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
 *         &lt;element name="RMAItemID" type="{FishbowlSDK}DB_ID"/>
 *         &lt;element name="LineNum" type="{FishbowlSDK}INTTYPE"/>
 *         &lt;element name="ProductNum" type="{FishbowlSDK}STRTYPE"/>
 *         &lt;element name="ProductID" type="{FishbowlSDK}DB_ID" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{FishbowlSDK}QUANTYPE"/>
 *         &lt;element ref="{FishbowlSDK}UOM"/>
 *         &lt;element ref="{FishbowlSDK}Tracking" minOccurs="0"/>
 *         &lt;element name="Issue" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="RMAType" type="{FishbowlSDK}STRTYPE"/>
 *         &lt;element name="Resolution" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="ProductSubstitution" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="ProductSubstitutionID" type="{FishbowlSDK}DB_ID" minOccurs="0"/>
 *         &lt;element name="CrossShippedFlag" type="{FishbowlSDK}BOOLTYPE" minOccurs="0"/>
 *         &lt;element name="ShippedFlag" type="{FishbowlSDK}BOOLTYPE" minOccurs="0"/>
 *         &lt;element name="ReturnedFlag" type="{FishbowlSDK}BOOLTYPE" minOccurs="0"/>
 *         &lt;element name="VendorName" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="VendorRMA" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="DateResolved" type="{FishbowlSDK}DATETIMETYPE" minOccurs="0"/>
 *         &lt;element name="Note" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element ref="{FishbowlSDK}LinkedOrders" minOccurs="0"/>
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
    "rmaItemID",
    "lineNum",
    "productNum",
    "productID",
    "quantity",
    "uom",
    "tracking",
    "issue",
    "rmaType",
    "resolution",
    "productSubstitution",
    "productSubstitutionID",
    "crossShippedFlag",
    "shippedFlag",
    "returnedFlag",
    "vendorName",
    "vendorRMA",
    "dateResolved",
    "note",
    "linkedOrders"
})
@XmlRootElement(name = "RMAItem")
public class RMAItem {

    @XmlElement(name = "RMAItemID", required = true)
    protected BigInteger rmaItemID;
    @XmlElement(name = "LineNum", required = true)
    protected BigInteger lineNum;
    @XmlElement(name = "ProductNum", required = true)
    protected String productNum;
    @XmlElement(name = "ProductID")
    protected BigInteger productID;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "UOM", required = true)
    protected UOM uom;
    @XmlElement(name = "Tracking")
    protected Tracking tracking;
    @XmlElement(name = "Issue")
    protected String issue;
    @XmlElement(name = "RMAType", required = true)
    protected String rmaType;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "ProductSubstitution")
    protected String productSubstitution;
    @XmlElement(name = "ProductSubstitutionID")
    protected BigInteger productSubstitutionID;
    @XmlElement(name = "CrossShippedFlag")
    protected Boolean crossShippedFlag;
    @XmlElement(name = "ShippedFlag")
    protected Boolean shippedFlag;
    @XmlElement(name = "ReturnedFlag")
    protected Boolean returnedFlag;
    @XmlElement(name = "VendorName")
    protected String vendorName;
    @XmlElement(name = "VendorRMA")
    protected String vendorRMA;
    @XmlElement(name = "DateResolved")
    protected String dateResolved;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "LinkedOrders")
    protected LinkedOrders linkedOrders;

    /**
     * Gets the value of the rmaItemID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRMAItemID() {
        return rmaItemID;
    }

    /**
     * Sets the value of the rmaItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRMAItemID(BigInteger value) {
        this.rmaItemID = value;
    }

    /**
     * Gets the value of the lineNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNum(BigInteger value) {
        this.lineNum = value;
    }

    /**
     * Gets the value of the productNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * Sets the value of the productNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNum(String value) {
        this.productNum = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductID(BigInteger value) {
        this.productID = value;
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

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the rmaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMAType() {
        return rmaType;
    }

    /**
     * Sets the value of the rmaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMAType(String value) {
        this.rmaType = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the productSubstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubstitution() {
        return productSubstitution;
    }

    /**
     * Sets the value of the productSubstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubstitution(String value) {
        this.productSubstitution = value;
    }

    /**
     * Gets the value of the productSubstitutionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductSubstitutionID() {
        return productSubstitutionID;
    }

    /**
     * Sets the value of the productSubstitutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductSubstitutionID(BigInteger value) {
        this.productSubstitutionID = value;
    }

    /**
     * Gets the value of the crossShippedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossShippedFlag() {
        return crossShippedFlag;
    }

    /**
     * Sets the value of the crossShippedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossShippedFlag(Boolean value) {
        this.crossShippedFlag = value;
    }

    /**
     * Gets the value of the shippedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippedFlag() {
        return shippedFlag;
    }

    /**
     * Sets the value of the shippedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippedFlag(Boolean value) {
        this.shippedFlag = value;
    }

    /**
     * Gets the value of the returnedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnedFlag() {
        return returnedFlag;
    }

    /**
     * Sets the value of the returnedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnedFlag(Boolean value) {
        this.returnedFlag = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorRMA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorRMA() {
        return vendorRMA;
    }

    /**
     * Sets the value of the vendorRMA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorRMA(String value) {
        this.vendorRMA = value;
    }

    /**
     * Gets the value of the dateResolved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateResolved() {
        return dateResolved;
    }

    /**
     * Sets the value of the dateResolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateResolved(String value) {
        this.dateResolved = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the linkedOrders property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedOrders }
     *     
     */
    public LinkedOrders getLinkedOrders() {
        return linkedOrders;
    }

    /**
     * Sets the value of the linkedOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedOrders }
     *     
     */
    public void setLinkedOrders(LinkedOrders value) {
        this.linkedOrders = value;
    }

}
