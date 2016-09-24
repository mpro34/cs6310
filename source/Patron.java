import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Patron 
{
    private int UUID;
    private String name;
    private String Address;
    private Boolean isInstructor;
    private String phoneNumber;
    //Getter methods
    public int getuuid()
    {
        return UUID;
    }
    public String getname()
    {
        return name;
    }
    public String getaddr()
    {
        return Address;
    }
    public Boolean getInststate()
    {
        return isInstructor;
    }
    public String getphone()
    {
        return phoneNumber;
    }
    //Setter methods
    public void setuuid(int i)
    {
        UUID = i;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setAddress(String a)
    {
        Address = a;
    }
    public void setisAnInstructor(Boolean b)
    {
        isInstructor = b;
    }
    public void setPhone(String s)
    {
        phoneNumber = s;
    }
    
}
