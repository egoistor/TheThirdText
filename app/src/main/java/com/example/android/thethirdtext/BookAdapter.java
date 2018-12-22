package com.example.android.thethirdtext;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private List<Book> myBookList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView bookName;

        public ViewHolder(View view){
            super(view);
            bookName = view.findViewById(R.id.book_name);
        }
    }

    public void addBook(Book book){
        myBookList.add(book);
        notifyItemInserted(0);
    }

    public BookAdapter(List<Book> bookList){
        myBookList = bookList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (position % 2 == 0) {
            holder.bookName.setBackgroundColor(Color.parseColor("#7AC5CD"));
        }
        else{
            holder.bookName.setBackgroundColor(Color.WHITE);
        }
        Book book = myBookList.get(position);
        holder.bookName.setText(book.getName());
    }

    @Override
    public int getItemCount() {
        return myBookList.size();
    }
}
