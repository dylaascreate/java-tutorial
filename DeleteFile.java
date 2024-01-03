import java.io.File;

class DeleteFile
{
	public static void main (String [] args)
	{
		//File to be deleted
		File file= new File ("Ocean.txt"); //case-sensitive
		
		//Delete file
		boolean isDeleted= file.delete(); //file will use method called delete

		//check condition
		if (isDeleted)
		{
			System.out.println("File is successfully deleted.");
		} else {
			System.out.println("File doesn't exist.");
		}
	}
}

		