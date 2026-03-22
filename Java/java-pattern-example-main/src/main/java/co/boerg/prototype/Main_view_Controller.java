package co.boerg.prototype;

import co.boerg.prototype.product.Model_Product;
import co.boerg.prototype.product.ProductPrototype;
import co.boerg.prototype.product.PrototypeManager;
import co.boerg.prototype.product.VALID_PRODUCTS;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Main_view_Controller {
    PrototypeManager manager;
    ObservableList<Model_Product> products;
    @FXML
    void initialize(){
        this.manager = new PrototypeManager();
        this.col_Typ.setCellValueFactory(new PropertyValueFactory<>("typ"));
        this.col_Name.setCellValueFactory(new PropertyValueFactory<>("name"));
        this.col_Description.setCellValueFactory(new PropertyValueFactory<>("description"));
        this.col_Produktnummer.setCellValueFactory(new PropertyValueFactory<>("produktnummer"));
        this.col_Action.setCellValueFactory(new PropertyValueFactory<>("action"));
        products = FXCollections.observableArrayList();
        this.tv_Table.setItems(products);
    }

    @FXML
    protected void onNewDvD(){
        // Anstatt ein komplett neues DvD Objekt zu erstellen klonen wir es
        ProductPrototype clonedDvD = manager.getPrototype(VALID_PRODUCTS.DVD).clone();
        clonedDvD.setName(this.tf_Name.getText());
        clonedDvD.setDescription(this.tf_Description.getText());
        clonedDvD.setProdukt_nummer(Long.valueOf(this.tf_Produktnummer.getText()));
        Button btn = new Button();
        btn.setOnAction((var e)->{
            this.products.removeIf(obj -> obj.getProduktnummer().equals(clonedDvD.getProdukt_nummer().toString()));
        });
        btn.setText("Löschen");
        Model_Product model = manager.getModelProduct();
        model.inflate(clonedDvD, "DvD", btn);
        this.products.add(model);
    }
    @FXML
    protected void onNewCD(){
        ProductPrototype clonedCD = manager.getPrototype(VALID_PRODUCTS.CD).clone();
        clonedCD.setName(this.tf_Name.getText());
        clonedCD.setDescription(this.tf_Description.getText());
        clonedCD.setProdukt_nummer(Long.valueOf(this.tf_Produktnummer.getText()));
        Button btn = new Button();
        btn.setOnAction((var e)->{
            this.products.removeIf(obj -> obj.getProduktnummer().equals(clonedCD.getProdukt_nummer().toString()));
        });
        btn.setText("Löschen");
        Model_Product model = manager.getModelProduct();
        model.inflate(clonedCD, "CD", btn);
        this.products.add(model);
    }
    @FXML
    protected void onNewBuch(){
        ProductPrototype clonedBuch = manager.getPrototype(VALID_PRODUCTS.BUCH).clone();
        clonedBuch.setName(this.tf_Name.getText());
        clonedBuch.setDescription(this.tf_Description.getText());
        clonedBuch.setProdukt_nummer(Long.valueOf(this.tf_Produktnummer.getText()));
        Button btn = new Button();
        btn.setOnAction((var e)->{
            this.products.removeIf(obj -> obj.getProduktnummer().equals(clonedBuch.getProdukt_nummer().toString()));
        });
        btn.setText("Löschen");
        Model_Product model = manager.getModelProduct();
        model.inflate(clonedBuch, "Buch", btn);
        this.products.add(model);
    }

    @FXML
    protected TextField tf_Name;
    @FXML
    protected TextField tf_Description;
    @FXML
    protected TextField tf_Produktnummer;

    @FXML
    protected TableColumn<Model_Product, String> col_Typ;
    @FXML
    protected TableColumn<Model_Product, String> col_Name;
    @FXML
    protected TableColumn<Model_Product, String> col_Description;
    @FXML
    protected TableColumn<Model_Product, String> col_Produktnummer;
    @FXML
    protected TableColumn<Model_Product, Button> col_Action;
    @FXML
    protected TableView<Model_Product> tv_Table;

}
