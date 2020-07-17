package day41_Inheritance;
/*
    title (Iherited)
    author (Iherited)
    price (Iherited)
    length (declared)
    listen() (declared)
    toString() (Iherited)
     */
public class AudioBook extends Book {

    public String length;

    public void listen(){
        System.out.println("Listening to "+title);
    }

}
