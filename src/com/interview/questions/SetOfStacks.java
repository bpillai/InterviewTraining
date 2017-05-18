package com.interview.questions;

import java.util.ArrayList;
 
public class SetOfStacks{
    private int threshold;
    private ArrayList<MyStack> setOfStacks =new  ArrayList<MyStack>();
     
    SetOfStacks(int threshold) {
        this.threshold = threshold;        
    }
    //get the last stack
    public MyStack getLastStack(){
        int size = setOfStacks.size();
        if(size <= 0) return null;
        else return setOfStacks.get(size - 1);
    }
     
    //get the nth stack
    public MyStack getNthStack(int n){
        int size = setOfStacks.size();
        if(size <= 0) return null;
        else return setOfStacks.get(n - 1);
    }
     
    //push value
    public void push(int value){
        MyStack lastStack = this.getLastStack();
         
        if(lastStack == null){
            lastStack = new MyStack(threshold);
            lastStack.push(value);
            setOfStacks.add(lastStack);
        }else {
            if( !lastStack.isAtCapacity())
                lastStack.push(value);
            else {
                MyStack newLastStack = new MyStack(threshold);
                newLastStack.push(value);
                setOfStacks.add(newLastStack);
            }
        }    
    }
    // the pop 
    public int pop(){
        MyStack lastStack = this.getLastStack();
        int v = lastStack.pop();
        if(lastStack.size() == 0) setOfStacks.remove(setOfStacks.size() -  1);
        return v;
    }
     
     
    //pop the nth stack
    public int pop(int nth){
         MyStack nthStack = this.getNthStack(nth);
         int v = nthStack.pop();
         if(nthStack.size() == 0) setOfStacks.remove(setOfStacks.size() -  1);
         return v;   
         
    }
     
    public String toString(){
        String s = "";
        for(int i = 0; i < setOfStacks.size(); i++){
            MyStack stack = setOfStacks.get(i);
            s = "||" + stack.toString() +  s;
        }
         
        return s;
    }
     
     
    public static void main(String[] args){
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        stacks.push(7);
        System.out.println("the stack is: " + stacks);
        stacks.pop(1);
        System.out.println("pop 1st: " + stacks);
        stacks.pop(2);
        System.out.println("pop 2nd stack: " + stacks);
        stacks.pop(1);
        System.out.println("pop 1st stack: " + stacks);
        stacks.pop(2);
        System.out.println("pop 2nd stack: " + stacks);
         
         
    }
}