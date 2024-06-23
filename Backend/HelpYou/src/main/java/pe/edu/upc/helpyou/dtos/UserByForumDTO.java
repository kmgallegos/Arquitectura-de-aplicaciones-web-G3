package pe.edu.upc.helpyou.dtos;

public class UserByForumDTO {
    private String Foro;
    private int Usuarios;

    public String getForo() {
        return Foro;
    }

    public void setForo(String foro) {
        Foro = foro;
    }

    public int getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(int usuarios) {
        Usuarios = usuarios;
    }
}

