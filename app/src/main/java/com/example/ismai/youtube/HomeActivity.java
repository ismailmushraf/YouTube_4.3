package com.example.ismai.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.ismai.youtube.adapters.ChannelCardAdapter;
import com.example.ismai.youtube.adapters.VideoCardAdapter;
import com.example.ismai.youtube.models.ChannelCardModel;
import com.example.ismai.youtube.models.VideoCardModel;

public class HomeActivity extends AppCompatActivity {

    VideoCardModel[] videos = new VideoCardModel[]{
            new VideoCardModel("Top 10 Cars of 2024", "1.2M Views", "2 days ago", "AutoFanatic", R.drawable.background),
            new VideoCardModel("Watch this before it gets deleted!", "800K Views", "5 days ago", "Anonymous", R.drawable.background),
            new VideoCardModel("Crazy Engineering Facts", "500K Views", "1 week ago", "Tech Insider", R.drawable.background),
            new VideoCardModel("How to be a Millionaire?", "2.3M Views", "3 months ago", "Money Talk", R.drawable.background),
            new VideoCardModel("Gaming Setup Tour 2024", "4M Views", "1 year ago", "GamerPro", R.drawable.background)
    };

    ChannelCardModel[] channels = new ChannelCardModel[]{
            new ChannelCardModel("AutoFanatic", "1.2M Subscribers", R.drawable.background),
            new ChannelCardModel("Anonymous", "800K Subscribers", R.drawable.background),
            new ChannelCardModel("Tech Insider", "500K Subscribers", R.drawable.background),
            new ChannelCardModel("Money Talk", "2.3M Subscribers", R.drawable.background),
            new ChannelCardModel("GamerPro", "4M Subscribers", R.drawable.background)
    };



    private ListView videosContainer;
    private VideoCardAdapter videosAdapter;

//    private ListView channelsContainer;
//    private ChannelCardAdapter channelsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        videosContainer = findViewById(R.id.listViewVideos);
        videosAdapter = new VideoCardAdapter(getApplicationContext(), R.layout.video_card, videos);

        if (videosContainer != null) {
            videosContainer.setAdapter(videosAdapter);
        }

//        channelsContainer = findViewById(R.id.listViewChannels);
//        channelsAdapter = new ChannelCardAdapter(getApplicationContext(), R.layout.channel_card, channels);
//
//        if (channelsContainer != null) {
//            channelsContainer.setAdapter(channelsAdapter);
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_search) {
            Intent i = new Intent(this, SearchActivity.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
