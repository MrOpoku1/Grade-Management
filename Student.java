import java.util.ArrayList;
import java.time.LocalTime;
public class Student extends Grade_Management{
  private  LocalTime time = LocalTime.now();
  private String first_name;
  private String last_name;
  private String student_ID;
  private ArrayList<Double> test_scores= new ArrayList<>();  
  private double gpa=0.0;
  private Object[] class_grades =  {100,100,100,100,100,100};
  private int period = 0;
  

  public Student(String first_name, String last_name, String student_ID){
    this.addStudent(this);
    this.first_name = first_name;
    this.last_name = last_name;
    this.student_ID = student_ID;
    this.test_scores = new ArrayList<>();
    this.period =(int)(Math.random()*6);
    if(time.getMinute()==0 && period == 5){
      this.period=0;
    }else if (time.getMinute()==0){
      this.period++;
    }
  }
  public void copy_student(Student copy){ //copy constructor for students with multiple periods
    // Copy the relevant fields from the other student
    this.first_name = copy.first_name;
    this.last_name = copy.last_name;
    this.student_ID = copy.student_ID;
  }
  public String getFirstName(){
    return this.first_name;
  } 
  public String getLastName(){
    return this.last_name;
  }
  public void addTestScore(double score){
    this.test_scores.add(score);
  }
  public double getGrade(){
    double grades = 0.0;
    int i=0;
    for(double score : test_scores){
      i++;
       grades += score;
    }
    return grades/i;
  }
  public void updateGradee(int period , double grade){
    this.class_grades[period] = (int)grade;
  }
  public String toString(){
    return "Name: " + this.first_name + " " + this.last_name +  "\nGrade: " + this.getGrade();
  }
  public int getPeriod(){
    return this.period;
  }
  
}
// IM going to add students to a period via variable in teh studentr class, and then add all the students that are in that period to an ArrayList. Im going to make it so that I am able to change the period of the student, so their grade in that period can be modified.