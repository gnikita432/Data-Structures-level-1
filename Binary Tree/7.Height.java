//Height of Binary Tree

public static int height(Node node) {
  if (node == null) {
    return -1;
  }

  int lh = height(node.left);
  int rh = height(node.right);
  int th = Math.max(lh, rh) + 1;

  return th;
}

/*
Sample Input
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Sample Output
3

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/