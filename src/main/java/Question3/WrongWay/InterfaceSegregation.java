package Question3.WrongWay;

public class InterfaceSegregation {

    //Wrong way, some workers don't require to eat, like a robot for example.

    interface Worker{
        public void work();
        public void eat();
    }

    class lazyWorker implements Worker{

        @Override
        public void work() {
            System.out.println("This worker works lazily");
        }

        @Override
        public void eat() {
            System.out.println("This worker spends a whole hour during lunch");
        }
    }

    class hardWorker implements Worker{

        @Override
        public void work() {
            System.out.println("This worker works very hard");
        }

        @Override
        public void eat() {
            System.out.println("This worker only eats his lunch then returns to work");
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
