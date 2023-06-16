package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:testdata.properties"})

public interface TestDataConfig extends Config {

    @Key("searchWord")
    String getSearchWord();

    @Key("address")
    String getAddress();

    @Key("userName")
    String getUserName();

    @Key("userEmail")
    String getuserEmail();

    @Key("userPhoneNumber")
    String getUserPhoneNumber();

    @Key("city")
    String getCity();

    @Key("messageText")
    String getMessageText();
}
