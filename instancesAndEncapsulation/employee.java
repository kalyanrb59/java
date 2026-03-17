public class Employee{
    int basic;
    int hra;
    int ta;

    Employee(int b, int h, int t){
        System.out.println("Hellow Edupoly");
        basic = b;
        hra = h;
        ta = t;
    }
}

void main(){
    Employee e1 = new Employee(10000,40, 10);
    Employee e2 = new Employee(40000,40,10);
    System.out.println(e1.basic);
    System.out.println(e2.basic);
}