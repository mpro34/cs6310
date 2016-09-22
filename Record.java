import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Record 
{
    private int studentid;
    private int courseid;
    private int instructorid;
    private String finalGrade;
    private String instructorNotes;
    //Default constructor
   // public Student(Boolean enrolledstate)
 //   {
 //       isEnrolled = enrolledstate;
 //   }
    //Getter methods
  /*  public String getcurrentGrade(Course c)
    {
        return currentGrade;
    }*/
    public int getStuId()
    {
        return studentid;
    }
    public int getCourId()
    {
        return courseid;
    }
    public int getInstId()
    {
        return instructorid;
    }
    public String getFinalGrade()
    {
        return finalGrade;
    }
    public String getInstructorNotes()
    {
        return instructorNotes;
    }
    
    //Setter methods
    public void setStuId(int s)
    {
        studentid = s;
    }
    public void setCourId(int c)
    {
        courseid = c;
    }
    public void setInstId(int i)
    {
        instructorid = i;
    }
    public void setFinalGrade(String f)
    {
        finalGrade = f;
    }
                                    
  /*  void assignGrade(int id, int courseid, String grade)
    {
        System.out.println("Grade");
    }*/
    public void addNote(String note)
    {
        instructorNotes = note;
    }
    
    public void linkRecords(List<Student> s)
    {
        
    }
    
}
