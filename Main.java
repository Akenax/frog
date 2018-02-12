public class Main{
	public static void main(String args[]){

			
			voiture v1=new voiture(3,1000);
			//voiture v2=new voiture(4,100);
			
			
			System.out.println(""+v1.toString());
			
			for (int i=0;i<10;i++){
				v1.deplacementVoiture();
			
				System.out.println(v1);
			}
		
			nenuphar n=new nenuphar(3);
			//System.out.println(n);
	
	}
}
