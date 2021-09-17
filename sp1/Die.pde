class Die
{
  color eyeC;
  color dieC;
  float x;
  float y;
  int valueOfDie =(int)random(1, 7);

  Die(color a, color b) { // constructor, that takes a color for the die and a color for the eyes on the die.
    dieC = a;
    eyeC = b;
  }

  void roll() // Method that assigns arandom value between 1 and 7 to the die.
  {
    valueOfDie = (int)random(1, 7);
  }

  void draw(float x, float y, float size) { // that draws the die on the screen with the correct number of eyes at position (x,y)
    // and with an edge length determined by the parameter size.
    float eyeSize = 0.2;

    rectMode(CENTER);
    fill(dieC);
    rect(x, y, size, size);

    //fill(eyeC);
    //if (key==ENTER) {
      ellipseMode(CENTER);
      fill(eyeC);

      switch(valueOfDie) {
      case 1:
        ellipse(x, y, size*eyeSize, size*eyeSize);          //mid mid
        break;

      case 2:

        ellipse(x-15, y-15, size*eyeSize, size*eyeSize);    //top left
        ellipse(x+15, y+15, size*eyeSize, size*eyeSize);    //bottom right
        break;

      case 3:

        ellipse(x-15, y-15, size*eyeSize, size*eyeSize);    //top left
        ellipse(x, y, size*eyeSize, size*eyeSize);          //mid mid
        ellipse(x+15, y+15, size*eyeSize, size*eyeSize);    //bottom right

        break;

      case 4:

        ellipse(x+15, y-15, size*eyeSize, size*eyeSize);    //top right
        ellipse(x-15, y-15, size*eyeSize, size*eyeSize);    //top left
        ellipse(x+15, y+15, size*eyeSize, size*eyeSize);    //bottom right
        ellipse(x-15, y+15, size*eyeSize, size*eyeSize);    //bottom left
        break;

      case 5:

        ellipse(x+15, y-15, size*eyeSize, size*eyeSize);    // top right
        ellipse(x-15, y-15, size*eyeSize, size*eyeSize);    //top left
        ellipse(x, y, size*eyeSize, size*eyeSize);          //mid mid
        ellipse(x+15, y+15, size*eyeSize, size*eyeSize);    //bottom right
        ellipse(x-15, y+15, size*eyeSize, size*eyeSize);    //bottom left
        break;

      case 6:

        ellipse(x-15, y, size*eyeSize, size*eyeSize);       //left mid
        ellipse(x+15, y-15, size*eyeSize, size*eyeSize);    // top right
        ellipse(x-15, y-15, size*eyeSize, size*eyeSize);    //top left
        ellipse(x+15, y+15, size*eyeSize, size*eyeSize);    //bottom right
        ellipse(x+15, y, size*eyeSize, size*eyeSize);       //right mid
        ellipse(x-15, y+15, size*eyeSize, size*eyeSize);    //bottom left
        break;
      }
   // }
  }


  int getEyes() {
    return valueOfDie;
  }
}
