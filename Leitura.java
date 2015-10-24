import java.util.*; 
import javax.swing.*;
import java.io.*;

public class Leitura{
  public static void main(String SuperTrunfo[]){
    
    try {
      FileReader arq = new FileReader("cartas.txt");
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine(); // l� a primeira linha
      // a vari�vel "linha" recebe o valor "null" quando o processo  de repeti��o atingir o final do arquivo texto 
      while (linha != null) { 
        if(linha.equals("*")){
          System.out.println("***********************************");
        }else{
          System.out.println(linha);
        }
        linha = lerArq.readLine(); // l� da segunda at� a �ltima linha
      }
      
      arq.close(); 
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
    } 
    System.out.println(); 
  }
}