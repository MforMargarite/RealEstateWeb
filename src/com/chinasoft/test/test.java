package com.chinasoft.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasoft.action.HouseSellEnterpriseAction;
import com.chinasoft.action.HouseSellRentAction;
import com.chinasoft.action.IndexAction;
import com.chinasoft.pojo.HouseSellEnterprise;
import com.chinasoft.pojo.HouseSellRent;
import com.chinasoft.pojo.HouseType;


//JUnit��
public class test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		//JUnit����
//		//������ҳ������Ϣ���
//		HouseSellRentAction action = (HouseSellRentAction) context.getBean("HouseSellRentAction");
//		List<HouseSellRent> list = action.Test1();	
//		for(int i = 0; i < list.size(); i++)
//		{
//			HouseSellRent temp = list.get(i); //������Ϣ
//			
//			HouseType houseType = temp.getHouseType(); //��������
//			
//			System.out.print(houseType.getHtypeId() + "	");
//			System.out.println(houseType.getName());	
//		}
		
//		//������ҳ������Ϣ���
//		System.out.print("����");
//		HouseSellEnterpriseAction action = (HouseSellEnterpriseAction) context.getBean("HouseSellEnterpriseAction");
//		List<HouseSellEnterprise> list = action.Test1();	
//		for(int i = 0; i < list.size(); i++)
//		{
//			HouseSellEnterprise temp = list.get(i); //�·���Ϣ
//			
//			System.out.print(temp.getTitle() + " ");
//			System.out.println(temp.getRegion().getCounty());	
//		}
		
		
		//������ҳ������Ϣ���
		System.out.println("����");
		IndexAction action = (IndexAction) context.getBean("IndexAction");
		
		List<HouseSellRent> list = action.Test2();	
		for(int i = 0; i < list.size(); i++)
		{
			HouseSellRent temp = list.get(i); //������Ϣ
			
			HouseType houseType = temp.getHouseType(); //��������
			
			System.out.print(houseType.getHtypeId() + "	");
			System.out.println(houseType.getName());	
		}
		
		List<HouseSellEnterprise> list2 = action.Test1();	
		for(int i = 0; i < list2.size(); i++)
		{
			HouseSellEnterprise temp = list2.get(i); //�·���Ϣ
			
			System.out.print(temp.getTitle() + " ");
			System.out.println(temp.getRegion().getCounty());	
		}
		
		
	}

}