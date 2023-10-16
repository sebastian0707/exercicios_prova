package pilhas;

import java.util.Stack;

public class CursoJava {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        carros.push("HRV");
        carros.push("Golf");
        carros.push("Camaro");
        carros.push("Tiggo 3X");

        System.out.println(carros);
        for (String c : carros) {
            System.out.println(c);
        }

    }
}
