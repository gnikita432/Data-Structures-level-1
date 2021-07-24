//Lowest Common Ancestor (generic Tree)

public static int lca(Node node, int d1, int d2) {
   
    ArrayList <Integer> d1path = nodeToRootPath(node, d1);
    ArrayList <Integer> d2path = nodeToRootPath(node, d2);
    
    int i=d1path.size()-1;
    int j=d2path.size()-1;
    
    while(i>=0 && j>=0 && d1path.get(i)==d2path.get(j)){
        i--;
        j--;
    }
    return d1path.get(i+1);
  }

  /*
  Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120
80

Sample Output
80


Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(n)
The space complexity for the function is linear as we are maintaining two paths which in the worst case can be equal to the size of the tree. In addition to this, some extra space is also consumed due to the recursion stack.

*/