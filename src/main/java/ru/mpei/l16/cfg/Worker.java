package ru.mpei.l16.cfg;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Worker {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String surname;
    @XmlAttribute
    private int age;
    @XmlAttribute
    private String sex;
    @XmlAttribute
    private String department;
    @XmlAttribute
    private double salary;
}
