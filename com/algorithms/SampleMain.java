package com.algorithms;

import com.algorithms.trees.BinaryTreeNode;
import com.algorithms.trees.BinaryTreeTraversals;
import com.algorithms.trees.BuildBinarySearchTree;
import com.algorithms.trees.DeepestNode;
import com.algorithms.trees.MaxSumLevel;
import com.algorithms.trees.TreeComparision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SampleMain {

  public static void main(String[] args) {
    //    Scanner in = new Scanner(System.in);
    //    int noOfInputs = Integer.parseInt(in.nextLine());

        int[] numbers = {8, 3, 10, 1, 6, 14, 4, 7, 13};
    
        BinaryTreeNode root = null;
    
        root = BuildBinarySearchTree.buildBinarySearchTree(numbers);
        BinaryTreeTraversals.printZigZagOrder(root);
  }
}
