import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Course
{
    private int courseID;
    private String Title;
    private String Description;  //Not used yet.
    private List<String> semestersOffered = new ArrayList<String>();
    //Getter methods
    public int getcid()
    {
        return courseID;
    }
    public String gettitle()
    {
        return Title;
    }
    public String getdescp()
    {
        return Description;
    }
    public List<String> getSemestersOffered()
    {
        return semestersOffered;
    }
    //Setter methods
    public void setcid(int i)
    {
        courseID = i;
    }
    public void setTitle(String t)
    {
        Title = t;
    }
    public void setDescription(String d)
    {
        Description = d;
    }
    public void setSemestersOffered(List<String> strlist)
    {
        semestersOffered = strlist;
    }

}
