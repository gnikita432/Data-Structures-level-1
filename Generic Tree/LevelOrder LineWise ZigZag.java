public static void levelOrderLinewiseZZ(Node node) {

  Stack <Node> mainStack = new Stack ();
  Stack <Node> childStack = new Stack ();

  mainStack.push(node);
  int level = 1;
  while (mainStack.size() > 0) {
    node = mainStack.pop();
    System.out.print(node.data + " ");
    if (level % 2 != 0) {
      for (int i = 0 ; i < node.children.size(); i++) {
        childStack.push(node.children.get(i));
      }
    }
    else {
      for (int i = node.children.size() - 1; i >= 0 ; i--) {
        childStack.push(node.children.get(i));
      }
    }
    if (mainStack.size() == 0) {
      mainStack = childStack;
      childStack = new Stack();
      level++;
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
40 30 20 
50 60 70 80 90 100 
120 110
*/
