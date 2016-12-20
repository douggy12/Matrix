
public class Pixel {
	private int bool;
	private int taille;
	
	public Pixel(){
		bool = (int)(Math.random()*2);
		taille = (int)(Math.random()*10)+10;
	}

	public int getTaille() {
		return taille;
	}
	

	public int getBool() {
		return bool;
	}

	@Override
	public String toString() {
		taille--;
		if (bool==1)return (((int)(Math.random()*6)+4)+"");
		else return (" "); 
	}
	
	 

}
