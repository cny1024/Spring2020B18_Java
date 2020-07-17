package day25_MethodsRecap;
/*
write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS

 */
public class Driver {
    public static void main(String[] args) {
        String str = getDriver1("chrome");
        System.out.println(str);
        String str2 = getDriver2("opera");
        System.out.println(str2);
        String str3 = getDriver3("firefox");
        System.out.println(str3);

    }

    public static String getDriver1(String browserName){
        String result = "";

        switch (browserName.toLowerCase()){
            case "chrome": result = "Chrome Driver";
            break;
            case "firefox": result = "Firefox Driver";
            break;
            case "safari": result= "Safari Driver";
            break;
            case "opera": result= "Opera Driver";
            break;
            case "edge": result = "Edge Driver";
            break;
            default: result = "Invalid Driver";
            break;
        }

        return result;
    }
    public static String getDriver2(String browserName){
        String result = "";
        if (browserName.equalsIgnoreCase("chrome")){
            result = "Chrome Driver";
        }else if(browserName.equalsIgnoreCase("firefox")){
            result = "Firefox Driver";
        }else if(browserName.equalsIgnoreCase("safari")){
            result = "Safari Driver";
        }else if (browserName.equalsIgnoreCase("opera")){
            result = "Opera Driver";
        }else if (browserName.equalsIgnoreCase("edge")){
            result = "Edge Driver";
        }else{
            result= "Invalid Driver";
        }

        return result;
    }
    public static String getDriver3(String browserName){
        String result = "";
        browserName=browserName.toLowerCase();
        result = (browserName.equals("chrome"))?"Chrome Drover"
                :(browserName.equals("firefox"))?"Firefox Driver"
                :(browserName.equals("opera")?"Opera Driver"
                :(browserName.equals("edge")?"Edge Driver"
                :(browserName.equals("safari"))?"Safari Driver"
                :"Invalid Driver"));

        return result;
    }
}
