// import javax.swing.tree.TreeNode;

 class TreeNode {
   int val;
   TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
    }
 }
 
public class bst {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val)return root;
       else if(root.val<val) return searchBST(root.right,val);
       //root.val>val
        else  return searchBST(root.left,val);
        // return null;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);

        bst obj = new bst();

        int target = 6;
        TreeNode result = obj.searchBST(root, target);

        if (result != null)
            System.out.println("Value found: " + result.val);
        else
            System.out.println("Value not found");                        
    }
}
