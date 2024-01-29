package org.example;

import java.util.Arrays;

/**
 * Generic class
 * @param <E> will accept every type of data type
 */
public class CustomArray<E> {
    private Object[] elements;
    private int capacity;
    private int size; // index will size - 1
    private int currentIndex;

    public CustomArray() {
        this.capacity = 2;
        this.currentIndex = 0;
        this.size = 0;
        this.elements = new Object[this.capacity];
    }

    public void add(E e) {
        if (capacity == currentIndex) {
            grow();
        }
        this.elements[currentIndex] = e;
        currentIndex++;
        this.size++;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * grow() will increase the size with 2x
     */
    public void grow() {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = elements[i];
        }
        capacity = capacity * 2;
        elements = new Object[capacity];
        for (int i = 0; i < temp.length; i++) {
            elements[i] = temp[i];
        }
    }

    public void remove(int index) {
        // exception handling
        boolean isIndexOutOfBound = checkIndex(index);
        if (isIndexOutOfBound)
            return;

        // check kro kya ham last element ko remove kr rahay hain
        if ((index + 1) == currentIndex) {
            elements[index] = null;
            size--;
            currentIndex--;
            return;
        }

        for (int i = index; i < size; i++) {
            if ((i + 1) != currentIndex) {
                elements[i] = elements[i + 1];
            } else {
                elements[i] = null;
                size--;
                currentIndex--;
            }
        }
    }

    private boolean checkIndex(int index) {
        boolean isIndexOutOfBound = false;
        if (capacity == index && index == currentIndex) {
            System.out.println("Index out of bound");
            isIndexOutOfBound = true;
        }
        return isIndexOutOfBound;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}
