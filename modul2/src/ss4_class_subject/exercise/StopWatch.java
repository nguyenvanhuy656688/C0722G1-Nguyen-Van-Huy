package ss4_class_subject.exercise;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println();
        }
        stopWatch.end();
        System.out.println("Thời gian chạy : " + stopWatch.getElapsedTime() + " miliseconds");
   }
}
