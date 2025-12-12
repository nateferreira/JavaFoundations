package exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {

        //Criar arquivo .txt
        try {
            FileWriter fw = new FileWriter("exemplo.txt");
            fw.write("Queijos saborosos Manoel \n");
            fw.write("Queijo Palitinho\n");
            fw.write("Queijo Meia-Cura\n");
            fw.write("Queijo Nozinho\n");
            fw.write("Queijo Pimenta\n");
            fw.close();
            System.out.println("Programa finalizado, arquivo criado.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
