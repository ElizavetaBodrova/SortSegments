/**
 * Класс границы отрезка - с координатой и пометкой, является ли граница началом
 */
public class SegmentBorder {
    private int point;
    private boolean isStart;

    public SegmentBorder(int point, boolean isStart) {
        this.point = point;
        this.isStart = isStart;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

}
