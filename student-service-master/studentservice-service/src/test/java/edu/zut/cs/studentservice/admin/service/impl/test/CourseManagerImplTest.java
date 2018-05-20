package edu.zut.cs.studentservice.admin.service.impl.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.admin.service.impl.CourseManagerImpl;
import edu.zut.cs.studentservice.base.service.GenericGenerator;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CourseManagerImplTest extends GenericGenerator {
	@Test
	public void findTest()
	{
		CourseManagerImpl courseManagerImpl=new CourseManagerImpl();
		List<Course> courses=courseManagerImpl.getCourseDao().findBySpeciality("软件工程");
		System.out.println(courses.size());
	}
	

//	public void addCourse() throws InterruptedException
//	{
//		File file=new File("G:\\Java\\ServerFiles\\17182\\17182.xls");
//		List<List<String>> ex=new ArrayList<>();
//		ex=readExcel(file);	
//		for(int i=0;i<ex.size();i++)
//		{	
//			if((i+1)%9==0)
//			{
//				Course course=new Course();
//				course.setSpecialty(ex.get(i-8).get(3));
//				course.setStudent_class(ex.get(i-8).get(4));
//				course.setMonday("");
//				course.setTuesday("");
//				course.setWednesday("");
//				course.setThursday("");
//				course.setFriday("");
//				course.setSaturday("");
//				course.setSunday("");
//				for(int row=i-8;row<i+1;row++)
//				{
//					if((row-(i-8))>1&&row<i-1)
//					{
//						course.setMonday(course.getMonday()+ex.get(row).get(0)+"^");
//						course.setTuesday(course.getTuesday()+ex.get(row).get(1)+"^");
//						course.setWednesday(course.getWednesday()+ex.get(row).get(2)+"^");
//						course.setThursday(course.getThursday()+ex.get(row).get(3)+"^");
//						course.setFriday(course.getFriday()+ex.get(row).get(4)+"^");
//						course.setSaturday(course.getSaturday()+ex.get(row).get(6)+"^");
//						course.setSunday(course.getSunday()+ex.get(row).get(7)+"^");
//					}
//				}
//				this.courseManager.save(course);
//			}
//			
//		
//		}
//	}
//	@Test
//	public void add()
//	{
//		
//		for(int i=0;i<10;i++)
//		{
//			Course course=new Course();
//			course.setMonday(""+i);
//			this.courseManager.save(course);
//		}
//
//	}
	public  List<List<String>> readExcel(File file) throws InterruptedException
	{
		try
		{
			List <List<String>> myExcel = new ArrayList<>();
			InputStream is=new FileInputStream(file.getAbsolutePath());
			Workbook wb=Workbook.getWorkbook(is);
			int sheet_size=wb.getNumberOfSheets();
			List<List> outerList=new ArrayList<List>();
			for(int index=0;index<sheet_size;index++)
			{
				Sheet sheet=wb.getSheet(index);
				for(int i=0;i<sheet.getRows();i++)
				{
					List innerList=new ArrayList<>();
					for(int j=0;j<sheet.getColumns();j++)
					{
						String cellinfo=sheet.getCell(j, i).getContents();
						if(cellinfo.isEmpty())
							cellinfo="Empty!";
						innerList.add(cellinfo);
					}
					outerList.add(i,innerList);
					myExcel.add(innerList);
				}
			}
			return myExcel;
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
