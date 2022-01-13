package hello.staticProxy;

public class MarryCompany implements Marry{
    public Marry target;
    public MarryCompany(Marry target){
        this.target=target;
    }
    @Override
    public void toMarry() {
        System.out.println("为你准备婚礼...");
        target.toMarry();
        System.out.println("婚礼结束了...");
    }
}
