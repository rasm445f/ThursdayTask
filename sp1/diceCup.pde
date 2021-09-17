
class diceCup
{
  int dieces;

  Die[] dicePool;
  Die[][] sortDicePool;


  public diceCup(int dieces) {
    this.dieces=dieces;

    dicePool = new Die[dieces];
  }

  void addDice(Die d) {
    for (int i=0; i<dicePool.length; i++)
    {
      if (dicePool[i]==null) {
        dicePool[i]=d;
        break;
      }
    }
  }


  void shake() {
    for (int i=0; i < dicePool.length; i++) {
      dicePool[i].roll();
    }
  }

  void diceDraw(int x, int y, int size)
  {

    int dieSpace = size+size/2;



    sortDicePool= new Die[6][dieces];
    for (int i =0; i<dicePool.length; i++) {
      int getEyes = dicePool[i].getEyes();

      if (getEyes==1) 
      {
        for (int q =0; q<sortDicePool[getEyes-1].length; q++) {

          if (sortDicePool[getEyes-1][q]==null) {
            sortDicePool[getEyes-1][q]=dicePool[i];
            break;
          }
        }
      } else if (getEyes==2) {

        for (int q =0; q<sortDicePool[getEyes-1].length; q++) {

          if (sortDicePool[getEyes-1][q]==null) {
            sortDicePool[getEyes-1][q]=dicePool[i];

            break;
          }
        }
      } else if (getEyes==3) {
        for (int q =0; q<sortDicePool[getEyes-1].length; q++) {

          if (sortDicePool[getEyes-1][q]==null) {
            sortDicePool[getEyes-1][q]=dicePool[i];

            break;
          }
        }
      } else if (getEyes==4) {
        for (int q =0; q<sortDicePool[getEyes-1].length; q++) {

          if (sortDicePool[getEyes-1][q]==null) {
            sortDicePool[getEyes-1][q]=dicePool[i];

            break;
          }
        }
      } else if (getEyes==5) {
        for (int q =0; q<sortDicePool[getEyes-1].length; q++) {

          if (sortDicePool[getEyes-1][q]==null) {
            sortDicePool[getEyes-1][q]=dicePool[i];

            break;
          }
        }
      } else if (getEyes==6) {
        for (int q =0; q<sortDicePool[getEyes-1].length; q++) {

          if (sortDicePool[getEyes-1][q]==null) {
            sortDicePool[getEyes-1][q]=dicePool[i];

            break;
          }
        }
      }
    }
    int dieCount = 0;
    int xCount = 0;
    

    for (int i =0; i<sortDicePool.length; i++) {

      int nulCounter =0;
      for (int j =0; j<sortDicePool[0].length; j++) {
        println(sortDicePool[i][j]);
        if (sortDicePool[i][j]!=null) {
          sortDicePool[i][j].draw(x+xCount*dieSpace, y+dieCount*dieSpace, size);
          xCount++;
        } else {
          nulCounter++;
        }
      }
      if (nulCounter==dieces && dieCount!=0) {
        //dieCount--;
      } else {
        dieCount++;
      }
      nulCounter=0;
      xCount=0;
    }
  }
}
