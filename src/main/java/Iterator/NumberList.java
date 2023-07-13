package Iterator;

public class NumberList {

    private int numbers[];
    private int position;

    public NumberList(int size) {
        this.numbers = new int[size];
        this.position = 0;
    }

    public void addNumber(int number){
        numbers[position++] = number;
    }

    public NumberListIterator iterator(){
        return new NumberListIterator(numbers);
    }

}
