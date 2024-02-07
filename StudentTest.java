

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Elie",85);
        Student student1 = new Student("Emma",95);

        System.out.printf(("%s's  letter grade is: %s%n"),
         student.getName(),student.getLettergrade());

        System.out.printf(("%s's letter grade is: %s%n"),
          student1.getName(),student1.getLettergrade());

    }
}
