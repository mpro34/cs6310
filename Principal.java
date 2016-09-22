import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Principal
{
    private List<Instructor> activeInstructors = new ArrayList<Instructor>();
    private List<Student> activeStudents = new ArrayList<Student>();
    private List<Course> currentCourses = new ArrayList<Course>();
    private String currentSemester;
   // private int numberOfInstructors;
   // private int numOfStudents;
    //Getter methods
    public List<Instructor> getActiveInstructors()
    {
        return activeInstructors;
    }
    public List<Student> getActiveStudents()
    {
        return activeStudents;
    }
    public List<Course> getCurrentCourses()
    {
        return currentCourses;
    }
    public String getCurrentSemester()
    {
        return currentSemester;
    }
   /* public int getNumOfInstructors()
    {
        return numberOfInstructors;
    }
    public int getNumOfStudents()
    {
        return numOfStudents;
    }
    //Setter methods*/
    public void setActiveInstructors(List<Instructor> instlist)
    {
        if (instlist.size() <= 10) { activeInstructors = instlist; }
        else { System.out.println("Too many instructors hired, limited at 10 per semester!"); }
    }
    public void setActiveStudents(List<Student> studlist)
    {
        if (studlist.size() <= 10) { activeStudents = studlist; }
        else { System.out.println("Too many students enrolled, limited at 5000 at any one time!"); }
    }
    public void setCurrentCourses(List<Course> courlist)
    {
        if (courlist.size() <= 100) { currentCourses = courlist; }
        else { System.out.println("Too many active courses, limited at 100 per semester!"); }
    }
    public void setCurrentSemester(String s)
    {
        currentSemester = s;
    }
    
    
    //member functions
    public void hireInstructor(Instructor i)
    {
        if (activeInstructors.size() <= 9)
        {
            activeInstructors.add(i);
            i.setHiredState(true);
        }
        else
        {
            System.out.println("Too many instructors hired, limited at 10 per semester!");
        }
    }
    
    public void addCourse(Course c)
    {
        if (currentCourses.size() <= 99)
        {
            currentCourses.add(c);
        }
        //***NEED to fix/revise this!!
    /*    else if (c.getcid() == currentCourses.get(9).getcid())
        {
            System.out.println("Error adding course, duplicate course.");
        }*/
        else
        {
            System.out.println("Too many active courses, limited at 100 per semester!");
        }
    }
    
    public void enrollStudent(Student s)
    {
        if (activeStudents.size() <= 4999)
        {
            activeStudents.add(s);
            s.setenroll(true);
        }
        else
        {
            System.out.println("Too many students enrolled, limited at 5000 at any one time!");
        }
    }
    
    public void disenrollStudent(Student s)
    {
        activeStudents.remove(s);
        s.setenroll(false);
    }
}
