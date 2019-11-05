import java.util.ArrayList;

public class User {
    private String nome;
    ArrayList<User> userList;

    public User(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addList(User u){
        userList.add(u);
    }

    public ArrayList<User> returnList(){
        return this.userList;
    }
}
