package models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

@XmlRootElement(name = "user")
public class UserModel {

    @XmlElement(name = "enabled")
    public Boolean enabled;

    @XmlElement(name = "created")
    public Date created;

    @XmlElement(name = "product")
    public String product;

    @XmlElement(name = "parent")
    public String parent;

    @XmlElement(name = "deletion-deadline")
    public Date deletion_deadline;

    @XmlElement(name = "subscribed")
    public Boolean subscribed;

    @XmlElement(name = "external_id")
    public String external_id;


    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setDeletion_deadline(Date deletion_deadline) {
        this.deletion_deadline = deletion_deadline;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(enabled, userModel.enabled) &&
                Objects.equals( created.getTime(), userModel.created.getTime()) &&
                Objects.equals(product, userModel.product) &&
                Objects.equals(parent, userModel.parent) &&
                Objects.equals(deletion_deadline,userModel.deletion_deadline) &&
                Objects.equals(subscribed, userModel.subscribed) &&
                Objects.equals(external_id, userModel.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, created, product, parent, deletion_deadline, subscribed, external_id);
    }


}
