package exercise10.MVCPatternExample;

public class MVCDemo {

    public static void main(String[] args) {

        Student model = new Student(
                "Varshini",
                101,
                "A"
        );

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println("\nAfter Updating Details:");

        controller.setStudentName("Varshini Keerthi");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}