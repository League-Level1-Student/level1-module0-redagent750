package methodCheckPoint;
import org.jointheleague.graphical.robot.Robot;
public class methodCheckPoint {

static void food(String fruit) {
	       System.out.println("I like " + fruit);
	}

static void truth(int x) {
       if(x > 5)
             System.out.println("Geeks rule");
       else
              System.out.println("Nerds rule");

}

static void jump(int height) {
    if (height > 100)
          System.out.println("The mouse jumped over the moon.");
    if (height > 50)
           System.out.println("The mouse jumped over the broom.");
    if (height > 5)
           System.out.println("The mouse jumped over the candlestick.");

}





static void jump(String obstacle) {

    System.out.println("The mouse jumped over the " + obstacle);
}

static void drawLine() {
      robot.move(100);
       robot.turn(90);
}

	public static void main(String[] args) {

    
    food("apple");
    
    truth(4);

    jump(100);
    
    jump("dustin");

    Robot robot = new Robot();
    
    robot.penDown();
    robot.miniaturize();
    for(int i=0;i<=4;i++) {
    	robot.move(100);
    	robot.turn(90);
 
}  
 
}	










}
