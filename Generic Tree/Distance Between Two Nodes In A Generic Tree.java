//Distance Between Two Nodes In A Generic Tree

public static int distanceBetweenNodes(Node node, int d1, int d2) {
  ArrayList p1 = nodeToRootPath(node, d1);

  ArrayList p2 = nodeToRootPath(node, d2);
  int i = p1.size() - 1;
  int j = p2.size() - 1;
  while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
    i--;
    j--;
  }
  i++;
  j++;
  return i + j;
}

/*
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
100
110

Sample Output
5

Time Complexity: O(n)

The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(n)

The space complexity for the function is linear as we are maintaining two paths which in the worst case can be equal to the size of the tree. In addition to this, some extra space is also consumed due to the recursion stack.

*/