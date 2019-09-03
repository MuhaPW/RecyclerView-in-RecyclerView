package com.release.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Резервируем переменные
    RecyclerView recyclerView;
    TitleBlogRecyclerAdapter titleBlogRecyclerAdapter;

    List<List> array_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        array_list = new ArrayList(); //Создаем ArrayList где будут хранится наши Item

        List<String> item1 = new ArrayList(); //Создаем item1 и наполняем его
        item1.add("Title1"); //Первое значение у нас ровно титолу
        item1.add("item 1.1");
        item1.add("item 1.2");

        List<String> item2 = new ArrayList(); //Создаем item2 и наполняем его
        item2.add("Title2"); //Первое значение у нас ровно титолу
        item2.add("item 2.1");
        item2.add("item 2.2");

        array_list.add(item1); //Добавляем item1 в array_list
        array_list.add(item2); //Добавляем item2 в array_list

        recyclerView = (RecyclerView) findViewById(R.id.main_recycler); //Инициализируем
        titleBlogRecyclerAdapter = new TitleBlogRecyclerAdapter(array_list); //Инициализируем и передаем array_list в конструктор

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext())); //Устанавливаем LayoutManager
        recyclerView.setAdapter(titleBlogRecyclerAdapter); //Устанавливаем адаптер
    }
}
