//Find In Generic Tree

  public static boolean find(Node node, int data) {
   
    if(node.data==data){
        return true;
    }
    for(Node child : node.children){
        boolean ans = find(child,data);
        if(ans){
            return true;
        }
    }
    return false;
  }

  /*
  Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120

Sample Output
true

Time Complexity: O(n)

The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)

The space complexity for the function is proportional to the height of the given tree due to the recursion stack.

*/