//Predecessor And Successor Of An Element

static Node predecessor;
static Node successor;
static int state;

private static void predecessorAndSuccessor(Node node, int data) {
  if (state == 0) {
    if (node.data == data) {
      state++;
    } else {
      predecessor = node;
    }
  } else if (state == 1) {
    successor = node;
    state++;
  }
  for (Node child : node.children) {
    predecessorAndSuccessor(child, data);
  }
}

/*
Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
-120

Sample Output
Predecessor = 110
Successor = 90

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/
