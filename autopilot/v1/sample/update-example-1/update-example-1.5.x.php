<?php

// Update the path below to your autoload.php,
// see https://getcomposer.org/doc/01-basic-usage.md
require_once '/path/to/vendor/autoload.php';

use Twilio\Rest\Client;

// Find your Account Sid and Auth Token at twilio.com/console
$sid    = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
$token  = "your_auth_token";
$twilio = new Client($sid, $token);

$sample = $twilio->autopilot->v1->assistants("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
                                ->tasks("UDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
                                ->samples("UFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
                                ->update(array("language" => "en-US"));

print($sample->dateCreated->format());