package models;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

public class User {
    @XmlElement(name="enabled")
    public Boolean enabled;

    @XmlElement(name="created")
    public Date created;

    @XmlElement(name="product")
    public String product;

    @XmlElement(name="parent")
    public String parent;

    @XmlElement(name="deletion-deadline")
    public Date deletion_deadline;

    @XmlElement(name="subscribed")
    public Boolean subscribed;

    @XmlElement(name="external_id")
    public String external_id;
}
