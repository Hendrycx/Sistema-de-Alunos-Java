package src.main.java;

import java.util.*;
import static src.main.java.util.mathUtils.*;
import static src.main.java.methods.studentsMethods.*;
import static src.main.java.util.printlnUtils.*;

public class siepe {
  public static void main(String[] a) {
    Scanner input = new Scanner(System.in);
    int homeInput;
    int exitOption = 3;
    double[] currentStudentGrade = null;

    String[] students = {"João", "Maria", "Jose"};
    double[] notasJoao = {7.5, 4.3, 10.0, 9.5};
    double[] notasMaria = {5.5, 7.3, 8.0, 7.5};
    double[] notasJose = {8.5, 3.3, 9.5, 9.5};

    homePrintln(); //1-Entrar no sistema 2-Sair / Execução Única
    homeInput = input.nextInt();
    int mainInput;
    if (homeInput == 1) {
    do{
        mainPrintln();
        mainInput = input.nextInt();

        switch (mainInput) {
          case 1: //Caso escolha verificar notas dos alunos:
            showStudentsList(students);
            System.out.println("-- Qual aluno deseja verificar? --");
            int studentOption = input.nextInt();
            switch (studentOption) {
              case 1:
                System.out.println("-- As notas foram: --");
                System.out.println(Arrays.toString(notasJoao));
                currentStudentGrade = notasJoao;
                break;
              case 2:
                System.out.println("-- As notas foram: --");
                System.out.println(Arrays.toString(notasMaria));
                currentStudentGrade = notasMaria;
                break;
              case 3:
                System.out.println("-- As notas foram: --");
                System.out.println(Arrays.toString(notasJose));
                currentStudentGrade = notasJose;
              default:
                break;
            }
            averageInputPrintln();
            int averageInputNum = input.nextInt();
            if (averageInputNum == 1) {
               calcularMedia(currentStudentGrade);
            }
            continue;
          case 2:
            System.out.println("-- Qual aluno deseja verificar? --");
            showStudentsList(students);
          default:
            break;
        }
    }while(mainInput != exitOption);
    }
}
}
