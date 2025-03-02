import java.io.*;
import java.util.*;

class Employee{
    String name,id,addr;
    double basic,hra,pf,da;

    Employee(String name,String id,String addr,double basic){
        this.name=name;
        this.id = id;
        this.addr = addr;
        this.basic = basic;
        this.hra = 0.97*basic;
        this.pf = 0.34*basic;
        this.da = 0.12*basic;
    }
    double gs(){
        return basic+hra+da;
    }
    double net(){
        return gs()-pf;
    }

    void payslip(){
        System.out.println("Employee name:"+name+"\nEmp id:"+id+"\nEmp addr:"+addr+"\nEmp gs:"+gs()+"\nEmp net:"+net());
    }

}
class Programmer extends Employee{
    Programmer(String n,String id,String addr,double basic){
    super(n,id,addr,basic);
    Employee e = new Employee();
    e.payslip();
    }
}
class AP extends Employee{
    AP(String n,String id,String addr,double basic){
        super(n,id,addr,basic);
    }
}
public class ex6{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter name,id,addr,basic");
        Programmer p = new  Programmer(s.next(),s.next(),s.next(),40000);
        AP a = new AP(s.next(),s.next(),s.next(),600000);
    

    }
}