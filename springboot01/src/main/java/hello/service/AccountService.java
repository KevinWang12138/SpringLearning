package hello.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Value("${jdbc.username}")
    private String jdbcname;
    @Value("${jdbc.password}")
    private String jdbcpwd;
    @Value("${user.userName}")
    private String name;
    @Value("${user.password}")
    private String pwd;

    public void test(){
        System.out.println(jdbcname+" "+jdbcpwd);
        System.out.println(name+" "+pwd);
    }
}
