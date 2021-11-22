package ExercisesObjectsAndClasses;

public class Articles {
    //poleta --harakteri
    private  String title;
    private  String content;
    private  String author;

    //metodi-konstruktor winagi pub i sys imeto na klasa

    public  Articles(String title,String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;

    }
    public void edit(String newContent){
        this.content = newContent;
    }

    public void chageAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    // smqna na zag
    public void rename(String newTitle) {
        this.title =newTitle;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
