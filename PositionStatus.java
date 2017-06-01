package com.example.danielfang.myapplication;

/**
 * Created by Danielfang on 2017/5/30.
 */

public class PositionStatus {
    Position currentPosition;
    Position lastPosition;
    public Position getCurrentPosition()
    {

        return currentPosition;
    }
    public float getDistance()
    {
        float lanA=currentPosition.getLantitude(),lanB=lastPosition.getLantitude(),
                lonA=currentPosition.getLongitude(),lonB=lastPosition.getLongitude();
        //0.00000900900901
        double delX;
        double delY;
        delX=(lanA-lanB)/0.00000900900901;
        delY=(lonA-lonB)/0.00000900900901;
        float distance;
        distance= (float) Math.sqrt((delX * delX) + (delY * delY));
        return distance;
    }
    public void openGPS()
    {

    }
}
