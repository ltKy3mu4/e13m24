package ru.mpei.l15;

import lombok.Data;
import ru.mpei.l5.ifaces.EnemySharkNpc;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "cfg")
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonConfiguration {
    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    private List<StudentCfg> students;
}
