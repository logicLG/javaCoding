package design.strategy;



public class Context {
    //持有抽象策略角色的引用，用于客户端调用
    private Strategy strategy;
    //获得策略类
    public Strategy getStrategy() {
        return strategy;
    }
    //设置所需策略
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;

    }
    //根据设置的策略类返回对应的结果
    public int getResult(int a,int b)
    {
        return strategy.strategy(a, b);
    }

}
abstract class Strategy {
    //定义抽象策略的方法
    public abstract int strategy(int a,int b);

}
class AddStrategy extends Strategy {
    //定义实现加法的策略方法
    public int strategy(int a, int b)
    {
        return a+b;
    }

}
class SubStrategy extends Strategy {
    //定义减法的策略方法
    public int strategy(int a, int b)
    {
        return a-b;
    }

}
class MultiplyStrategy extends Strategy {
    //定义乘法的策略方法
    public int strategy(int a,int b)
    {
        return a*b;
    }
}
class DivStrategy extends Strategy {
    //定义除法的策略方法，这里为了简单就不考虑除数为零的情况了
    public int strategy(int a,int b)
    {
        return a/b;
    }
}
