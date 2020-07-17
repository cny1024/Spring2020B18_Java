package Replits;

public class GasTank {

    double amount;
    double capacity;
    public GasTank(double capacity){
        this.capacity=capacity;
    }
    public void addGas(double a){
        if(a<=capacity){
            amount+=a;
        }else{
            amount=capacity;
        }
    }
    public void useGas(double a){
        if(a>=0){
            amount-=a;
        }else{
            amount=0;
        }
    }public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(amount>(capacity-0.1)){
            return true;
        }else{
            return false;
        }
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        return (amount- capacity);
    }
}

