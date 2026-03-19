class A{
//properties/fields/datamembers/state (variables)

    int a;
    int b;

    A(int x, int y){
        this.a = x;
        this.b = y;
    }
// functions/ methods

   int add(){
    return this.a + this.b;
   }
   int sub(){
    return this.a - this.b;
   }
   int mul(){
    return this.a * this.b;
   }
}

void main(){
    A oa1 = new A(35,23);
    
    System.out.println(oa1.mul());
    System.out.println(oa1.sub());
    System.out.println(oa1.add());
}