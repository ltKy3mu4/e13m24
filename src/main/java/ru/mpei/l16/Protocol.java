package ru.mpei.l16;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Protocol {
    private String type;
    private String ip;
    private int port;
    private boolean enable;
    private List<Signal> signals;
    @JsonIgnore
    private Map<String, Double> parameters;
}
