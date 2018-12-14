package com.example.android.thethirdtext;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Book> bookList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initBook();
        final RecyclerView recyclerView = findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        final BookAdapter adapter = new BookAdapter(bookList);
        recyclerView.setAdapter(adapter);
        final TextView textView = findViewById(R.id.edit_text);
        Button button = findViewById(R.id.add_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String mesege = textView.getText().toString();
                Book newBook = new Book(mesege);
                adapter.addBook(newBook);
                recyclerView.setAdapter(adapter);
            }
        });
    }

    private void initBook(){
        Book book1 = new Book("aaa");
        bookList.add(book1);
        Book book2 = new Book("bbb");
        bookList.add(book2);
        Book book3 = new Book("ccc");
        bookList.add(book3);
        Book book4 = new Book("ddd");
        bookList.add(book4);
        Book book5 = new Book("eee");
        bookList.add(book5);
        Book book6 = new Book("fff");
        bookList.add(book6);
        Book book7 = new Book("ggg");
        bookList.add(book7);
        Book book8 = new Book("hhh");
        bookList.add(book8);
        Book book9 = new Book("kkk");
        bookList.add(book9);
        Book book10 = new Book("jjj");
        bookList.add(book10);
    }
}
