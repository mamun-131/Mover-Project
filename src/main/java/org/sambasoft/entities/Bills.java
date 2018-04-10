package org.sambasoft.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bills {

    @Id
    @GeneratedValue()
    private Long id;
    private Long orderid;
    private double hourlyrate;
    private double totalhours;
    private double totalamount;
    private double hst;

    public Bills( Long orderid, double hourlyrate, double totalhours, double totalamount, double hst) {

        this.orderid = orderid;
        this.hourlyrate = hourlyrate;
        this.totalhours = totalhours;
        this.totalamount = totalamount;
        this.hst = hst;
    }

    public Bills() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public double getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public double getTotalhours() {
        return totalhours;
    }

    public void setTotalhours(double totalhours) {
        this.totalhours = totalhours;
    }

    public double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }

    public double getHst() {
        return hst;
    }

    public void setHst(double hst) {
        this.hst = hst;
    }

    @Override
    public String toString() {
        return "BIlls{" +
                "id=" + id +
                ", orderid='" + orderid + '\'' +
                ", hourlyrate=" + hourlyrate +
                ", totalhours=" + totalhours +
                ", totalamount=" + totalamount +
                ", hst=" + hst +
                '}';
    }
}
