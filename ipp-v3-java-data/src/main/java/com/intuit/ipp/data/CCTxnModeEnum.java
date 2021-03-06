//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.23 at 05:01:01 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCTxnModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCTxnModeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CardNotPresent"/>
 *     &lt;enumeration value="CardPresent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CCTxnModeEnum")
@XmlEnum
public enum CCTxnModeEnum {

    @XmlEnumValue("CardNotPresent")
    CARD_NOT_PRESENT("CardNotPresent"),
    @XmlEnumValue("CardPresent")
    CARD_PRESENT("CardPresent");
    private final String value;

    CCTxnModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCTxnModeEnum fromValue(String v) {
        for (CCTxnModeEnum c: CCTxnModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
