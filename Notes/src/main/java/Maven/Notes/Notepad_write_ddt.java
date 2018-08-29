package Maven.Notes;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Notepad_write_ddt 
{
   public static void main(String[] args) throws Exception
	{
		// Notepad data writing
     FileWriter fr=new FileWriter("C:\\Users\\MURALISWAPNA\\Desktop\\Softwares\\sample1.txt");
     BufferedWriter br=new BufferedWriter(fr);
     br.write("Hello world");
     br.newLine();
     br.write("Hello Anil");
     br.newLine();
     br.write("Hello Ravi");
     br.newLine();
     br.write("Hello Jo");
     br.close();
     
	}

}
