void main(){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();

    // if(x>y && x>z){
    //     System.out.println("x is greater than y and z "+x);
    // }
    // if(y>x && y>z){
    //     System.out.println("y is greater than x and z "+y);
    // }
    // if(z>y && z>x){
    //     System.out.println("z is greater than x and y "+z);
    // }

    if(x>y){
        if(x>z){
            System.out.println("x is greater than y and z "+ x)
        }else{
            System.out.println("z is greater than x and z "+ z)
        }
    }
    else{
        if(y>x){
            System.out.println("y is greater than x and z" + y)
        }else{
            System.out.println("")
        }
    }
}