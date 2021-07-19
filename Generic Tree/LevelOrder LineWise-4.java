 public static void levelOrderLinewise4(Node node) {
   
    Queue <pair> Q = new ArrayDeque <> ();
    int level=1;
    Q.add(new pair(node , level) );
    
    while(Q.size()>0){
        pair p = Q.remove();
        if(p.level>level){
            level = p.level;
            System.out.println();
        }
        System.out.print(p.node.data + " ");
        for(Node child : p.node.children){
            pair cp = new pair(child , p.level+1);
            Q.add(cp);
        }
    }

  }
