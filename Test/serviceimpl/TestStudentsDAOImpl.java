package serviceimpl;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import service.StudentsDAO;
import entity.Students;

public class TestStudentsDAOImpl {
	
	@Test
	public void testQueryAllStudents(){
		StudentsDAO sdao = new StudentsDAOImpl();
		 List<Students> list = sdao.queryAllStudents();
		 
		 for(int i =0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }
	}
	
	@Test
	public void testGetNewSid()
	{
		StudentsDAOImpl sdao = new StudentsDAOImpl();
		System.out.println(sdao.getNewSid());
	}
	
	@Test
	public void testAddStudents(){
		Students s = new Students();
		s.setGender("男");
		s.setAddress("武当山");
		s.setBirthday(new Date());
		s.setSname("张三丰");
		StudentsDAOImpl sdao = new StudentsDAOImpl();
		Assert.assertEquals(true, sdao.addStudents(s));
	}
}
