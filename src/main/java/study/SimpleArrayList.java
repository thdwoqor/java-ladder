package study;

import java.util.Arrays;

public class SimpleArrayList implements SimpleList {
    private static final int DEFAULT_CAPACITY = 10;
    private static String[] elementData;
    private static final String[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private int size;

    public SimpleArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public boolean add(String value) {
        add(size, value);
        return true;
    }

    @Override
    public void add(int index, String value) {
        if (index == elementData.length) {
            elementData = Arrays.copyOf(elementData, Math.max(DEFAULT_CAPACITY, elementData.length));
        }
        elementData[index] = value;
        size++;
    }

    @Override
    public String set(int index, String value) {
        //rangeCheck
        String oldValue = elementData[index];
        elementData[index] = value;
        return oldValue;
    }

    @Override
    public String get(int index) {
        //rangeCheck
        return elementData[index];
    }

    @Override
    public boolean contains(String value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(String value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(String value) {
        int index = indexOf(value);
        if (index <= 0) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public String remove(int index) {
        //rangeCheck
        String oldValue = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }

        elementData[--size] = null;
        return oldValue;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
    }
}
