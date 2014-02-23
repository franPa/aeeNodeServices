
package com.prepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakdownArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BreakdownArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="r2Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="r3Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="r1TownOrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="r4LastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownArea", namespace = "http://persistence.breakdown.prepa.com/xsd", propOrder = {
    "r2Area",
    "r3Status",
    "r1TownOrCity",
    "r4LastUpdate"
})
public class BreakdownArea {

    @XmlElement(nillable = true)
    protected String r2Area;
    @XmlElement(nillable = true)
    protected String r3Status;
    @XmlElement(nillable = true)
    protected String r1TownOrCity;
    @XmlElement(nillable = true)
    protected String r4LastUpdate;

    /**
     * Gets the value of the r2Area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR2Area() {
        return r2Area;
    }

    /**
     * Sets the value of the r2Area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR2Area(String value) {
        this.r2Area = value;
    }

    /**
     * Gets the value of the r3Status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR3Status() {
        return r3Status;
    }

    /**
     * Sets the value of the r3Status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR3Status(String value) {
        this.r3Status = value;
    }

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
     * Gets the value of the r4LastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR4LastUpdate() {
        return r4LastUpdate;
    }

    /**
     * Sets the value of the r4LastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR4LastUpdate(String value) {
        this.r4LastUpdate = value;
    }

}
