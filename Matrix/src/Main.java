import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		Pixel[] tableau = new Pixel[10];
		Timer timer = new Timer();


		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				for(int i=0; i<10; i++){
					tableau[i]=new Pixel();
				}
				for(int i = 0; i < 10; i++){
					if (tableau[i].getTaille()<0){tableau[i]=new Pixel(); System.out.print(tableau[i].toString());}
					else System.out.print(tableau[i].toString());
				}
			}


		}, 0,500);

	}
}