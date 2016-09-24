//readFile.java
import java.io.*;
import java.util.List;
import java.util.ArrayList;

class readFile 
{
	public static void pullDataFrom(String filename, int fieldNum) {
		
	}
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
		String[] afterSplit;
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> al3 = new ArrayList<String>();
		ArrayList<String> al4 = new ArrayList<String>();
		ArrayList<String> al5 = new ArrayList<String>();
		try 
		{
			File myFile = new File("courses.csv");
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;

			while ((line = reader.readLine()) != null) 
			{

				afterSplit = line.split(",");
				System.out.println(afterSplit.length);
				for (int i=0; i < fieldNum; i++)
				{
					
				}
			}
			reader.close();

		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		listOLists.add(studentIds);
		listOLists.add(names);
		System.out.println(listOLists);
	}
	
}