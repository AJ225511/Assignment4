package Question3.RightWay;

//This is the right way to use Least Knowledge

public class LeastKnowledge {


    class Employee {
        private String address;
        public String getStreetName() {
            return address;
        }
    }
    class Example {
        public String getStreetName(Employee emplyee) {
           // employee.getAddress();
        }
    }

}
