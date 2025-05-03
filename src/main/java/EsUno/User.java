package EsUno;

import javax.management.InstanceAlreadyExistsException;

public class User {
    private String nome;
    private int età;

    public User(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }

    public String getNome() {
            
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", età=" + età +
                '}';
    }

    private static User instance;

    public static User getInstance() {
         if( instance == null) {
             instance = new User("Marco", 30);
         }


        return instance;
    }






}

