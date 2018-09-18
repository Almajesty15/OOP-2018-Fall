public class Time {

    int hour, minute, second;

    Time(int _hour, int _minute, int _second) {
        hour = _hour;
        minute = _minute;
        second = _second;
    }

    String toUniversal() {
        String time = "";
        time += convert(hour) + ":";
        time += convert(minute) + ":";
        time += convert(second);
        return time;
    }

    String toStandard() {
        String time = "";
        time += convert(hour % 12) + ":";
        time += convert(minute) + ":";
        time += convert(second) + " " + (hour / 12 == 0 ? "AM" : "PM");
        return time;
    }

    void add(Time toadd) {
        int first = hour * 3600 + minute * 60 + second;
        int second = toadd.hour * 3600 + toadd.minute * 60 + toadd.second;
        int sum = (first + second) % 86400;
        this.hour = sum / 3600;
        this.minute = sum % 3600 / 60;
        this.second = sum % 3600 % 60; // ????
    }

    private String convert(int time) {
        String cur = Integer.toString(time);
        if (cur.length() == 1) cur = "0" + cur;
        return cur;
    }
}