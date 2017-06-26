package youtube.models;

public class Video {
    private int id;
    private String title;
    private String filename;
    private String username;

    public Video() {
    }

    public Video(String title, String filename, String username) {
        this.title = title;
        this.filename = filename;
        this.username = username;
    }

    public Video(int id, String title, String filename, String username) {
        this.id = id;
        this.title = title;
        this.filename = filename;
        this.username = username;
    }

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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Video video = (Video) o;

        if (id != video.id) return false;
        return title != null ? title.equals(video.title) : video.title == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}