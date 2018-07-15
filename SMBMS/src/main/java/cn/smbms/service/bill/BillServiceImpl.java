package cn.smbms.service.bill;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;
import cn.smbms.tools.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BillServiceImpl {

    private BillMapper billDao;
    private SqlSession sqlSession = MybatisUtil.getSession();

    public BillServiceImpl() {
        billDao = sqlSession.getMapper(BillMapper.class);
    }

    public boolean add(Bill bill) {
        // TODO Auto-generated method stub
//		boolean flag = false;
//		Connection connection = null;
//		try {
//			connection = BaseDao.getConnection();
//			connection.setAutoCommit(false);//开启JDBC事务管理
//			if(billDao.add(connection,bill) > 0)
//				flag = true;
//			connection.commit();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			try {
//				System.out.println("rollback==================");
//				connection.rollback();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}finally{
//			//在service层进行connection连接的关闭
//			BaseDao.closeResource(connection, null, null);
//		}
        try {
            int row = billDao.add(bill);
            sqlSession.commit();
            if (row > 0) {
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

    public List<Bill> getBillList(Bill bill) {
        return billDao.getBillList(bill);
    }

    public boolean deleteBillById(String delId) {
        try {
            int row = billDao.deleteBillById(delId);
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

    public Bill getBillById(String id) {
        return billDao.getBillById(id);
    }

    public boolean modify(Bill bill) {
        try {
            int row = billDao.modify(bill);
            sqlSession.commit();
            if (row > 0) {
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

}
