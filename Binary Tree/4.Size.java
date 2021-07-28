//Size of Binary Tree

 public static int size(Node node) {
    // write your code here
   
    if(node==null){
        return 0;
    }
    
    int ls=size(node.left);
    int rs=size(node.right);
    
    int size = 1+ls+rs;
    return size;
  }

/*
Sample Input
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Sample Output
9

Time Complexity: O(n)
The time complexity for the function is linear as tree traversal is involved which is linear in terms of time complexity.

Space Complexity: O(logn)
The space complexity for the function is proportional to the height of the tree due to the recursion stack.
*/