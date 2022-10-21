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
        ArrayList<Product> data = new ArrayList<Product>();
        data.add(
                new Product(
                        "Product 1", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Male_and_female_chicken_sitting_together.jpg/220px-Male_and_female_chicken_sitting_together.jpg", 199
                )
        );
        data.add(
                new Product(
                        "Product 2", "https://image.shutterstock.com/image-photo/homemade-chicken-rotisserie-thyme-lemon-260nw-1574170006.jpg", 2199
                )
        );


        data.add(
                new Product(
                        "Product 3", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Eier_verschiedener_H%C3%BChnerrassen.jpg/220px-Eier_verschiedener_H%C3%BChnerrassen.jpg", 999
                )
        );
        data.add(
                new Product(
                        "Product 4", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Rooster_portrait2.jpg/300px-Rooster_portrait2.jpg", 219
                )
        );
        products.setValue(data);
    }



    LiveData<ArrayList<Product>> getData(){
        return products;
    }

}