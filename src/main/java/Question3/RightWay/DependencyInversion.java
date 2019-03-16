package Question3.RightWay;

public class DependencyInversion {

    interface Worker {
        public void work();
    }

    class LazyWorker implements Worker{
        public void work() {
            System.out.println("This worker works lazily");
        }
    }

    class HardWorker  implements Worker{
        public void work() {
            System.out.println("This worker works hard");
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
}
