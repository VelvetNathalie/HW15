package com.pb.vlasenko.hw10;

public class NumBox <T extends Number> {
    private final T[] numbers;
    private int size = 0;

    public NumBox(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("параметр должен быть больше нуля");
        }
        numbers = (T[]) new Number[maxSize];
    }
public void add(T num){
    if (size >= numbers.length)
    {
    throw new NumBoxIsFullException("текущий размер " + size);
}
    numbers[size] = num;
    size++;
}
    public T get(int index) {
        if (index >= size) {
            return null;
        }
        return numbers[index];
    }

    public int length() {
        return size;
    }

    public double sum() {
        if (size < 1) {
            throw new NumBoxIsEmptyException("NumBox пустой");
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }

    public double average() {
        return sum() / size;
    }

    public T max() {
        if (size < 1) {
            throw new NumBoxIsEmptyException("NumBox пустой");
        }
        double max = numbers[0].doubleValue();
        int maxIndex = 0;
        for(int i = 1; i < size; i++) {
            if (numbers[i].doubleValue() > max) {
                max = numbers[i].doubleValue();
                maxIndex = i;
            }
        }
        return numbers[maxIndex];
    }

}


