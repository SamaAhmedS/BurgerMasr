package food;

import java.util.ArrayList;

class Sandwich extends Item {
    private String breadType;
    private String[] fillings;
    //private ArrayList<Extra> extra;

    public Sandwich(String name, Double price, String breadType, String[] fillings) {
        super(name, price);
        this.breadType = breadType;
        this.fillings = fillings;
       // extra = new ArrayList<>();
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String[] getFillings() {
        return fillings;
    }

    public void setFillings(String[] fillings) {
        this.fillings = fillings;
    }

    @Override
    public String toString() {
        return "Sandwich{name='" + getName() + 
               ", breadType='" + breadType + "', fillings=" + String.join(", ", fillings) + "', price=" + getPrice()  + "}";
    }
}
