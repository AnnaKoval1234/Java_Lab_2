class Line
{
    private Point begin;
    private Point end;

    public Line(int x_begin, int y_begin, int x_end, int y_end)
    {
        this.begin = new Point(x_begin, y_begin);
        this.end = new Point(x_end, y_end);
    }
    public Line(Point begin, Point end)
    {
        this.begin = begin;
        this.end = end;
    }
    
    public Point getBegin()
    {
        return begin;
    }
    public Point getEnd()
    {
        return end;
    }
    public void setBegin(Point begin)
    {
        this.begin = begin;
    }
    public void setEnd(Point end)
    {
        this.end = end;
    }
    public void setBegin(int x_begin, int y_begin)
    {
        this.begin.setX(x_begin);
        this.begin.setY(y_begin);
    }
    public void setEnd(int x_end, int y_end)
    {
        this.end.setX(x_end);
        this.end.setY(y_end);
    }

    @Override
    public String toString()
    {
        return "Линия от " + begin + " до " + end;
    }
}