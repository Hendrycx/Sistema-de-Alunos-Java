package src.main.java;

import java.util.Scanner;

import static src.main.java.methods.studentsMethods.verificarNotas;
import static src.main.java.util.printlnUtils.homePrintln;
import static src.main.java.util.printlnUtils.mainPrintln;

public class siepe {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int homeInput;
        int exitOption = 3;
        homePrintln(); //1-Entrar no sistema 2-Sair / Execução Única
        homeInput = input.nextInt();
        int mainInput;
        if (homeInput == 1) {
            do {
                mainPrintln();
                mainInput = input.nextInt();
                switch (mainInput) {
                    case 1: //Caso escolha verificar notas dos alunos:
                        verificarNotas();
                        continue;
                    default:
                        break;
                }
            } while (mainInput != exitOption);
        }
    }
}
