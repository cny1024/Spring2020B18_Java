package Replits;

public class Encapsulation02 {
    class Db {

        private String data;
        private int yint;

        public void insertData(String data,int yint){
            this.data=data;
            this.yint=yint;
        }
        public void setData(String data){
            this.data = data;
        }
        public String getData(){
            return data;
        }
        public void setYint(int yint){
            this.yint = yint;
        }
        public int getYint(){
            return yint;
        }





    }
}
