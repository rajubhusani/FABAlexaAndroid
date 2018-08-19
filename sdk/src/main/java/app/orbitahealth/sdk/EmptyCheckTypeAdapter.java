package app.orbitahealth.sdk;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public  class EmptyCheckTypeAdapter<T> extends TypeAdapter<T> {

    private final TypeAdapter<T> delegate;
    private final TypeAdapter<JsonElement> elementAdapter;

    public EmptyCheckTypeAdapter(final TypeAdapter<T> delegate,
                                 final TypeAdapter<JsonElement> elementAdapter) {
        this.delegate = delegate;
        this.elementAdapter = elementAdapter;
    }

    @Override public void write(final JsonWriter out, final T value) throws IOException {
        this.delegate.write(out, value);
    }

    @Override public T read(final JsonReader in) throws IOException {
        final JsonObject asJsonObject = elementAdapter.read(in).getAsJsonObject();
        if (asJsonObject.entrySet().isEmpty()) return null;
        return this.delegate.fromJsonTree(asJsonObject);
    }
}

