/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 *
 * @author aurélien
 */
public class nenuphar {
    final int tailleJeu=10;
	int tab[]=new int[tailleJeu];
	
	int ecart;		//ecart entre les nenuphar
	
	 public nenuphar(int ecart){
		this.ecart=ecart;
		for (int i=0;i<tailleJeu;i++){
			if (i%ecart==0)
				tab[i]=1;
			else
				tab[i]=0;
			
		}
	}
	
	public String toString(){
		String s="";
		for(int i=0;i<tailleJeu;i++){
			s+=" "+tab[i];
		}
		s+="\n";
		return s;
	}
}
