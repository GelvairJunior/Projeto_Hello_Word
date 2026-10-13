package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class Arvore_Binaria_Search {
	class word{int key; int count; word left; word right;}
	word root; word q;
	
	public void printtree(word t, int h) {
		if (t != null) {
			printtree(t.left, h+1);
			for(int i = 0; i <= h; i++) {System.out.print("   ");}
			System.out.println(t.key + " : " + t.count);
			printtree(t.right, h+1);
		}
	}
	
	public void preorder(word t) {if(t != null) {System.out.print(" -> "+t.key); preorder(t.left); preorder(t.right);}}
	
	public void inorder(word t) {if(t != null) {inorder(t.left); System.out.print(" -> "+t.key); inorder(t.right);}}
	
	public void postorder(word t) {if(t != null) {postorder(t.left); postorder(t.right); System.out.print(" -> "+t.key);}}
	
	public word locate(int x, word t) { t.key = x; while(t.key != x) {if(t.key < x) {t = t.right;}else {t = t.left;}} return t; }
	
	public word search(int x, word p) {
		if(p == null) {p = new word(); p.key = x; p.left = null; p.right = null; p.count = 1;} 
		else if(x < p.key) {p.left=search(x, p.left);}
		else if(x>p.key) {p.right=search(x, p.right);}
		else {p.count = p.count + 1;}
		return p;
	}
	
	public void teste(Sequencia<Integer> x) {
		x.startRead();Integer f = x.read(); root = null;
		while(f != null) {root = search(f, root); f = x.read();}
		printtree(root, 0);
		System.out.println("________________________________");
		root = delete(8, root);
		printtree(root, 0);
		System.out.print("In order "); inorder(root); System.out.println("");
		System.out.print("Post order "); postorder(root); System.out.println("");
		System.out.print("Pre order "); preorder(root); System.out.println("");
	}
	
	public word delete(int x, word p) {
	    if (p == null) {System.out.println("Palavra não está na árvore");}
	    else if (x < p.key) {p.left = delete(x, p.left);}
	    else if (x > p.key) {p.right = delete(x, p.right);}
	    else {
	        q = p;
	        if (q.right == null) {p = q.left;}	        
	        else if (q.left == null) {p = q.right;}
	        else {p = del(q);}
	    }
	    return p;
	}
	
	public word del(word q) {
	    word r = q.left;
	    while (r.right != null) {r = r.right;}
	    q.key = r.key;q.count = r.count; q.left = delete(r.key, q.left);
	    return q;
	}
	
}
