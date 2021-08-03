// Print Nodes K Distance Away

//The function is expected to print all nodes which are k distance away in any direction from node with value equal to data.

 public static void printKNodesFar(Node node, int data, int k) {
 
    ArrayList<Node> path = nodeToRootPath(node, data);

    for (int i = 0; i < path.size(); i++) {
      printKLevelsDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1));
    }
  }

  public static void printKLevelsDown(Node node, int k, Node blocker) {

    if (node == null || k < 0 || node == blocker) {
      return;

    }
    if (k == 0) {
      System.out.println(node.data);
      return;
    }
    printKLevelsDown(node.left, k - 1, blocker);
    printKLevelsDown(node.right, k - 1, blocker);
  }

  public static ArrayList<Node> nodeToRootPath(Node node, int data) {

    if (node == null) {
      return new ArrayList<>();
    }

    if (node.data == data) {
      ArrayList<Node> path = new ArrayList<>();
      path.add(node);
      return path;
    }

    ArrayList<Node> lr = nodeToRootPath(node.left, data);
    if (lr.size() > 0) {
      lr.add(node);
      return lr;
    }
    ArrayList<Node> rr = nodeToRootPath(node.right, data);
    if (rr.size() > 0) {
      rr.add(node);
      return rr;
    }

    return new ArrayList<>();
  }

/*
Sample Input
19
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
37
2

Sample Output
12
50
*/
