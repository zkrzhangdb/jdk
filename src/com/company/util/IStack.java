package com.company.util;

public interface IStack {
    public void clear();

    public boolean isEmpty();

    public int length();

    public Object peek();

    public void push(Object x) throws Exception;

    public Object pop();
}
