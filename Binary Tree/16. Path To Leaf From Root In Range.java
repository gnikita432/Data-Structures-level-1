//Path To Leaf From Root In Range

public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi) {

  if (node == null) {
    return;
  }

  if (node.left == null && node.right == null) {
    sum = sum + node.data;
    if (sum >= lo && sum <= hi) {
      System.out.println(path + node.data);
    }
    return;
  }

  pathToLeafFromRoot(node.left, path + node.data + " ", sum + node.data, lo, hi);
  pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, lo, hi);
}

/*
Sample Input
23
50 25 12 n n 37 30 n n 40 n n 75 62 60 n n 70 n n 87 n n
150
250

Sample Output
50 25 37 40
50 75 62 60
50 75 87
*/
