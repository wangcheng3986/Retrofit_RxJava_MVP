package com.example.y.mvp.adapter;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.y.mvp.ImageDetailInfo;
import com.example.y.mvp.network.Api;
import com.example.y.mvp.utils.DiaLogUtils;
import com.example.y.mvp.utils.ImageLoaderUtils;

import java.util.List;

/**
 * by y on 2016/5/3.
 */
public class ImageDetailAdapter extends BasePagerAdapter<ImageDetailInfo> {


    public ImageDetailAdapter(List<ImageDetailInfo> datas) {
        super(datas);
    }

    @Override
    protected Object instantiate(ViewGroup container, final int position, ImageDetailInfo data) {
        final ImageView imageView = new ImageView(container.getContext());
        ImageLoaderUtils.display(container.getContext(), imageView, Api.IMAGER_URL + data.getSrc());
        container.addView(imageView);
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                DiaLogUtils.iamgeViewDialog(imageView, position);
                return true;
            }
        });
        return imageView;
    }

}
