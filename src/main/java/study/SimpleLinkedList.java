package study;

public class SimpleLinkedList implements SimpleList {
    private SimpleNode first;
    private SimpleNode last;
    private int size = 0;

    SimpleLinkedList() {
    }

    public boolean add(String value) {
        add(size, value);
        return true;
    }

    public void add(int index, String value) {
        SimpleNode l = last;
        SimpleNode newSimpleNode = new SimpleNode(null, value);
        last = newSimpleNode;
        if (l == null) {
            first = newSimpleNode;
        } else {
            l.next = newSimpleNode;
        }
        size++;
    }

    public String set(int index, String value) {
        return null;
    }

    public String get(int index) {
        //rangeCheck
        SimpleNode x;
        x = first;
        if (index < size) {
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        }
        return x.data;
    }

    public boolean contains(String value) {
        return indexOf(value) >= 0;
    }

    public int indexOf(String value) {
        int index = 0;
        for (SimpleNode x = first; x != null; x = x.next, index++) {
            if (x.data.equals(value)) {
                return index;
            }
            x = x.next;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(String value) {
        return true;
    }

    public String remove(int index) {
        SimpleNode x = first;
        for (int i = 0; i < size; i++) {
            x = x.next;
        }

        String item = first.data;
        x = x.next;

        size--;
        return x.data;
    }

    public void clear() {
        for (SimpleNode x = first; x != null; ) {
            SimpleNode next = x.next;
            x.data = null;
            x.next = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    private static class SimpleNode {
        SimpleNode next;
        String data;

        SimpleNode(SimpleNode next, String data) {
            this.next = next;
            this.data = data;
        }
    }
}
