 public static void levelOrderLinewise1(Node node) {
    Queue <Node> mainQ = new ArrayDeque<>();
    Queue <Node> childQ = new ArrayDeque<>();

    mainQ.add(node);

    while (mainQ.size() > 0) {
      node = mainQ.remove();
      System.out.print(node.data + " ");

      for (Node child : node.children) {
        childQ.add(child);
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
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
Sample Output
10 
20 30 40 
50 60 70 80 90 100 
110 120
*/
