/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aurélien
 */
public class obstacle extends Thread{
    final int taillejeu=10;
    int tabObs[]=new int[taillejeu];
    int vitesse;
    int sens;
    int taille; 
    int vide;
    //int type? pour rondin etc 
    public obstacle(int vitesse, int sens,int taille, int vide){
    this.sens=sens;
    this.vitesse=vitesse;
    this.taille=taille;
    this.vide=vide;
    }
    public void deplacementDroite(){
                int i;		//pour les for()
		if (this.taille==0 && vide==0)
                {
                taille=(int)(Math.random()*4)+1;
                vide=(int)(Math.random()*2)+1;
                } 
                //on initialise la taille du prochain vide et de la prochaine voiture quand les deux précédents ont passé la case 0
                   for (i=tabObs.length-1;i>0;i--){
                     tabObs[i]=tabObs[i-1];
                   }
                   //décalage d'un cran
                   if(taille!=0){
                   tabObs[0]=1;//int type
                   taille--;
                   }
                   //Si la taille est différente de 0, la voiture n'est pas totalement passée, la case 0 vaut 1 et on décrémente taille
                   else{
                       tabObs[0]=0;
                       vide--;
                       }
                   //si la taille est à 0, la voiture a passé la case 0, on fait pareil pour le vide 
                     
    }
public void initObs(int a,int b,int c,int d,int e, int f,int g,int h,int i,int j){
int tab[]= {a,b,c,d,e,f,g,h,i,j};//on initialise un tableau avec nos variables 
for (i=0;i<tabObs.length;i++){tabObs[i]=tab[i];}//On transfère vers tabObs
}

    public void deplacementGauche(){  //comme pour droite
                int i;		//pour les for()
                if (this.taille==0 && vide==0)
                {
                    taille=(int)(Math.random()*4)+1;
                    vide=(int)(Math.random()*4)+2;
                } 
                   for (i=0;i<tabObs.length-1;i++){
                        tabObs[i]=tabObs[i+1];
                   }
                    if(taille!=0){
                       tabObs[tabObs.length-1]=1;//int type
                       taille--;
                   }
                   else{
                       tabObs[tabObs.length-1]=0;
                       vide--;
                   }
    }
    

    
public void deplacementObs(){//On applique la bonne methode en fonction du sens
		if (this.sens==1){deplacementDroite();}
                if (this.sens==2){deplacementGauche();}
		try{
			Thread.sleep((int)(vitesse));
		}catch (InterruptedException e){e.printStackTrace();}
		
}
    

    public int getSens(){ //ascesseur 
   	 return this.sens;
    }
    
    
    //retourne l'entier se trouvant en position i dans le tableau d'obstacle
    public int getTabObs(int i){
    	 return tabObs[i];
    }
    
    
    public void run(){
			System.out.println(""+toString());
                        initObs(0,0,1,0,0,1,1,0,0,1);
                        int g=2;
			while(g==2){
				deplacementObs();
			
				System.out.println(""+toString());
					
			}
    }
    
    
    	public String toString(){
		String s="";
		for(int i=0;i<taillejeu;i++){
			s+=" "+tabObs[i];
		}
		s+="\n";
		return s;
	}
}
