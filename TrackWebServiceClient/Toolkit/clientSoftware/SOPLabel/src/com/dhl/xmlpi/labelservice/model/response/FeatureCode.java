//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 10:21:23 AM IST 
//


package com.dhl.xmlpi.labelservice.model.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="3"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="EXW"/>
 *     &lt;enumeration value="EPU"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="DG"/>
 *     &lt;enumeration value="SX"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="DTP"/>
 *     &lt;enumeration value="DVU"/>
 *     &lt;enumeration value="NDS"/>
 *     &lt;enumeration value="RPA"/>
 *     &lt;enumeration value="IMP"/>
 *     &lt;enumeration value="RET"/>
 *     &lt;enumeration value="NSR"/>
 *     &lt;enumeration value="NPA"/>
 *     &lt;enumeration value="SIG"/>
 *     &lt;enumeration value="PLC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeatureCode")
@XmlEnum
public enum FeatureCode {

    C,
    COD,
    EXW,
    EPU,
    BB,
    DG,
    SX,
    MT,
    DTP,
    DVU,
    NDS,
    RPA,
    IMP,
    RET,
    NSR,
    NPA,
    SIG,
    PLC;

    public String value() {
        return name();
    }

    public static FeatureCode fromValue(String v) {
        return valueOf(v);
    }

}
