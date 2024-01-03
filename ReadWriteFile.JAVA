import java.io.File;  //create file
import java.io.PrintWriter; //write file
import java.io.IOException;
import java.io.*;

class ReadWriteFile
{
	public static void main (String[]args) throws IOException
	{
	 PrintWriter out=new PrintWriter("Marks2.txt");

	 //Locate the file
	 String fileName="C://java/Marks1.txt"; //name of the file to open

	 //read the file //one line at a time
	 String line= null;

	try {
	 FileReader fileReader= new FileReader(fileName); 		//java reserve word "FileReader"
	 BufferedReader bufferedReader= new BufferedReader(fileReader);	//java reserve word "BufferedReader"
			
	while((line=bufferedReader.readLine()) != null)
	{
	 out.println(line);
	 System.out.println(line);
	}
	 bufferedReader.close();
	}
	
	//when using try must have catch
	catch (FileNotFoundException ex)
	{
	 System.out.println("Unable to open file " + fileName + " ");
	}
	catch (IOException ex)
	{
	 System.out.println ("Reading Error file " + fileName + " ");
	}

	out.close();
	}
}