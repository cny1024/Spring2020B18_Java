package Replits;

public class Accumulator {

    int sum;

    public Accumulator(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void add(int a) {
        sum += a;
    }

    public void remove(int b) {
        sum -= b;
    }
    public String toString(){
        return "Sum is: "+sum;
    }

}
