package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class Arvore_Balanceada<T extends Comparable<T>> {
	class Node{T key; Node left, right; int bal; int count;}
	Node q=null; Node root; boolean h;
	
	public Node search(T x, Node p) {
		Node p1, p2;
		if (p == null) {
			p = new Node(); p.key = x; p.left = null; p.right = null; p.count = 1; p.bal = 0; h=true ;return p;
		}
		else if(p.key.compareTo(x) > 0) {
			p.left = search(x, p.left);
			if(h){
				if(p.bal == 1){p.bal = 0; h = false;}
				else if(p.bal==0) {p.bal = -1;}
				else {
					p1 = p.left;
					if(p1.bal == -1) {
						p.left = p1.right; p1.right = p;
						p.bal = 0; p = p1; 
					}else {
						p2 = p1.right;
						p1.right = p2.left; p2.left = p1;
						p.left = p2.right; p2.right = p;
						if (p2.bal == -1) {p.bal = 1;} else {p.bal = 0;}
						if (p2.bal == 1) {p1.bal = -1;} else {p1.bal = 0;}
						p = p2; 
					}
					p.bal = 0; h = false; return p;
				}
			}
		}else if(p.key.compareTo(x) < 0) {
			p.right = search(x, p.right);
			if (h) {
				if(p.bal == -1) {p.bal = 0; h = false;}
				else if(p.bal == 0) {p.bal = 1;}
				else {
					p1 = p.right;
					if(p1.bal == 1) {
						p.right = p1.left; p1.left = p;
						p.bal = 0; p = p1; 
					}else {
						p2 = p1.left;
						p1.left = p2.right; p2.right = p1;
						p.right = p2.left; p2.left = p;
						if (p2.bal == 1) {p.bal = -1;} else {p.bal = 0;}
						if (p2.bal == -1) {p1.bal = 1;} else {p1.bal = 0;}
						p = p2; 
					}
					p.bal = 0; h = false; return p;
				}
			}
		}else {p.count = p.count +1;}
			
		return p;
	}
	
	private Node balanceL(Node p) {
		Node p1, p2; int b1, b2;
		if(p.bal == -1){p.bal = 0;}
		else if(p.bal==0) {p.bal = 1; h = false;}
		else {
			p1 = p.right; b1 = p1.bal;
			if(b1 >= 0) {
				p.right = p1.left; p1.left = p;
				if(b1 == 0) {p.bal = 1; p1.bal = -1; h = false;}
				else {p.bal = 0; p1.bal = 0;}
				p = p1;
			}else {
				p2 = p1.left; b2 = p2.bal;
				p1.left = p2.right; p2.right = p1;
				p.right = p2.left; p2.left = p;
				if (b2 == 1) {p.bal = -1;} else {p.bal = 0;}
				if (b2 == -1) {p1.bal = 1;} else {p1.bal = 0;}
				p = p2; p2.bal = 0;
			}
		}
		return p;
	}
	
	private Node balanceR(Node p) {
		Node p1, p2; int b1, b2;
		if(p.bal == 1){p.bal = 0;}
		else if(p.bal==0) {p.bal = -1; h = false;}
		else {
			p1 = p.left; b1 = p1.bal;
			if(b1 <= 0) {
				p.left = p1.right; p1.right = p;
				if(b1 == 0) {p.bal = -1; p1.bal = 1; h = false;}
				else {p.bal = 0; p1.bal = 0;}
				p = p1;
			}else {
				p2 = p1.right; b2 = p2.bal;
				p1.right = p2.left; p2.left = p1;
				p.left = p2.right; p2.right = p;
				if (b2 == 1) {p.bal = -1;} else {p.bal = 0;}
				if (b2 == -1) {p1.bal = 1;} else {p1.bal = 0;}
				p = p2; p2.bal = 0;
			}
		}
		return p;
	}

	private Node del(Node r) {
		if(r.right != null) {
			r.right = del(r.right);
			if(h) {r = balanceR(r);}
		}else {
			q.key = r.key; q.count = r.count;
			q = r; r = r.left; h = true;
		}
		return r;
	}
	
	public Node delete(T x, Node p) {
		if(p == null) {System.out.println("Não foi encontrado "+x); return p;}
		else if(p.key.compareTo(x) > 0) {
			p.left = delete(x, p.left);
			if(h) {p = balanceL(p);}
		}else if(p.key.compareTo(x) < 0) {
			p.right = delete(x, p.right);
			if(h) {p = balanceR(p);}
		}else {
			q = p;
			if (q.right == null) {p = q.left; h = true;}	        
	        else if (q.left == null) {p = q.right; h = true;}
	        else {p.left = del(q.left); if(h) {p = balanceL(p);}}
		}
		return p;
	}
	
	public void printtree(Node t, int h) {
		if (t != null) {
			printtree(t.left, h+1);
			for(int i = 0; i <= h; i++) {System.out.print("   ");}
			System.out.println(t.key + " : " + t.count);
			printtree(t.right, h+1);
		}
	}
	
	public void preorder(Node t) {if(t != null) {System.out.print(" -> "+t.key); preorder(t.left); preorder(t.right);}}
	
	public void inorder(Node t) {if(t != null) {inorder(t.left); System.out.print(" -> "+t.key); inorder(t.right);}}
	
	public void postorder(Node t) {if(t != null) {postorder(t.left); postorder(t.right); System.out.print(" -> "+t.key);}}
	
	public void teste(Sequencia<T> x, Sequencia<T> del) {
		x.startRead(); root = null; h = true; del.startRead();
		while(!x.eof) {root = search(x.read(), root); h = false;}
		printtree(root, 0);
		System.out.println("________________________________");
		//System.out.println("Validando antes das exclusões:"); validarAVL(root);
		System.out.println("deletando as primeiras entradas");
		h = false; root = delete(del.read(), root); h = false; root = delete(del.read(), root); h = false; root = delete(del.read(), root); h = false; root = delete(del.read(), root); h = false; root = delete(del.read(), root); h = false; root = delete(del.read(), root); h = false; root = delete(del.read(), root); h = false; root = delete(del.read(), root);     
		printtree(root, 0);
		System.out.print("In order "); inorder(root); System.out.println("");
		System.out.print("Post order "); postorder(root); System.out.println("");
		System.out.print("Pre order "); preorder(root); System.out.println("");
		//System.out.println("Validando depois das exclusões:"); validarAVL(root);
	}
	
	private int validarAVL(Node p) {
	    if (p == null) {
	        return 0;
	    }

	    int alturaEsq = validarAVL(p.left);
	    int alturaDir = validarAVL(p.right);

	    int balReal = alturaDir - alturaEsq;

	    if (balReal < -1 || balReal > 1) {
	        System.out.println(
	            "AVL desbalanceada em " + p.key +
	            ": fator real = " + balReal
	        );
	    }

	    if (p.bal != balReal) {
	        System.out.println(
	            "Fator incorreto em " + p.key +
	            ": armazenado = " + p.bal +
	            ", real = " + balReal
	        );
	    }

	    return 1 + Math.max(alturaEsq, alturaDir);
	}
}
