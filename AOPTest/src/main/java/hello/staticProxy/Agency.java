package hello.staticProxy;

/**
 * 代理角色--中介
 * 实现目标角色的行为，并增强用户行为
 */
public class Agency implements RentHouse{
    public RentHouse target;
    public Agency(RentHouse target){
        this.target=target;
    }
    @Override
    public void toRentHouse() {
        //功能的扩展
        System.out.println("发布租房信息...");
        //实现目标角色的方法
        target.toRentHouse();
        //功能的扩展
        System.out.println("准备合同...");
    }
}
