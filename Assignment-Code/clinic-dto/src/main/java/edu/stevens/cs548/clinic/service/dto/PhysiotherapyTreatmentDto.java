package edu.stevens.cs548.clinic.service.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PhysiotherapyTreatmentDto extends TreatmentDto {
	
	@SerializedName("treatment-dates")
	private List<LocalDate> treatmentDates;

	public List<LocalDate> getTreatmentDates() {
		return treatmentDates;
	}

	public void setTreatmentDates(List<LocalDate> treatmentDates) {
		this.treatmentDates = treatmentDates;
	}
	
	public PhysiotherapyTreatmentDto() {
		this.treatmentDates = new ArrayList<>();
	}

}
