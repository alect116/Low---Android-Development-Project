package edu.rosehulman.huangf1.low;

import android.os.AsyncTask;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

/**
 * Created by thompsar on 1/16/2017.
 */
public class GetProductsTask extends AsyncTask<String, Void, Product>{

    private ProductAdapter mUserActivity;
    String urlString;

    public GetProductsTask(ProductAdapter activity) {
        mUserActivity = activity;
    }

    @Override
    protected Product doInBackground(String... urlStrings) {
        urlString = urlStrings[0];
        Product product = null;
        try {
            product = (new ObjectMapper()).readValue(new URL(urlString), Product.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    protected void onPostExecute(Product product) {
        super.onPostExecute(product);
        mUserActivity.addProduct(product);
    }
}
