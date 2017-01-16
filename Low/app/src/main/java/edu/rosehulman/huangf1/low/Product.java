package edu.rosehulman.huangf1.low;

/**
 * Created by huangf1 on 1/15/2017.
 */

public class Product {
    private String mName;
    private String mRetailer;
    private String mLink;
    private Double mPrice;

    public Product() {
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRetailer() {
        return mRetailer;
    }

    public void setmRetailer(String mRetailer) {
        this.mRetailer = mRetailer;
    }

    public String getmLink() {
        return mLink;
    }

    public void setmLink(String mLink) {
        this.mLink = mLink;
    }

    public Double getmPrice() {
        return mPrice;
    }

    public void setmPrice(Double mPrice) {
        this.mPrice = mPrice;
    }
}
