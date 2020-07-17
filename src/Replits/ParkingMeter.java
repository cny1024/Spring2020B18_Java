package Replits;

public class ParkingMeter {

    public int timeLeft = 0;
    public int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }
    public boolean add(int parameter){
        if (timeLeft<maxTime) {
            if (parameter == 25) {
                timeLeft += 30;
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }
    public void tick(){
        if (timeLeft>0){
            timeLeft--;
        }
    }
    public boolean isExpired(){
        return timeLeft == 0;
    }


}
