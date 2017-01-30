package edu.rosehulman.huangf1.low;

import android.util.Log;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by thompsar on 1/15/2017.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Product> mProducts;
    private RecyclerView mRecyclerView;
    private String[] mSearchQuery;
    private String mUrl;
    private ViewHolder mView;

    public ProductAdapter(Context context, RecyclerView view, String searchQuery) {
        mContext = context;
        mRecyclerView = view;
        mSearchQuery = searchQuery.split(" ");
        mProducts = new ArrayList<>();

        //load products
        for (int i=0; i<mSearchQuery.length; i++) {
            mUrl = String.format(Locale.US, "https://api.shopstyle.com/api/v2/products?pid=uid8681-34276459-70&cat=mens-clothes&fts=" + mSearchQuery[i]);
        }
        mUrl = mUrl + "&sort=PriceLoHi&offset=0&limit=10";
        (new GetProductsTask(this)).execute(mUrl);


    }

    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("Set Text", "set");
        View view = LayoutInflater.from(mContext).inflate(R.layout.grid_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductAdapter.ViewHolder holder, int position) {
        holder.priceText.setText(mProducts.get(position).getPrice());
        holder.productNameText.setText(mProducts.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
//        return 0;
    }

    public void addProduct(Product product) {
        Log.d("Product Added", "added");
        mProducts.add(product);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnTouchListener {

        private ImageView imageView;
        private TextView priceText;
        private TextView productNameText;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            priceText = (TextView) itemView.findViewById(R.id.productPriceText);
            productNameText = (TextView) itemView.findViewById(R.id.productNameText);
            itemView.setOnTouchListener(this);

        }


        @Override
        public boolean onTouch(View v, MotionEvent event) {

            return false;
        }
    }
}