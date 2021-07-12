  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }
  
/* Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
Sample Output
6Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
Sample Output
6
*/
