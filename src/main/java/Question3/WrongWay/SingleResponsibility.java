package Question3.WrongWay;

import java.util.Date;

public class SingleResponsibility {

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

    //Promotion should not be here, it should be in a Human Resources class, this is supposed to be a
    //single responsibility class for Employee
    public boolean promotionDueThisYear(){
        return promotionDueThisYear();
    }
}
