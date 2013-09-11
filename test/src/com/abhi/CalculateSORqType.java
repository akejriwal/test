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
 * Calculates the totals and tax on the specified Sales Order.  This will not save the Sales Order.
 * 
 * <p>Java class for CalculateSORqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateSORqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{FishbowlSDK}SalesOrder"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateSORqType", propOrder = {
    "salesOrder"
})
public class CalculateSORqType {

    @XmlElement(name = "SalesOrder", required = true)
    protected SalesOrder salesOrder;

    /**
     * The sales order to calculate.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrder }
     *     
     */
    public SalesOrder getSalesOrder() {
        return salesOrder;
    }

    /**
     * Sets the value of the salesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrder }
     *     
     */
    public void setSalesOrder(SalesOrder value) {
        this.salesOrder = value;
    }

}
