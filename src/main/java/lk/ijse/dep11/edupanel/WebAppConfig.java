package lk.ijse.dep11.edupanel;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.StorageClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.io.InputStream;

@EnableWebMvc
@ComponentScan
@Configuration

public class WebAppConfig {

//    @Bean
//    public CommonsMultipartResolver multipartResolver(){ //This old version of standard servlet multipart resolver
//        return new CommonsMultipartResolver();
//    }
    @Bean
    public StandardServletMultipartResolver multipartResolver(){ //This is used to convert TO object from multipart file
        return new StandardServletMultipartResolver();
    }

    @Bean
    public Bucket defaultBucket() throws IOException {
        InputStream serviceAccount =
                getClass().getResourceAsStream("/edu-panel-574fb-firebase-adminsdk-49xdf-970b1fcb29.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount)).setStorageBucket("edu-panel-574fb.appspot.com")
                .build();

        FirebaseApp.initializeApp(options);

        return StorageClient.getInstance().bucket();
    }
}
