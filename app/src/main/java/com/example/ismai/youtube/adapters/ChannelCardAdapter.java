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
import com.example.ismai.youtube.models.ChannelCardModel;

/**
 * Created by ismai on 3/7/2025.
 */

public class ChannelCardAdapter extends ArrayAdapter<ChannelCardModel> {

    Context context;
    int layoutResourceId;
    ChannelCardModel[] data = null;

    public ChannelCardAdapter(Context context, int layoutResourceId, ChannelCardModel[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Nullable
    @Override
    public ChannelCardModel getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View channelCard = convertView;
        LayoutInflater inflater = LayoutInflater.from(context);
        channelCard = inflater.inflate(layoutResourceId, parent, false);

        ImageView channelPic = channelCard.findViewById(R.id.channel_pic);
        TextView channelName = channelCard.findViewById(R.id.channel_name);
        TextView subsCount = channelCard.findViewById(R.id.subs_count);

        ChannelCardModel channel = data[position];

        channelPic.setImageResource(channel.getProfilePicResId());
        channelName.setText(channel.getName());
        subsCount.setText(channel.getSubscribers());

        return channelCard;
    }
}
