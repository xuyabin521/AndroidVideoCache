package com.danikula.videocache.sample;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_multiple_videos)
public class SharedCacheActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        if (state == null) {
            addVideoFragment(R.id.videoContainer0);
            addVideoFragment(R.id.videoContainer1);
            addVideoFragment(R.id.videoContainer2);
            addVideoFragment(R.id.videoContainer3);
        }
    }

    private void addVideoFragment(int containerViewId) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(containerViewId, VideoFragment.build(Video.ORANGE_1.url))
                .commit();
    }
}
