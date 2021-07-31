//Node to root path In Binary Tree

public static ArrayList<Integer> nodeToRootPath(Node node, int data) {

    if (node == null) {
      return new ArrayList<>();
    }

    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }

    ArrayList<Integer> lr = nodeToRootPath(node.left, data);
    if (lr.size() > 0) {
      lr.add(node.data);
      return lr;
    }

    ArrayList<Integer> rr = nodeToRootPath(node.right, data);
    if (rr.size() > 0) {
      rr.add(node.data);
      return rr;
    }

    return new ArrayList<>();
}

/*
Sample Input
19
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
30

Sample Output
[30, 37, 25, 50]

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/