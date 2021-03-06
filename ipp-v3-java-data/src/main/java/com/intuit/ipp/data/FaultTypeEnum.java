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
 * <p>Java class for FaultTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AuthenticationFault"/>
 *     &lt;enumeration value="AuthorizatonFault"/>
 *     &lt;enumeration value="ValidationFault"/>
 *     &lt;enumeration value="SystemFault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultTypeEnum")
@XmlEnum
public enum FaultTypeEnum {

    @XmlEnumValue("AuthenticationFault")
    AUTHENTICATION_FAULT("AuthenticationFault"),
    @XmlEnumValue("AuthorizatonFault")
    AUTHORIZATON_FAULT("AuthorizatonFault"),
    @XmlEnumValue("ValidationFault")
    VALIDATION_FAULT("ValidationFault"),
    @XmlEnumValue("SystemFault")
    SYSTEM_FAULT("SystemFault");
    private final String value;

    FaultTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultTypeEnum fromValue(String v) {
        for (FaultTypeEnum c: FaultTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
