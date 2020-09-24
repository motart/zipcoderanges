public class Range implements Comparable<Range>{
    private int from;
    private int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }
    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public String toString() {
        return "[" + from + " , " + to + "]";
    }

    @Override
    public int compareTo(Range o) {
        return from - o.from;
    }
}
