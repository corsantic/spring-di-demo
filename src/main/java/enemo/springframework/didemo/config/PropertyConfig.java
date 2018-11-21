package enemo.springframework.didemo.config;

import enemo.springframework.didemo.examplebeans.FakeDataSource;
import enemo.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {


    @Value("${enemo.username}")
    String user;
    @Value("${enemo.password}")
    String password;
    @Value("${enemo.dburl}")
    String url;
    @Value("${enemo.jms.username}")
    String userJms;
    @Value("${enemo.jms.password}")
    String passwordJms;
    @Value("${enemo.jms.url}")
    String urlJms;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }



    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUserJms(userJms);
        fakeJmsBroker.setPasswordJms(passwordJms);
        fakeJmsBroker.setUrlJms(urlJms);

        return fakeJmsBroker;
    }






    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
