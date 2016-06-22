package com.algorithms;

import com.algorithms.heaps.HeapCreation;
import com.algorithms.trees.BSTSearching;
import com.algorithms.trees.BinaryTreeNode;
import com.algorithms.trees.BuildBinarySearchTree;

public class SampleMain {

  public static void main(String[] args) {
    //    Scanner in = new Scanner(System.in);
    //    int noOfInputs = Integer.parseInt(in.nextLine());

    int[] numbers = {8, 3, 10, 1, 6, 14, 4, 7, 13};
    //int[] numbers = {8, 3, 10, 1, 6, 14, 4, 7, 13, 20, 30, 25, 100, 90, 5, 35};
    HeapCreation.buildHead(numbers);
    HeapCreation.printHeap(numbers);

 
  }
  
}
