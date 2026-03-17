void printSeries(int sn, int en){
    int a =sn;
    while(a<=en){
        System.out.println(a);
        a++;
    }
}

int add (int a, int b){
    int c = a+b;
    return c;
}

int add (int a, int b, int c){
    return a+b+c;
}

void main(){
    // printSeries(30,40);
    // printSeries(20,30);
    System.out.println(add(10,20));
    System.out.println(add(110,240));
    System.out.println(add(10,20,330));
}