package com.example.michlg.youtubebaseapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by M2469215 on 16/03/2018.
 */

public class YoutubeResultsAdapter extends RecyclerView.Adapter {
    /**
     * This inner class implements the ViewHolder for our items
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
