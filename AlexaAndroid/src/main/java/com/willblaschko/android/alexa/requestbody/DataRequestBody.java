package com.willblaschko.android.alexa.requestbody;

import android.media.AudioFormat;
import android.media.AudioRecord;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Pipe;

/**
 * An implemented class that automatically fills in the required MediaType for the {@link RequestBody} that is sent
 * in the {@link com.willblaschko.android.alexa.interfaces.SendEvent} class.
 *
 * @author will on 5/28/2016.
 */
public class DataRequestBody extends RequestBody {

    private final Pipe pipe = new Pipe(AudioRecord.getMinBufferSize(16000, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT) * 4);
    private final BufferedSink sink = Okio.buffer(pipe.sink());

    public BufferedSink sink() {
        return sink;
    }

    @Override
    public MediaType contentType() {
        return MediaType.parse("application/octet-stream");
    }

    @Override public void writeTo(BufferedSink sink) throws IOException {
        sink.writeAll(pipe.source());
    }
}
