package ru.mirea.task2;

public class TestDog {
    private Dog[] array;
    private boolean isEmpty = true;
    int id_noname = 0;
    int length;
    public void add(int n) {
        Dog[] temp_array = new Dog[length + n];
        //перезаписываем собак
        int i = 0;
        for (; i < length; i++) {
            temp_array[i] = array[i];
        }

        for (; i < length + n; i++) {
            temp_array[i] = new Dog("NO NAME" + ++id_noname, 0);
        }
        array = temp_array;
        length += n;
    }

    @Override
    public String toString() {
        StringBuilder return_string = new StringBuilder();
        for (Dog x: array) {
            if (x != null) return_string.append(x + "\n");
        }
        return return_string.toString();
    }
}
