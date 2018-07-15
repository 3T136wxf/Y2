package cn.smbms.dao.provider;

import cn.smbms.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderMapper {
	
	/**
	 * 增加供应商
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	 int add(@Param("provider") Provider provider);


	/**
	 * 通过供应商名称、编码获取供应商列表-模糊查询-providerList
	 * @param proName
	 * @return
	 * @throws Exception
	 */
	List<Provider> getProviderList(@Param("proName") String proName,@Param("proCode") String proCode);
	
	/**
	 * 通过proId删除Provider
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	int deleteProviderById(@Param("delId") String delId);
	
	
	/**
	 * 通过proId获取Provider
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Provider getProviderById(@Param("id") String id);
	
	/**
	 * 修改用户信息
	 * @return
	 * @throws Exception
	 */
	int modify(@Param("provider") Provider provider);
	
	
}
