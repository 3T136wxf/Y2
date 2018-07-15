package cn.smbms.dao.user;

import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.sql.Connection;
import java.util.List;

public interface UserMapper {
	/**
	 * 增加用户信息
	 * @param connection
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int add(@Param("user") User user);

	/**
	 * 通过userCode获取User
	 * @param
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	User getLoginUsers(@Param("userCode") String userCode,@Param("userPassword") String userPassword);

	/**
	 * 通过条件查询-userList
	 * @param
	 * @param userName
	 * @param userRole
	 * @return
	 * @throws Exception
	 */
	List<User> getUserList(@Param("userName") String userName,@Param("userRole") Integer userRole,@Param("currentPageNo") Integer currentPageNo,@Param("pageSize") Integer pageSize);
	/**
	 * 通过条件查询-用户表记录数
	 * @param
	 * @param userName
	 * @param userRole
	 * @return
	 * @throws Exception
	 */
	int getUserCount(@Param("userName") String userName,@Param("userRole") Integer userRole);
	
	/**
	 * 通过userId删除user
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	int deleteUserById(@Param("delId") Integer delId);
	
	
	/**
	 * 通过userId获取user
	 * @param connection
	 * @param id
	 * @return
	 * @throws Exception
	 */
	User getUserById(@Param("id") String id);
	
	/**
	 * 修改用户信息
	 * @param connection
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int modify(@Param("user") User user);
	
	
	/**
	 * 修改当前用户密码
	 * @param connection
	 * @param id
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	int updatePwd(@Param("id") Integer id,@Param("pwd") String pwd);
	
	
}
