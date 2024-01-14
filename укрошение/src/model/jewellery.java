package model;

public abstract class  jewellery {
    private int article;
    private Producer producer;
    private double weight;
    private Material material;

    public jewellery(int article) {
        this.article = article;
    }

    public jewellery(int article, Producer producer, double weight, Material material) {
        this.article = article;
        this.producer = producer;
        this.weight = weight;
        this.material = material;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    public abstract getDifficultFactor();

    public double calculatePrice(){
        double result= weight * material.getPricePerGram() * getDifficultFactor();
        return result;
    }

}
