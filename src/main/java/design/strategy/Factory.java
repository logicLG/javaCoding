package design.strategy;

public abstract class Factory {
    public abstract <T extends Strategy> T create(Class<T> c);
}
class ConcreteFactory extends Factory{

    @Override
    public <T extends Strategy> T create(Class<T> c) {
        Strategy strategy=null;
        try {
            strategy= (Strategy) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) strategy;
    }
}
