import javax.swing.JOptionPane;
public class Principal {
    public static void mensagemAleatoria(){
        JOptionPane.showMessageDialog(null,"Bem vindo ao programa Java");
    }

    public static String solicitarDados(String solicitacao){
        return JOptionPane.showInputDialog(solicitacao);
    }

    public static int diasVivido(int idade){
        return (idade * 365);
    }

    public static int qntNumerosNome(String nome){
        return nome.length();
    }
    public static void main(String[] args){
    mensagemAleatoria();
    int idade = Integer.parseInt(solicitarDados("digite sua idade: "));
    String nome = solicitarDados("digite seu nome: ");
    System.out.println("Sua idade é:"+idade);
    System.out.println("seu nome é: "+nome);
    int idadeDias = diasVivido(idade); 
    System.out.println("idade em dias:"+idadeDias);
    int tamanhoNome = qntNumerosNome(nome);
    System.out.println(tamanhoNome);
    }
}
