package cn.smbms.dao.role;

import java.sql.Connection;
import java.util.List;
import cn.smbms.pojo.Role;

public interface RoleMapper {
	
	List<Role> getRoleList();

}
