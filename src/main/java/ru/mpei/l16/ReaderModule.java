package ru.mpei.l16;

import ru.mpei.l15.CommonConfiguration;
import ru.mpei.l15.XmlSerialization;

import java.util.Optional;
import java.util.function.Consumer;

public class ReaderModule {

    private Consumer<CommonConfiguration> consumer;

    public void start(){
        Optional<CommonConfiguration> res = XmlSerialization.deserialize("src/main/resources/students.xml", CommonConfiguration.class);
        if (res.isPresent()){
            consumer.accept(res.get());
        } else {
            System.err.println("cannot read cfg");
        }
    }

    public void setConsumer(Consumer<CommonConfiguration> consumer) {
        this.consumer = consumer;
    }
}
