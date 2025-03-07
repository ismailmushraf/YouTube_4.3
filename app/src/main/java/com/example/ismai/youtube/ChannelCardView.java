package com.example.ismai.youtube;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ismai on 3/4/2025.
 */

public class ChannelCardView extends LinearLayout {

    private RoundedImageView channelAvatar;
    private TextView channelName, subsCount, subBtn;

    public ChannelCardView(Context context) {
        super(context);
        init(context);
    }

    public ChannelCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.channel_card, this, true);

        channelAvatar = findViewById(R.id.channel_pic);
        channelName = findViewById(R.id.channel_name);
        subsCount = findViewById(R.id.subs_count);
        subBtn = findViewById(R.id.sub_button);
    }

    public void setVideoDetails(String name, String count) {
        channelName.setText(name);
        subsCount.setText(count);
    }

    public void setChannelAvatar(int drawableResId) {
        channelAvatar.setImageResource(drawableResId);
    }
}
