package pe.edu.upc.demosi63.dtos;

public class UserCommentCountDTO {
    private String username;
    private int commentCount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}

