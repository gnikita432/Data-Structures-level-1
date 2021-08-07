//Ceil And Floor In Generic Tree

static int ceil;
static int floor;

private static void ceilAndFloor(Node node, int data) {
  if (node.data > data) {
    if (node.data < ceil) {
      ceil = node.data;
    }
  }
  if (node.data < data) {
    if (node.data > floor) {
      floor = node.data;
    }
  }
  for (Node child : node.children) {
    ceilAndFloor(child, data);
  }
}

/*
Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
70

Sample Output
CEIL = 90
FLOOR = 60

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/
