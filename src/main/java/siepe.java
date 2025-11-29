package src.main.java;

import src.main.java.domain.Aluno;

import java.util.Arrays;
import java.util.Scanner;

import static src.main.java.methods.studentsMethods.showStudentsList;
import static src.main.java.util.mathUtils.calcularMedia;
import static src.main.java.util.printlnUtils.*;

public class siepe {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        int homeInput;
        int exitOption = 3;
        double[] currentStudentGrade = null;

        String[] students = {"João", "Maria", "Jose"};
        double[][] notasAlunos = {{7.5, 4.3, 10.0, 9.5}, {5.5, 7.3, 8.0, 7.5}, {8.5, 3.3, 9.5, 9.5}};

        homePrintln(); //1-Entrar no sistema 2-Sair / Execução Única
        homeInput = input.nextInt();
        int mainInput;
        if (homeInput == 1) {
            do {
                mainPrintln();
                mainInput = input.nextInt();

                switch (mainInput) {
                    case 1: //Caso escolha verificar notas dos alunos:
                        showStudentsList(students);
                        System.out.println("-- Qual aluno deseja verificar? --");
                        int studentOption = input.nextInt();

                        System.out.println("-- As notas foram de " + (students[studentOption - 1]) + " foram: --");
                        System.out.println(Arrays.toString(notasAlunos[studentOption - 1]));
                        currentStudentGrade = notasAlunos[studentOption - 1];

                        averageInputPrintln(); //1- Calcular média?
                        int averageInputNum = input.nextInt();
                        if (averageInputNum == 1) {
                            calcularMedia(currentStudentGrade);
                        }
                        continue;
                    default:
                        break;
                }
            } while (mainInput != exitOption);
        }
    }
}
