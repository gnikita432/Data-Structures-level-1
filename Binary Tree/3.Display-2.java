//Display a Binary Tree

public static void display(Node node) {
    if (node == null) {
      return;
    }

    System.out.println(node.data);

    display(node.left);
    System.out.println("null");
    display(node.right);
    
}

 /*
Sample Input
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Sample Output
50
25
12
null
null
37
30
null
null
null
75
62
null
70
null
null
87
null
*/
