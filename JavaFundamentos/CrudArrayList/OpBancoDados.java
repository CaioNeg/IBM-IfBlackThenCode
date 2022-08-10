package CrudArrayList;

import java.util.ArrayList;

public class OpBancoDados {
    public static void main(String[] args) {

        // Criando um procedimento de inserção de registro com Array List
        ArrayList<String> nameClient = new ArrayList<String>();
        nameClient.add("Petrolina");
        nameClient.add("Givanildo");
        nameClient.add("Adroaldo");
        nameClient.add("Tarciano");

        System.out.println(nameClient);

        System.out.println(nameClient.get(1));

        nameClient.set(0, "Caio");

        nameClient.remove(3);

        System.out.println(nameClient);

        // Retornando a quantidade de registros
        System.out.println(nameClient.size());

        // como utilizar um size dentro do laco de repeticao
        for (String count : nameClient) {
            System.out.println(count);
        }
        for (int count = 0 ; count<nameClient.size(); count++){
            System.out.println(nameClient.get(count));
        }

    }

}