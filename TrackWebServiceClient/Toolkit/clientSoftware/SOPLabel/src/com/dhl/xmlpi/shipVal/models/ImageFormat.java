//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 02:35:05 PM IST 
//


package com.dhl.xmlpi.shipVal.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="5"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="TIFF"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="JPEG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageFormat")
@XmlEnum
public enum ImageFormat {

    PDF,
    PNG,
    TIFF,
    GIF,
    JPEG;

    public String value() {
        return name();
    }

    public static ImageFormat fromValue(String v) {
        return valueOf(v);
    }

}
