package com.algorithms.trees;

public class BSTSearching {
  
  public static int findMin(BinaryTreeNode root) {
    if (root == null) return -1;
    
    if ( root.getLeft() == null) return root.getData();
    
    return findMin(root.getLeft());
  }

  
  public static int findKthSmallest(BinaryTreeNode root) {
  
    return 0;
  }
  
  
  public static int leastCommonAncestor(BinaryTreeNode root, int num1, int num2) {
    if (root == null) return -1;

    if (root.getData() == num1 || root.getData() == num2) return root.getData();

    if ((root.getData() > num1 && root.getData() < num2)
        || (root.getData() < num1 && root.getData() > num2)) return root.getData();

    if (root.getData() > num1 && root.getData() > num2)
      return leastCommonAncestor(root.getLeft(), num1, num2);

    if (root.getData() < num1 && root.getData() < num2)
      return leastCommonAncestor(root.getRight(), num1, num2);
    return -1;
  }
}
