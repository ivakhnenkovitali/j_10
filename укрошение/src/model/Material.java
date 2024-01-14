package model;

public enum Material {
    GOLD(pricePerGram:110, "золото"),;

    SILVER(pricePerGram:130, "Серебро");

    WHITE_COLD(pricePerGram:130, "белое золото" );
    private double pricePerGram;
    private String rusTitle;

    Material(double pricePerGram, String rusTitle) {
        this.pricePerGram = pricePerGram;
        this.rusTitle = rusTitle;
    }

    public double getPricePerGram() {
        return pricePerGram;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Material{");
        sb.append("pricePerGram=").append(pricePerGram);
        sb.append(", rusTitle='").append(rusTitle).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
