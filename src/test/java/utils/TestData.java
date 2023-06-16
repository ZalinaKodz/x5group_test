package utils;

import config.TestDataConfig;
import org.aeonbits.owner.ConfigFactory;

public class TestData {
    TestDataConfig config = ConfigFactory.create(TestDataConfig.class, System.getProperties());

    public String searchWord = config.getSearchWord();
    public String address = config.getAddress();
    public String userName = config.getUserName();
    public String userEmail = config.getuserEmail();
    public String userPhoneNumber = config.getUserPhoneNumber();
    public String city = config.getCity();
    public String messageText = config.getMessageText();
}
