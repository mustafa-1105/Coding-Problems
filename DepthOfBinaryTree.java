/**
 * Created by admin on 02-Aug-18.
 */

// Java program to find height of tree

class DepthOfBinaryTree
{
    TreeNode root;

    /* Compute the "maxDepth" of a tree -- the number of 
       TreeNodes along the longest path from the root TreeNode 
       down to the farthest leaf TreeNode.*/
    int maxDepth(TreeNode TreeNode)
    {
        if (TreeNode == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(TreeNode.left);
            int rDepth = maxDepth(TreeNode.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        DepthOfBinaryTree tree = new DepthOfBinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));
    }
}
