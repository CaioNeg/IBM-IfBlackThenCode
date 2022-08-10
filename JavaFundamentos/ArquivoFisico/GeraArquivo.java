package ArquivoFisico;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class GeraArquivo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> nameClient = new ArrayList<String>();
        nameClient.add("Petrolina");
        nameClient.add("Givanildo");
        nameClient.add("Adroaldo");
        nameClient.add("Tarciano");

        FileWriter file = new FileWriter("c://clientes.txt");
        PrintWriter gravarFile = new PrintWriter(file);

        gravarFile.println(nameClient);
        file.close();
        System.out.println("Criacao de arquivo");


    }

}
