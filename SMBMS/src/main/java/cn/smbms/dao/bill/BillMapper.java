package cn.smbms.dao.bill;

import cn.smbms.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {

	/**
	 * 增加订单
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	int add(@Param("bill") Bill bill);


	/**
	 * 通过查询条件获取供应商列表-模糊查询-getBillList
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	List<Bill> getBillList(@Param("bill") Bill bill);
	
	/**
	 * 通过delId删除Bill
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	int deleteBillById(@Param("delId") String delId);
	
	
	/**
	 * 通过billId获取Bill
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Bill getBillById(@Param("id") String id);
	
	/**
	 * 修改订单信息
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	 int modify(@Param("bill") Bill bill);

	/**
	 * 根据供应商ID查询订单数量
	 * @param providerId
	 * @return
	 * @throws Exception
	 */
	int getBillCountByProviderId(@Param("providerId") String providerId);

}
