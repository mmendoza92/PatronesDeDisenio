package Iterator;

public class NumberListIterator implements Iterator<Integer>{

    private int numbers[];
    private int position;

    public NumberListIterator(int[] numbers) {
        this.numbers = numbers;
        this.position = 0;
    }

    @Override
    public Integer getNext() {
        return numbers[position++];
    }

    @Override
    public boolean hasNext() {
        if (position >= numbers.length) return false;
        return true;
    }
}
