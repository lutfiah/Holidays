package sg.edu.rp.c347.holidays;

public class Holiday {
    private String name;
    private String date;
    private String icon;
    public Holiday(String name, String date, String icon) {
        this.name = name;
        this.date = date;
        this.icon = icon;
    }
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getIcon() {
        return icon;
    }
}
