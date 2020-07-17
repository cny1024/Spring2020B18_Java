package day47_Abstraction;

public final class ChromeDriver extends RemoteWebDriver{

    //public abstract void get(String URL);
    @Override
    public void get(String URL){
        System.out.println("Opening " + URL+ " in chrome browser");
    }
    public void quit(){
        System.out.println("Closing the chrome browser");
    }
   /*
    public void get(String URL){
        System.out.println("Open Chrome");
    }
    */
}
