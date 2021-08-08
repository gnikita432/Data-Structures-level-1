//Kth Largest Element In Tree

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

public static int kthLargest(Node node, int k) {
  int data = Integer.MAX_VALUE;
  floor = Integer.MIN_VALUE;
  for (int i = 0; i < k; i++) {
    ceilAndFloor(node, data);
    data = floor;
    floor = Integer.MIN_VALUE;
  }
  return data;
}

/*
Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
8

Sample Output
10

Time Complexity: O(k*n)
The time complexity for the function is k times linear as tree traversal is called k times to find the kTh largest element in the tree.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/
