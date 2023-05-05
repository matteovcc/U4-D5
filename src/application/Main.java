package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audio audio1 = new Audio("audio1", 1, 3);
		Video video1= new Video ("video1",1,2,3);
		
//		audio1.play();
		
//		audio1.volumeUp();
//		audio1.play();
//		audio1.volumeDown();
//		audio1.play();
//		
//		Audio audio2 = new Audio("audio2", 2,1);
//		audio2.play();
//		audio2.volumeUp();
//		audio2.play();
//		audio2.volumeDown();
//		audio2.play();
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("1 per audio,2 per video,3 per immagine");
		int media = in.nextInt();
		
		if(media == 1) {
			audio1.play();
			audio1.volumeUp();
			audio1.play();
			audio1.volumeDown();
			audio1.play();
		}else if (media == 2) {
			video1.play();
			video1.aumentaLuminosità();
			video1.play();
		}else if (media == 3) {
			//immagine
		}else {
			System.out.println("inserisci 1,2 o 3");
		}
		in.close();
	}
	

}
