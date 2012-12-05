package ru.onec.megaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MegaObject", propOrder = {
    "value"
})
public class MegaObject {
    @XmlElement(required = true, nillable = true)
    protected String value="It's working !!!!!";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
