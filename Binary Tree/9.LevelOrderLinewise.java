//Level order linewise Display of binary tree

public static void levelOrder(Node node) {

  Queue <Node> mainQ = new ArrayDeque<>();
  Queue <Node> childQ = new ArrayDeque<>();

  mainQ.add(node);

  while (mainQ.size() > 0) {

    node = mainQ.remove();
    System.out.print(node.data + " ");

    if (node.left != null) {
      childQ.add(node.left);
    }
    if (node.right != null) {
      childQ.add(node.right);
    }

    if (mainQ.size() == 0) {
      mainQ = childQ;
      childQ = new ArrayDeque<>();
      System.out.println();
    }

  }

}

/*
Sample Input
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Sample Output
50 
25 75 
12 37 62 87 
30 70 
*/