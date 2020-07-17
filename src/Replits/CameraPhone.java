package Replits;

public class CameraPhone {

    public int imageSize;
    public int memorySize;

    public CameraPhone(int imageSize, int memorySize){
        this.imageSize= imageSize;
        this.memorySize=memorySize;
    }
    public int numPictures(){
        int result = (memorySize*1000)/imageSize;
        return result;

    }

}
