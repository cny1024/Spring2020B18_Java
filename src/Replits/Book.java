package Replits;

public class Book {

    public String title;
    public String author;
    public String tableOfContents = "";
    public int nextPage = 1;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void addChapter(String titleOfChapter, int numOfPages){
        tableOfContents += "\n"+titleOfChapter+"..."+nextPage;
        nextPage += numOfPages;
    }
    public int getPages(){
        return nextPage-1;
    }
    public String getTableOfContents(){
        return tableOfContents;
    }
    public String toString(){
        return title+ "\n"+author;
    }


}
