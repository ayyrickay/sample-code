// Download the helper library from https://www.twilio.com/docs/node/install
// Your Account Sid and Auth Token from twilio.com/console
const accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
const authToken = 'your_auth_token';
const client = require('twilio')(accountSid, authToken);

client.validationRequests
      .create({phoneNumber: '+15017122661'})
      .then(validation_request => console.log(validation_request.friendlyName))
      .done();
