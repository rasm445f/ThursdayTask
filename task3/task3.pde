int W = 80;
int H = 80;
int red = #FF0000;
int yellow = #FFEA00;
int green = #00FF00;
int start = 175;
int i = 5;

//
void setup(){
  size(100,300);
  background(0);
  ellipseMode(CENTER);
  noStroke();
  fill(start);
  ellipse(width/2,height*0.8,W,H);
  ellipse(width/2,height*0.2,W,H);
  fill(yellow);
  ellipse(width/2,height/2,W,H);
  frameRate(3);
  
}

void draw(){
  
  if(i<10){
  fill(red);
  ellipse(width/2,height*0.2,W,H);
  fill(start);
  ellipse(width/2,height*0.8,W,H);
  i++;
  }
  else{
  fill(green);
  ellipse(width/2,height*0.8,W,H);
  fill(start);
  ellipse(width/2,height*0.2,W,H);
  i++;
  }
  if(i == 21){
    i=1;
  }
  println(i);
}
