package com.kuls.pojo;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/4/3 7:26 下午
 */
public class Address {
    private String country;
    private String province;
    private String city;

    public Address(String addressString) {
        //假设我们是通过 - 来分开country-province-city
        String[] address = addressString.split("-");

        this.country = address[0];
        this.province = address[1];
        this.city = address[2];

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
