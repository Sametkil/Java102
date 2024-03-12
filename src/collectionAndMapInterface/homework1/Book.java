package src.collectionAndMapInterface.homework1;

public class Book implements Comparable<Book>{
    private String name;
    private int page;
    private String writerName;
    private String publishDate;

    public Book(String name, int page, String writerName, String publishDate) {
        this.name = name;
        this.page = page;
        this.writerName = writerName;
        this.publishDate = publishDate;
    }
    @Override
    public int compareTo(Book a) {
        return this.name.compareTo(a.name);
    }
    public String toString(){
        return "Name: " +name + ", Page : "+ page;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

}
