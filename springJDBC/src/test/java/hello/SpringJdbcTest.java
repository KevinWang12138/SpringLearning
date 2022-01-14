package hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcTest {
    @Test
    public void testJdbc(){
        //得到上下文环境
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate=(JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        String sql="select count(*) from tb_count";
        Integer total= jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println("得到总记录数" + total);
    }
}
