package hello.staticProxy;

/**
 * 目标角色（真实角色）--租客
 */
public class User implements RentHouse,Marry{
    @Override
    public void toRentHouse() {
        System.out.println("我要租一套三室一厅的房子");
    }

    @Override
    public void toMarry() {
        System.out.println("我要结婚了");
    }
}
