//Node To Root Path In Generic Tree

private static ArrayList nodeToRootPath(Node node, int data) {
  if (node.data == data) {
    ArrayList path = new ArrayList<>();

    path.add(node.data);
    return path;
  }
  for (Node child : node.children) {
    ArrayList ptc = nodeToRootPath(child, data);
    if (ptc.size() > 0) {
      ptc.add(node.data);
      return ptc;
    }
  }
  return new ArrayList<>();
}

/*
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120

Sample Output
[120, 80, 30, 10]

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the given tree due to the recursion stack.

*/