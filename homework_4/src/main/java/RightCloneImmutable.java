import java.util.Date;


public final class RightCloneImmutable {
    private final long start;
    private final long end;

    public RightCloneImmutable(Date start, Date end) {
        this.start = start.getTime();
        this.end = end.getTime();
    }

    public Date getStart() {
        return new Date(start);
    }

    public Date getEnd() {
        return new Date(end);
    }
}