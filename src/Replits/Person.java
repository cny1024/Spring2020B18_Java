package Replits;

public class Person {

    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
        this.ssn=ssn;
    }
    public void  setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getFirstname(){ // no parameter
        return firstname;
    }
    public String getLastname(){ // no parameter
        return lastname;
    }

    public String getBirthday(){
        return birthday+"/"+birthday+"/"+birthyear;
    }
    public boolean verifySSN(String str){
        if (str.equalsIgnoreCase(ssn)){
            return true;
        }else{
            return false;
        }
    }



}
