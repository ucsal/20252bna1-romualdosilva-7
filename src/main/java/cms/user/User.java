public abstract class User {
  private  int id, senha;
    private String email, nome;

    public User(int id, int senha, String email, String nome){
        this.senha = senha;
        this.id = id;
        this.email = email;
        this.nome = nome;
    }
    public String getome(){
        return nome;
    }
    
    public String getemail(){
        return email;
    }
    
    public int getid(){
        return id;
    }

    public int getsenha(){
        return senha;

    }
    public class checkPassword(int senha){
boolean checkPassword = true;
if(checkPassword == true){
    System.out.println("Sua senha foi checada e está correta.");
}
    }


}
