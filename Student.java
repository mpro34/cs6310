import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Student extends Patron
{
    private Boolean isEnrolled;
    private List<Record> studentRecord = new ArrayList<Record>();
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
    
    public int registerForClass()
    {
        System.out.println("resgistering...");
        return 0;
    }

}
