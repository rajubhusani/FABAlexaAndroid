package com.orbitahealth.voice.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.Toast;

import com.orbitahealth.voice.R;
import com.squareup.picasso.Picasso;

public class Utilities {

    public static void startInstalledAppDetailsActivity(final Context context) {
        if (context == null) {
            return;
        }
        final Intent i = new Intent();
        i.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        i.addCategory(Intent.CATEGORY_DEFAULT);
        i.setData(Uri.parse("package:" + context.getPackageName()));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        i.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        context.startActivity(i);
    }

    public static void loadImageAndCenterCrop(Context context, ImageView imageView, String url, int errorResourceId) {
        if (context != null && imageView != null) {
            try {
                if (URLUtil.isHttpUrl(url) || URLUtil.isHttpsUrl(url)) {
                    Picasso.with(context).load(url).error(errorResourceId).fit().centerCrop().into(imageView);
                } else {
                    Picasso.with(context).load(errorResourceId).into(imageView);
                }
            } catch (IllegalArgumentException e) {
                showToast(context, context.getString(R.string.error_no_image), Toast.LENGTH_SHORT);
            }
        }
    }

    public static void showToast(Context context, String message, int duration) {
        if (context != null && !TextUtils.isEmpty(message)) {
            if (duration == -1) {
                duration = Toast.LENGTH_SHORT;
            }
            Toast.makeText(context, message, duration).show();
        }
    }


}
