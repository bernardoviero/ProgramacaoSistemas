import javax.swing.JOptionPane;
import java.util.Random;

public class Avaliacao01 {
    public static void main(String[] args){
        String frase = solicitaString();
        int tamanhoPalavra = (frase.length());
        JOptionPane.showMessageDialog(null,"A frase digitada é: "+frase+"\nE seu tamanho é: "+tamanhoPalavra+" caracteres");

        int numeroInicio = pontoInicial();
        JOptionPane.showMessageDialog(null,"Frase: "+frase+"\n"+frase.substring(numeroInicio-1));


        int numeroAleatorio = valorAleatorio(tamanhoPalavra);
        JOptionPane.showMessageDialog(null,"Frase: "+frase+"\nNumero sorteado é: "+numeroAleatorio+" e ele equivale ao caracter: "+frase.charAt(numeroAleatorio-1));
    }

    public static String solicitaString(){
        return JOptionPane.showInputDialog("Digite uma frase: ");
    }
    public static int pontoInicial(){
        int numeroParaIniciar = Integer.parseInt(JOptionPane.showInputDialog("A partir de qual número deseja ver a exibição da frase ?"));
        return numeroParaIniciar;
        
    }
    public static int valorAleatorio(int tamanhoMaximo){
        double numAleatorio = Math.random() * (tamanhoMaximo);
        int num = (int)numAleatorio+1;
        return num;
    }
}
