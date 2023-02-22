package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleArrayListTest {

    @Test
    void add() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        Assertions.assertThat(simpleArrayList.size()).isEqualTo(2);
    }

    @Test
    void set() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        simpleArrayList.set(1,"TEST3");
        Assertions.assertThat(simpleArrayList.get(1)).isEqualTo("TEST3");
    }

    @Test
    void get() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        Assertions.assertThat(simpleArrayList.get(1)).isEqualTo("TEST2");
    }

    @Test
    void contains() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        Assertions.assertThat(simpleArrayList.contains("TEST2")).isEqualTo(true);
    }

    @Test
    void indexOf() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        Assertions.assertThat(simpleArrayList.indexOf("TEST2")).isEqualTo(1);
    }

    @Test
    void size() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        Assertions.assertThat(simpleArrayList.size()).isEqualTo(2);
    }

    @Test
    void isEmpty() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        Assertions.assertThat(simpleArrayList.isEmpty()).isEqualTo(false);
    }

    @Test
    void remove() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        simpleArrayList.add("TEST3");
        simpleArrayList.add("TEST4");
        simpleArrayList.remove(1);
        Assertions.assertThat(simpleArrayList.size()).isEqualTo(3);
    }

    @Test
    void clear() {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("TEST1");
        simpleArrayList.add("TEST2");
        simpleArrayList.clear();
        Assertions.assertThat(simpleArrayList.size()).isEqualTo(2);
    }
}
