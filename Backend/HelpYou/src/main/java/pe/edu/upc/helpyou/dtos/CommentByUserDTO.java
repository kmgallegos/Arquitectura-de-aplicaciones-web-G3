package pe.edu.upc.helpyou.dtos;

public class CommentByUserDTO {
    private String username;
    private int quantityComments;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getQuantityComments() {
        return quantityComments;
    }

    public void setQuantityComments(int quantityComments) {
        this.quantityComments = quantityComments;
    }
}

