package cn.ghx.tianditu.common;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import lombok.NoArgsConstructor;

import java.io.IOException;

/**
 * 适配天地图返回的Integer适配器
 */
@NoArgsConstructor
public class IntegerAdapter extends TypeAdapter<Integer> {
    @Override
    public void write(JsonWriter writer, Integer value) throws IOException {
        if (value == null) {
            writer.nullValue();
            return;
        }
        writer.value(value);
    }

    @Override
    public Integer read(JsonReader reader) throws IOException {
        if (reader.peek() == JsonToken.NULL) {
            reader.nextNull();
            return null;
        }
        String stringValue = reader.nextString();
        try {
            return Integer.valueOf(stringValue);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
