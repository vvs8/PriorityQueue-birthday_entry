import java.util.*;

public class Main {
  public static void main (String[] args) {
    PriorityQueue birthdaysPQ = new PriorityQueue();

    BirthdayEntry firstDate = new BirthdayEntry(13, "April", "John");
    BirthdayEntry secondDate = new BirthdayEntry(4, "December", "Rose"); 
    BirthdayEntry thirdDate = new BirthdayEntry(19, "February", "Dave"); 
    BirthdayEntry fourthDate = new BirthdayEntry(20, "December", "Jade");
    BirthdayEntry fifthDate = new BirthdayEntry(3, "October", "Jack");
    BirthdayEntry sixthDate = new BirthdayEntry(5, "October", "John");
    BirthdayEntry seventhDate = new BirthdayEntry(20, "January", "Max");
    
    
    
    birthdaysPQ.add(firstDate);
    birthdaysPQ.add(secondDate);
    birthdaysPQ.add(thirdDate);
    birthdaysPQ.add(fourthDate);
    birthdaysPQ.add(fifthDate);
    birthdaysPQ.add(sixthDate);
    birthdaysPQ.add(seventhDate);
    birthdaysPQ.poll().announceBirthday();
    birthdaysPQ.poll().announceBirthday();
    birthdaysPQ.poll().announceBirthday();
    birthdaysPQ.poll().announceBirthday();
    birthdaysPQ.poll().announceBirthday();
    birthdaysPQ.poll().announceBirthday();
    birthdaysPQ.poll().announceBirthday();
  } 
}
