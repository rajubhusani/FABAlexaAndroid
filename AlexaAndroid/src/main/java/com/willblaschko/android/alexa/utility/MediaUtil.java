/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.willblaschko.android.alexa.utility;

import android.content.Context;


public abstract class MediaUtil {

    private static MediaUtil mInstance;

    public static interface OnCompletionListener {
        public void onCompletion();
    }

    public static MediaUtil get() {
        if(mInstance == null){
            mInstance = new MediaUtilImpl();
        }
        return mInstance;
    }

    /**
     * Play sound from local resources given a resource id.
     */
    public abstract void playSound(final Context context, final int resId,
            final OnCompletionListener completionListener);

    public static boolean canAutoAccessIncomingMedia() {
        // Check is at least M
        return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M;
    }
}
