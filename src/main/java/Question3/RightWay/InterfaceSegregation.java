package Question3.RightWay;

public class InterfaceSegregation {

    //This is the correct way of using interface segregation, by having two interfaces we don't have to force the robot to eat food


    interface Worker{
        public void work();
    }

    interface Lunch{
        public void eat();
    }

    class LazyWorker implements Worker,Lunch{

        @Override
        public void work() {
            System.out.println("This worker works lazily");
        }

        @Override
        public void eat() {
            System.out.println("This worker spends a whole hour during lunch");
        }
    }

    class HardWorker implements Worker,Lunch{

        @Override
        public void work() {
            System.out.println("This worker works very hard");
        }

        @Override
        public void eat() {
            System.out.println("This worker only eats his lunch then returns to work");
        }
    }

    class Robot implements Worker{

        @Override
        public void work() {
            System.out.println("This robot works without the need to take lunch");
        }
    }

    class Supervisor{
        Worker w;

        public void setW(Worker worker){
            worker = w;
        }

        public void supervize(){
            w.work();
        }
    }

}
