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
 *         &lt;element name="SerialID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element ref="{FishbowlSDK}SerialNumList"/>
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
    "serialID",
    "committed",
    "serialNumList"
})
@XmlRootElement(name = "SerialBox")
public class SerialBox {

    @XmlElement(name = "SerialID", required = true)
    protected Object serialID;
    @XmlElement(name = "Committed", required = true)
    protected Object committed;
    @XmlElement(name = "SerialNumList", required = true)
    protected SerialNumList serialNumList;

    /**
     * Gets the value of the serialID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSerialID() {
        return serialID;
    }

    /**
     * Sets the value of the serialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSerialID(Object value) {
        this.serialID = value;
    }

    /**
     * Gets the value of the committed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCommitted() {
        return committed;
    }

    /**
     * Sets the value of the committed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCommitted(Object value) {
        this.committed = value;
    }

    /**
     * Gets the value of the serialNumList property.
     * 
     * @return
     *     possible object is
     *     {@link SerialNumList }
     *     
     */
    public SerialNumList getSerialNumList() {
        return serialNumList;
    }

    /**
     * Sets the value of the serialNumList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialNumList }
     *     
     */
    public void setSerialNumList(SerialNumList value) {
        this.serialNumList = value;
    }

}