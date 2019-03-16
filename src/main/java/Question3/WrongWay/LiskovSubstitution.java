package Question3.WrongWay;

//This is the wrong way of using Liskov Substitution

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {
    static class Bird{
        public void fly(){

        }
        public void eat(){

        }
    }

    static class Parrot extends Bird{

        @Override
        public void fly(){
            System.out.println("The parrot flies");
        }
    }

    static class Ostrich extends Bird{

        @Override
        public  void fly(){
            System.out.println("The ostrich flies"); //Ostrich CANT fly
        }

    }

    public static void main(String[] args){

        List<Bird> list = new ArrayList<Bird>();
        list.add(new Bird());
        list.add(new Parrot());
        list.add(new Ostrich());
        letThemFly (list);
    }

    static void letThemFly(List<Bird> list){
        for(Bird b:list){
            b.fly();
        }
    }
}
