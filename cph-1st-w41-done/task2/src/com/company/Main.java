package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String []args){

        Rooms a1 = new Rooms(4,2,3,1);
        Rooms a2 = new Rooms(4,1,8,0);
        Rooms a3 = new Rooms(8,8,8,8);


        ArrayList<Rooms> arrayOfRooms=new ArrayList<>();
        arrayOfRooms.add(a1);
        arrayOfRooms.add(a2);
        arrayOfRooms.add(a3);

        Building b1 = new Building(arrayOfRooms,2,5,true);



        for (Rooms rooms: arrayOfRooms){
            System.out.println("number of laps: " +rooms.numOfLamps);
        }



        }
        //public void addLamps(){
          //  int totalNumOfLamps;
           // totalNumOfLamps=a1.numOfLamps+ a2.numOfLamps+a3.numOfLamps;

        //}
    }

