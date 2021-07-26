//Are Trees Similar In Shape

public static boolean areSimilar(Node n1, Node n2) {
  if (n1.children.size() != n2.children.size()) {
    return false;

  }
  for (int i = 0; i < n1.children.size(); i++) {
    Node c1 = n1.children.get(i);
    Node c2 = n2.children.get(i);
    if (areSimilar(c1, c2) == false) {
      return false;
    }
  }
  return true;
}

/*
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
24
1 2 5 -1 6 -1 -1 3 7 -1 8 11 -1 12 -1 -1 9 -1 -1 4 10 -1 -1 -1

Sample Output
true

Time Complexity: O(n)

The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)

The space complexity for the function is proportional to the height of the tree due to the recursion stack.

*/