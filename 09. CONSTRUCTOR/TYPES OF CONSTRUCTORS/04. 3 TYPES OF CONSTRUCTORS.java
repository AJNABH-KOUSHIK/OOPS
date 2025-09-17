package Lab6;
public class TaskB {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee(1,"vijju");
        Employee e3=new Employee(2,"kannu",10000);
        e1.display();
        e2.display();
        e3.display();
    }
}
class Employee{
    int id;
    String name;
    int salary;
Employee(){
    this.id=0;
    this.name="Not Assigned";
    this.salary=0;
}
Employee(int id,String name){
    this.id=id;
    this.name=name;
    this.salary=30000;
}
Employee(int id,String name,int salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
    if(this.salary<0){
        this.salary=0;
    }
}
void display(){
    System.out.println("The id of the Employee:"+this.id);
    System.out.println("The name of the Employee:"+this.name);
    System.out.println("The salary of the Employee:"+this.salary);
}
}
