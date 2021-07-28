//Maximum Element in Binary Tree

public static int max(Node node) {
  if (node == null) {
    return Integer.MIN_VALUE;
  }

  int lm = max(node.left);
  int rm = max(node.right);
  int tm = Math.max(node.data, Math.max(lm, rm));
  
  return tm;
}

/*
Sample Input
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Sample Output
87

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/