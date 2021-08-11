//Iterative Preorder And Postorder Of Generic Tree

static class Pair {
  Node node;
  int state;

  Pair(Node node, int state) {
    this.node = node;
    this.state = state;
  }
}

private static void IterativePreandPostOrder(Node node) {

  Pair p = new Pair(node, -1);
  Stack st = new Stack<>();

  st.push(p);

  String preOrder = "";
  String postOrder = "";

  while (st.size() > 0) {
    Pair top = st.peek();
    if (top.state == -1) {
      preOrder += top.node.data + " ";
      top.state++;
    } else if (top.state >= 0 && top.state < top.node.children.size()) {
      Pair cp = new Pair(top.node.children.get(top.state), -1);
      st.push(cp);
      top.state++;
    } else {
      postOrder += top.node.data + " ";
      st.pop();
    }
  }
  System.out.println(preOrder);
  System.out.println(postOrder);
}

/*
Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1

Sample Output
10 20 -50 60 30 70 -80 110 -120 90 40 -100 
-50 60 20 70 110 -120 -80 90 30 -100 40 10 

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the stack.
*/
