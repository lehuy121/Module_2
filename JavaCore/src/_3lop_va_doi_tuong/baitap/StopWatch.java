package _3lop_va_doi_tuong.baitap;

public class StopWatch {
    private long startTime;
    private long endTime;

    protected long getStartTime() {
        return this.startTime;
    }

    protected long getEndTime() {
        return this.endTime;
    }

    protected long start() {
        return this.startTime = System.currentTimeMillis();
    }

    protected long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    protected double getElapsedTime() {
        return (this.getEndTime() - this.getStartTime()) / 1000.0;
    }

}
