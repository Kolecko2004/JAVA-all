package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CircularArrayQueue implements Queue {
   String[] circularQueue;
   private int head, tail, currentSize;
   private int bigCapacity;

   public void StartValues(int capacity) {
      head = 0;
      tail = 0;
      bigCapacity = capacity;
      currentSize = 0;
   }

   public CircularArrayQueue() {
      circularQueue = new String[5];
      StartValues(5);
   }

   public CircularArrayQueue(int capacity) {
      circularQueue = new String[capacity];
      StartValues(capacity);
   }

   @Override
   public int size() {
      return currentSize;
   }

   @Override
   public boolean isEmpty() {
      return currentSize == 0;
   }

   @Override
   public boolean isFull() {
      return currentSize == bigCapacity;
   }

   @Override
   public boolean enqueue(String obj) {
      if (obj == null || isFull()) { // Prevent adding null or adding when full
         return false;
      }

      circularQueue[head] = obj;
      head = (head + 1) % bigCapacity;
      currentSize++;

      return true;
   }

   @Override
   public String dequeue() {
      if (isEmpty()) {
         return null;
      }

      String retString = circularQueue[tail];
      circularQueue[tail] = null;

      tail = (tail + 1) % bigCapacity;
      currentSize--;

      return retString;
   }

   @Override
   public Collection<String> getElements() {
      List<String> allStringValues = new ArrayList<>();

      for (int i = 0; i < currentSize; i++) { // Iterate only through valid elements
         int index = (tail + i) % bigCapacity; // Correct circular indexing
         allStringValues.add(circularQueue[index]);
      }

      return allStringValues;
   }

   @Override
   public void printAllElements() {
      for (String item : getElements()) {
         System.out.println(item);
      }
   }
}
