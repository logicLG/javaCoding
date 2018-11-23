package design.state;

public abstract class LiftState {
    //定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected static Context context ;
    public void setContext(Context _context) {
        this.context = _context;
    }
    //首先电梯门开启动作
    public abstract void open();
    //电梯门有开启，自然有关闭
    public abstract void close();
    //电梯要能够运行
    public abstract void run();
    //电梯要能够停下来
    public abstract void stop();
}
