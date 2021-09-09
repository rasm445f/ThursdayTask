void setup(){
  //opg1();
  //opg2();
}

void opg1(){
int a = 0;
int b = 0;

if(a==10 || b==10 || a+b==10){
  println("succes");
}
else{
  println("failure");
}
}

void opg2(){
  //
  int x = 0;
  int y = 15;
  int z = 15;
  
  if( x%10==0 || y%10==0 || z%10==0){
    println("failure");
  }
  else if(x+y+z==30){
    println("succes");
}
}
