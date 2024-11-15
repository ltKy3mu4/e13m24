package ru.mpei.l15;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupCfg {
    @XmlAttribute
    private String department;
    @XmlAttribute
    private String count;
}
