 public static void traversals(Node node){
    System.out.println("Node Pre " + node.data);
    for(Node child: node.children){
        System.out.println("Edge Pre "+node.data + "--" + child.data);
        traversals(child);
        System.out.println("Edge Post "+ node.data + "--"+child.data);
    }
    System.out.println("Node Post "+node.data);
  }

/*
Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
Sample Output
Node Pre 10
Edge Pre 10--20
Node Pre 20
Node Post 20
Edge Post 10--20
Edge Pre 10--30
Node Pre 30
Edge Pre 30--50
Node Pre 50
Node Post 50
Edge Post 30--50
Edge Pre 30--60
Node Pre 60
Node Post 60
Edge Post 30--60
Node Post 30
Edge Post 10--30
Edge Pre 10--40
Node Pre 40
Node Post 40
Edge Post 10--40
Node Post 10
*/
