package Question3.RightWay;

import java.util.Date;

public class SingleResponsibility {

    //Single Responsibility means a class should have a single responsibility, where a responsibility is nothing but a reason to change

    private String empId;
    private String name;
    private String address;
    private Date joinDate;

    public String getEmpId(){
        return empId;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public Date getJoinDate(){
        return joinDate;
    }

    public void setEmpId(String empId){
        this.empId=empId;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setJoinDate(Date joinDate){
        this.joinDate=joinDate;
    }
}
