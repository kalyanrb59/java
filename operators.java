void main(){
    int a = 13;
    int b = 20;
    // int c = a++;
    // int d = ++a;
    int e = a++ + a++;
    int f = a++ + ++a;
    System.out.println(a/b); //Res: 0 
    System.out.println((double) a/b); // res 0.5
    System.out.println((double) (a/b)); // res 0.0
    System.out.println((double) a/(double) b); // res 0.5
    System.out.println(a%b); //res 13
    // System.out.println(c);
    // System.out.println(d);
    System.out.println(e);
    System.out.println(f);
}