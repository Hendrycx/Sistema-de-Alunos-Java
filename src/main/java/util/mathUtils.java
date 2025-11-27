package src.main.java.util;

public class mathUtils {
    public static void calcularMedia(double[] currentStudentGrade) {
        double soma = 0;
        for (double n : currentStudentGrade) soma += n;
        double media = soma / currentStudentGrade.length;
        if (media < 6) {
            System.out.println("---");
            System.out.println("A média desse aluno é: "+ media + ", abaixo da média.");
            System.out.println("---");
        }
        else{
            System.out.println("---");
            System.out.println("A média desse aluno é: "+ media + ", acima da média.");
            System.out.println("---");
        }
    }
}
