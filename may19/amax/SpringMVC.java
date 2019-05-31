/*
package may19.amax;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.apache.http.HttpStatus;

@RestController
class HealthcheckController {

    private static final String FORMAT_FULL ="full";
    private static final String FORMAT_SHORT ="short";
    @GetMapping(value = "/healthcheck",params = {"format"}, produces = "application/json")
    public  ResponseEntity<?> healthcheck(@RequestParam("format") String format) {

        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        if(FORMAT_SHORT.equalsIgnoreCase(format)){
            return new ResponseEntity<>(httpHeaders, HttpStatus.OK);
        } else if(FORMAT_FULL.equalsIgnoreCase(format)){
            TimeZone tz = TimeZone.getTimeZone("UTC");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
            df.setTimeZone(tz);
            String iSO = df.format(new Date());
            System.out.println(iSO);
            ResponseHealthCheck responseHealthCheck = new ResponseHealthCheck( );
            responseHealthCheck.setApplication("OK");
            responseHealthCheck.setCurrentTime(iSO);

            return new ResponseEntity<>(responseHealthCheck,httpHeaders);
        }
        return new ResponseEntity<>(httpHeaders, HttpStatus.SC_BAD_REQUEST);
    }

    @PutMapping(value = "/healthcheck")
    public void healthcheckPut() {
        return;
    }

    @PostMapping(value = "/healthcheck")
    public void healthcheckPost() {
        return;
    }


    @DeleteMapping(value = "/healthcheck")
    public void healthcheckDelete() {
        return;
    }


}


class ResponseHealthCheck
{
    private  String currentTime;
    private  String application;

    ResponseHealthCheck(){}

    public ResponseHealthCheck(String currentTime, String application) {
        this.currentTime = currentTime;
        this.application = application;

    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "ResponseHealthCheck{" +
                "application=" + application +
                ", currentTime='" + currentTime + '\'' +

                '}';
    }
}
*/
