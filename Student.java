import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Student extends Patron
{
    private Boolean isEnrolled;
    private List<Record> studentRecord = new ArrayList<Record>();
    private List<Course> registeredCourses = new ArrayList<Course>();
    //Default constructor
    public Student(Boolean enrolledstate)
    {
        isEnrolled = enrolledstate;
    }
    //Getter method
    public Boolean getenroll()
    {
        return isEnrolled;
    }
    public List<Record> getStudentRecord()
    {
        return studentRecord;
    }
    public List<Course> getregisteredCourses()
    {
        return registeredCourses;
    }
    //Setter method
    public void setenroll(Boolean state)
    {
        isEnrolled = state;
    }
    public void addRecord(Record r)
    {
        studentRecord.add(r);
    }
    public void removeRecord(Record r)
    {
        studentRecord.remove(r);
    }
    public void registerforclass(Course c)
    {
        /*if (c.getSemestersOffered.size() > 0)
        {
            for (int i=0; i < c.getSemestersOffered.size(); i++)
            {
                if (c.getSemestersOffered.get(i) == currentSemester)
                {
                    registeredCourses.add(c);
                }
            }
        }*/
        registeredCourses.add(c);
    }
    
    public int registerForClass()
    {
        System.out.println("resgistering...");
        return 0;
    }

}
