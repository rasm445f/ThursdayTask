package com.company;

import java.util.ArrayList;
public class Building {
    ArrayList<Rooms> rooms;
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;

    public Building(ArrayList<Rooms> roomsX,int numberOfBathroomsX,int numberOfFloorsX,boolean isOfficeBuildingX){
        this.rooms=roomsX;
        this.numberOfBathrooms=numberOfBathroomsX;
        this.numberOfFloors=numberOfFloorsX;
        this.isOfficeBuilding=isOfficeBuildingX;
    }


    public ArrayList<Rooms> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}