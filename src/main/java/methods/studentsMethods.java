package src.main.java.methods;

import java.util.Arrays;

import static src.main.java.domain.AlunoData.notasAlunos;
import static src.main.java.domain.AlunoData.studentsList;
import static src.main.java.siepe.input;
import static src.main.java.util.mathUtils.calcularMedia;
import static src.main.java.util.printlnUtils.averageInputPrintln;

public class studentsMethods {
    public static void showStudentsList(String[] students) {
        System.out.println("-- Lista de alunos --");
        for (int i = 0; i < students.length; i++) {
            System.out.println(i + 1 + " - " + students[i]);
        }
    }

        public static void verificarNotas() {
            showStudentsList(studentsList);
            System.out.println("-- Qual aluno deseja verificar? --");
            int studentOption = input.nextInt();

            System.out.println("-- As notas foram de " + (studentsList[studentOption - 1]) + " foram: --");
            System.out.println(Arrays.toString(notasAlunos[studentOption - 1]));
            double[] currentStudentGrade = notasAlunos[studentOption - 1];

            averageInputPrintln(); //1- Calcular média?
            int averageInputNum = input.nextInt();
            if (averageInputNum == 1) {
                calcularMedia(currentStudentGrade);
            }
        }
}
