//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.17 at 12:50:48 PM GMT 
//


package eu.cec.digit.circabc.migration.entities.generated.nodes;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.alfresco.service.cmr.repository.NodeRef;

import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatorProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.DescriptionProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifiedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifierProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.NameProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.OwnerProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.TitleProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.VersionLabelProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.VersionNoteProperty;
import eu.cec.digit.circabc.migration.entities.adapter.VersionNotePropertyAdapter;
import eu.cec.digit.circabc.migration.entities.generated.properties.ExtendedProperty;
import eu.cec.digit.circabc.migration.entities.generated.properties.I18NProperty;


/**
 * <p>Java class for informationContentVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informationContentVersion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://circabc.europa.eu/Import/NodesSchema/1.0}contentNode">
 *       &lt;sequence>
 *         &lt;element ref="{https://circabc.europa.eu/Import/PropertiesSchema/1.0}versionNote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informationContentVersion", propOrder = {
    "versionNote"
})
public class InformationContentVersion
    extends ContentNode
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(VersionNotePropertyAdapter.class)
    protected VersionNoteProperty versionNote;

    /**
     * Default no-arg constructor
     * 
     */
    public InformationContentVersion() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InformationContentVersion(final NodeRef nodeReference, final List<ExtendedProperty> extendedProperties, final CreatedProperty created, final CreatorProperty creator, final ModifiedProperty modified, final ModifierProperty modifier, final List<I18NProperty> i18NTitles, final TitleProperty title, final List<I18NProperty> i18NDescriptions, final DescriptionProperty description, final OwnerProperty owner, final NameProperty name, final String contentString, final VersionLabelProperty versionLabel, final String uri, final VersionNoteProperty versionNote) {
        super(nodeReference, extendedProperties, created, creator, modified, modifier, i18NTitles, title, i18NDescriptions, description, owner, name, contentString, versionLabel, uri);
        this.versionNote = versionNote;
    }

    /**
     * Gets the value of the versionNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public VersionNoteProperty getVersionNote() {
        return versionNote;
    }

    /**
     * Sets the value of the versionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNote(VersionNoteProperty value) {
        this.versionNote = value;
    }

    public InformationContentVersion withVersionNote(VersionNoteProperty value) {
        setVersionNote(value);
        return this;
    }

    @Override
    public InformationContentVersion withContentString(String value) {
        setContentString(value);
        return this;
    }

    @Override
    public InformationContentVersion withVersionLabel(VersionLabelProperty value) {
        setVersionLabel(value);
        return this;
    }

    @Override
    public InformationContentVersion withUri(String value) {
        setUri(value);
        return this;
    }

    @Override
    public InformationContentVersion withName(NameProperty value) {
        setName(value);
        return this;
    }

    @Override
    public InformationContentVersion withI18NTitles(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NTitles().add(value);
            }
        }
        return this;
    }

    @Override
    public InformationContentVersion withI18NTitles(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NTitles().addAll(values);
        }
        return this;
    }

    @Override
    public InformationContentVersion withTitle(TitleProperty value) {
        setTitle(value);
        return this;
    }

    @Override
    public InformationContentVersion withI18NDescriptions(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NDescriptions().add(value);
            }
        }
        return this;
    }

    @Override
    public InformationContentVersion withI18NDescriptions(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NDescriptions().addAll(values);
        }
        return this;
    }

    @Override
    public InformationContentVersion withDescription(DescriptionProperty value) {
        setDescription(value);
        return this;
    }

    @Override
    public InformationContentVersion withOwner(OwnerProperty value) {
        setOwner(value);
        return this;
    }

    @Override
    public InformationContentVersion withNodeReference(NodeRef value) {
        setNodeReference(value);
        return this;
    }

    @Override
    public InformationContentVersion withExtendedProperties(ExtendedProperty... values) {
        if (values!= null) {
            for (ExtendedProperty value: values) {
                getExtendedProperties().add(value);
            }
        }
        return this;
    }

    @Override
    public InformationContentVersion withExtendedProperties(Collection<ExtendedProperty> values) {
        if (values!= null) {
            getExtendedProperties().addAll(values);
        }
        return this;
    }

    @Override
    public InformationContentVersion withCreated(CreatedProperty value) {
        setCreated(value);
        return this;
    }

    @Override
    public InformationContentVersion withCreator(CreatorProperty value) {
        setCreator(value);
        return this;
    }

    @Override
    public InformationContentVersion withModified(ModifiedProperty value) {
        setModified(value);
        return this;
    }

    @Override
    public InformationContentVersion withModifier(ModifierProperty value) {
        setModifier(value);
        return this;
    }

}