void main(){
    int a = 13;
    int b = 20;
    System.out.println(a/b); //Res: 0 
    System.out.println((double) a/b); // res 0.5
    System.out.println((double) (a/b)); // res 0.0
    System.out.println((double) a/(double) b); // res 0.5
    System.out.println(a%b); //res 13
}