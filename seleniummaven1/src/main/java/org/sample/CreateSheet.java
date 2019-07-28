package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\sony\\eclipse-workspace\\seleniummaven1\\data\\Logindata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.createSheet("sample1");
		Row r=s.createRow(0);
		
		Cell c=r.createCell(0);
		
		c.setCellValue("createsample");
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		/*Row r1=s.getRow(0);
		Cell c1=r1.getCell(0);
		String data = c.getStringCellValue();
		System.out.println(data);
		*/
	}

}
