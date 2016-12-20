
public class Main {

	public static void main(String[] args) {
		Pixel[] tableau = new Pixel[10];
		for(int i=0; i<10; i++){
			tableau[i]=new Pixel();
		}
		for(int i = 0; i < 10; i++){
			if (tableau[i].getTaille()<0){tableau[i]=new Pixel(); System.out.println(tableau[i].toString());}
			else System.out.println(tableau[i].toString());
		}
		
	}
	
}
