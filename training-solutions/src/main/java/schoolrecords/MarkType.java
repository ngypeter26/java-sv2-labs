package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private final int markInt;
    private final String markString;

    MarkType(int markInt, String markString) {
        this.markInt = markInt;
        this.markString = markString;
    }

    public int getMarkInt() {
        return markInt;
    }

    public String getMarkString() {
        return markString;
    }
}
