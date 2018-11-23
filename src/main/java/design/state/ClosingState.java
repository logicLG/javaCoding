package design.state;

public class ClosingState extends LiftState {
    //电梯门关闭，这是关闭状态要实现的动作
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }
    //电梯门关了再打开
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}

