package com.baris;

public class Car
{
    public int year;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        if (year<=2020)
        {
            this.year = year;
        }
        else
            System.out.println("Wrong year");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOtomaticVites() {
        return otomaticVites;
    }

    public void setOtomaticVites(boolean otomaticVites) {
        this.otomaticVites = otomaticVites;
    }

    private String colour;
    private String name;
    private  boolean otomaticVites;

}
