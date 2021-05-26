package day03;

public class MobilePhone {
    /**
     * 属性
     */
    public String brand;
    public int price;

    /**
     * 设置手机的品牌
     * @param name
     */
    public void setBrand(String name){
        brand = name;
    }

    /**
     * 设置手机的价格
     * @param monkey
     */
    public void setPrice(int monkey){
        price = monkey;
    }

    /**
     * 函数（方法） --> 行为
     */
    public void sendMessage(){
        System.out.println("周末去你家玩");
        System.out.println("此短信发自一部价格为:【"+this.price+"】, 品牌为:【"+this.brand+"】的手机");
    }

    /**
     * 无参构造函数
     */
    public MobilePhone(){

    }

    /**
     * 带参构造函数
     * @param name
     * @param monkey
     */

    public MobilePhone(String name,int monkey){
        brand = name;
        price = monkey;
    }

    public static void main(String[] args) {
        //调用无参构造函数创建一个手机对象
        MobilePhone mobile1 = new MobilePhone();
        mobile1.setBrand("iphone X");
        mobile1.setPrice(4800);
        mobile1.sendMessage();
        //调用带参函数创建一个手机对象
        MobilePhone mobile2 = new MobilePhone("华为P30 pro",5800);
        mobile2.sendMessage();

        /**
         * 静态方法，和不是静态方法
         * 1.静态的方法可以用方法名直接调
         * 2.不是静态的方法只能用对象去调
         */
    }
}
