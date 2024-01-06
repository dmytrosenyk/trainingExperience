import java.util.ArrayList;
import java.util.List;

/*
Product of the Last K Numbers

Difficulty - Medium
Runtime - 15 ms
Memory - 69 MB
Time - 25 min
 */
public class Task1352 {

  List<Integer> list;
  int prev;

  public Task1352() {

    list = new ArrayList();
    list.add(1);
    prev = 1;
  }

  public void add(int num) {

    if (num > 0) {
      prev *= num;
      list.add(prev);
    }
    else {
      list = new ArrayList();
      list.add(1);
      prev = 1;
    }
  }

  public int getProduct(int k) {

    int N = list.size();
    return (k < N) ? prev / list.get(N - 1 - k) : 0;
  }
}
