
public class Main {
    public static void main(String[] args) {
        // Exemplo 1
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        int NodeInicial = 7;
        int NodeFinal = 15;

        BSTRangeSum bst = new BSTRangeSum();
        int result = bst.rangeSumBST(root, NodeInicial, NodeFinal);

        System.out.println("Saída: " + result);

        //Exemplo 2
        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(5);
        root2.left.left = new TreeNode(3);
        root2.left.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(7);
        root2.left.right.left = new TreeNode(6);
        root2.right = new TreeNode(15);
        root2.right.left = new TreeNode(13);
        root2.right.right = new TreeNode(18);

        int NodeInicial2 = 6;
        int NodeFinal2 = 10;

        BSTRangeSum bst2 = new BSTRangeSum();
        int result2 = bst2.rangeSumBST(root2, NodeInicial2, NodeFinal2);

        System.out.println("Saída: " + result2);

    }
}
