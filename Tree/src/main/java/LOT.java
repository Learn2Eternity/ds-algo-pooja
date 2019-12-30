public class LOT {
    Node root;
    public static void main(String[] args) {
        LOT tree = new LOT();
        tree.root = new Node (1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(" Level Order Traversal(LOT) .....!!!!" );
        tree.printLOT();



    }

    public static int height (Node root) {
        if (root == null)
            return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.right);
            if (lh > rh)
                return lh + 1;
            else
                return rh + 1;
        }
    }
    void printLOT() {
        for (int i = 0; i < height(root); i++) {
            printLevelWiseData(root, i);
        }
    }
    void printLevelWiseData(Node root , int level){
        if(root == null)
            return;
        if (level ==0){
            System.out.print(root.data + " ");
        }
        else if (level > 0) {
            printLevelWiseData(root.left, level -1);
            printLevelWiseData(root.right,level-1);
        }

    }
}

class Node{
    int data;
    Node left, right;
    Node (int data){
        this.data = data;
        left =null;
        right = null;
    }
}
