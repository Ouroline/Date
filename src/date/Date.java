/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

/**
 *
 * @author lucif
 */
public class Date {
    private int day;
    private int month;
    private int year;
    private int date;

    public Date(int day, int month, int year, int date) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.date = date;
    }

    public Date() {
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDate() {
        return date;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    
}
