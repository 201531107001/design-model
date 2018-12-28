package com.me.struct.design.m4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Composite extends Component{

    public List<Component> list = new LinkedList<>();
    
    public Composite(String name,int lavel) {
        super(name,lavel);
    }
    
    
    @Override
    public void add(Component component) {
        list.add(component);
    }
    
    @Override
    public void remove(Component component) {
        list.remove(component);
    }
    
    @Override
    public void display() {
        System.out.println(name);
        Iterator<Component> iterator = list.iterator();
        while(iterator.hasNext()) {
            for (int i=0;i<=lavel;i++) {
                System.out.print("---");
            }
            Component component = iterator.next();
            component.display();
        }
    }
}
