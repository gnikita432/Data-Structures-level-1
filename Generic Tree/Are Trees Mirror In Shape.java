//Are Trees Mirror In Shape

public static boolean areMirror(Node n1, Node n2) {
  if (n1.children.size() != n2.children.size()) {
    return false;

  }
  for (int i = 0; i < n1.children.size(); i++) {
    Node c1 = n1.children.get(i);
    Node c2 = n2.children.get(n2.children.size() - 1 - i);
    if (areMirror(c1, c2) == false) {
      return false;
    }
  }
  return true;
}

/*
Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
12
100 200 -1 300 500 -1 600 -1 -1 400 -1 -1

Sample Output
true

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/
