import java.util.*;

public class KidsWithGreatestNoOfCandies {

  public static void main(String[] args) {
    int[] candies = { 4,2,1,1,2};
    int extraCandies = 1;

    List<Boolean> list = new ArrayList<>();

    int maxCandies = Arrays.stream(candies).max().getAsInt();

    for(int candy : candies){
      list.add(candy + extraCandies >= maxCandies);
    }

    System.out.println(list);

  }

}
