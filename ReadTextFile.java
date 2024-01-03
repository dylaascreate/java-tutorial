import java.io.*;

class ReadTextFile
{
	public static void main (String []args)
	{
	 //Locate the file
	 String fileName="C://java/Marks1.txt"; //name of the file to open

	 //read the file //one line at a time
	 String line= null;

	try {
	 FileReader fileReader= new FileReader(fileName); 		//java reserve word "FileReader"
	 BufferedReader bufferedReader= new BufferedReader(fileReader);	//java reserve word "BufferedReader"
			
	while((line=bufferedReader.readLine()) != null)
	{
	 System.out.println(line);
	}
	 bufferedReader.close();
	}
	catch (FileNotFoundException ex)
	{
	 System.out.println("Unable to open file " + fileName + " ");
	}
	catch (IOException ex)
	{
	 System.out.println ("Reading Error file " + fileName + " ");
	}
	}
}