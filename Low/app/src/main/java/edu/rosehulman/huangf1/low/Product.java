package edu.rosehulman.huangf1.low;

import android.icu.text.IDNA;
import android.media.Image;
import android.media.RemoteController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by huangf1 on 1/15/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Product {


    private String name;
    private int id;
    private String retailer;
    private String clickUrl;
    private Double price;
    private String priceLabel;
    private Image image;
//    private JSONObject metadata;
    private JSONObject products;

    public Product() {
    }

    public JSONObject getProducts() {
        return products;
    }

    public void setProducts(JSONObject products) {
        this.products = products;
    }
    //
//    public IDNA.Info getMetadata() {
//        return metadata;
//    }
//
//    public void setMetadata(IDNA.Info metadata) {
//        this.metadata = metadata;
//    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public String getPriceLabel() {
        return priceLabel;
    }

    public void setPriceLabel(String priceLabel) {
        this.priceLabel = priceLabel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }
}
