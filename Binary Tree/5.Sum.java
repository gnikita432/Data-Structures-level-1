//Sum of Binary Tree

 public static int sum(Node node) {
  if (node == null) {
    return 0;
  }

  int ls = sum(node.left);
  int rs = sum(node.right);
  int ts = ls + rs + node.data;

  return ts;
}

/*
Sample Input
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Sample Output
448

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/