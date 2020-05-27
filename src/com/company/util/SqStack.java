package com.company.util;

public class SqStack implements IStack {
    private Object[] stackElem;
    private int top;
    boolean b;

    public SqStack(int maxSize) {
        top = 0;
        stackElem = new Object[maxSize];
    }

    public void clear() {
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int length() {
        return top;
    }

    public Object peek() {
        if (!isEmpty())
            return stackElem[top - 1];
        else
            return null;
    }

    public Object pop() {
        if (isEmpty())
            return null;
        else
            return stackElem[--top];
    }

    public void push(Object x) throws Exception {
        if (top == stackElem.length)
            throw new Exception("栈满");
        else
            stackElem[top++] = x;
    }


    public void display() {
        if(top < 32){
            for(int i=1; i<= 32-top; i++){
                System.out.print("0");
            }
        }
        for (int i = top - 1; i >= 0; i--)
            System.out.print(stackElem[i].toString() + "");
    }


    public void bin(int x){
        int n = 0;
        while(x > 0){
            n = x%2;
            try {
                push(n);
            } catch (Exception e) {
                e.printStackTrace();
            }
            x = x / 2;
        }
    }
}
