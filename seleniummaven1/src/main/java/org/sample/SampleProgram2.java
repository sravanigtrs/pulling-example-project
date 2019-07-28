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

public class SampleProgram2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\sony\\eclipse-workspace\\seleniummaven1\\data\\Logindata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook();
		Sheet s = w.getSheet("myfate");
		
	    Row r=s.createRow(2);
		Cell c=r.createCell(1);
		c.setCellValue("hai");
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
	}

}
