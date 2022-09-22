public class Pojo {
    private String item;
    private String aisle;
    private Boolean parse;

    public Pojo (String item, String aisle, Boolean parse) {
        this.item = item;
        this.aisle = aisle;
        this.parse = parse;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public Boolean getParse() {
        return parse;
    }

    public void setParse(Boolean parse) {
        this.parse = parse;
    }
}
