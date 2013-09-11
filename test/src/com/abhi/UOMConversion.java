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
 *         &lt;element name="MainUOMID" type="{FishbowlSDK}INTTYPE"/>
 *         &lt;element name="ToUOMID" type="{FishbowlSDK}INTTYPE"/>
 *         &lt;element name="ToUOMCode" type="{FishbowlSDK}STRTYPE"/>
 *         &lt;element name="ConversionMultiply" type="{FishbowlSDK}FLOATTYPE"/>
 *         &lt;element name="ConversionFactor" type="{FishbowlSDK}FLOATTYPE"/>
 *         &lt;element name="ToUOMIsIntegral" type="{FishbowlSDK}BOOLTYPE"/>
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
    "mainUOMID",
    "toUOMID",
    "toUOMCode",
    "conversionMultiply",
    "conversionFactor",
    "toUOMIsIntegral"
})
@XmlRootElement(name = "UOMConversion")
public class UOMConversion {

    @XmlElement(name = "MainUOMID", required = true)
    protected BigInteger mainUOMID;
    @XmlElement(name = "ToUOMID", required = true)
    protected BigInteger toUOMID;
    @XmlElement(name = "ToUOMCode", required = true)
    protected String toUOMCode;
    @XmlElement(name = "ConversionMultiply", required = true)
    protected String conversionMultiply;
    @XmlElement(name = "ConversionFactor", required = true)
    protected String conversionFactor;
    @XmlElement(name = "ToUOMIsIntegral")
    protected boolean toUOMIsIntegral;

    /**
     * Gets the value of the mainUOMID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMainUOMID() {
        return mainUOMID;
    }

    /**
     * Sets the value of the mainUOMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMainUOMID(BigInteger value) {
        this.mainUOMID = value;
    }

    /**
     * Gets the value of the toUOMID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToUOMID() {
        return toUOMID;
    }

    /**
     * Sets the value of the toUOMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToUOMID(BigInteger value) {
        this.toUOMID = value;
    }

    /**
     * Gets the value of the toUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToUOMCode() {
        return toUOMCode;
    }

    /**
     * Sets the value of the toUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToUOMCode(String value) {
        this.toUOMCode = value;
    }

    /**
     * Gets the value of the conversionMultiply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionMultiply() {
        return conversionMultiply;
    }

    /**
     * Sets the value of the conversionMultiply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionMultiply(String value) {
        this.conversionMultiply = value;
    }

    /**
     * Gets the value of the conversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Sets the value of the conversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionFactor(String value) {
        this.conversionFactor = value;
    }

    /**
     * Gets the value of the toUOMIsIntegral property.
     * 
     */
    public boolean isToUOMIsIntegral() {
        return toUOMIsIntegral;
    }

    /**
     * Sets the value of the toUOMIsIntegral property.
     * 
     */
    public void setToUOMIsIntegral(boolean value) {
        this.toUOMIsIntegral = value;
    }

}
