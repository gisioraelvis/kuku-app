package com.example.kukuapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kukuapp.models.Product;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Product>> products;

    public HomeViewModel() {
        products = new MutableLiveData<>();
        ArrayList<Product> items = new ArrayList<>();
        items.add(
                new Product(
                        "Eggs", "https://source.unsplash.com/leOh1CzRZVQ", 300
                )
        );
        items.add(
                new Product(
                        "Chicken", "https://source.unsplash.com/auijD19Byq8", 1000
                )
        );


        items.add(
                new Product(
                        "Chicks", "https://source.unsplash.com/gi4p27XKVY8", 2000
                )
        );
        items.add(
                new Product(
                        "Rooster", "https://source.unsplash.com/eSuB4XJxOZ4", 1500
                )
        );
        products.setValue(items);
    }


    LiveData<ArrayList<Product>> getData() {
        return products;
    }

}