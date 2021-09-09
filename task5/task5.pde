
int i = 1000;
int max = 10;
void setup() {
  //MethodOne();
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  String output = "i is greater than "+max+"."; 
  int max = 10;
  
  if (i > max)
  {  
    println(output);
  }
  
  
   
}

void MethodTwo() 
{
  int weekDay = 6; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
     if(weekend==true){
       println("Weekend");
     }
}
  // Print the name of the weekday here: 
  
  if(weekDay == 0){
    println("Monday");
  }
  else if(weekDay == 1){
    println("Tuesday");
  }
    else if(weekDay == 2){
    println("Wensday");
  }
    else if(weekDay == 3){
    println("Thursday");
  }
    else if(weekDay == 4){
    println("Friday!!");
  }
    else if(weekDay == 5){
    println("Saturday");
  }
    else if(weekDay == 6){
    println("Sunday");
}
  
    
  // Print if it is weekend here:
  
}
