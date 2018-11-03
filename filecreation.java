import java.io.File;
import java.io.IOException;

public class filecreation {

	public void file() throws IOException
	{
		File f=new File("C:\\Users\\kanika\\Documents\\sample.txt");
		boolean b=f.createNewFile();
		
System.out.println(b);
	System.out.println("Editing Filecreation");	
	}
	
	public static void main(String[]args) throws IOException
	{
		filecreation ff=new filecreation();
		ff.file();
	}
	
}
