package day44_Exceptions;
/*
1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {

    protected void openBrowser(){
        System.out.println("Opening the default browser");
    }
    protected void closeBrowser(){
        System.out.println("Closing the default browser");
    }

}
class ChromeBrowser extends Browsers{

    protected void openBrowser(){
        System.out.println("Opening the Chrome browser");
    }protected void closeBrowser(){
        System.out.println("Closing the Chrome Browser");
    }
}
class Opera extends Browsers{
@Override
    public void openBrowser(){
        System.out.println("Opening the Opera Browser");
    }
    public void closeBrowser(){
        System.out.println("Closing the Opera Browser");
    }
}
class FirefoxBrowser extends Browsers{

    protected void openBrowser(){
        System.out.println("Opening the Firefox Browser");
    }
@Override
    protected void closeBrowser(){
        System.out.println("Closing the Firefox Browser");
    }
}

class Test{
    public static void main(String[] args) {

        ChromeBrowser obj1 = new ChromeBrowser();
        obj1.openBrowser();

        Opera obj2 = new Opera();
        obj2.closeBrowser();

        FirefoxBrowser obj3 = new FirefoxBrowser();
        obj3.openBrowser();
    }
}