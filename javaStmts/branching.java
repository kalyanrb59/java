void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Percentate");

    int x = sc.nextInt();

    switch(x){
        case (55):
            System.out.println("Second class");
            break;
        case (65):
            System.out.println("First class");
            break;
        default:
            System.out.println("Failed");
            break;
    }
}