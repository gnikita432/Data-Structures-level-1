//Node With Maximum Subtree Sum

static int mSum = 0;

static int mSumNode = 0;
private static int nodeWithMaximumSubtreeSum(Node node) {
  int sum = 0;
  for (Node child : node.children) {
    int cstSum = nodeWithMaximumSubtreeSum(child);
    sum += cstSum;
  }
  sum += node.data;
  if (sum > mSum) {
    mSum = sum;
    mSumNode = node.data;
  }
  return sum;
}

/*
Sample Input
20
10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1

Sample Output
30@130

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the generic tree.
*/
