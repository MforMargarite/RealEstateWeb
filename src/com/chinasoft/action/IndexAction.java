package com.chinasoft.action;

import java.util.List;

import com.chinasoft.pojo.HouseSellEnterprise;
import com.chinasoft.pojo.HouseSellRent;
import com.chinasoft.service.HouseSellEnterpriseService;
import com.chinasoft.service.HouseSellRentService;

public class IndexAction {

	private HouseSellRentService houseSellRentService;
	private HouseSellEnterpriseService houseSellEnterpriseService;
	
	private List<HouseSellRent> houseSellRentList; //��ҳ������Ϣ�б�
	private List<HouseSellEnterprise> houseSellEnterpriseList; //��ҳ��ҵ¥����Ϣ�б�
	
	
	public HouseSellRentService getHouseSellRentService() {
		return houseSellRentService;
	}
	public void setHouseSellRentService(HouseSellRentService houseSellRentService) {
		this.houseSellRentService = houseSellRentService;
	}
	public HouseSellEnterpriseService getHouseSellEnterpriseService() {
		return houseSellEnterpriseService;
	}
	public void setHouseSellEnterpriseService(
			HouseSellEnterpriseService houseSellEnterpriseService) {
		this.houseSellEnterpriseService = houseSellEnterpriseService;
	}
	public List<HouseSellRent> getHouseSellRentList() {
		return houseSellRentList;
	}
	public void setHouseSellRentList(List<HouseSellRent> houseSellRentList) {
		this.houseSellRentList = houseSellRentList;
	}
	public List<HouseSellEnterprise> getHouseSellEnterpriseList() {
		return houseSellEnterpriseList;
	}
	public void setHouseSellEnterpriseList(
			List<HouseSellEnterprise> houseSellEnterpriseList) {
		this.houseSellEnterpriseList = houseSellEnterpriseList;
	}
	
	
	
	public String LoadInfo(){
		houseSellRentList = houseSellRentService.getRentInfo();
		houseSellEnterpriseList = houseSellEnterpriseService.getSellNewInfo();
		
		if (houseSellEnterpriseList != null && houseSellRentList != null) {
			return "success";
		} else {
			return "error";
		}
		
	}
	
	public List<HouseSellEnterprise> Test1(){
		return houseSellEnterpriseService.getSellNewInfo();
	}
	
	
	public List<HouseSellRent> Test2(){
		return houseSellRentService.getRentInfo();
	}
	
	
	

}
