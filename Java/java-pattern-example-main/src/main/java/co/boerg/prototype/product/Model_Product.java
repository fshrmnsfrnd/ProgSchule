package co.boerg.prototype.product;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

public class Model_Product implements Cloneable {
    private SimpleStringProperty typ;
    private SimpleStringProperty name;
    private SimpleStringProperty description;
    private SimpleStringProperty produktnummer;
    private Button action;

    public void inflate(String typ, String name, String description, String produktnummer, Button action){
        this.typ = new SimpleStringProperty(typ);
        this.name = new SimpleStringProperty(name);
        this.description = new SimpleStringProperty(description);
        this.produktnummer = new SimpleStringProperty(produktnummer);
        this.action = action;
    }
    public void inflate(ProductPrototype input, String typ, Button action){
        this.typ = new SimpleStringProperty(typ);
        this.name = new SimpleStringProperty(input.getName());
        this.description = new SimpleStringProperty(input.getDescription());
        this.produktnummer = new SimpleStringProperty(input.getProdukt_nummer().toString());
        this.action = action;
    }
    public Button getAction() {
        return action;
    }

    public String getProduktnummer() {
        return produktnummer.get();
    }

    public SimpleStringProperty produktnummerProperty() {
        return produktnummer;
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getTyp() {
        return typ.get();
    }

    public SimpleStringProperty typProperty() {
        return typ;
    }

    @Override
    public Model_Product clone(){
        Model_Product product = null;
        try{
            product = (Model_Product) super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
}
