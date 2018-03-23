package com.example.michlg.youtubebaseapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.michlg.youtubebaseapplication.Model.YoutubeResult;
import com.example.michlg.youtubebaseapplication.Model.YoutubeSingleVideo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public void createAdapter(YoutubeResultsAdapter adapter) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText query = (EditText) findViewById(R.id.query);
        Button queryButton = (Button) findViewById(R.id.button_query);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executeQuery(query.getText().toString());
            }
        });
    }

    protected void executeQuery(String query) {
        Retrofit r = RetrofitClient.getRetrofitClient("https://www.googleapis.com");

        YoutubeClient service = r.create(YoutubeClient.class);

        Call<YoutubeResult> yres = service
                .listItems("AIzaSyCLflXUAXwY1xWUfgYWK0txiaWAh1om8Y8",
                        query,
                        "snippet",
                        25);

        final RecyclerView rv = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this.getApplicationContext());
        rv.setLayoutManager(llm);

        yres.enqueue(new Callback<YoutubeResult>() {
            @Override
            public void onResponse(Call<YoutubeResult> call, Response<YoutubeResult> response) {
                if (response.isSuccessful()) {
                    ArrayList<YoutubeVideoModelAdapter> myVideos = new ArrayList<YoutubeVideoModelAdapter>();
                    for (YoutubeSingleVideo video : response.body().getItems()) {
                        myVideos.add(new YoutubeVideoModelAdapter(video));
                    }
                    YoutubeResultsAdapter adapter = new YoutubeResultsAdapter(myVideos);
                    rv.setAdapter(adapter);
                } else {
                    Log.i("RESPONSE CODE", String.valueOf(response.code()));
                }
            }

            @Override
            public void onFailure(Call<YoutubeResult> call, Throwable t) {
                Log.i("RESPONSE", "ERROR");
                Log.e("ERROR", "onFailure: ", t);
            }
        });
    }
}
