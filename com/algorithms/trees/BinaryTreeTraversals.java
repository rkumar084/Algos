package com.algorithms.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversals {
  
  public static void printPreOrder(BinaryTreeNode root){
    if (root == null) return;
    System.out.print(root.getData() + "\t");
    printPreOrder(root.getLeft());
    printPreOrder(root.getRight());
  }
  
  public static void printInOrder(BinaryTreeNode root){
    if (root == null) return;
    printInOrder(root.getLeft());
    System.out.print(root.getData() + "\t");
    printInOrder(root.getRight());
  }
  
  public static void printPostOrder(BinaryTreeNode root){
    if (root == null) return;
    printPostOrder(root.getLeft());
    printPostOrder(root.getRight());
    System.out.print(root.getData() + "\t");
  }
  

  public static void printLevelOrder(BinaryTreeNode root) {

    if (root == null) return;

    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      System.out.println(""); 
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          break;
        }
        System.out.print("\t" + tempNode.getData());
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
      }
    }
  }
  
  public static void printZigZagOrder(BinaryTreeNode root) {

    if (root == null) return;
    
    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
    boolean leftToRight = false;
    
    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      System.out.println("");
      leftToRight = !leftToRight;
      Stack<Integer> stack = new Stack<Integer>();
      
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          break;
        }
        if (leftToRight) 
          System.out.print("\t" + tempNode.getData());
        else 
          stack.push(tempNode.getData());
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
      }
      
      while (!stack.isEmpty())
        System.out.print("\t" + stack.pop());
    }
  }
}
