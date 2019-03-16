package Question3.WrongWay;

//This is the wrong way of using Least Knowledge

public class LeastKnowledge {

    public class Employee {

        private String address;
        private String streetName;

        public String getAddress(){
            return address;
        }

        public String getStreetName(){
            return streetName;
        }

        public void setAddress(String address){
            this.address=address;
        }

        public void setStreetName(String streetName){
            this.streetName = streetName;
        }

        class Example {
            public String getStreetName(Employee employee) {
                address = employee.getAddress();
                return address;
            }
        }
    }
}


