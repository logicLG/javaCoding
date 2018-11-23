package design.state;

public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }
    //电梯停止是怎么发生的
    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
