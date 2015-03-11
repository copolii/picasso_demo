package ca.mahram.demo.picasso.misc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 Created by mahram on 15-03-03.
 */
public class ListItemRow {
    @InjectView (android.R.id.text1) public TextView  title;
    @InjectView (android.R.id.icon) public ImageView icon;

    public ListItemRow (final View view) {
        ButterKnife.inject (this, view);
    }
}
