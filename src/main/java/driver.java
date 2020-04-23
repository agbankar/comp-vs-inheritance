import com.animals.Dog;
import com.animals.Robot;
import com.animals.Sparrow;

public class driver {

    public static void main ( String[] args ) {
        System.out.println ("Testing sparrow");

        Sparrow sparrow= new Sparrow ();
        sparrow.eat ();
        sparrow.fly ();

        System.out.println ("Testing dog");

        Dog dog= new Dog ();
        dog.eat ();
        dog.walk ();

        System.out.println ("Testing robot");

        Robot robot= new Robot ();
        //Unnnccessary eating feature for robot
        //this need to be improved
        robot.eat ();
        robot.fly ();
        robot.walk ();

    }
}
