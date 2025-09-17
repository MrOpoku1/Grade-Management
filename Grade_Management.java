import java.util.ArrayList;

public class Grade_Management{
  public ArrayList<Student> students = new ArrayList<>();
  public void addStudent(Student student){
    this.students.add(student);
  }
  
  public void copy_student(Student student){
    this.students.add(student);
  }
  
}
