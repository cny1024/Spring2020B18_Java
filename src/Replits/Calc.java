package Replits;

public class Calc {

    private int x;
    private int y;
    private int result;


    public int getResult(){
        return x+y;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public int x(){
        return x;
    }
    public int y(){
        return y;
    }
    public void plus(){
        result = x+y;
    }
    public void minus(){
        result = x-y;
    }


}
