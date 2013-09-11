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
 *         &lt;element name="PickID" type="{FishbowlSDK}DB_ID"/>
 *         &lt;element ref="{FishbowlSDK}Number"/>
 *         &lt;element name="OrderTypeNumber" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element ref="{FishbowlSDK}Priority"/>
 *         &lt;element ref="{FishbowlSDK}DateScheduled"/>
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
    "pickID",
    "number",
    "orderTypeNumber",
    "priority",
    "dateScheduled"
})
@XmlRootElement(name = "PickSearchItem")
public class PickSearchItem {

    @XmlElement(name = "PickID", required = true)
    protected BigInteger pickID;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "OrderTypeNumber")
    protected String orderTypeNumber;
    @XmlElement(name = "Priority", required = true)
    protected String priority;
    @XmlElement(name = "DateScheduled", required = true)
    protected String dateScheduled;

    /**
     * Gets the value of the pickID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPickID() {
        return pickID;
    }

    /**
     * Sets the value of the pickID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPickID(BigInteger value) {
        this.pickID = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the orderTypeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeNumber() {
        return orderTypeNumber;
    }

    /**
     * Sets the value of the orderTypeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeNumber(String value) {
        this.orderTypeNumber = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the dateScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateScheduled() {
        return dateScheduled;
    }

    /**
     * Sets the value of the dateScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateScheduled(String value) {
        this.dateScheduled = value;
    }

}
