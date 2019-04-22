package com.example.demo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="Fuel_Inventory_Report", schema="ods")


public class Inventory implements Serializable {
    private static final long serialVersionUID = 1L;



    @Column(name="site_country_id")
    private String siteCountryId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="site_id")
    private Integer siteId;

    @Column(name="zone_name")
    private BigDecimal zoneName;

    @Column(name="market_name")
    private BigDecimal marketName;

    @Column(name="def_carrier_name")
    private String defCarrierName;

    @Column(name="trns_def_suppterm_name")
    private String trnsDefSupptermName;

    @Column(name="asset")
    private String asset;

    @Column(name="truck_terminal")
    private String truckTerminal;

    @Column(name="truck_terminal_carrier")
    private String truckTerminalCarrier;

    @Column(name="truck_terminal_brand")
    private String truckTerminalBrand;

    @Column(name="fuel_grade")
    private String fuelGrade;

    @Column(name="capacity")
    private Double capacity;

    @Column(name="gross_volume")
    private Double grossVolume;

    @Temporal(TemporalType.DATE)
    @Column(name="inventory_reading_date")
    private Date inventoryReadingDate;

    @Column(name="brand")
    private String brand;

    @Column(name="days_supply")
    private Double daysSupply;

    @Column(name="percent_full")
    private Double percentFull;

    @Temporal(TemporalType.DATE)
    @Column(name="process_date")
    private Date processDate;

    @Temporal(TemporalType.DATE)
    @Column(name="process_date_cst")
    private Date processDateCst;

    public String getSiteCountryId() {
        return siteCountryId;
    }

    public void setSiteCountryId(String siteCountryId) {
        this.siteCountryId = siteCountryId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public BigDecimal getZoneName() {
        return zoneName;
    }

    public void setZoneName(BigDecimal zoneName) {
        this.zoneName = zoneName;
    }

    public BigDecimal getMarketName() {
        return marketName;
    }

    public String getDefCarrierName() {
        return defCarrierName;
    }

    public void setDefCarrierName(String defCarrierName) {
        this.defCarrierName = defCarrierName;
    }

    public String getTrnsDefSupptermName() {
        return trnsDefSupptermName;
    }

    public void setTrnsDefSupptermName(String trnsDefSupptermName) {
        this.trnsDefSupptermName = trnsDefSupptermName;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getTruckTerminal() {
        return truckTerminal;
    }

    public void setTruckTerminal(String truckTerminal) {
        this.truckTerminal = truckTerminal;
    }

    public String getTruckTerminalCarrier() {
        return truckTerminalCarrier;
    }

    public void setTruckTerminalCarrier(String truckTerminalCarrier) {
        this.truckTerminalCarrier = truckTerminalCarrier;
    }

    public String getTruckTerminalBrand() {
        return truckTerminalBrand;
    }

    public void setTruckTerminalBrand(String truckTerminalBrand) {
        this.truckTerminalBrand = truckTerminalBrand;
    }

    public String getFuelGrade() {
        return fuelGrade;
    }

    public void setFuelGrade(String fuelGrade) {
        this.fuelGrade = fuelGrade;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getGrossVolume() {
        return grossVolume;
    }

    public void setGrossVolume(Double grossVolume) {
        this.grossVolume = grossVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getDaysSupply() {
        return daysSupply;
    }

    public void setDaysSupply(Double daysSupply) {
        this.daysSupply = daysSupply;
    }

    public Double getPercentFull() {
        return percentFull;
    }

    public void setPercentFull(Double percentFull) {
        this.percentFull = percentFull;
    }

    public Date getProcessDateCst() {
        return processDateCst;
    }

    public void setProcessDateCst(Date processDateCst) {
        this.processDateCst = processDateCst;
    }

    public Date getInventoryReadingDate() {
        return inventoryReadingDate;
    }

    public void setInventoryReadingDate(Date inventoryReadingDate) {
        this.inventoryReadingDate = inventoryReadingDate;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public void setMarketName(BigDecimal marketName) {
        this.marketName = marketName;
    }

}
