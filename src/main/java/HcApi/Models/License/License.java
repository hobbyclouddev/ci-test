package HcApi.Models.License;


public class License {

    private String licenseKey;

    private String licenseValidFrom;

    private String licenseValidTo;

    private LicenseTypeEnum licenseType;

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getLicenseValidFrom() {
        return licenseValidFrom;
    }

    public void setLicenseValidFrom(String licenseValidFrom) {
        this.licenseValidFrom = licenseValidFrom;
    }

    public String getLicenseValidTo() {
        return licenseValidTo;
    }

    public void setLicenseValidTo(String licenseValidTo) {
        this.licenseValidTo = licenseValidTo;
    }

    public LicenseTypeEnum getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseTypeEnum licenseType) {
        this.licenseType = licenseType;
    }
///


}
