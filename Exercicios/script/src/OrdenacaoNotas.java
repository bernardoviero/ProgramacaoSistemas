import java.util.Arrays;

import javax.swing.JOptionPane;
/*
Receber nome/idade/notas de 5 alunos de uma disciplina e retornar essas notas em ordem da maior para menor;
Utilizando funcao
*/
public class OrdenacaoNotas {
    public static void main(String[] args) {
        // solicitando nome e mostrando;
        String nome[] = solicitarNome();
        int r2;
        for(r2=0;r2<nome.length;r2++){ 
            System.out.println(nome[r2]);
        }
        //solicitaindo idade e mostrando;
        
        int idade[] = solicitarIdade();
        int r3;
        for(r3=0;r3<idade.length;r3++){ 
            System.out.println(idade[r3]);
        }
        
        // solicitando e mostrando a nota;
        float nota[] = solicitarNota();
        int r1;
        for(r1=0;r1<nota.length;r1++){ 
            System.out.println(nota[r1]);
        }
        // mostrar nota da maior pra menos
        Arrays.sort(nota);
        System.out.print("Ordem crescente:    "); 
        for (int j = 0; j < 5; j++) 
        {
          System.out.print(nota[j]+ "  \n");       		
     }

    }   

    public static float[] solicitarNota(){
        int i;
        float Nota[] = new float[5];
        for(i=0;i<Nota.length;i++){
            Nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite sua nota: "));
        }
        return Nota;
    }
    public static int[] solicitarIdade(){
        int i;
        int Idade[] = new int[5];
        for(i=0;i<5;i++){
            Idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        }
        return Idade;
    }
    public static String[] solicitarNome(){
        int i;
        String Nome[] = new String[5];
        for(i=0;i<5;i++){
            Nome[i] = JOptionPane.showInputDialog("Digite seu nome: ");
        }
        return Nome;
    }

}
