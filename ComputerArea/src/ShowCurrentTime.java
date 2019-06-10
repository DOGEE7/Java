public class ShowCurrentTime {
    public static  void main(String[] args){
        long totalMillisecond = System.currentTimeMillis();
        long totalSeconds = totalMillisecond / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHou = totalHours % 24;
        System.out.println(currentHou + ":" + currentMinute + ":" + currentSecond);
    }
}
