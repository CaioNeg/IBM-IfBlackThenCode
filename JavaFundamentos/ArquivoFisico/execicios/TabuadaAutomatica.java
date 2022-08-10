public class TabuadaAutomatica {
    public static void main(String[] args) {

        // criando um laço de repetição
        for(int contador=1; contador<=9; contador++) {
            // tabuada automática
            System.out.println("Tabuada do: "+contador );
            for (int valor = 1; valor <= 10; valor++) {

                System.out.println(contador + "*" + valor + "= " + contador * valor);
            }
        }
    }
}
