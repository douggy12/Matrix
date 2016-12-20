import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		int matrix=100;
		Pixel[] tableau = new Pixel[matrix];
		Timer timer = new Timer();
		
		for(int i=0; i<matrix; i++){
			tableau[i]=new Pixel();
		}


		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				for(int i = 0; i < matrix; i++){
					if (tableau[i].getTaille()==0){tableau[i]=new Pixel(); System.out.print(tableau[i].toString() + " ");}
					else System.out.print(tableau[i].toString() + " ");
				}
				System.out.print("\n");
			}

		
		}, 0,100);

	}
}