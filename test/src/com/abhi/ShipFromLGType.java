//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.10 at 12:16:50 AM IST 
//


package com.abhi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipFromLGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipFromLGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{FishbowlSDK}LocationGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipFromLGType", propOrder = {
    "locationGroup"
})
public class ShipFromLGType {

    @XmlElement(name = "LocationGroup")
    protected LocationGroup locationGroup;

    /**
     * Gets the value of the locationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link LocationGroup }
     *     
     */
    public LocationGroup getLocationGroup() {
        return locationGroup;
    }

    /**
     * Sets the value of the locationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationGroup }
     *     
     */
    public void setLocationGroup(LocationGroup value) {
        this.locationGroup = value;
    }

}
