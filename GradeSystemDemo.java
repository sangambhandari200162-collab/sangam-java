import java.util.ArrayList;
import java.util.List;

public class GradeSystemDemo {

    private final GradeCalculator gradeCalculator;
    private final ResultPrinter resultPrinter;

    public GradeSystemDemo(GradeCalculator gradeCalculator, ResultPrinter resultPrinter) {
        this.gradeCalculator = gradeCalculator;
        this.resultPrinter = resultPrinter;
    }

    public void processStudent(Student student) {
        double average = gradeCalculator.calculateAverage(student);
        char letterGrade = gradeCalculator.calculateLetterGrade(student);
        resultPrinter.printResult(student, average, letterGrade);
    }

    public static void main(String[] args) {

        Student alice = new Student("S001", "Alice Sharma");
        alice.addScore(85);
        alice.addScore(92);
        alice.addScore(78);

        Student bob = new Student("S002", "Bob Thapa");
        bob.addScore(60);
        bob.addScore(55);
        bob.addScore(70);

        GradeCalculator calculator = new AverageGradeCalculator();
        ResultPrinter printer = new ConsoleResultPrinter();

        GradeSystemDemo demo = new GradeSystemDemo(calculator, printer);

        demo.processStudent(alice);
        demo.processStudent(bob);
    }
}

// ====================== Student ======================

class Student {

    private String id;
    private String name;
    private List<Integer> scores;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        scores = new ArrayList<>();
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// ====================== GradeCalculator ======================

interface GradeCalculator {

    double calculateAverage(Student student);

    char calculateLetterGrade(Student student);
}

// ====================== AverageGradeCalculator ======================

class AverageGradeCalculator implements GradeCalculator {

    @Override
    public double calculateAverage(Student student) {

        List<Integer> scores = student.getScores();

        if (scores.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return (double) sum / scores.size();
    }

    @Override
    public char calculateLetterGrade(Student student) {

        double average = calculateAverage(student);

        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else
            return 'F';
    }
}

// ====================== ResultPrinter ======================

interface ResultPrinter {

    void printResult(Student student, double average, char letterGrade);
}

// ====================== ConsoleResultPrinter ======================

class ConsoleResultPrinter implements ResultPrinter {

    @Override
    public void printResult(Student student, double average, char letterGrade) {

        System.out.println("--------------------------------");
        System.out.println("Student ID   : " + student.getId());
        System.out.println("Student Name : " + student.getName());
        System.out.printf("Average      : %.2f%n", average);
        System.out.println("Grade        : " + letterGrade);
        System.out.println("--------------------------------");
    }
}