package cn.smbms.service.role;

import cn.smbms.dao.role.RoleMapper;
import cn.smbms.pojo.Role;
import cn.smbms.tools.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RoleServiceImpl implements RoleService{
	
	private RoleMapper roleDao;
	private SqlSession sqlSession=MybatisUtil.getSession();

	public RoleServiceImpl(){
		roleDao = sqlSession.getMapper(RoleMapper.class);
	}

	@Override
	public List<Role> getRoleList() {
		// TODO Auto-generated method stub
//		Connection connection = null;
//		List<Role> roleList = null;
//		try {
//			connection = BaseDao.getConnection();
//			roleList = roleDao.getRoleList(connection);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			BaseDao.closeResource(connection, null, null);
//		}

		return roleDao.getRoleList();


	}
	
}
