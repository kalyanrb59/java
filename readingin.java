import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String s = (x%2==0) ? "Even" : "Odd";
    System.out.println("The entered number is " + x + " and it is " + s + " number");
}