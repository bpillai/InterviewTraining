package com.interview.questions;

//MyStack goes with size(), isAtCapacity()
//implemented from a array

class MyStack {
   
  private int top = -1;   
  private int[] buffer;
  private int capacity;
   
   
  MyStack(int capacity){
      this.capacity = capacity;
      buffer = new int[capacity];
  }
   
  public void push(int v){
      buffer[++top] = v;
  }
   
  public int pop(){
       
      return buffer[top--];
  }
  // if the stack is at capacity
  public Boolean isAtCapacity(){
      return capacity == top + 1;
  }
  //return the size of the stack
  public int size(){
      return top+1;
  }
   
  public String toString(){
      String s = "";
      int index = top;
      while(index >= 0){
          s += "[" + buffer[index--] + "]"+ " -> ";
      }
      return s;
       
  }

}