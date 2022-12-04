package com.example.projectg104;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;

import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;


import com.example.projectg104.Adapters.ProductAdapter;
import com.example.projectg104.DB.DBHelper;
import com.example.projectg104.Entities.Product;
import com.example.projectg104.Services.ProductService;

import java.util.ArrayList;

public class ProductList extends AppCompatActivity {

    private DBHelper dbHelper;
    private ProductService productService;
    private ListView productListView;
    private ArrayList<Product> arrayProducts;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);

        arrayProducts = new ArrayList<>();
        productService = new ProductService();
        //Cuando no hay base de datos se crea una pequena lista de productos
        Product product1 = new Product(R.drawable.product1,"Milky Way","Chocolatina",2500);
        Product product2 = new Product(R.drawable.product2, "M&M's", "Chocolates", 6000);
        Product product3 = new Product(R.drawable.product3, "Chocorramo", "Pastel", 2300);
        Product product4 = new Product(R.drawable.product3, "Ferrero", "Chocolates", 24500);
        Product product5 = new Product(R.drawable.product3, "Barquillos Pirulin", "Chocolates", 11200);
        Product product6 = new Product(R.drawable.product3, "Brownies Mama-Ia", "Pastel", 12000);

        arrayProducts.add(product1);
        arrayProducts.add(product2);
        arrayProducts.add(product3);
        arrayProducts.add(product4);
        arrayProducts.add(product5);
        arrayProducts.add(product6);


        productAdapter = new ProductAdapter(this, arrayProducts);
        productListView = (ListView) findViewById(R.id.productListView);
        productListView.setAdapter(productAdapter);



    }



}

           /*
            //Se insertan datos manualmente hasta crear formulario para llenar DB
            byte[] img = "".getBytes();
            dbHelper.insertData("Chocorramo","Ponquecito", "1200",img);
            dbHelper.insertData("Chocorramo","Ponquecito", "1300",img);
            dbHelper.insertData("Chocorramo","Ponquecito", "1400",img);
            */

        /*
//Cuando no hay base de datos se crea una pequena lista de productos
        Product product1 = new Product(R.drawable.product1,"Milky Way","Chocolatina",2500);
        Product product2 = new Product(R.drawable.product2, "M&M's", "Chocolates", 6000);
        Product product3 = new Product(R.drawable.product3, "Chocorramo", "Pastel", 2300);

        arrayProducts.add(product1);
        arrayProducts.add(product2);
        arrayProducts.add(product3);
*/