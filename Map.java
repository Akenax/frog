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
public class Map 
//pour que l'action se déclenche lorsqu'on appuie sur une touche
extends Applet
implements KeyListener
{
     	final int taillejeu=10;
    	obstacle tabMap[]=new obstacle[taillejeu];
    	grenouille g;
    
    
    	public Map(obstacle tabMap[]){
   		 this.tabMap=tabMap;
   		 g=new grenouille(10,5);
   	 }
   	 
   	 
  	
	//Déplacement grenouille
	
	//appui sur touche clavier
	public void keyPressed(keyEvent e){
	
		//déplacement droite
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			if(tabMap[g.getLigne()].getTabObs(g.getColonne+1)==0){	//Si pas d'obstacle dans la colonne suivante (même ligne)
				g.setColonne(getColonne()+1);
			}
			else{						//si obstacle
				g.setPosDepart();			//retour position départ
			}
			System.out.println(""+toString());
		}
		
		//déplacement gauche
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			g.setColonne(getColonne()-1);
			System.out.println(""+toString());
		}
		
		//déplacement haut
		if(e.getKeyCode()==KeyEvent.VK_UP){
			g.setLigne(getLigne()+1);
			System.out.println(""+toString());
		}
		
		//déplacement bas
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			g.setLigne(getLigne()+1);
			System.out.println(""+toString());
		}
	}
	
	public String toString(){
		String s="";
		//Affiche chaque ligne d'obstacle
		for (int i=0;i<taillejeu;i++){
			s+="\n"+tabMap[i].toString();
		}
		return s;
		
	}
}








