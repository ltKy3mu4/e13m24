package ru.mpei.l16.cfg;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "cfg")
@XmlAccessorType(XmlAccessType.FIELD)
public class RootCfg {
    @XmlElementWrapper(name = "workers")
    @XmlElement(name = "worker")
    private List<Worker> workers;
}
