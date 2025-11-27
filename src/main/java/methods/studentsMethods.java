package src.main.java.methods;

public class studentsMethods {
    public static void showStudentsList(String[] students) {
        System.out.println("-- Lista de alunos --");
        for (int i = 0; i < students.length; i++) {
            System.out.println(i+1+ " - " + students[i]);
        }
    }
}
