 public static void levelOrder(Node node){
    Queue <Node> que = new ArrayDeque<>();
    que.add(node);
    
    while(que.size()>0){
       node =  que.remove();  
       System.out.print(node.data + " ");
       
       for(Node child : node.children){
           que.add(child);
       }         
    }
    System.out.print(".");
  }

/*
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
Sample Output
10 20 30 40 50 60 70 80 90 100 110 120 .
*/
