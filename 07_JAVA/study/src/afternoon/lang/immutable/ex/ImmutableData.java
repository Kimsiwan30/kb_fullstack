package afternoon.lang.immutable.ex;

public class ImmutableData {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableData(final int year, final int month, final int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() { return year; }

    public ImmutableData setYear( int year) {
        return new ImmutableData(year, this.month, this.day);
    }

    public int getMonth() { return month; }

    public ImmutableData setMonth( int month) {
        return new ImmutableData(this.year, month, this.day);
    }

    public int getDay() { return day; }

    public ImmutableData setDate( int day) {
        return new ImmutableData(this.year, this.month, day);
    }

}
