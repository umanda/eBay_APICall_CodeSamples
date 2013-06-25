//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the message portion of a listing tip that is returned by the Listing Analyzer engine.
 * 			
 * 
 * <p>Java class for ListingTipMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingTipMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingTipMessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HelpURLPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingTipMessageType", propOrder = {
    "listingTipMessageID",
    "shortMessage",
    "longMessage",
    "helpURLPath"
})
public class ListingTipMessageType {

    @XmlElement(name = "ListingTipMessageID")
    protected String listingTipMessageID;
    @XmlElement(name = "ShortMessage")
    protected String shortMessage;
    @XmlElement(name = "LongMessage")
    protected String longMessage;
    @XmlElement(name = "HelpURLPath")
    protected String helpURLPath;

    /**
     * Gets the value of the listingTipMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingTipMessageID() {
        return listingTipMessageID;
    }

    /**
     * Sets the value of the listingTipMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingTipMessageID(String value) {
        this.listingTipMessageID = value;
    }

    /**
     * Gets the value of the shortMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * Sets the value of the shortMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * Gets the value of the longMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongMessage() {
        return longMessage;
    }

    /**
     * Sets the value of the longMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongMessage(String value) {
        this.longMessage = value;
    }

    /**
     * Gets the value of the helpURLPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpURLPath() {
        return helpURLPath;
    }

    /**
     * Sets the value of the helpURLPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpURLPath(String value) {
        this.helpURLPath = value;
    }

}