public static void removeLeaves(Node node) {
  for (int i = node.children.size() - 1;
       i >= 0; i--) {
    Node child = node.children.get(i);
    if (child.children.size() == 0) {
      node.children.remove(i);
    }
  }
  for (Node child : node.children) {
    removeLeaves(child);
  }
}

/*
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1

Sample Output
10 -> 20, 30, 40, .
20 -> .
30 -> 80, .
80 -> .
40 -> .


Time Complexity: O(n)

The time complexity for the function is linear as we are using preorder traversal.

Space Complexity: O(logn)

The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/
