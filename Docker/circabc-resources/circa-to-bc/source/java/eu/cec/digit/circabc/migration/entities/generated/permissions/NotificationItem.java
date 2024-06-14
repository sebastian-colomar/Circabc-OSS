//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.17 at 12:50:48 PM GMT 
//


package eu.cec.digit.circabc.migration.entities.generated.permissions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.cec.digit.circabc.migration.entities.XMLElement;


/**
 * <p>Java class for notificationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}notificationStatus"/>
 *         &lt;choice>
 *           &lt;element name="user" type="{https://circabc.europa.eu/Import/UsersSchema/1.0}userId"/>
 *           &lt;element ref="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}profile"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationItem", propOrder = {
    "status",
    "profile",
    "user"
})
public class NotificationItem
    extends XMLElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, defaultValue = "Default")
    protected NotificationStatus status;
    protected String profile;
    protected String user;

    /**
     * Default no-arg constructor
     * 
     */
    public NotificationItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NotificationItem(final NotificationStatus status, final String profile, final String user) {
        super();
        this.status = status;
        this.profile = profile;
        this.user = user;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus }
     *     
     */
    public NotificationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus }
     *     
     */
    public void setStatus(NotificationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
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

    public NotificationItem withStatus(NotificationStatus value) {
        setStatus(value);
        return this;
    }

    public NotificationItem withProfile(String value) {
        setProfile(value);
        return this;
    }

    public NotificationItem withUser(String value) {
        setUser(value);
        return this;
    }

}