package com.example.ismai.youtube.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismai.youtube.R;
import com.example.ismai.youtube.models.VideoCardModel;

/**
 * Created by ismai on 3/7/2025.
 */

public class VideoCardAdapter extends ArrayAdapter<VideoCardModel> {

    Context context;
    int layoutResourceId;
    VideoCardModel data[] = null;

    public VideoCardAdapter(Context context, int layoutResourceId, VideoCardModel[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Nullable
    @Override
    public VideoCardModel getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View videoCard = convertView;
        LayoutInflater inflater = LayoutInflater.from(context);
        videoCard = inflater.inflate(layoutResourceId, parent, false);

        ImageView thumbnail = videoCard.findViewById(R.id.thumbnail_pic);
        TextView title = videoCard.findViewById(R.id.video_title);
        TextView views = videoCard.findViewById(R.id.view_count);
        TextView date = videoCard.findViewById(R.id.created_date);
        TextView channelName = videoCard.findViewById(R.id.channel_name);

        VideoCardModel video = data[position];

        title.setText(video.getTitle());
        views.setText(video.getViews());
        date.setText(video.getDate());
        channelName.setText(video.getChannelName());
        thumbnail.setImageResource(video.getThumbnailResId());

        return videoCard;
    }
}
