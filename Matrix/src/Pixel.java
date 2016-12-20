
public class Pixel {
	private int bool;
	private int taille;
	
	public Pixel(){
		bool = (int)Math.random();
		taille = (int)Math.random()*10-1;
	}

	public int getTaille() {
		return taille;
	}

	@Override
	public String toString() {
		if (bool==1)return (((int)Math.random()*10-1)+"");
		else return (" ");
	}
	
	

}
