package ca.mahram.demo.picasso.misc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 Created by mahram on 15-03-03.
 */
public class ListItemRow {
    public final TextView  title;
    public final ImageView icon;

    public ListItemRow (final View view) {
        title = (TextView) view.findViewById (android.R.id.text1);
        icon = (ImageView) view.findViewById (android.R.id.icon);
    }
}
