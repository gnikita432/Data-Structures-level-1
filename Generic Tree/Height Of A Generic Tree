 public static int height(Node node) {
  
    int height=-1;
    for(Node child:node.children){
        int h = height(child);
       height = Math.max(h,height);
    }
    height=height+1;
    return height;
  }

/*
Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
Sample Output
2
*/
