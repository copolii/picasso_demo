package ca.mahram.demo.picasso.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import ca.mahram.demo.picasso.activity.base.BaseDemoActivity;

/**
 Demos Picasso transformations
 Created by mahram on 15-03-02.
 */
public class ContactActivity extends BaseDemoActivity {
    @Override protected void onCreate (final Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);

        final Intent intent = getIntent ();

        Log.d ("CONTACT", String.valueOf (intent.getData ()));
    }
}
