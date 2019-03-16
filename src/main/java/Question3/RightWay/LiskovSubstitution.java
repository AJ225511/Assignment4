package Question3.RightWay;

import java.util.ArrayList;
import java.util.List;

//This is the right way to use Liskov Substitution

public class LiskovSubstitution {

    static class Bird{
        public void eat(){

        }
    }

    static class FlightBird extends Bird{
        public void fly(){
            System.out.println("These birds can fly");
        }
    }

    static class NonFlight extends Bird{
        public void walk(){
            System.out.println("These birds cant fly");
        }
    }

    static class Parrot extends FlightBird{

        @Override
        public void fly(){
            System.out.println("The parrot flies");
        }
    }

    static class Ostrich extends NonFlight{

        @Override
        public  void walk(){
            System.out.println("The ostrich flies"); //Ostrich CAN walk
        }

    }

    public static void main(String[] args){

        List<FlightBird> list = new ArrayList<FlightBird>();
        //list.add(new Bird());
        list.add(new Parrot());
        //list.add(new Ostrich());
        letThemFly (list);
    }

    static void letThemFly(List<FlightBird> list){
        for(FlightBird b:list){
            b.fly();
        }
    }

}
