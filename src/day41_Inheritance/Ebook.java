package day41_Inheritance;
/*
  title (inherited)
  author (inherited)
  price (inherited)
  toString() (inherited)
  size (declared)
  pages (declared)
  readbook()(declared)
  toString()(inherited)   */
public class Ebook extends Book{

    public String size;
    public int pages;

    public void readbook(){
        System.out.println( "reading " + title+"..." );
    }



}
