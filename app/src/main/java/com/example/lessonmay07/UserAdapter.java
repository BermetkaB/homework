package com.example.lessonmay07;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.userViewHolder> {
    private ArrayList<Employee> list;

    public UserAdapter(ArrayList<Employee> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public userViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list,parent,false);
        return new userViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolder holder, int position) {
        Employee employee=ne

    }

    @Override
    public int getItemCount() {
        return list.size();

    }

    class userViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewLastName;
        TextView textViewLocation;
        TextView textViewOccupation;
        public userViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName=itemView.findViewById(R.id.tvName);

        }
    }
}
