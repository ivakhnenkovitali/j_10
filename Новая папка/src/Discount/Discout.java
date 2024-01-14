package Discount;

public enum Discout {
    UNSISCOUNTED(1.0),
    DISCOUNTED(0.9),
    REDDISCOUTED(0.75);




    ////можно создовать статические методы


    /////дополнительное поле для каждого элемента пречисления
    private double discount;




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Discout{");
        sb.append("discount=").append(discount);
        sb.append(", name='").append(name()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    Discout(double discount) {
        this.discount = discount;

    }

    public double getDiscount() {
        return discount;
    }
}
