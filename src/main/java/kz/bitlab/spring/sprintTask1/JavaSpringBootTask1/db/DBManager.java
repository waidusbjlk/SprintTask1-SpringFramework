package kz.bitlab.spring.sprintTask1.JavaSpringBootTask1.db;
import java.util.ArrayList;

public class DBManager {


    private static final ArrayList<Student> students = new ArrayList<>();

    private static Long id = 1L;

    public static ArrayList<Student> getAllStudents(){
        return students;
    }


    public static void addMusic(Student student){
        student.setId(id);
        students.add(student);
        id++;
    }
}
