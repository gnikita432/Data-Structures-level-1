// Print K Levels Down in a binary tree

public static void printKLevelsDown(Node node, int k) {
  if (node == null || k < 0) {
    return;

  }
  if (k == 0) {
    System.out.println(node.data);
    return;
  }

  printKLevelsDown(node.left, k - 1);
  printKLevelsDown(node.right, k - 1);
}

/*
Sample Input
19
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
3

Sample Output
30
70

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/
