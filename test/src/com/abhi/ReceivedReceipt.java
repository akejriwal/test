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
 *         &lt;element name="ItemType" type="{FishbowlSDK}INTTYPE"/>
 *         &lt;element name="Quantity" type="{FishbowlSDK}STRTYPE"/>
 *         &lt;element name="Responsible" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="Reason" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="TagNum" type="{FishbowlSDK}INTTYPE" minOccurs="0"/>
 *         &lt;element ref="{FishbowlSDK}Tracking" minOccurs="0"/>
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
    "itemType",
    "quantity",
    "responsible",
    "reason",
    "tagNum",
    "tracking"
})
@XmlRootElement(name = "ReceivedReceipt")
public class ReceivedReceipt {

    @XmlElement(name = "ItemType", required = true)
    protected BigInteger itemType;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "Responsible")
    protected String responsible;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "TagNum")
    protected BigInteger tagNum;
    @XmlElement(name = "Tracking")
    protected Tracking tracking;

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemType(BigInteger value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsible(String value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the tagNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTagNum() {
        return tagNum;
    }

    /**
     * Sets the value of the tagNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTagNum(BigInteger value) {
        this.tagNum = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link Tracking }
     *     
     */
    public Tracking getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking }
     *     
     */
    public void setTracking(Tracking value) {
        this.tracking = value;
    }

}