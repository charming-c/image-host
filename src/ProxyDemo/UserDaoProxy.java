package ProxyDemo;

public class UserDaoProxy implements IUserDao {
//创建代理类
    private IUserDao target;

    public UserDaoProxy(UserDao target){
//        创建构造器，传入被代理的对象，并将此对象声明成全剧变量，有利于继承接口行使方法
        this.target=target;
    }

    @Override
//    复写的方法能够调用传入构造器的对象的方法
//    以实现用代理来帮助被代理类行使方法
    public void save() {
        System.out.println("开始事物");
        target.save();
        System.out.println("提交事物");
    }

    public  static void main(String [] args){
        UserDao target=new UserDao();

        UserDaoProxy proxy=new UserDaoProxy(target);

        proxy.save();
    }
}
//    静态代理每代李一次都要有相应代理类和接口，比较繁琐。