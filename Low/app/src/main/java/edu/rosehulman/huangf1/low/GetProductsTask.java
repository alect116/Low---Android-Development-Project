package edu.rosehulman.huangf1.low;

import android.os.AsyncTask;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by thompsar on 1/16/2017.
 */
public class GetProductsTask extends AsyncTask<String, Void, ArrayList<Product>>{

    private ProductAdapter mUserActivity;
    String urlString;

    public GetProductsTask(ProductAdapter activity) {
        mUserActivity = activity;
    }

    @Override
    protected ArrayList<Product> doInBackground(String... urlStrings) {
        urlString = urlStrings[0];
        ObjectNode node = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            node = mapper.readValue(new URL(urlString), ObjectNode.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayNode products = (ArrayNode) node.get("products");
        ArrayList<Product> prods = new ArrayList<>();
        for (int i=0; i<products.size(); i++){
            Product p = new Product(products.get(1).get("name").asText());
            mUserActivity.addProduct(p);
            prods.add(p);
        }


//        Product product = null;
//        try {
//            product = (new ObjectMapper()).readValue(new URL(urlString), Product.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return prods;
    }

//    @Override
//    protected void onPostExecute(Product product) {
//        super.onPostExecute(product);
//        mUserActivity.addProduct(product);
//    }
}
