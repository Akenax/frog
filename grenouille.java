import java.awt.*;

class grenouille
{


	private int ligne;	//ligne postion de la grenouille
	private int colonne;	//colonne postion de la grenouille
	
	
	public int getLigne(){ return this.ligne; }
	public int getColonne(){ return this.colonne; }
	
	public void setLigne(int ligne){ this.ligne=ligne; }
	public void setColonne(int colonne){ this.colonne=colonne; }
	
	//applique une position à la grenouille
	public void setPos(int ligne, int colonne){
		this.ligne=ligne; 
		this.colonne=colonne;
		
	}
	//position de départ de la grenouille
	public void setPosDepart(){
		this.ligne=10; 
		this.colonne=5;
		
	}
	
	
	
}
