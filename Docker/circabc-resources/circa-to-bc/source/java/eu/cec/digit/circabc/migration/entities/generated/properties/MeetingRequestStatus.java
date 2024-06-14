//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.17 at 12:50:48 PM GMT 
//


package eu.cec.digit.circabc.migration.entities.generated.properties;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.cec.digit.circabc.migration.entities.XMLElement;
import eu.cec.digit.circabc.migration.entities.adapter.DateAdapter;


/**
 * <p>Java class for meetingRequestStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingRequestStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invitedUser" type="{https://circabc.europa.eu/Import/UsersSchema/1.0}userId"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingRequestStatus", propOrder = {
    "invitedUser",
    "date",
    "accepted"
})
public class MeetingRequestStatus
    extends XMLElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String invitedUser;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date date;
    protected boolean accepted;

    /**
     * Default no-arg constructor
     * 
     */
    public MeetingRequestStatus() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeetingRequestStatus(final String invitedUser, final Date date, final boolean accepted) {
        super();
        this.invitedUser = invitedUser;
        this.date = date;
        this.accepted = accepted;
    }

    /**
     * Gets the value of the invitedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitedUser() {
        return invitedUser;
    }

    /**
     * Sets the value of the invitedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitedUser(String value) {
        this.invitedUser = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

    public MeetingRequestStatus withInvitedUser(String value) {
        setInvitedUser(value);
        return this;
    }

    public MeetingRequestStatus withDate(Date value) {
        setDate(value);
        return this;
    }

    public MeetingRequestStatus withAccepted(boolean value) {
        setAccepted(value);
        return this;
    }

}