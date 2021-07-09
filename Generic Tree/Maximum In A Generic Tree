 public static int max(Node node) {
   
    int max =Integer.MIN_VALUE;
    
    for(Node child : node.children){
        int mv = max(child);
        if(mv>max){
            max=mv;
        }
    }
      if(node.data>max){
           max=node.data;
        }
        return max;
  }
  
/*Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
Sample Output
60
*/
