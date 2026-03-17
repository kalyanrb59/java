int facto(int n){
    int f = 1;
    while(n>=1){
        f = f*n;
        n--;
    }
    return f;
}

void main(){
  int k =  facto(5);
  System.out.println(k);
  System.out.println(facto(8));
}