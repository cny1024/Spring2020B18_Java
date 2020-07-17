package Replits;

public class Encapsulation04 {

    class TV {


        private int channel = 1;
        private int volumeLevel = 1;
        private boolean on = false;
        private String brand = "undefined";

        public TV() {
            System.out.println("Creating TV object using no Args- constructor");
        }

        public TV(String brand) {
            this.brand = brand;
            System.out.println("Creating TV object using 1 arg - constructor");
        }

        public int getChannel() {
            return channel;
        }

        public int getVolumeLevel() {
            return volumeLevel;
        }

        public String getBrand() {
            return brand;
        }

        public void setChannel(int channel) {
            if (on) {
                if (channel < 0 || channel > 120) {
                    System.out.println("ERROR: TV is either OFF or invalid Channel");
                } else {
                    this.channel = channel;
                }
            }else {
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            }

        }

        public void setVolumeLevel(int volumeLevel) {
            if (on) {
                if (volumeLevel >= 1 && volumeLevel <= 7) {
                    this.volumeLevel = volumeLevel;
                } else {
                    System.out.println("ERROR: TV is either OFF or invalid Volume level");
                }
            }else {
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void channelUp() {
            channel += 1;
        }

        public void channelDown() {
            channel -= 1;
        }

        public void volumeUp() {
            volumeLevel += volumeLevel;
        }

        public void volumeDown() {
            volumeLevel -= volumeLevel;
        }

        public boolean isOn() {
            if (on){
                return true;
            }else {
                return false;
            }
        }

        public void turnOn() {
            if (on) {
                System.out.println("TV is already ON");
            } else {
                on = true;
            }
        }

        public void turnOff() {
            if (!on) {
                System.out.println("TV is already OFF");
            } else {
                on = false;
            }
        }


    }

}
