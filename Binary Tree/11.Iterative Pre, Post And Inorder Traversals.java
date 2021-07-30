//Iterative Pre, Post And Inorder Traversals Of Binary Tree

/*
 public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }
*/

public static void iterativePrePostInTraversal(Node node) {

  Stack <Pair> st = new Stack<>();
  st.push(new Pair(node, 1));

  String pre = "";
  String in = "";
  String post = "";

  while (st.size() > 0) {
    Pair nodep = st.peek();

    if (nodep.state == 1) {
      pre += nodep.node.data + " ";
      st.peek().state = 2;

      if (nodep.node.left != null) {
        st.push(new Pair(nodep.node.left, 1));
      }
    }

    else if (nodep.state == 2) {
      in += nodep.node.data + " ";
      st.peek().state = 3;

      if (nodep.node.right != null) {
        st.push(new Pair(nodep.node.right, 1));
      }
    }

    else {
      post += nodep.node.data + " ";

      st.pop();
    }
  }

  System.out.println(pre);
  System.out.println(in);
  System.out.println(post);
}

/*
Sample Input
19
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Sample Output
50 25 12 37 30 75 62 70 87 
12 25 30 37 50 62 70 75 87 
12 30 37 25 70 62 87 75 50 
*/
