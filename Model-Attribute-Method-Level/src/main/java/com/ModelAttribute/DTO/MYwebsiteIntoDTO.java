package com.ModelAttribute.DTO;

public class MYwebsiteIntoDTO {

	public MYwebsiteIntoDTO() {
		System.out.println("MYwebsiteIntoDTO Constructer Executing...");
	}

	private String websiteName;
	private String websiteCategory;

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	public String getWebsiteCategory() {
		return websiteCategory;
	}

	public void setWebsiteCategory(String websiteCategory) {
		this.websiteCategory = websiteCategory;
	}

	@Override
	public String toString() {
		return "MYwebsiteIntoDTO [websiteName=" + websiteName + ", websiteCategory=" + websiteCategory + "]";
	}
}
