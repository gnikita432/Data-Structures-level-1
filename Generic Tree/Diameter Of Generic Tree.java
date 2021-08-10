//Diameter Of Generic Tree

static int dia = 0;
private static int diameter(Node node) {
  int ht = -1;
  int sh = -1;
  
  for (Node child : node.children) {
    int ch = diameter(child);
    if (ch >= ht) {
      sh = ht;
      ht = ch;
    } else if (ch >= sh) {
      sh = ch;
    }
  }
  if (sh + ht + 2 > dia) {
    dia = sh + ht + 2;
  }
  ht += 1;
  return ht;
}

/*
Sample Input
20
10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1

Sample Output
4

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(h)
The space complexity for the function is proportional to the height of the generic tree due to the recursion stack.
*/
