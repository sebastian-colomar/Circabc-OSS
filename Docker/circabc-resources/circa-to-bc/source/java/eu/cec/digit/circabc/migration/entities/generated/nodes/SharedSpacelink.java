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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.alfresco.service.cmr.repository.NodeRef;

import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatorProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.DescriptionProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifiedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifierProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.NameProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.OwnerProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.TitleProperty;
import eu.cec.digit.circabc.migration.entities.generated.permissions.LibraryUserRights;
import eu.cec.digit.circabc.migration.entities.generated.permissions.Notifications;
import eu.cec.digit.circabc.migration.entities.generated.properties.ExtendedProperty;
import eu.cec.digit.circabc.migration.entities.generated.properties.I18NProperty;


/**
 * <p>Java class for sharedSpacelink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sharedSpacelink">
 *   &lt;complexContent>
 *     &lt;extension base="{https://circabc.europa.eu/Import/NodesSchema/1.0}link">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sharedSpacelink")
@XmlRootElement(name = "sharedSpacelink")
public class SharedSpacelink
    extends Link
    implements Serializable
{

    private final static long serialVersionUID = 1L;

    /**
     * Default no-arg constructor
     * 
     */
    public SharedSpacelink() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SharedSpacelink(final NodeRef nodeReference, final List<ExtendedProperty> extendedProperties, final CreatedProperty created, final CreatorProperty creator, final ModifiedProperty modified, final ModifierProperty modifier, final List<I18NProperty> i18NTitles, final TitleProperty title, final List<I18NProperty> i18NDescriptions, final DescriptionProperty description, final OwnerProperty owner, final NameProperty name, final Notifications notifications, final LibraryUserRights libraryUserRights, final String reference) {
        super(nodeReference, extendedProperties, created, creator, modified, modifier, i18NTitles, title, i18NDescriptions, description, owner, name, notifications, libraryUserRights, reference);
    }

    @Override
    public SharedSpacelink withNotifications(Notifications value) {
        setNotifications(value);
        return this;
    }

    @Override
    public SharedSpacelink withLibraryUserRights(LibraryUserRights value) {
        setLibraryUserRights(value);
        return this;
    }

    @Override
    public SharedSpacelink withReference(String value) {
        setReference(value);
        return this;
    }

    @Override
    public SharedSpacelink withName(NameProperty value) {
        setName(value);
        return this;
    }

    @Override
    public SharedSpacelink withI18NTitles(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NTitles().add(value);
            }
        }
        return this;
    }

    @Override
    public SharedSpacelink withI18NTitles(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NTitles().addAll(values);
        }
        return this;
    }

    @Override
    public SharedSpacelink withTitle(TitleProperty value) {
        setTitle(value);
        return this;
    }

    @Override
    public SharedSpacelink withI18NDescriptions(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NDescriptions().add(value);
            }
        }
        return this;
    }

    @Override
    public SharedSpacelink withI18NDescriptions(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NDescriptions().addAll(values);
        }
        return this;
    }

    @Override
    public SharedSpacelink withDescription(DescriptionProperty value) {
        setDescription(value);
        return this;
    }

    @Override
    public SharedSpacelink withOwner(OwnerProperty value) {
        setOwner(value);
        return this;
    }

    @Override
    public SharedSpacelink withNodeReference(NodeRef value) {
        setNodeReference(value);
        return this;
    }

    @Override
    public SharedSpacelink withExtendedProperties(ExtendedProperty... values) {
        if (values!= null) {
            for (ExtendedProperty value: values) {
                getExtendedProperties().add(value);
            }
        }
        return this;
    }

    @Override
    public SharedSpacelink withExtendedProperties(Collection<ExtendedProperty> values) {
        if (values!= null) {
            getExtendedProperties().addAll(values);
        }
        return this;
    }

    @Override
    public SharedSpacelink withCreated(CreatedProperty value) {
        setCreated(value);
        return this;
    }

    @Override
    public SharedSpacelink withCreator(CreatorProperty value) {
        setCreator(value);
        return this;
    }

    @Override
    public SharedSpacelink withModified(ModifiedProperty value) {
        setModified(value);
        return this;
    }

    @Override
    public SharedSpacelink withModifier(ModifierProperty value) {
        setModifier(value);
        return this;
    }

}