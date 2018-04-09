package org.sambasoft.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
    @Id
    @GeneratedValue()
    private Long id;

    private Long customerid;
    private String movedate;
    private String cityout;
    private String addressout;
    private String cityin;
    private String addressin;
    private String offers;
    private String extras;

    public Orders( String movedate,String cityout, String addressout, String cityin, Long customerid, String addressin, String offers, String extras) {
        this.customerid = customerid;
        this.movedate = movedate;
        this.cityout = cityout;
        this.addressout = addressout;
        this.cityin = cityin;
        this.addressin = addressin;
        this.offers = offers;
        this.extras = extras;
    }

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getMovedate() {
        return movedate;
    }

    public void setMovedate(String movedate) {
        this.movedate = movedate;
    }

    public String getCityout() {
        return cityout;
    }

    public void setCityout(String cityout) {
        this.cityout = cityout;
    }

    public String getAddressout() {
        return addressout;
    }

    public void setAddressout(String addressout) {
        this.addressout = addressout;
    }

    public String getCityin() {
        return cityin;
    }

    public void setCityin(String cityin) {
        this.cityin = cityin;
    }

    public String getAddressin() {
        return addressin;
    }

    public void setAddressin(String addressin) {
        this.addressin = addressin;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", customerid=" + customerid +
                ", movedate='" + movedate + '\'' +
                ", cityout='" + cityout + '\'' +
                ", addressout='" + addressout + '\'' +
                ", cityin='" + cityin + '\'' +
                ", addressin='" + addressin + '\'' +
                ", offers='" + offers + '\'' +
                ", extras='" + extras + '\'' +
                '}';
    }
}
