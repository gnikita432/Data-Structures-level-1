public static void linearize(Node node) {
  for (Node child : node.children) {
    linearize(child);

  }
  for (int i = node.children.size() - 2; i >= 0; i--) {
    Node ip1 = node.children.remove(i + 1);
    Node itail = getTail(node.children.get(i));
    itail.children.add(ip1);
  }
}
public static Node getTail(Node node) {
  while (node.children.size() == 1) {
    node = node.children.get(0);
  }
  return node;
}

/*
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1

Sample Output
10 -> 20, .
20 -> 50, .
50 -> 60, .
60 -> 30, .
30 -> 70, .
70 -> 80, .
80 -> 110, .
110 -> 120, .
120 -> 90, .
90 -> 40, .
40 -> 100, .
100 -> .

Time Complexity: O(n)

The time complexity for the function is linear.

Space Complexity: O(h)

The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/
