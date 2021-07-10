  public static void display(Node node) {
  String str = node.data+"->";
   for(Node child: node.children){
       str+=child.data+",";
       str+=".";
       System.out.println(str);
   }
   for(Node child: node.children){
       display(child);
   }
  }
  
Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
