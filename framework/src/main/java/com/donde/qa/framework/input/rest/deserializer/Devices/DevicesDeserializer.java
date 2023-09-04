package com.donde.qa.framework.input.rest.deserializer.Devices;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

import com.donde.qa.domain.entity.Devices;

public class DevicesDeserializer extends StdDeserializer<Devices> {

    public DevicesDeserializer(){this(null);}

    public DevicesDeserializer(Class<?> vc){
        super(vc);
    }

    @Override
    public Devices deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        return null;
    }
    
}
