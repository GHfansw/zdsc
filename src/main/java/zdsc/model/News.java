package zdsc.model;

import java.sql.Date;
/**
 * Created by lenovo on 2017/6/14.
 */
public class News {
    private int id;
    private String title;
    private String content;
    private Date presstime;
    private String author;
    private String classification;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPresstime() {
        return presstime;
    }

    public void setPresstime(Date presstime) {
        this.presstime = presstime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
