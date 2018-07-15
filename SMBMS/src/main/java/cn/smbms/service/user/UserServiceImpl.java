package cn.smbms.service.user;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.tools.Constants;
import cn.smbms.tools.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * service层捕获异常，进行事务处理
 * 事务处理：调用不同dao的多个方法，必须使用同一个connection（connection作为参数传递）
 * 事务完成之后，需要在service层进行connection的关闭，在dao层关闭（PreparedStatement和ResultSet对象）
 *
 * @author Administrator
 */
public class UserServiceImpl {

    private UserMapper userDao;
    private SqlSession sqlSession = MybatisUtil.getSession();

    public UserServiceImpl() {
        userDao = sqlSession.getMapper(UserMapper.class);
    }

    public boolean add(User user) {
        try {
            int row = userDao.add(user);
            sqlSession.commit();
            if (row == 1) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            return false;
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return false;
    }

    public User login(String userCode, String userPassword) {
        return userDao.getLoginUsers(userCode, userPassword);
    }

    public List<User> getUserList(String queryUserName, Integer queryUserRole, Integer currentPageNo, Integer pageSize) {
        return userDao.getUserList(queryUserName, queryUserRole, (currentPageNo - 1) * Constants.pageSize, pageSize);

    }

    public boolean deleteUserById(Integer delId) {
        try {
            int row = userDao.deleteUserById(delId);
            sqlSession.commit();
            if (row == 1) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            return false;
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return false;
    }

    public User getUserById(String id) {
        return userDao.getUserById(id);

    }

    public boolean modify(User user) {
        try {
            int row = userDao.modify(user);
            sqlSession.commit();
            if (row == 1) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            return false;
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return false;
    }

    public boolean updatePwd(int id, String pwd) {
        // TODO Auto-generated method stub
        try {
            int row = userDao.updatePwd(id, pwd);
            sqlSession.commit();
            if (row == 1) {
                return true;
            }
        } catch (Exception e) {
            sqlSession.rollback();
            return false;
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return false;

    }

    public int getUserCount(String queryUserName, Integer queryUserRole) {
        return userDao.getUserCount(queryUserName, queryUserRole);
    }

}
