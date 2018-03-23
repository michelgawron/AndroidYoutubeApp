package com.example.michlg.youtubebaseapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by michlg on 23/03/2018.
 */

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    //region Fields
    ImageView myImage;
    //endregion

    //region Constructor
    DownloadImageTask(ImageView myImage) {
        this.myImage = myImage;
    }
    //endregion

    //region Overridden methods

    /**
     * Downloads an image from an url in the background
     *
     * @param urls
     * @return A bitmap object that we can add to an imageview
     */
    @Override
    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        return mIcon11;
    }
    //endregion

    /**
     * Function to be executed at the end of the async task - set the image to the imageview
     *
     * @param result
     */
    protected void onPostExecute(Bitmap result) {
        myImage.setImageBitmap(result);
    }
}
