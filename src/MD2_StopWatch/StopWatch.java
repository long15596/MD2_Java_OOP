package src.MD2_StopWatch;

import java.time.LocalTime;

public class StopWatch {
    LocalTime startTime;
    LocalTime endTime;

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void start() {
        startTime = LocalTime.now();
    }
    public void stop() {
        endTime = LocalTime.now();
    }
    public int getElapsedTime() {
        int miliSecond = (((endTime.getHour() - startTime.getHour()) * 3600) + ((endTime.getMinute() - startTime.getMinute()) * 60) + ((endTime.getSecond() - startTime.getSecond()) * 1000));
        return miliSecond;
    }

}
