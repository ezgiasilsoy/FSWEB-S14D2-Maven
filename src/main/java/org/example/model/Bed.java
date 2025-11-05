package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int sheets;
    private int quilts;
    private int height;

    public Bed(String style, int pillows, int sheets, int quilts, int height) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilts = quilts;
        this.height = height;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }


    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getHeight() {
        return height;
    }



    public String getStyle() {
        return style;
    }
}
