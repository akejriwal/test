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
 *         &lt;element name="ProductNumber" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="QtyShipped" type="{FishbowlSDK}QUANTYPE" minOccurs="0"/>
 *         &lt;element ref="{FishbowlSDK}UOM" minOccurs="0"/>
 *         &lt;element name="Cost" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="SKU" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="UPC" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="OrderItemID" type="{FishbowlSDK}INTTYPE" minOccurs="0"/>
 *         &lt;element name="CartonName" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="TagNum" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="Weight" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element ref="{FishbowlSDK}WeightUOM" minOccurs="0"/>
 *         &lt;element name="DisplayWeightUOM" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "productNumber",
    "qtyShipped",
    "uom",
    "cost",
    "sku",
    "upc",
    "orderItemID",
    "cartonName",
    "tagNum",
    "weight",
    "weightUOM",
    "displayWeightUOM",
    "tracking"
})
@XmlRootElement(name = "ShippingItem")
public class ShippingItem {

    @XmlElement(name = "ProductNumber")
    protected String productNumber;
    @XmlElement(name = "QtyShipped")
    protected String qtyShipped;
    @XmlElement(name = "UOM")
    protected UOM uom;
    @XmlElement(name = "Cost")
    protected String cost;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "OrderItemID")
    protected BigInteger orderItemID;
    @XmlElement(name = "CartonName")
    protected String cartonName;
    @XmlElement(name = "TagNum")
    protected String tagNum;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "WeightUOM")
    protected WeightUOM weightUOM;
    @XmlElement(name = "DisplayWeightUOM")
    protected Object displayWeightUOM;
    @XmlElement(name = "Tracking")
    protected Tracking tracking;

    /**
     * Gets the value of the productNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * Sets the value of the productNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNumber(String value) {
        this.productNumber = value;
    }

    /**
     * Gets the value of the qtyShipped property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyShipped() {
        return qtyShipped;
    }

    /**
     * Sets the value of the qtyShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyShipped(String value) {
        this.qtyShipped = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link UOM }
     *     
     */
    public UOM getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOM }
     *     
     */
    public void setUOM(UOM value) {
        this.uom = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the orderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderItemID(BigInteger value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the cartonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartonName() {
        return cartonName;
    }

    /**
     * Sets the value of the cartonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartonName(String value) {
        this.cartonName = value;
    }

    /**
     * Gets the value of the tagNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagNum() {
        return tagNum;
    }

    /**
     * Sets the value of the tagNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagNum(String value) {
        this.tagNum = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUOM property.
     * 
     * @return
     *     possible object is
     *     {@link WeightUOM }
     *     
     */
    public WeightUOM getWeightUOM() {
        return weightUOM;
    }

    /**
     * Sets the value of the weightUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUOM }
     *     
     */
    public void setWeightUOM(WeightUOM value) {
        this.weightUOM = value;
    }

    /**
     * Gets the value of the displayWeightUOM property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayWeightUOM() {
        return displayWeightUOM;
    }

    /**
     * Sets the value of the displayWeightUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayWeightUOM(Object value) {
        this.displayWeightUOM = value;
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