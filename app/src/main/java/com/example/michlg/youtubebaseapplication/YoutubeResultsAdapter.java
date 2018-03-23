package com.example.michlg.youtubebaseapplication;

import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * This class is an adapter for ou recycler view
 * Created by M2469215 on 16/03/2018.
 */

public class YoutubeResultsAdapter extends RecyclerView.Adapter<YoutubeResultsAdapter.ViewHolder> {
    /**
     * This inner class implements the ViewHolder for our items
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView title;
        TextView description;
        TextView date;
        ImageView img;

        /**
         * Creates our viewholder
         *
         * @param itemView
         */
        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cardview);
            title = (TextView) itemView.findViewById(R.id.yt_title);
            description = (TextView) itemView.findViewById(R.id.yt_description);
            date = (TextView) itemView.findViewById(R.id.yt_date);
            img = (ImageView) itemView.findViewById(R.id.yt_picture);
        }
    }

    //region Model
    List<YoutubeVideoModelAdapter> videos;
    //endregion

    //region Constructor

    /**
     * Base constructor for the adapter
     *
     * @param videos
     */
    public YoutubeResultsAdapter(List<YoutubeVideoModelAdapter> videos) {
        this.videos = videos;
    }
    //endregion

    //region Overridden methods

    /**
     * Method to be executed on the viewholder creation event
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.yt_card, parent, false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Test", Toast.LENGTH_LONG).show();
            }
        });
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(videos.get(position).getTitle());
        holder.description.setText(videos.get(position).getDescription());
        holder.date.setText(new SimpleDateFormat("dd/MM/yyyy")
                .format(videos.get(position).getPublicationDate()));
        new DownloadImageTask(holder.img).execute(videos.get(position).getImageUrl());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }
    //endregion
}
