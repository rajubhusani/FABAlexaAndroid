package app.orbitahealth.sdk;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

public class EmptyCheckTypeAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
        // We filter out the EmptyCheckTypeAdapter as we need to check this for emptiness!
        if (Object.class.isAssignableFrom(type.getRawType())) {
            final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            return new EmptyCheckTypeAdapter<>(delegate, elementAdapter).nullSafe();
        }
        return null;
    }
}
