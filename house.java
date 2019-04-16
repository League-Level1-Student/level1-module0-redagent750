package house;
import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class house {
public static void main(String[]args) {
	biulding(14);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
public static void biulding(int number) {	
	Random a = new Random();
	Robot r = new Robot();
	r.setSpeed(10000);
	r.setX(0);
	r.setY(500);
	r.miniaturize();
	r.penDown();
	r.setPenWidth(50);
	r.setAngle(90);
		for(int i = 0 ; i <= number; i++) {
			int b = a.nextInt((300-100)+1)+100;
			int s = a.nextInt((70-30)+1)+30;
			r.setPenColor(0,255,0);
			r.move(50);
			int x = a.nextInt((255-0)+1);
			int y = a.nextInt((255-0)+1);
			int z = a.nextInt((255-0)+1);
			r.turn(270);
			r.setPenColor(x,y,z);
			r.move(b);
			r.turn(90);
			int e = a.nextInt((2-1)+1)+1;
				if(e == 1) {
					r.setPenColor(255,0,0);
					r.turn(315);
					r.move(s);
					r.turn(90);
					r.move(s);
					r.turn(45);
					r.setPenColor(x,y,z);
				}		
				else{
					r.setPenColor(255,0,0);
					r.move(s);
					r.turn(90);
					r.setPenColor(x,y,z);
				}
		r.move(b);
		r.setAngle(90);
}
}
}

