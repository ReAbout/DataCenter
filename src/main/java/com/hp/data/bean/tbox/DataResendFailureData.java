package com.hp.data.bean.tbox;
import com.hp.data.core.DataEntity;

/**
 * Created by luj on 2015/11/13.
 */
@DataEntity(key = "8995")
public class DataResendFailureData extends TBoxUpBean{
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Integer speed;
    private Integer heading;

    private Byte warnMsg_acm;
    private Integer warnMsg_ic;
    private Byte warnMsg_escl;
    private Long warnMsg_bcm;
    private Byte warnMsg_tpms;
    private Integer warnMsg_dme;
    private Byte warnMsg_tcu;
    private Byte warnMsg_pdc_bsw;
    private Integer warnMsg_sesam;
    private Byte warnMsg_tbox;

    public Short getIsLocation() {
        return isLocation;
    }

    public void setIsLocation(Short isLocation) {
        this.isLocation = isLocation;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public Byte getWarnMsg_acm() {
        return warnMsg_acm;
    }

    public void setWarnMsg_acm(Byte warnMsg_acm) {
        this.warnMsg_acm = warnMsg_acm;
    }

    public Integer getWarnMsg_ic() {
        return warnMsg_ic;
    }

    public void setWarnMsg_ic(Integer warnMsg_ic) {
        this.warnMsg_ic = warnMsg_ic;
    }

    public Byte getWarnMsg_escl() {
        return warnMsg_escl;
    }

    public void setWarnMsg_escl(Byte warnMsg_escl) {
        this.warnMsg_escl = warnMsg_escl;
    }

    public Long getWarnMsg_bcm() {
        return warnMsg_bcm;
    }

    public void setWarnMsg_bcm(Long warnMsg_bcm) {
        this.warnMsg_bcm = warnMsg_bcm;
    }

    public Byte getWarnMsg_tpms() {
        return warnMsg_tpms;
    }

    public void setWarnMsg_tpms(Byte warnMsg_tpms) {
        this.warnMsg_tpms = warnMsg_tpms;
    }

    public Integer getWarnMsg_dme() {
        return warnMsg_dme;
    }

    public void setWarnMsg_dme(Integer warnMsg_dme) {
        this.warnMsg_dme = warnMsg_dme;
    }

    public Byte getWarnMsg_tcu() {
        return warnMsg_tcu;
    }

    public void setWarnMsg_tcu(Byte warnMsg_tcu) {
        this.warnMsg_tcu = warnMsg_tcu;
    }

    public Byte getWarnMsg_pdc_bsw() {
        return warnMsg_pdc_bsw;
    }

    public void setWarnMsg_pdc_bsw(Byte warnMsg_pdc_bsw) {
        this.warnMsg_pdc_bsw = warnMsg_pdc_bsw;
    }

    public Integer getWarnMsg_sesam() {
        return warnMsg_sesam;
    }

    public void setWarnMsg_sesam(Integer warnMsg_sesam) {
        this.warnMsg_sesam = warnMsg_sesam;
    }

    public Byte getWarnMsg_tbox() {
        return warnMsg_tbox;
    }

    public void setWarnMsg_tbox(Byte warnMsg_tbox) {
        this.warnMsg_tbox = warnMsg_tbox;
    }
}

