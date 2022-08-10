package MercadoFrutas;

import java.util.Scanner;
import java.util.ArrayList;

public class ControleFrutas{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList <String> fruits = new ArrayList<>();
        int option, chosenFruits;
        String process;

        do{
            System.out.println("Welcome to the SUPERMARKET");
            System.out.println(" 1 -Choose an option");
            System.out.println(" 2 -Register Fruits");
            System.out.println(" 3 -Fruit List");
            System.out.println(" 4 -Delete fruits fron the List");
            System.out.println(" 5 -List fruits with ID");
            System.out.println(" 0 - Exit");
            option = keyboard.nextInt();

                switch(option) {
                    case 1:
                        System.out.println("Enter how many fruits you want to register:");
                        chosenFruits = keyboard.nextInt();
                        System.out.println("Enter the name of the fruit");
                        for (int i = 0; i < chosenFruits; i++) {
                            process = keyboard.next();
                            fruits.add(process);
                        }
                        break;

                    case 2:
                        System.out.println("Fruits Available");
                        System.out.println(fruits);
                        break;
                    case 3:
                    System.out.println("Which fruit do you want to delete");
                    process = keyboard.next();
                    for(int i = 0; i < fruits.size(); i++) {
                        if (process.equals(fruits.get(i))) {
                            fruits.remove(i);
                        }
                    }
                    break;
                    case 4:
                        System.out.println("List fruit, choose fruit by ID");
                        chosenFruits = keyboard.nextInt();
                        System.out.println(fruits.get(chosenFruits));
                        break;

                }
        }
    }
}


*/
    //cadastrar frutaas add
    //listar frutas var
    //excluir frutas remove
    // listar com id get
    //modificar uma fruta set

    //Mostrar o nome da fruta atual e
    //o nome da fruta modificada
