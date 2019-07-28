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

public class BasicProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Normal file
		File f=new File("C:\\\\Users\\\\sony\\\\eclipse-workspace\\\\seleniummaven1\\\\data\\\\Logindata.xlsx");
       //convert into object format
		FileInputStream fis=new FileInputStream(f);

	Workbook w=new XSSFWorkbook(fis);
	
	Sheet s=w.getSheet("myfate");
	
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		
	Row r=s.getRow(i);
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c=r.getCell(j);
		 
		int type = c.getCellType();
		if(type==1) {
			String data = c.getStringCellValue();
			System.out.println(data);
		}
		else {
			double value = c.getNumericCellValue();
			
			long l=(long)value;
		String data = String.valueOf(l);
		System.out.println(data);
			
			
		}
		
		
		
	}
		
	}
	
	

	}}
