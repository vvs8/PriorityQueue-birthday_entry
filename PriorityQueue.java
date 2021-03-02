import java.util.*;

public class PriorityQueue {
  ArrayList <BirthdayEntry> EnrtyArray;

  public PriorityQueue() {
    EnrtyArray = new ArrayList <BirthdayEntry>();
  }

  public void add(BirthdayEntry data) {
    EnrtyArray.add(data);
    Collections.sort(EnrtyArray, BdayComparator);
  }

  public BirthdayEntry poll() {
    return EnrtyArray.remove(0);
  }

 Comparator <BirthdayEntry> BdayComparator = Comparator.comparing(BirthdayEntry::getMonth).thenComparing(BirthdayEntry::getDay);
	  
}
