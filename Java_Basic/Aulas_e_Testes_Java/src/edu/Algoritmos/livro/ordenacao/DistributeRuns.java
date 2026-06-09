package edu.Algoritmos.livro.ordenacao;

public class DistributeRuns {
	int count;
	Item x;
	Item H[] = new Item[270];
	FileSystem f0, f1;
	
	private void select(){
		count++;
	}
	
	private void sift(int L, int R){
		int i, j;
		Item x;
		i = L; j = L * 2; x = H[L];
		
		if( (j < R) && (H[j].key > H[j + 1].key)) {j++;}
		
		while((j <= R) && (x.key > H[j].key)) {
			
			H[i] = H[j]; i = j; j = 2*j;
			
			if( (j < R) && (H[j].key > H[j + 1].key)) {j++;}
			
		}
		H[i] = x;
	}
	
	private void list(FileSystem s) {
		int i, L;
		s.reset();
		i = 0;
		L = s.length;
		while(i < L) {
			System.out.println(s.data); i++;
		}
	}
	
	void distribute(Sequencia s){
		f0 = s.f;
		f1 = new FileSystem();
		int L;
		int m = f0.data.length;
		int mh = m/2;
		
		count = 0;
		f1.open();
		f0.reset();
		select();
		
		// passo 1: preencher a metade superior do "heap"
		L = m;
		do {
			H[L] = (Item) f0.readWord(); L--;
		}while(L > mh);
		
		// passo 2: preencher a metade inferior do "heap"
		do {
			H[L] = (Item) f0.readWord(); sift(L, m); L--;
		}while(L > 0);
		
		// passo 3: passar elementos pelo "heap"
		L = m; x = (Item) f0.readWord();
		while(!f0.eof) {
			f1.writeWord(x);
			if(H[0].key <= x.key) {
				H[0] = x; sift(1, L);
			}else {
				H[0] = H[L]; sift(1, L-1); H[L] = x;
				if (L <= mh) {sift(L, m);}
				L--;
				if (L == 0) {L = m; select();}
			}
			x = (Item) f0.readWord();
		}
		
		// passo 4: igualar a metade inferor do "heap"
		int R = m;
		do {
			f1.writeWord(H[0]);
			H[0] = H[L]; sift(1, L-1); H[L] = H[R]; R--;
			
			if(L <= R) {sift(L, R);}
			L--;
		}while(L>0);
		
		// passo 5: igualar a metade superior do "heap"
		select();
		while(R > 0) {
			f1.writeWord(H[0]); H[0] = H[R]; R--; sift(1, R);
		}
		list(f1);
		
		f0.close();
		f1.close();
	}
}
