package com.example.recyclerviewlab;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    private int mCurrentPosition;
    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public abstract void clear();
    public void onBind(int position)
    {
        mCurrentPosition=position;
        clear();
    }
    public int getmCurrentPosition()
    {
        return mCurrentPosition;
    }

}
