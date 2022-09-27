import javax.swing.JOptionPane;
import java.util.Random;
/*
Fazer um sorteador;
pedir para 5 pessoas escolherem 1 numero de (0 a 10); armazenar os n
fazer o sorteio e verificar se há algum vencedor;
caso haja, imprimir na tela;
*/
public class Avalicao {
    public static void main(String[] args) {
        int numero[] = solicitarNumero();
        int j;
        for(j=0;j<numero.length;j++){ 
            System.out.println("Posição variavel = ["+(j+1)+"]"+numero[j]);
        }
        int numeroSorteado = valorAleatorio();
        verificarGanhador(numero, numeroSorteado);
    }

    public static int[] solicitarNumero(){
        int i;
        int Numero[] = new int[5];
        for(i=0;i<Numero.length;i++){
            Numero[i] = Integer.parseInt(JOptionPane.showInputDialog("vez:"+(i+1)+" Digite um numero de 0 a 10: "));
            if(Numero[i] > 10){
                JOptionPane.showMessageDialog(null,"ERRO! Número digitado acima de 10");
                System.exit (0);
            }
        }
        return Numero;
    }

    public static int valorAleatorio(){
        Random random = new Random();
        int numeroSorteado = random.nextInt(10);
        System.out.println("Numero sorteado = "+numeroSorteado);
        return numeroSorteado;
    }

    public static void verificarGanhador(int[] valores,int valorSorteado){
        if(valorSorteado == valores[0]){
            System.out.println("Jogador ganhador: 1");
        }
        else if(valorSorteado == valores[1]){
            System.out.println("Jogador ganhador: 2");
        }
        else if(valorSorteado == valores[2]){
            System.out.println("Jogador ganhador: 3");
        }
        else if(valorSorteado == valores[3]){
            System.out.println("Jogador ganhador: 4");
        }
        else if(valorSorteado == valores[4]){
            System.out.println("Jogador ganhador: 5");
        }
        else{
            System.out.println("Não há ganhador!");
        }
    }
}
