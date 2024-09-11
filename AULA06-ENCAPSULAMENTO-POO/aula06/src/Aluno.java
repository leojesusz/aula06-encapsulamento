public class Aluno {
    //sintaxe atributos
    //metodo de acesso - tipagem - nome
    private String nome;
    private int ra;
    private int idade;
    private String genero;
    private boolean status;


    public Aluno(String nome, int ra, int idade, String genero, boolean status){
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.genero = genero;
        this.status = status;
    }


    public void setNome (String ent_nome){
        nome = ent_nome;
    }

    public String getNome(){
        return nome;
    }
}

