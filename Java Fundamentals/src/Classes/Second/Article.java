package Classes.Second;

public class Article {
    private String  title,content,author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;


    }
    public void editTitle(String newTitle){
        title=newTitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return  title +
                " - " + content + ": " +
                author ;
    }
}
