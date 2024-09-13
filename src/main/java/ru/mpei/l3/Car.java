package ru.mpei.l3;

public class Car {
    private int releaseYear = 2024;
    private String color;
    private boolean sold;
    private String model;

    public Car() {
    }

    public Car(int releaseYear, String color, boolean sold, String model) {
        this.releaseYear = releaseYear;
        this.color = color;
        this.sold = sold;
        this.model = model;
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
        this.releaseYear = 2020;
        this.sold = true;
    }

    /**
     * moethod to change car color
     *
     * @param clr - new color to set
     */
    public void setColor(String clr) {
        if (clr.equals("green") || clr.equals("red") || clr.equals("blue")) {
            color = clr;
        } else {
            System.err.println("Not man color set!");
        }
//        this.getAge();
    }

    public int getAge() {
        int age = 2024 - releaseYear;
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
