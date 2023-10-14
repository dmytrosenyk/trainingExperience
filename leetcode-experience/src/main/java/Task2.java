import help.ListNode;

/*
Add Two Numbers

Difficulty - Medium
Runtime - 1 ms
Memory - 42.79 MB
Time - 13 min
 */
public class Task2 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    return adder(l1, l2, 0);
  }

  private ListNode adder(ListNode l1, ListNode l2, int x) {

    if (l1 == null && l2 == null && x == 0) {
      return null;
    }

    int val1 = l1 == null ? 0 : l1.val;
    int val2 = l2 == null ? 0 : l2.val;

    int result = val1 + val2 + x;
    x = result / 10;

    l1 = l1 == null ? null : l1.next;
    l2 = l2 == null ? null : l2.next;

    return new ListNode(result % 10, adder(l1, l2, x));
  }
}
