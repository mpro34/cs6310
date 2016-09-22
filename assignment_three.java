import java.io.*;
import java.util.List;
import java.util.ArrayList;

class assignment_three
{
	public static List<String> readStudentData(String inputFile) 
	{
		int id = 0;
		String[] afterSplit;
		List<String> studentIds = new ArrayList<String>();
        List<Student> allStudents = new ArrayList<Student>();
        
		try
		{
			File myFile = new File(inputFile);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;

			while ((line = reader.readLine()) != null) 
			{
				afterSplit = line.split(",");
                Student chris = new Student(true);
				chris.setuuid(Integer.parseInt(afterSplit[0]));  //Only add studentId values to array
                chris.setName(afterSplit[1]);
                chris.setAddress(afterSplit[2]);
                chris.setPhone(afterSplit[3]);
                allStudents.add(chris);
			}
			reader.close();

		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		return studentIds;
	}
    //*******************************************************************
    public static List<Student> parseStudentData(String inputFile)
    {
        int id = 0;
        String[] afterSplit;
        List<Student> allStudents = new ArrayList<Student>();
        
        try
        {
            File myFile = new File(inputFile);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            
            while ((line = reader.readLine()) != null)
            {
                afterSplit = line.split(",");
                Student chris = new Student(true);
                chris.setuuid(Integer.parseInt(afterSplit[0]));  //Only add studentId values to array
                chris.setName(afterSplit[1]);
                chris.setAddress(afterSplit[2]);
                chris.setPhone(afterSplit[3]);
                allStudents.add(chris);
            }
            reader.close();
            
        } catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        return allStudents;
    }
    
    public static List<Instructor> parseInstructorData(String inputFile)
    {
        int id = 0;
        String[] afterSplit;
        List<Instructor> allInstructors = new ArrayList<Instructor>();
        
        try
        {
            File myFile = new File(inputFile);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            
            while ((line = reader.readLine()) != null)
            {
                afterSplit = line.split(",");
                Instructor whiting = new Instructor();
                whiting.setuuid(Integer.parseInt(afterSplit[0]));  //Only add studentId values to array
                whiting.setName(afterSplit[1]);
                whiting.setAddress(afterSplit[2]);
                whiting.setPhone(afterSplit[3]);
                allInstructors.add(whiting);
            }
            reader.close();
            
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return allInstructors;
    }
    
    public static List<Course> parseCoursesData(String inputFile)
    {
        int id = 0;
        String[] afterSplit;
        List<Course> allCourses = new ArrayList<Course>();
        
        try
        {
            File myFile = new File(inputFile);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            
            while ((line = reader.readLine()) != null)
            {
             //Keeps track of each courses semesters offered data.
                List<String> semesters = new ArrayList<String>();
                afterSplit = line.split(",");
                System.out.println(afterSplit[1]);
                Course compsci = new Course();
                compsci.setcid(Integer.parseInt(afterSplit[0]));
                compsci.setTitle(afterSplit[1]);
                if (afterSplit.length > 2 && afterSplit[2] != null) { semesters.add(afterSplit[2]); }
                if (afterSplit.length > 3 && afterSplit[3] != null) { semesters.add(afterSplit[3]); }
                if (afterSplit.length > 4 && afterSplit[4] != null) { semesters.add(afterSplit[4]); }
                compsci.setSemestersOffered(semesters);
                allCourses.add(compsci);
            }
            reader.close();
            
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return allCourses;
    }
    
    public static List<Record> parseRecordsData(String inputFile)
    {
        int id = 0;
        String[] afterSplit;
        List<Record> allRecords = new ArrayList<Record>();
        
        try
        {
            File myFile = new File(inputFile);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            
            while ((line = reader.readLine()) != null)
            {
                //Keeps track of each courses semesters offered data.
         //       List<String> semesters = new ArrayList<String>();
                afterSplit = line.split(",");
                System.out.println(afterSplit[1]);
                Record chris_fall = new Record();
                chris_fall.setStuId(Integer.parseInt(afterSplit[0]));
                chris_fall.setCourId(Integer.parseInt(afterSplit[1]));
                chris_fall.setInstId(Integer.parseInt(afterSplit[2]));
                if (afterSplit.length > 3 && afterSplit[3] != null) { chris_fall.addNote(afterSplit[3]); }
                if (afterSplit.length > 4 && afterSplit[4] != null) { chris_fall.setFinalGrade(afterSplit[4]); }
             //   if (afterSplit.length > 5 && afterSplit[5] != null) { semesters.add(afterSplit[5]); }
                allRecords.add(chris_fall);
            }
            reader.close();
            
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return allRecords;
    }
    
    
    
    //*******************************************************************


	//arguments are the records file and a guide number for which data is required for return:
	//  1 - student id, 2 - course id, 3 - instructor id.
	public static List<String> readRecordsData(String inputFile, int guide) 
	{
		int id = 0;
		String[] afterSplit;
		List<String> recordDataList = new ArrayList<String>();
		List<String> studentIds = new ArrayList<String>();
		List<String> courseIds = new ArrayList<String>();
		List<String> instructorIds = new ArrayList<String>();
		try 
		{
			File myFile = new File(inputFile);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;

			while ((line = reader.readLine()) != null) 
			{
				afterSplit = line.split(",");
				studentIds.add(afterSplit[0]);        //build student id array
				courseIds.add(afterSplit[1]);        //build course id array
				instructorIds.add(afterSplit[2]);
			}
			reader.close();

		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		if (guide == 1) { recordDataList = studentIds; }
		else if (guide == 2) { recordDataList = courseIds; }
		else if (guide == 3) { recordDataList = instructorIds; }
		else { System.out.println("Incorrect guide value, enter 1-3."); }
		return recordDataList;
	}

	public static List<String> readInstructorsData(String inputFile) 
	{
		int id = 0;
		String[] afterSplit;
		List<String> instructorIds = new ArrayList<String>();
		try 
		{
			File myFile = new File(inputFile);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;

			while ((line = reader.readLine()) != null) 
			{
				afterSplit = line.split(",");
				instructorIds.add(afterSplit[0]);        //build instructor id array
			}
			reader.close();

		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		return instructorIds;
	}

	public static List<String> readCoursesData(String inputFile, String term) 
	{
		String[] afterSplit;
		List<String> courseIds = new ArrayList<String>();
		List<String> offeredFall = new ArrayList<String>();
		List<String> offeredSummer = new ArrayList<String>();
		List<String> offeredSpring = new ArrayList<String>();
		List<String> termResults = new ArrayList<String>();
		try 
		{
			File myFile = new File(inputFile);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;

			while ((line = reader.readLine()) != null) 
			{
				afterSplit = line.split(",");
				courseIds.add(afterSplit[0]);        //build course id array
				for (int i=2; i<afterSplit.length; i++) {
					 //Add course ID to offered lists
					if (afterSplit[i].equals("Fall")) {
						offeredFall.add(afterSplit[0]);
					}
					else if (afterSplit[i].equals("Summer")) {
						offeredSummer.add(afterSplit[0]);
					}
					else if (afterSplit[i].equals("Spring")) {
						offeredSpring.add(afterSplit[0]);
					}
				}
			}
			reader.close();

		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}

		if (term.equals("fall")) { termResults = offeredFall; }
		else if (term.equals("spring")) { termResults = offeredSpring; }
		else if (term.equals("summer")) { termResults = offeredSummer; }
		else if (term.equals("courses")) { termResults = courseIds; }
		return termResults;
	}

	public static int findLazyStudents()
	{
		int numOfLazyStudents = 0;
		List<String> stuID = readStudentData("students.csv");
		List<String> courID = readRecordsData("records.csv", 1);   //Get stud id data.
		//List denoting the students that are lazy and took 0 classes.
		List<Boolean> lazyStudents = new ArrayList<Boolean>(stuID.size());
		for (int z=0; z < stuID.size(); z++) { lazyStudents.add(true); }
		for (int i=0; i < stuID.size(); i++) 
		{
			for (int j=0; j < courID.size(); j++) 
			{
				if (Integer.parseInt(stuID.get(i)) == Integer.parseInt(courID.get(j))) 
				{ 
					lazyStudents.set(i, false); 
				}
			}
		}
		//Count the number of lazy students and return
		for (int i=0; i < lazyStudents.size(); i++)
		{
			if (lazyStudents.get(i)) { numOfLazyStudents++; }
		}
		return numOfLazyStudents;
	}

	public static int findLazyInstructors()
	{
		int numOfLazyInstructors = 0;
		List<String> instID = readInstructorsData("instructors.csv");
		List<String> courID = readRecordsData("records.csv", 3);  //Get inst id data.
		//List denoting the students that are lazy and took 0 classes.
		List<Boolean> lazyInstructors = new ArrayList<Boolean>(instID.size());
		for (int z=0; z < instID.size(); z++) { lazyInstructors.add(true); }
		for (int i=0; i < instID.size(); i++) 
		{
			for (int j=0; j < courID.size(); j++) 
			{
				if (Integer.parseInt(instID.get(i)) == Integer.parseInt(courID.get(j))) 
				{ 
					lazyInstructors.set(i, false); 
				}
			}
		}
		//Count the number of lazy students and return
		for (int i=0; i < lazyInstructors.size(); i++)
		{
			if (lazyInstructors.get(i)) { numOfLazyInstructors++; }
		}
		return numOfLazyInstructors;
	}
    
    
    //Function to assign records to the particular students.
    public static void assignRecords(List<Student> ls, List<Record> lr)
    {
        System.out.println(ls.get(0).getuuid());
        System.out.println(lr.get(0).getStuId());
        for (int i=0; i < lr.size(); i++)
        {
            for (int j=0; j < ls.size(); j++)
            {
                if (lr.get(i).getStuId() == ls.get(j).getuuid())
                {
                    ls.get(j).addRecord(lr.get(i));
                }
            }
        }
    }
    
    public static void outputDigest()
    {
        //Parse data files and assign records to students + instructors.
        List<Record> schoolRecords = parseRecordsData("records.csv");
        List<Student> allStudents = parseStudentData("students.csv");
        List<Instructor> allInstructors = parseInstructorData("instructors.csv");
        List<Course> allCourses = parseCoursesData("courses.csv");
        assignRecords(allStudents, schoolRecords);

    }

	public static void main(String[] args) 
	{

		//Produce output (digest) format
        List<Record> schoolRecords = parseRecordsData("records.csv");
        List<Student> allStudents = parseStudentData("students.csv");
        List<Instructor> allInstructors = parseInstructorData("instructors.csv");
        List<Course> allCourses = parseCoursesData("courses.csv");
        assignRecords(allStudents, schoolRecords);
		//#1
        Principal pete = new Principal();
        System.out.println(pete.getActiveInstructors());
        System.out.println(pete.getActiveStudents());
        System.out.println(pete.getCurrentCourses());
        
        pete.setActiveInstructors(allInstructors);
        pete.setActiveStudents(allStudents);
        pete.setCurrentCourses(allCourses);
        
        
        System.out.println(pete.getActiveInstructors());
        System.out.println(pete.getActiveStudents().size());
        System.out.println(pete.getCurrentCourses());
        
        pete.enrollStudent(allStudents.get(0));
        System.out.println(pete.getActiveStudents().size());
        
       // allStudents.get(1).addRecord(schoolRecords.get(0));
       // List<Record> r = allStudents.get(1).getStudentRecord();
       // System.out.println(r.get(0).getFinalGrade());

		//System.out.println(readRecordsData("records.csv", 1).size());
		//#2  
        /*	System.out.println(readStudentData("students.csv").size());
		//#3
		System.out.println(findLazyStudents()); 
		//#4
		System.out.println(readInstructorsData("instructors.csv").size()); 
		//#5
		System.out.println(findLazyInstructors());
		//#6
		System.out.println(readCoursesData("courses.csv", "courses").size());
		//#7
		List<String> recorded_courseID = readRecordsData("records.csv", 2);
		List<String> allcourses = readCoursesData("courses.csv", "courses");
		List<Boolean> takenCourses = new ArrayList<Boolean>(allcourses.size());
		int nonTakenCourses = 0;
		for (int z=0; z < allcourses.size(); z++) { takenCourses.add(false); }
		for (int i=0; i < allcourses.size(); i++) 
		{
			for (int j=0; j < recorded_courseID.size(); j++) 
			{
				if (Integer.parseInt(allcourses.get(i)) == Integer.parseInt(recorded_courseID.get(j))) 
				{ 
					takenCourses.set(i, true); 
				}
			}
		}
		for (int c=0; c<takenCourses.size(); c++) 
		{
			if (!takenCourses.get(c)) { nonTakenCourses++; }
		}

		System.out.println(nonTakenCourses);
		//#8
		System.out.println(readCoursesData("courses.csv", "fall").size());
		//#9
		System.out.println(readCoursesData("courses.csv", "spring").size());
		//#10
		System.out.println(readCoursesData("courses.csv", "summer").size());*/
        
        //Create Patron and Student.
      //  Patron mypat = new Patron();
      //  mypat.UUID = 4;
      //  System.out.println(mypat);
        
     //   Student mystud1 = new Student(true);
     //   Student mystud2 = new Student(false);
        //mystud1.UUID = 5;
        //mystud2.UUID = 6;
       // mystud2.isEnrolled = true;
     //   System.out.println(mystud1.getuuid());
     //   System.out.println(mystud2.getenroll());
        
    /*    List<Student> allStudents = new ArrayList<Student>();
        allStudents.add(mystud1);
        System.out.println(allStudents.get(0).registerForClass());
        allStudents.add(mystud2);
        System.out.println(allStudents.get(1).UUID);
        courseCatalog gt = new courseCatalog();
        Course biology = new Course();
        Course math = new Course();
        biology.Title = "biology for cs majors!";
        math.Title = "math cs6290";
        gt.activeCourses.add(biology);
        gt.activeCourses.add(math);
        System.out.println(gt.activeCourses.get(1).Title);*/
	}
}
