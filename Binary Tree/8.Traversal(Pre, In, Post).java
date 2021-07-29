// Pre In and Post order traversal of binary tree

public static void Pre(Node node) {
    if (node == null) {
        return;
    }

    System.out.println(node.data);
    Pre(node.left);
    Pre(node.right);
}

public static void In(Node node) {
    if (node == null) {
        return;
    }

    In(node.left);
    System.out.println(node.data);
    In(node.right);
}

public static void Post(Node node) {
    if (node == null) {
        return;
    }

    Post(node.left);
    Post(node.right);
    System.out.println(node.data);
}
