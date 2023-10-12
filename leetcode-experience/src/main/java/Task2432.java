/*
The Employee That Worked on the Longest Task

Difficulty - Easy
Runtime - 1 ms
Memory - 43.98 MB
Time - 9 min
 */
public class Task2432 {

  public int hardestWorker(int n, int[][] logs) {

    int result = logs[0][0];
    int maxTime = logs[0][1];

    for (int i = 1; i < logs.length; i++) {
      int time = logs[i][1] - logs[i - 1][1];
      if (maxTime == time) {
        result = Math.min(result, logs[i][0]);
      }
      else if (maxTime < time) {
        maxTime = logs[i][1] - logs[i - 1][1];
        result = logs[i][0];
      }
    }

    return result;
  }
}
