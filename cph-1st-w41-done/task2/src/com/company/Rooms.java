package com.company;

public class Rooms {

    int walls;
    int numOfDoors;
    int numOfLamps;
    int numOfWindows;

    public Rooms(int wallsX,int numOfDoorsX,int numOfLampsX,int numOfWindowsX){
        this.walls=wallsX;
        this.numOfDoors=numOfDoorsX;
        this.numOfLamps=numOfLampsX;
        this.numOfWindows=numOfWindowsX;
    }

    public int getWalls() {
        return walls;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public int getNumOfLamps() {
        return numOfLamps;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }
}