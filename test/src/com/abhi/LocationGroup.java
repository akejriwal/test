//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.10 at 12:16:50 AM IST 
//


package com.abhi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{FishbowlSDK}LocationGroupID" minOccurs="0"/>
 *         &lt;element name="LocationGroupName" type="{FishbowlSDK}STRTYPE"/>
 *         &lt;element name="UsersDefaultLG" type="{FishbowlSDK}BOOLTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locationGroupID",
    "locationGroupName",
    "usersDefaultLG"
})
@XmlRootElement(name = "LocationGroup")
public class LocationGroup {

    @XmlElement(name = "LocationGroupID")
    protected BigInteger locationGroupID;
    @XmlElement(name = "LocationGroupName", required = true)
    protected String locationGroupName;
    @XmlElement(name = "UsersDefaultLG")
    protected Boolean usersDefaultLG;

    /**
     * Gets the value of the locationGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationGroupID() {
        return locationGroupID;
    }

    /**
     * Sets the value of the locationGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationGroupID(BigInteger value) {
        this.locationGroupID = value;
    }

    /**
     * Gets the value of the locationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationGroupName() {
        return locationGroupName;
    }

    /**
     * Sets the value of the locationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationGroupName(String value) {
        this.locationGroupName = value;
    }

    /**
     * Gets the value of the usersDefaultLG property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsersDefaultLG() {
        return usersDefaultLG;
    }

    /**
     * Sets the value of the usersDefaultLG property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsersDefaultLG(Boolean value) {
        this.usersDefaultLG = value;
    }

}
