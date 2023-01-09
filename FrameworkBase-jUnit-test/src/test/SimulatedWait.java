package test;

public abstract class SimulatedWait {
    public static void waitSecs(long seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
