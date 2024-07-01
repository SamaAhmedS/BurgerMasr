package food;

class Extra extends Item {
    private Type type;

    public Extra(String name, Double price, Type type) {
        super(name, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Extra{name='" + getName() + "', price=" + getPrice() + 
               ", type='" + type + "'}";
    }
}
