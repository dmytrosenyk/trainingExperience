/*
Zigzag Conversion

Difficulty - Medium
Runtime - 4 ms
Memory - 44.1 MB
Time - 16 min
 */
public class Task6 {

  public String convert(String s, int numRows) {

    if (numRows == 1 || s.length() <= numRows)
      return s;

    char[] chars = s.toCharArray();
    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++)
      rows[i] = new StringBuilder();

    int index = 0;
    int direction = -1;

    for (char c : chars) {
      rows[index].append(c);
      if (index == 0 || index == numRows - 1)
        direction *= -1;
      index += direction;
    }

    StringBuilder result = new StringBuilder();
    for (StringBuilder row : rows)
      result.append(row);

    return result.toString();
  }
}
