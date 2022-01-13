package hello.staticProxy;

public class Starter {
    public static void main(String[] args) {
        //得到目标角色
        RentHouse target=new User();
        //得到代理角色
        Agency agency=new Agency(target);
        //代理角色实现目标角色的行为
        agency.toRentHouse();

        Marry marry=new User();

        MarryCompany marryCompany=new MarryCompany(marry);

        marryCompany.toMarry();
    }
}
