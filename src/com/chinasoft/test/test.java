package com.chinasoft.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasoft.action.HouseSellRentAction;
import com.chinasoft.action.UsersAction;
import com.chinasoft.dao.HouseSellRentDAO;
import com.chinasoft.pojo.HouseSellRent;
import com.chinasoft.pojo.HouseType;
import com.chinasoft.pojo.Users;

//JUnit��
public class test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		//JUnit����
//		UsersAction action = (UsersAction) context.getBean("UsersAction");
//		
//		Users users = new Users("test", "123", "testuser", 1);
//		System.out.println(action.loiginTest(users).getUAccount());
		
		
		HouseSellRentAction action = (HouseSellRentAction) context.getBean("HouseSellRentAction");
		
		List<HouseSellRent> list = action.Test1();
		
//		List<HouseSellRent> list = action.Test2();
		
		System.out.println("size: " + list.size());
		
		for(int i = 0; i < list.size(); i++)
		{
			HouseSellRent temp = list.get(i); //������Ϣ
			
			HouseType houseType = temp.getHouseType(); //��������
			
			System.out.print(houseType.getHtypeId() + "	");
			System.out.println(houseType.getHtypeName());
			
			
//			System.out.println(temp.getCommunity() + ", " + temp.getHouseType().getHtypeId() + ", " + 
//			temp.getSize() + ", " + temp.getPrice());
			
		}
		
		
		
		
	}

}
