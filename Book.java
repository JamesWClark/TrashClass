public class Book{
    private String title;
    private String author;
    private int pageNumber;
  
    public Book(){
      title = "Das Kapital";
      author = "Socrates";
      pageNumber = 100;
    }
  
    public Book(String title){
      this();
      this.title = title;
    }
  
    public Book(String title, String author, int pageNumber){
      this.title = title;
      this.author = author;
      this.pageNumber = pageNumber;
    }
  
    public String toString(){
      return "Title: " + title + " Author: " + author + " # of pages: " + pageNumber;
    }
  
    //methods
  
    public String cite() {return title + author;}
    public int checkPageNumber() {return pageNumber;}
    public void ripOutPages(int d) {pageNumber = pageNumber - d;}
    
    //accessors
  
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getPageNumber() {return pageNumber;}
    
    //mutators
    public void setTitle(String a) {title  = a;}
    public void setAuthor(String b) {author = b;}
    public void setPageNumber(int c) {pageNumber = c;}
    
  }