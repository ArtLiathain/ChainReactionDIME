// generated by info.scce.dime.generator.rest.SelectiveInteractableProcessGenerator#generateOutputs(Process)

package de.ls5.dywa.generated.rest.process.interactable;

import java.util.List;

public class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutput{
	private String branchName;
	private String branchId;
	private Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutputWrapper result;
		
	@com.fasterxml.jackson.annotation.JsonProperty("branchName")
	public java.lang.String getBranchName() {
		return this.branchName;
	}
	
	public void setBranchName(String branchname) {
		this.branchName = branchname;
	}
	
	@com.fasterxml.jackson.annotation.JsonProperty("branchId")
	public java.lang.String getBranchId() {
		return this.branchId;
	}
	
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	
	@com.fasterxml.jackson.annotation.JsonProperty("outputs")
	@com.codingrodent.jackson.crypto.Encrypt
	@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = info.scce.dime.rest.ContextIndependentSerializer.class)
	@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = info.scce.dime.rest.ContextIndependentDeserializer.class)
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutputWrapper getResult() {
		return this.result;
	}
	
	public void setResult(Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutputWrapper result) {
		this.result = result;
	}
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutput(){}
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutput(info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult result, info.scce.dime.rest.ObjectCache objectCache){
		this.branchName = result.getBranchName();
		this.branchId = result.getBranchId();
		this.result = new Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutputWrapper(result, objectCache);
	}

public static class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutputWrapper {
	
	private String branchName;
		
	@com.fasterxml.jackson.annotation.JsonProperty("branchName")
	public java.lang.String getBranchName() {
		return this.branchName;
	}
	
	public void setBranchName(String branchname) {
		this.branchName = branchname;
	}
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutputWrapper(){}
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutputWrapper(info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult result, info.scce.dime.rest.ObjectCache objectCache){
		this.branchName = result.getBranchName();
	}
}
}
