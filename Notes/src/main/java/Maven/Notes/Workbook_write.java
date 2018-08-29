package Maven.Notes;

import java.io.File;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Workbook_write 
{
	public static void main(String[] args) throws Exception 
	{
		// Workbook_write a data
    // create a workbook in excel file in writable workbook
	WritableWorkbook wb=Workbook.createWorkbook(new FileOutputStream("C:\\Users\\MURALISWAPNA\\Desktop\\Softwares\\Book4.xls"));
	// create worksheet for writing
	WritableSheet ws=wb.createSheet("Samplesheet", 0);
	// add cell to a worksheet (col,row,data)
	ws.addCell(new Label(0,0,"Selenium"));
	ws.addCell(new Label(0,1,"Java"));
	ws.addCell(new Label(0,2,"Testing"));
	ws.addCell(new Label(0,3,"QTP/UFT"));
	WritableSheet ws1=wb.createSheet("New sheet", 1);
	ws1.addCell(new Label(0,2,"Testing"));
	ws1.addCell(new Label(0,3,"QTP/UFT"));
	// write all data into workbook and close
	wb.write();
	wb.close();
	}
}
