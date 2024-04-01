package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtil {
		XSSFWorkbook wb;
		//constructor for reading excel path
		public ExcelFileUtil(String ExcelPath)throws Throwable
		{
			FileInputStream fi = new FileInputStream(ExcelPath);
			wb = new XSSFWorkbook(fi);
		}
		//count no of rows in a sheet
		public int rowCount(String SheetName)
		{
			return wb.getSheet(SheetName).getLastRowNum();
		}
		//count no of cells in row
		public int cellCount(String sheetName)
		{
			return wb.getSheet(sheetName).getRow(0).getLastCellNum();
		}
		//get cell data from sheet
		public String getCellData(String sheetName,int row,int column)
		{
			String data="";
			if(wb.getSheet(sheetName).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata =(int) wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
				data =String.valueOf(celldata);
			}
			else
			{
				data =wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
			}
			return data;
		}
		//set cell data
		public void setCellData(String sheetName,int row,int column,String status,String WriteExcel)throws Throwable
		{
			//get sheet from wb
			XSSFSheet ws =wb.getSheet(sheetName);
			//get row from sheet
			XSSFRow rowNum =ws.getRow(row);
			//create cell
			XSSFCell cell =rowNum.createCell(column);
			cell.setCellValue(status);
			if(status.equalsIgnoreCase("Pass"))
			{
				XSSFCellStyle style = wb.createCellStyle();
				XSSFFont font = wb.createFont();
				font.setColor(IndexedColors.GREEN.getIndex());
				font.setBold(true);
				font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
				style.setFont(font);
				ws.getRow(row).getCell(column).setCellStyle(style);
			}
			else if(status.equalsIgnoreCase("Fail"))
			{
				XSSFCellStyle style = wb.createCellStyle();
				XSSFFont font = wb.createFont();
				font.setColor(IndexedColors.RED.getIndex());
				font.setBold(true);
				font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
				style.setFont(font);
				ws.getRow(row).getCell(column).setCellStyle(style);
			}
			else if(status.equalsIgnoreCase("blocked"))
			{
				XSSFCellStyle style = wb.createCellStyle();
				XSSFFont font = wb.createFont();
				font.setColor(IndexedColors.BLUE.getIndex());
				font.setBold(true);
				font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
				style.setFont(font);
				ws.getRow(row).getCell(column).setCellStyle(style);
			}
			FileOutputStream fo = new FileOutputStream(WriteExcel);
			wb.write(fo);
		}
		
}



