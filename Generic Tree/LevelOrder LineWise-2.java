 public static void levelOrderLinewise2(Node node) {
    Queue <Node> mainQ = new ArrayDeque<>();

    mainQ.add(node);
    mainQ.add(new Node(-1));

    while (mainQ.size() > 0) {
      node = mainQ.remove();

      if (node.data != -1) {
        System.out.print(node.data + " ");

        for (Node child : node.children) {
          mainQ.add(child);
        }
      }
      else {
        if (mainQ.size() > 0) {
          mainQ.add(new Node(-1));
          System.out.println();
        }
      }
    }
}
  
