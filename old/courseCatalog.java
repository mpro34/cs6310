import java.io.*;
import java.util.List;
import java.util.ArrayList;

class courseCatalog
{
    private List<Course> activeCourses = new ArrayList<Course>();
    private int numberOfCourses = 0;
    private String currentSemester;
    //Getter methods
    public List<Course> getActiveCourses()
    {
        return activeCourses;
    }
    public int getnumCourses()
    {
        return numberOfCourses;
    }
    public String getcurrSemester()
    {
        return currentSemester;
    }
    
    //Setter methods
    public void setActiveCourses(List<Course> courselist)
    {
        activeCourses = courselist;
    }
    public void setNumCourses(int n)
    {
        numberOfCourses = n;
    }
    public void setCurrentSemester(String s)
    {
        currentSemester = s;
    }
    //member functions
    void addCourse(Course a)
    {
        System.out.println("added");
    }
    void removeCourse(Course r)
    {
        System.out.println("removed");
    }
    void editCourse(Course e)
    {
        System.out.println("edited");
    }
	public static void main(String[] args)
	{
		System.out.println("I am a course catalog!");
	}
}
