package ru.mpei.l16;

import ru.mpei.l15.CommonConfiguration;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<CommonConfiguration> {
    @Override
    public void accept(CommonConfiguration commonConfiguration) {
        System.err.println(commonConfiguration);
    }
}
