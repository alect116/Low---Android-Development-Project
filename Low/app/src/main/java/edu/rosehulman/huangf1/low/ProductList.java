package edu.rosehulman.huangf1.low;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.EditText;

import java.util.Locale;

public class ProductList extends AppCompatActivity {

    private static final String SEARCH_MESSAGE = "Search";
    private static final String SEARCH_SHOW = "Show";
    private ProductAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);


        String searchHint = getIntent().getStringExtra(SEARCH_MESSAGE);
        boolean showSearch = getIntent().getBooleanExtra(SEARCH_SHOW, true);

        SearchView searchText = (SearchView) findViewById(R.id.searchView);
        searchText.setQuery(searchHint, false);
//        searchText.setVisibility();



        RecyclerView listView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new ProductAdapter(this,listView, searchText.getQuery().toString());
        listView.setLayoutManager(new GridLayoutManager(this, 2));
        listView.setAdapter(mAdapter);
        listView.setHasFixedSize(true);



    }
}
