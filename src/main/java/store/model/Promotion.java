package store.model;

public enum Promotion {
    PLUS("탄산2+1",2,1,"2024-01-01","2024-12-31"),
    discount("반짝할인",1,1,"2024-11-01","2024-11-30"),
    MD("MD추천상품",1,1,"2024-01-01","2024-12-31"),
    nothing("null",1,1,null,null);

    Promotion(String type,int buy, int get,String startDate,String endDate){
        this.type = type;
        this.buy = buy;
        this.get = get;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getType() {
        return this.type;
    }

    private String type;
    private int buy;
    private int get;
    private String startDate;
    private String endDate;

    @Override
    public String toString() {
        return "Promotion{" +
                "type='" + type + '\'' +
                ", buy=" + buy +
                ", get=" + get +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
