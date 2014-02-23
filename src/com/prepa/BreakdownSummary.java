
package com.prepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakdownSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BreakdownSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="r1TownOrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="r2TotalBreakdowns" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownSummary", namespace = "http://persistence.breakdown.prepa.com/xsd", propOrder = {
    "r1TownOrCity",
    "r2TotalBreakdowns"
})
public class BreakdownSummary {

    @XmlElement(nillable = true)
    protected String r1TownOrCity;
    protected Integer r2TotalBreakdowns;

    /**
     * Gets the value of the r1TownOrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR1TownOrCity() {
        return r1TownOrCity;
    }

    /**
     * Sets the value of the r1TownOrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR1TownOrCity(String value) {
        this.r1TownOrCity = value;
    }

    /**
     * Gets the value of the r2TotalBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getR2TotalBreakdowns() {
        return r2TotalBreakdowns;
    }

    /**
     * Sets the value of the r2TotalBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setR2TotalBreakdowns(Integer value) {
        this.r2TotalBreakdowns = value;
    }

}
