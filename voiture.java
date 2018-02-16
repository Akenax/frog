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
public class voiture extends Thread{
	final int tailleJeu=10;			//taille du jeu
	int tab[]=new int[tailleJeu];		//ligne du jeu de la largeur du jeu
	int taille;					// taille de ma voiture
	double vitesse;				//vitesse de ma voiture
	int sens;
	//constructeur en fonction de la taille et de la vitesse
	public voiture(int taille, double vitesse, int sens){
		for (int i=0;i<taille;i++){
			tab[i]=1;
		}
                this.sens=sens;
		this.taille=taille;
		this.vitesse=vitesse;
	}
	
	//constructeur clonage avec vitesse
	public voiture(int t[], double vitesse){
		setTab(t);
		this.taille=t.length;
		this.vitesse=vitesse;
	}
	
	//constructeur par défaut
	public voiture(){
		tab=new int[0];
		this.taille=taille;
		this.vitesse=vitesse;
	}
	
	
	
	public void deplacementVoiture(){
		int i;		//pour les for()
		int cpt=0;		//compteur
		
		//vitesse
		try{
			Thread.sleep((int)(10000-vitesse));
		}catch (InterruptedException e){e.printStackTrace();}
		
		//la voiture est-elle entierement sur la ligne?
		for (i=0;i<tailleJeu-taille-1;i++){
			if (tab[i]==1)
				cpt++;
		}
		
		//déplacement de la voiture
		//on parcoure le tableau de droite à gauche
		 if(this.getSens()==1){
		for (i=tab.length-1; i>0;i--){
			tab[i]=tab[i-1];
		}}
                 else if(this.getSens()==2){
		for (i=1; i<tab.length-1;i++){
			tab[i+1]=tab[i];
		}}
		
		//si la voiture n'est pas entièrement sur la ligne, tab[0]=1
		//si elle est déjà avancée sur la ligne, tab[0]=0
		if(cpt<taille) tab[0]=1;
		else tab[0]=0;
		
	}
        public int getSens(){
    return this.sens;
    }
	
	public void run(){
			System.out.println(""+toString());
			
			for (int i=0;i<10;i++){
				deplacementVoiture();
			
				System.out.println(""+toString());
					
			}
			
	}
	
	public int[] getTab(){ return this.tab;}
	
	public void setTab(int t[]){ 
		for (int i=0;i<tab.length;i++){
			tab[i]=t[i];
		}
	}
	
	//affiche la ligne puis fais un retour à la ligne
	public String toString(){
		String s="";
		for (int i=0;i<tab.length;i++){
			s+=" "+tab[i];
		}
		s+="\n";
		return s;
	}
	
	
	
}
