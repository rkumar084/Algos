package com.algorithms;

import com.algorithms.heaps.Heap;
import com.algorithms.heaps.HeapCreation;
import com.algorithms.heaps.HeapSearch;
import com.algorithms.trees.BSTSearching;
import com.algorithms.trees.BinaryTreeNode;
import com.algorithms.trees.BuildBinarySearchTree;

public class SampleMain {

  public static void main(String[] args) {
    //    Scanner in = new Scanner(System.in);
    //    int noOfInputs = Integer.parseInt(in.nextLine());


    int[] numbers = new int[100];
    numbers[0] = 8; // 3, 10, 1, 6, 14 }; //, 4, 7, 13, 20, 30, 25, 100, 90, 5, 35};
    numbers[1] = 3;
    numbers[2] = 10;
    numbers[3] = 1;
    numbers[4] = 14;
    numbers[5] = 4;
    numbers[6] = 7;    
    numbers[7] = 13;
    
    Heap heap = new Heap(numbers, 7);

    heap.buildHead();
    heap.printHeap();
    heap.replace(5);
    heap.printHeap();
    
  }
  
}
