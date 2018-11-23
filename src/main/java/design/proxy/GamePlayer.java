package design.proxy;

public class GamePlayer implements IGamePlayer {

    private String name = ""; //构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer gamePlayer,String _name) throws Exception{
        System.out.println(gamePlayer.getClass());
        if(gamePlayer==null)
            throw new Exception("error");
        else
            this.name = _name;

    } //打怪，最期望的就是杀老怪
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    } //进游戏之前你肯定要登录吧，这是一个必要条件
    public void login(String user, String password) {
        System.out.println("登录名为"+user + "的用户" + this.name + "登录成功！");
    } //升级，升级有很多方法，花钱买是一种，做任务也是一种
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！"); }
}