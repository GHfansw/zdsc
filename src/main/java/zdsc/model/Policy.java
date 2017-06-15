package zdsc.model;

/**
 * Created by lenovo on 2017/6/14.
 */
public class Policy {
    private int id;
    private String title;
    private String content;
    private String classification;
    private int rank;
    private int subrank;
    private String link;

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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSubrank() {
        return subrank;
    }

    public void setSubrank(int subrank) {
        this.subrank = subrank;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
