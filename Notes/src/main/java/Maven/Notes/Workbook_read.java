package Maven.Notes;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Workbook_read 
{

	public static void main(String[] args) throws Exception
	{
		// Workbook read
	 // file for reading	
     FileInputStream fs=new FileInputStream("C:\\Users\\MURALISWAPNA\\Desktop\\Softwares\\Book4.xls");
     // get workbook from file
     Workbook wb=Workbook.getWorkbook(fs);
     // get sheet in the workbook
     Sheet ws=wb.getSheet("Samplesheet");
     // read all rows
     for (int r=0;r<ws.getRows();r++)
     {
    	 System.out.println(ws.getCell(0,r).getContents());
     }
     wb.close();
	}

}
