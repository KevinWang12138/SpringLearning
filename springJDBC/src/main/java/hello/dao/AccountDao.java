package hello.dao;

public interface AccountDao {
    //支出
    public Integer outMoney(Integer outId,Double money);
    //收入
    public Integer inMoney(Integer inId,Double money);
}
