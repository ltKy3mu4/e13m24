package ru.mpei.l16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class JsonSerializationTest {

    @Test
    public void seriralizeTest1(){
        Protocol p = new Protocol("iec104", "127.0.0.1", 2404, true,
                List.of(new Signal("Ua", 220), new Signal("Ia", 10)),
                Map.of("asdu", 1110.0)
                );
        Optional<String> serialize = JsonSerialization.serialize(p);
        Assertions.assertTrue(serialize.isPresent());
        System.out.println(serialize.get());
    }

    @Test
    public void deserializeTestOk(){
        String data ="{\"type\":\"iec104\",\"ip\":\"127.0.0.1\",\"port\":2404,\"enable\":true,\"signals\":[{\"name\":\"Ua\",\"value\":220.0},{\"name\":\"Ia\",\"value\":10.0}],\"parameters\":{\"asdu\":1110.0}}\n";
        Optional<Protocol> deserialize = JsonSerialization.deserialize(data, Protocol.class);
        Assertions.assertTrue(deserialize.isPresent());
        System.out.println(deserialize.get());
    }

    @Test
    public void deserializeTestSomeExtraFieldsPresent(){
        String data ="{\"order\":1,\"type\":\"iec104\",\"ip\":\"127.0.0.1\",\"port\":2404,\"enable\":true,\"signals\":[{\"name\":\"Ua\",\"value\":220.0},{\"name\":\"Ia\",\"value\":10.0}],\"parameters\":{\"asdu\":1110.0}}\n";
        Optional<Protocol> deserialize = JsonSerialization.deserialize(data, Protocol.class);
        Assertions.assertTrue(deserialize.isPresent());
        System.out.println(deserialize.get());
    }

}