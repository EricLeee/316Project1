package edu.ncsu.csc316.compression_manager.util;

public class ArrayBasedList implements List {
    
    private static final int RESIZE = 10;
    
    private Object[] list;
    
    private int size;

    public ArrayBasedList() {
        this.list = new Object[RESIZE];
        this.size = 0;
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < this.size; i++) {
            if (list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object o) {
        if (list[size - 1] != null) {
            Object[] temp = new Object[size + RESIZE];
            for (int i = 0; i < this.size; i++) {
                temp[i] = list[i];
            }
            this.list = temp;
        }
        if (!this.contains(o)) {
            list[size] = o;
            size++;
        }
    }

    @Override
    public Object remove(int idx) {
        Object o = list[idx];
        for (int i = idx; i < this.size - idx; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return o;
    }

    @Override
    public int indexof(Object o) {
        for (int i = 0; i < this.size; i++) {
            if (list[i].equals(o))
                return i;
        }
        return -1;
    }

}
