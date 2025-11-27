package src.main.java;

import java.util.*;
import static src.main.java.util.mathUtils.calcularMedia;

public class siepe {

    public static void showStudentsList(String[] students) {
        System.out.println("-- Lista de alunos --");
        for (int i = 0; i < students.length; i++) {
            System.out.println(i+1+ " - " + students[i]);
        }
    }
  public static void main(String[] a) {
    Scanner input = new Scanner(System.in);
    int firstOption;
    double[] currentStudentGrade = null;


    String[] students = {"João", "Maria", "Jose"};
    double[] notasJoao = {7.5, 4.3, 10.0, 9.5};
    double[] notasMaria = {5.5, 7.3, 8.0, 7.5};
    double[] notasJose = {8.5, 3.3, 9.5, 9.5};

    System.out.println("-- Bem-Vindo ao Sistema de Notas --");
    System.out.println("1 - Entrar");
    System.out.println("2 - Sair");
    firstOption = input.nextInt();
    if (firstOption == 1) {
    do{
        System.out.println("-- O que deseja fazer? --");
        System.out.println("1 - Verificar notas de alunos");
        System.out.println("2 - Verificar aluno");
        System.out.println("3 - Cadastrar aluno");
        System.out.println("4 - Sair");
        int secondOption = input.nextInt();

        switch (secondOption) {
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
            System.out.println("-- O que deseja fazer? --");
            System.out.println("1 - Calcular a média");
            System.out.println("2 - Voltar");
            int mediaChoice = input.nextInt();
            if (mediaChoice == 1) {
               calcularMedia(currentStudentGrade);
            }
            continue;
          case 2:
            System.out.println("-- Qual aluno deseja verificar? --");
            showStudentsList(students);
            int thirdOption = input.nextInt();
            

          default:
            break;
        }
    }while(firstOption != 2);
    }
}
}
