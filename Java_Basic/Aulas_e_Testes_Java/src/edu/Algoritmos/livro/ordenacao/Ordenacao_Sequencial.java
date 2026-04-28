package edu.Algoritmos.livro.ordenacao;

import edu.Algoritmos.livro.ordenacao.Item;
import edu.Algoritmos.livro.ordenacao.Sequencia;

public class Ordenacao_Sequencial{
	
	Sequencia<Item> ordNaturalMerge(Sequencia<Item> a) {
	    Sequencia<Item> b = new Sequencia<Item>();
	    Sequencia<Item> c = new Sequencia<Item>();
	    
	    b.OpenSeq();
	    c.OpenSeq();
	    
	    int runs;
	    
	    do {
	        runs = 0;

	        a.startRead();
	        b.startWrite();
	        c.startWrite();

	        while (a.first != null) {
	            copyRun(a, b);
	            runs++;
	            
	            if(a.first == null) {break;}
	            
	            copyRun(a, c);
                runs++;
	        }
	        
	        a.startWrite();
	        b.startRead();
	        c.startRead();
	        
	        while(!b.eof && !c.eof) {
	        	if(c.first.key <= b.first.key) {
	        		a.copy(c);
	        		c.read();
	        	} else {
	        		a.copy(b);
	        		b.read();
	        	}
	        }
	        
	        while(!b.eof) {
	        	a.copy(b);
	        	b.read();
	        }
	        
	        while(!c.eof) {
	        	a.copy(c);
	        	c.read();
	        }
	        
	        
	    } while (runs > 1);
	    
	    return a;
	}

	private void copyRun(Sequencia<Item> a, Sequencia<Item> b) {
		Item last = (Item) a.first;
		b.f.writeWord(last);
		
	    while (!a.eof && a.first.key >= last.key) {
	    	a.read();
	    	if (a.eof) break;
	        if (a.first.key < last.key) break;
	        last = (Item) a.first;
	        b.f.writeWord(last);
	    }
	
	}
	
	public void ordBalancedMerge() {
		
	}
	
}