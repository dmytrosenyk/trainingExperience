import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Unique Email Addresses

Difficulty - Easy
Runtime - 33 ms
Memory - 44.66 MB
Time - 15 min
 */
public class Task929 {

  public int numUniqueEmails(String[] emails) {

    Set<String> set = new HashSet<String>();

    for (String e : emails) {
      String[] p = e.split("@");
      p[0] = p[0].replaceAll("\\.", "");
      String[] p1 = p[0].split("\\+");
      set.add(p1[0] + "@" + p[1]);
    }

    return set.size();
  }
}
