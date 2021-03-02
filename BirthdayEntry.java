import java.util.*;

public class BirthdayEntry { 
  int day;
  int month;
  String name;
  
  public BirthdayEntry(int dayIn, String monthIn, String nameIn) {
    day = dayIn; 
    month = monthToInt(monthIn); 
    name = nameIn;
  }

  public int getMonth() {return month;}
  public int getDay() {return day;}

  private int monthToInt(String month) {
    if (month == "December") {
      return 12;
    }
    else if (month == "November") {
      return 11;
    }
    else if (month == "October") {
      return 10;
    }
    else if (month == "September") {
      return 9;
    }
    else if (month == "August") {
      return 8;
    }
    else if (month == "July") {
      return 7;
    }
    else if (month == "June") {
      return 6;
    }
    else if (month == "May") {
      return 5;
    }
    else if (month == "April") {
      return 4;
    }
    else if (month == "March") {
      return 3;
    }
    else if (month == "February") {
      return 2;
    }
    else if (month == "January") {
      return 1;
    }
    return 0;
  }

  private String monthToStr(int month) {
    if (month == 12) {
      return "December";
    }
    else if (month == 11) {
      return "November";
    }
    else if (month == 10) {
      return "October";
    }
    else if (month == 9) {
      return "September";
    }
    else if (month == 8) {
      return "August";
    }
    else if (month == 7) {
      return "July";
    }
    else if (month == 6) {
      return "June";
    }
    else if (month == 5) {
      return "May";
    }
    else if (month == 4) {
      return "April";
    }
    else if (month == 3) {
      return "March";
    }
    else if (month == 2) {
      return "February";
    }
    else if (month == 1) {
      return "January";
    }
    return null;
  }

  public void announceBirthday() {
    System.out.println("I'm " + name + ", and my birthday is " + day + " " + monthToStr(month)); 
  }
  
}
