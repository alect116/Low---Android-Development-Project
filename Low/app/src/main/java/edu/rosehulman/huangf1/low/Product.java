package edu.rosehulman.huangf1.low;

import android.icu.text.IDNA;
import android.media.Image;
import android.media.RemoteController;

/**
 * Created by huangf1 on 1/15/2017.
 */

public class Product {


    private String name;
    private int id;
    private String retailer;
    private String clickUrl;
    private Double price;
    private String priceLabel;
    private Image image;
    private IDNA.Info metadata;

    public Product() {
    }

    public IDNA.Info getMetadata() {
        return metadata;
    }

    public void setMetadata(IDNA.Info metadata) {
        this.metadata = metadata;
    }

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

    public int getID() {
        return id;
    }
}
