package edu.Algoritmos.livro.EstruturasDinamicasInfo;


public class Arvore_perfeitamente_balanceada {
	class node{Integer key; Apontadores<node> left; Apontadores<node> right;}
	node root = new node();
	node s = new node();
	
	public node tree(int n, Sequencia<Integer> x) {
		node newnode = new node();
		int nl, nr;
		if(n == 0) {
			newnode = null;
		}else {
			nl = n/2; nr = n - nl - 1;
			newnode.key = x.read(); 
			newnode.left = new Apontadores<node>(tree(nl, x)); newnode.right = new Apontadores<node>(tree(nr, x));
		}
		
		return newnode;
	}
	
	public void printtree(node t, int h) {
		if (t != null) {
			printtree(t.left.p, h+1);
			for(int i = 0; i <= h; i++) {System.out.print("   ");}
			System.out.println(t.key);
			printtree(t.right.p, h+1);
		}
	}
	
	public void preorder(node t) {if(t != null) {System.out.print(" -> "+t.key); preorder(t.left.p); preorder(t.right.p);}}
	
	public void inorder(node t) {if(t != null) {inorder(t.left.p); System.out.print(" -> "+t.key); inorder(t.right.p);}}
	
	public void postorder(node t) {if(t != null) {postorder(t.left.p); postorder(t.right.p); System.out.print(" -> "+t.key);}}
	
	public node locate(int x, node t) {// não vai funcionar devido a criação dessa arvore não ser ordenada
		s.key = x;
		while(t.key != x) {if(t.key < x) {t = t.right.p;}else {t = t.left.p;}}
		return t;
	}
	
	public void teste(int n, Sequencia<Integer> x) {
		x.startRead();
		root = tree(n, x);printtree(root, 0);
		System.out.print("pre ordem");preorder(root);System.out.println("");
		System.out.print("em ordem");inorder(root);System.out.println("");
		System.out.print("pos ordem");postorder(root);System.out.println("");
		
		x.startRead();
	}
}
