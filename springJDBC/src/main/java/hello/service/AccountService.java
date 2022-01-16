package hello.service;

import hello.dao.AccountDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountService {
    @Resource
    AccountDaoImpl accountDao;
    public void tranfer(Integer outId,Integer inId,Double money){
        //支出操作
        Integer row1=accountDao.outMoney(outId,money);
        //收入
        Integer row2=accountDao.inMoney(inId,money);

        //判断是否操作成功
        if(row1==1&&row2==1){
            System.out.println("转账成功");
        }else{
            System.out.println("转账失败");
        }
    }
}
