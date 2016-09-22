import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Instructor extends Patron
{
    private List<Course> taughtCourses = new ArrayList<Course>();
    private Boolean isHired;
    //Getter methods
    public List<Course> getcourses()
    {
        return taughtCourses;
    }
    public Boolean gethired()
    {
        return isHired;
    }
    //Setter methods
    public void setTaughtCourses(List<Course> courselist)
    {
        taughtCourses = courselist;
    }
    public void setHiredState(Boolean state)
    {
        isHired = state;
    }
    
}
