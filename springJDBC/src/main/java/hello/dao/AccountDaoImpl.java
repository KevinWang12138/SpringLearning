package hello.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
@Repository
public class AccountDaoImpl implements AccountDao{
    @Resource
    public JdbcTemplate jdbcTemplate;
    /**
     * 支出
     *      xx账户支出了xxx金额
     * @param outId
     * @param money
     * @return
     */

    @Override
    public Integer outMoney(Integer outId, Double money) {
        String sql = "update tb_count set money = money - ? where account_id = ?";
        Integer row = jdbcTemplate.update(sql,money,outId);
        return row;
    }

    /**
     * 收入
     * @param inId
     * @param money
     * @return
     */
    @Override
    public Integer inMoney(Integer inId, Double money) {
        String sql = "update tb_count set money = money + ? where account_id = ?";
        Integer row = jdbcTemplate.update(sql,money,inId);
        return row;
    }
}

