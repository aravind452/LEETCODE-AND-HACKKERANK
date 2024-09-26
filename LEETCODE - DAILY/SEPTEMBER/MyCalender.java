package SEPTEMBER;

import java.util.*;

public class MyCalender {

  ArrayList<int[]> list;

  public MyCalender() {
    list = new ArrayList<>();

  }

  public boolean book(int start, int end) {

    for (int i[] : list) {
      int fStart = i[0];
      int fEnd = i[1];

      if (start < fEnd && end > fStart)
        return false;

    }
    list.add(new int[] { start, end });
    return true;

  }

  public static void main(String[] args) {
    MyCalender calender = new MyCalender();
    boolean ans = calender.book(10, 20);
    System.out.println(ans);

  }

}
