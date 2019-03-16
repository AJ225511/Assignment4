package Question3.WrongWay;

public class DependencyInversion {

    class Worker {

        public void work() {

           System.out.println("Worker is working");

        }

    }

    class Supervisor {

        Worker worker;



        public void setWorker(Worker w) {
            worker = w;
        }

        public void supervise() {
            worker.work();
        }
    }

    class HardWorker {
        public void work() {
            System.out.println("This worker is working hard");
        }
    }


}
