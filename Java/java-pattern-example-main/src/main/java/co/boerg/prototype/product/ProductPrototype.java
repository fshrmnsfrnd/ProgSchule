package co.boerg.prototype.product;

public abstract class ProductPrototype implements Cloneable{
    private String name;
    private String description;
    private Long produkt_nummer;

    @Override
    public ProductPrototype clone(){
        ProductPrototype clone = null;
        try{
            clone = (ProductPrototype) super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
    public Long getProdukt_nummer() {
        return produkt_nummer;
    }

    public void setProdukt_nummer(Long produkt_nummer) {
        this.produkt_nummer = produkt_nummer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
