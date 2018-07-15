package cn.smbms.service.provider;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;
import cn.smbms.tools.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Objects;

public class ProviderServiceImpl {

    private ProviderMapper providerDao;
    private BillMapper billDao;
    private SqlSession sqlSession = MybatisUtil.getSession();

    public ProviderServiceImpl() {
        providerDao = sqlSession.getMapper(ProviderMapper.class);
        billDao = sqlSession.getMapper(BillMapper.class);
    }

    public boolean add(Provider provider) {
        try {
            int row = providerDao.add(provider);
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

    public List<Provider> getProviderList(String proName, String proCode) {
        return providerDao.getProviderList(proName, proCode);
    }

    /**
     * 业务：根据ID删除供应商表的数据之前，需要先去订单表里进行查询操作
     * 若订单表中无该供应商的订单数据，则可以删除
     * 若有该供应商的订单数据，则不可以删除
     * 返回值billCount
     * 1> billCount == 0  删除---1 成功 （0） 2 不成功 （-1）
     * 2> billCount > 0    不能删除 查询成功（0）查询不成功（-1）
     * <p>
     * ---判断
     * 如果billCount = -1 失败
     * 若billCount >= 0 成功
     */

    public int deleteProviderById(String delId) {
        int billCount = 0;
        try {
            billCount = billDao.getBillCountByProviderId(delId);
            if (billCount == 0) {
                providerDao.deleteProviderById(delId);
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            Objects.requireNonNull(sqlSession);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return billCount;
    }

    public Provider getProviderById(String id) {
        return providerDao.getProviderById(id);
    }

    public boolean modify(Provider provider) {
        try {
            int row = providerDao.modify(provider);
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

}
