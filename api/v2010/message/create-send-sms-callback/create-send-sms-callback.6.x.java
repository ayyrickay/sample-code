// You may want to be more specific in your imports
import java.util.*;
import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class TwilioTest {
 // Find your Account Sid and Token at twilio.com/user/account
 public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
 public static final String AUTH_TOKEN = "your_auth_token";

 public static void main(String[]args) throws TwilioRestException {
  TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

   // Build the parameters
   List<NameValuePair> params = new ArrayList<NameValuePair>();
   params.add(new BasicNameValuePair("To", "+15558675310"));
   params.add(new BasicNameValuePair("From", "+15017122661"));
   params.add(new BasicNameValuePair("Body", "McAvoy or Stewart? These timelines can get so confusing."));
   params.add(new BasicNameValuePair("StatusCallback", "http://postb.in/1234abcd"));

   MessageFactory messageFactory = client.getAccount().getMessageFactory();
   Message message = messageFactory.create(params);
   System.out.println(message.getSid());
 }
}
