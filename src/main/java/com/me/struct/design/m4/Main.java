package com.me.struct.design.m4;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root",0);
        
        Component high1 = new Composite("高级1",1);
        Component high2 = new Composite("高级2",1);
        Component high3 = new Composite("高级3",1);
        
        root.add(high1);
        root.add(high2);
        root.add(high3);
        
        Component mid1 = new Composite("中级1",2);
        Component mid2 = new Composite("中级2",2);
        Component mid3 = new Composite("中级3",2);
        Component mid4 = new Composite("中级4",2);
        
        high1.add(mid1);
        high1.add(mid4);
        high2.add(mid2);
        high3.add(mid3);
        
        Component low1 = new Leaf("低级1",3);
        Component low2 = new Leaf("低级2",3);
        Component low3 = new Leaf("低级2",3);
        
        mid1.add(low1);
        mid2.add(low2);
        mid3.add(low3);
        
        root.display();
    }
}
