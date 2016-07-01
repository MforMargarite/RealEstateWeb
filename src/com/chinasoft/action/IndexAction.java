package com.chinasoft.action;

import java.util.List;

import com.chinasoft.pojo.HouseSellEnterprise;
import com.chinasoft.pojo.HouseSellRent;
import com.chinasoft.pojo.HouseSellSecondhand;
import com.chinasoft.service.HouseSellEnterpriseService;
import com.chinasoft.service.HouseSellRentService;
import com.chinasoft.service.HouseSellSecondhandService;

public class IndexAction {

	/**
	 * ���ⷿ�ݷ���
	 */
	private HouseSellRentService houseSellRentService;

	/**
	 * ��ҵ�·�����
	 */
	private HouseSellEnterpriseService houseSellEnterpriseService;

	/**
	 * ���۶��ַ�����
	 */
	private HouseSellSecondhandService houseSellSecondhandService;

	/**
	 * ��ҳ������Ϣ�б�
	 */
	private List<HouseSellRent> houseSellRentList;

	/**
	 * ��ҳ��ҵ¥����Ϣ�б�
	 */
	private List<HouseSellEnterprise> houseSellEnterpriseList;

	/**
	 * ��ҳ���۶��ַ���Ϣ�б�
	 */
	private List<HouseSellSecondhand> houseSellSecondhandList;

	public HouseSellRentService getHouseSellRentService() {
		return houseSellRentService;
	}

	public void setHouseSellRentService(
			HouseSellRentService houseSellRentService) {
		this.houseSellRentService = houseSellRentService;
	}

	public HouseSellEnterpriseService getHouseSellEnterpriseService() {
		return houseSellEnterpriseService;
	}

	public void setHouseSellEnterpriseService(
			HouseSellEnterpriseService houseSellEnterpriseService) {
		this.houseSellEnterpriseService = houseSellEnterpriseService;
	}

	public HouseSellSecondhandService getHouseSellSecondhandService() {
		return houseSellSecondhandService;
	}

	public void setHouseSellSecondhandService(
			HouseSellSecondhandService houseSellSecondhandService) {
		this.houseSellSecondhandService = houseSellSecondhandService;
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

	public List<HouseSellSecondhand> getHouseSellSecondhandList() {
		return houseSellSecondhandList;
	}

	public void setHouseSellSecondhandList(
			List<HouseSellSecondhand> houseSellSecondhandList) {
		this.houseSellSecondhandList = houseSellSecondhandList;
	}

	/**
	 * ������ҳ�ķ�����Ϣ ���ⷿ�� ��ҵ�·� ���۶��ַ�
	 * 
	 * @return
	 */
	public String LoadInfo() {
		houseSellRentList = houseSellRentService.getRentInfo();
		houseSellEnterpriseList = houseSellEnterpriseService.getSellNewInfo();
		houseSellSecondhandList = houseSellSecondhandService.getSellOldInfo();

		if (houseSellEnterpriseList != null && houseSellRentList != null
				&& houseSellSecondhandList != null) {
			return "success";
		} else {
			return "error";
		}

	}

	/**
	 * ��ҵ�·���ȡ����
	 * 
	 * @return
	 */
	public List<HouseSellEnterprise> Test1() {
		return houseSellEnterpriseService.getSellNewInfo();
	}

	public List<HouseSellRent> Test2() {
		return houseSellRentService.getRentInfo();
	}

}
