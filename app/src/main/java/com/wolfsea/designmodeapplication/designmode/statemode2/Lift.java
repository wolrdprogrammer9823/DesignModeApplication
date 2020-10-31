package com.wolfsea.designmodeapplication.designmode.statemode2;

/**
 * @author liuliheng
 * @desc 电梯实现类
 * @time 2020/10/31  10:50
 **/
public class Lift implements ILift {

    private int state;

    @Override
    public void open() {
        switch (this.state) {
            case ILift.OPEN_STATE:
            case ILift.RUN_STATE:{
                //do nothing
                break;
            }
            case ILift.STOP_STATE:
            case ILift.CLOSE_STATE:{
                //门打开状态下可以关闭,电梯停止状态下可以开门.
                openWithLogic();
                setState(ILift.OPEN_STATE);
                break;
            }
            default:
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case ILift.OPEN_STATE:
            case ILift.RUN_STATE:{
                //门关闭状态下可以开门,门运行状态下必须要关门.
                closeWithLogic();
                setState(ILift.CLOSE_STATE);
                break;
            }
            case ILift.STOP_STATE:
            case ILift.CLOSE_STATE:{
                //do nothing
                break;
            }
            default:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case ILift.OPEN_STATE:
            case ILift.RUN_STATE:{
                //do nothing
                break;
            }
            case ILift.CLOSE_STATE:
            case ILift.STOP_STATE:{
                //电梯运行状态下可以停止,门必须是关着的.
                runWithLogic();
                setState(ILift.RUN_STATE);
                break;
            }
            default:
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case ILift.OPEN_STATE:
            case ILift.RUN_STATE:{
                //电梯停止状态下可以开门,也可以运行.
                stopWithLogic();
                setState(ILift.STOP_STATE);
                break;
            }
            case ILift.CLOSE_STATE:
            case ILift.STOP_STATE:{
                //do nothing
                break;
            }
            default:
                break;
        }
    }

    public void setState(int state) {
        this.state = state;
    }

    private void openWithLogic() {

        System.out.println("电梯门打开了...");
    }

    private void runWithLogic() {

        System.out.println("电梯运行起来了...");
    }

    private void closeWithLogic() {

        System.out.println("电梯门关闭了...");
    }

    private void stopWithLogic() {

        System.out.println("电梯停止运行了...");
    }
}
