package ca.mahram.demo.picasso.misc;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 Created by mahram on 15-03-04.
 */
@EqualsAndHashCode @ToString
public class Contact {
    public final String name;
    public final long   id;
    private      Uri    uri;

    private Contact (final Cursor cursor, final int idxRow, final int idxName) {
        name = cursor.getString (idxName);
        id = cursor.getLong (idxRow);
    }

    public Uri getUri () {
        if (null == uri) {
            uri = ContentUris.withAppendedId (ContactsContract.Contacts.CONTENT_URI, id);
        }

        return uri;
    }

    static Contact[] extractAll (final Cursor cursor) {
        final int idxRow = cursor.getColumnIndexOrThrow (ContactsContract.Contacts._ID);
        final int idxName = cursor.getColumnIndexOrThrow (ContactsContract.Contacts.DISPLAY_NAME);

        if (!cursor.moveToFirst ()) {
            return new Contact[0];
        }

        final Contact[] all = new Contact[cursor.getCount ()];

        do {
            all[cursor.getPosition ()] = new Contact (cursor, idxRow, idxName);
        } while (cursor.moveToNext ());

        return all;
    }
}
