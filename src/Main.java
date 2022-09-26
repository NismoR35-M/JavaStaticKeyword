import staticBlock.Block;
import staticMethod.EvenNumber;
import staticVariable.Student;

public class Main {
    public static void main(String[] args) {

        //Static variable use
        Student Student1 = new Student();
        Student Student2 = new Student();

        Student1.studentName = "JACOB";
        Student1.course = "Data Mining";
        Student.school = "AMIGOS SCHOOL";

        //Static method use
        EvenNumber.incrementBy2(); //2
        EvenNumber.incrementBy2(); //4
        EvenNumber.incrementBy2(); //6

        //static block
        System.out.println("Hello there");
        System.out.println(Block.year);
    }
}