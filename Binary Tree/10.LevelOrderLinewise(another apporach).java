//Level order linewise Display of binary tree with one Queue only(another approch)

p public static void levelOrder(Node node) {
    // write your code here

    Queue <Node> Q = new ArrayDeque<>();
    Q.add(node);

    while (Q.size() > 0) {
      int count = Q.size();
      for (int i = 0 ; i < count; i++) {
        node = Q.remove();

        System.out.print(node.data + " ");

        if (node.left != null) {
          Q.add(node.left);
        }
        if (node.right != null) {
          Q.add(node.right);
        }
      }

      System.out.println();
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