import help.TreeNode;

/*
Merge Two Binary Trees

Difficulty - Easy
Runtime - 0 ms
Memory - 43.78 MB
Time - 8 min
 */
public class Task617 {

  public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

    if (root1 == null && root2 == null) {
      return null;
    }
    if (root1 == null) {
      return root2;
    }
    if (root2 == null) {
      return root1;
    }
    TreeNode newTree = new TreeNode(root1.val + root2.val);

    newTree.left = mergeTrees(root1.left, root2.left);
    newTree.right = mergeTrees(root1.right, root2.right);
    return newTree;
  }
}
