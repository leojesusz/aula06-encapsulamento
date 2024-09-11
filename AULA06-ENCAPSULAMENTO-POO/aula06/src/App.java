public class App {
    public static void main(String[] args) throws Exception {


       Aluno chico = new Aluno("Leonardo", 1224563, 21, "Masculino", true);
       chico.setNome("Leonardo");
       System.out.println(chico.getNome());

       Aluno moedas = new Aluno();
       chico.setNome("Leonardo");
       System.out.println(chico.getNome());
    }
}
