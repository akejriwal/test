//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.10 at 12:16:50 AM IST 
//


package com.abhi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransferOrderListRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransferOrderListRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartIndex" type="{FishbowlSDK}INTTYPE" minOccurs="0"/>
 *         &lt;element name="Count" type="{FishbowlSDK}INTTYPE" minOccurs="0"/>
 *         &lt;element name="Number" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="Type" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="Status" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="User" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="FromLocationGruop" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="ToLocationGroup" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="DateIssuedStart" type="{FishbowlSDK}DATETYPE" minOccurs="0"/>
 *         &lt;element name="DateIssuedEnd" type="{FishbowlSDK}DATETYPE" minOccurs="0"/>
 *         &lt;element name="DateScheduledStart" type="{FishbowlSDK}DATETYPE" minOccurs="0"/>
 *         &lt;element name="DateScheduledEnd" type="{FishbowlSDK}DATETYPE" minOccurs="0"/>
 *         &lt;element name="DateReceivedStart" type="{FishbowlSDK}DATETYPE" minOccurs="0"/>
 *         &lt;element name="DateReceivedEnd" type="{FishbowlSDK}DATETYPE" minOccurs="0"/>
 *         &lt;element name="ContainingPartNum" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element name="ContainingPartDescription" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *         &lt;element ref="{FishbowlSDK}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SortBy" type="{FishbowlSDK}STRTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransferOrderListRqType", propOrder = {
    "startIndex",
    "count",
    "number",
    "type",
    "status",
    "user",
    "fromLocationGruop",
    "toLocationGroup",
    "dateIssuedStart",
    "dateIssuedEnd",
    "dateScheduledStart",
    "dateScheduledEnd",
    "dateReceivedStart",
    "dateReceivedEnd",
    "containingPartNum",
    "containingPartDescription",
    "customField",
    "sortBy"
})
public class GetTransferOrderListRqType {

    @XmlElement(name = "StartIndex")
    protected BigInteger startIndex;
    @XmlElement(name = "Count")
    protected BigInteger count;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "FromLocationGruop")
    protected String fromLocationGruop;
    @XmlElement(name = "ToLocationGroup")
    protected String toLocationGroup;
    @XmlElement(name = "DateIssuedStart")
    protected String dateIssuedStart;
    @XmlElement(name = "DateIssuedEnd")
    protected String dateIssuedEnd;
    @XmlElement(name = "DateScheduledStart")
    protected String dateScheduledStart;
    @XmlElement(name = "DateScheduledEnd")
    protected String dateScheduledEnd;
    @XmlElement(name = "DateReceivedStart")
    protected String dateReceivedStart;
    @XmlElement(name = "DateReceivedEnd")
    protected String dateReceivedEnd;
    @XmlElement(name = "ContainingPartNum")
    protected String containingPartNum;
    @XmlElement(name = "ContainingPartDescription")
    protected String containingPartDescription;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;
    @XmlElement(name = "SortBy")
    protected String sortBy;

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the fromLocationGruop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromLocationGruop() {
        return fromLocationGruop;
    }

    /**
     * Sets the value of the fromLocationGruop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromLocationGruop(String value) {
        this.fromLocationGruop = value;
    }

    /**
     * Gets the value of the toLocationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToLocationGroup() {
        return toLocationGroup;
    }

    /**
     * Sets the value of the toLocationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLocationGroup(String value) {
        this.toLocationGroup = value;
    }

    /**
     * Gets the value of the dateIssuedStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateIssuedStart() {
        return dateIssuedStart;
    }

    /**
     * Sets the value of the dateIssuedStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateIssuedStart(String value) {
        this.dateIssuedStart = value;
    }

    /**
     * Gets the value of the dateIssuedEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateIssuedEnd() {
        return dateIssuedEnd;
    }

    /**
     * Sets the value of the dateIssuedEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateIssuedEnd(String value) {
        this.dateIssuedEnd = value;
    }

    /**
     * Gets the value of the dateScheduledStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateScheduledStart() {
        return dateScheduledStart;
    }

    /**
     * Sets the value of the dateScheduledStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateScheduledStart(String value) {
        this.dateScheduledStart = value;
    }

    /**
     * Gets the value of the dateScheduledEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateScheduledEnd() {
        return dateScheduledEnd;
    }

    /**
     * Sets the value of the dateScheduledEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateScheduledEnd(String value) {
        this.dateScheduledEnd = value;
    }

    /**
     * Gets the value of the dateReceivedStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReceivedStart() {
        return dateReceivedStart;
    }

    /**
     * Sets the value of the dateReceivedStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReceivedStart(String value) {
        this.dateReceivedStart = value;
    }

    /**
     * Gets the value of the dateReceivedEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReceivedEnd() {
        return dateReceivedEnd;
    }

    /**
     * Sets the value of the dateReceivedEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReceivedEnd(String value) {
        this.dateReceivedEnd = value;
    }

    /**
     * Gets the value of the containingPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainingPartNum() {
        return containingPartNum;
    }

    /**
     * Sets the value of the containingPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainingPartNum(String value) {
        this.containingPartNum = value;
    }

    /**
     * Gets the value of the containingPartDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainingPartDescription() {
        return containingPartDescription;
    }

    /**
     * Sets the value of the containingPartDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainingPartDescription(String value) {
        this.containingPartDescription = value;
    }

    /**
     * Custom field to search by.Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

}