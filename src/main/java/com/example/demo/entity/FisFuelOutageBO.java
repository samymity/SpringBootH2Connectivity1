package com.example.demo.entity;




import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
//@Table(name="fis_fuel_outage_0319", schema = "digital")
@Data
@Table(name="fis_fuel_outage_03190")
public class FisFuelOutageBO implements Serializable { 
	/*
	
	[seq_no]
		      ,[organization]
		      ,[site_name]
		      ,[city_name]
		      ,[state_name]
		      ,[fuel_grade]
		      ,[tank_number]
		      ,[inventory_date]
		      ,[inventory_date_orig_str]
		      ,[delivery_date]
		      ,[gross_volume]
		      ,[percent_full]
		      ,[capacity]
		      ,[supplier]
		      ,[carrier]
		      ,[avg_daily]
		      ,[last_24_hours]
		      ,[region_number]
		      ,[zone_number]
		      ,[issue]
		      ,[hours_of_outage]
		      ,[brand_name]
		      ,[sales_percent]
		      ,[historic_low_volume]
		      ,[historic_low_dttm]
		      ,[recent_outage_volume]
		      ,[recent_outage_dttm]
		      ,[benchmark]
		      ,[benchmark_dttm]
		      ,[sales_spike_flag]
		      ,[outage_flag_codes]
		      ,[workflow_status_seq_no]
		      ,[outage_reason]
		      ,[carrier_agree]
		      ,[carrier_notes]
		      ,[comments]
		      ,[penalty_amount]
		      ,[notes]
		      ,[update_user]
		      ,[process_dttm]
		      ,[process_dt_int]
		      ,[inventory_dt_int]
		      ,[insert_dttm]
		      ,[update_dttm]
		    		  */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="s_no")
    private Integer sNo;
	
	@Column(name="organization")
    private String organization;
	
	@Column(name="site_name")
    private String siteName;

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	@Override
	public String toString() {
		return "FisFuelOutageBO [s_no=" + sNo + ", organization=" + organization + ", siteName=" + siteName + "]";
	}

}