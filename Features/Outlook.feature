Feature: Outlook

Scenario Outline: Outlook Login
       Given User Launches Chrome Browser atomatic
       When User opens outlook url  "https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=1&msaredir=1&client-request-id=b5412b59-c6c5-da69-b5d7-391d7b173c33&protectedtoken=true&claims=%7b%22id_token%22%3a%7b%22xms_cc%22%3a%7b%22values%22%3a%5b%22CP1%22%5d%7d%7d%7d&nonce=637751474281609111.3cf4819b-1293-4514-b01e-699bf671b508&state=DYtBC4IwGEC1_ku35b45t30H6SCEhEZYUHjz0wlJQ1Ex-vft8N7l8cIgCPaenSfkXoFWsdYJSC2FAcURAI5x20sDSAwExkz6yoiDZQqReqWBEm5C_96i8dtEp2VtVpvCYbbde7bt-hjTJq94m5eq-OHWvaqFBM6FQ1e7z1A_SnG9JwMJvtHzPFGGE7nLZjPzBw"
       And enters registered Email as "<email>"
       And click on next
       And enters password as "<password>"
       And click on signin
       And click on staysignin
       Then user should be able to see "New message" button
       

       Examples:
            | email | password |
            |sarveshhatti31523@gmail.com | Sarvesh@4612  |
            |sarvesh@gmail.com | 46124612 |


Scenario: composemail
       Given User Launches Chrome Browser atomatic
       When User opens outlook url  "https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=1&msaredir=1&client-request-id=b5412b59-c6c5-da69-b5d7-391d7b173c33&protectedtoken=true&claims=%7b%22id_token%22%3a%7b%22xms_cc%22%3a%7b%22values%22%3a%5b%22CP1%22%5d%7d%7d%7d&nonce=637751474281609111.3cf4819b-1293-4514-b01e-699bf671b508&state=DYtBC4IwGEC1_ku35b45t30H6SCEhEZYUHjz0wlJQ1Ex-vft8N7l8cIgCPaenSfkXoFWsdYJSC2FAcURAI5x20sDSAwExkz6yoiDZQqReqWBEm5C_96i8dtEp2VtVpvCYbbde7bt-hjTJq94m5eq-OHWvaqFBM6FQ1e7z1A_SnG9JwMJvtHzPFGGE7nLZjPzBw"
       And enters registered Email as "sarveshhatti31523@gmail.com"
       And click on next
       And enters password as "Sarvesh@4612"
       And click on signin
       And click on staysignin
       And click on new message
       And add recipient's mail as "sarveshhattissbj@gmail.com"
       And add cc as "hattisarvesh@gmail.com"
       And add subject as "Hi hello"
       And add content as "Hello people"
       And click send  
       Then Verify the send mail with subject as "Hi hello" 

     
Scenario: Sendmail_without_recipientId
       Given User Launches Chrome Browser atomatic
       When User opens outlook url  "https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=1&msaredir=1&client-request-id=b5412b59-c6c5-da69-b5d7-391d7b173c33&protectedtoken=true&claims=%7b%22id_token%22%3a%7b%22xms_cc%22%3a%7b%22values%22%3a%5b%22CP1%22%5d%7d%7d%7d&nonce=637751474281609111.3cf4819b-1293-4514-b01e-699bf671b508&state=DYtBC4IwGEC1_ku35b45t30H6SCEhEZYUHjz0wlJQ1Ex-vft8N7l8cIgCPaenSfkXoFWsdYJSC2FAcURAI5x20sDSAwExkz6yoiDZQqReqWBEm5C_96i8dtEp2VtVpvCYbbde7bt-hjTJq94m5eq-OHWvaqFBM6FQ1e7z1A_SnG9JwMJvtHzPFGGE7nLZjPzBw"
       And enters registered Email as "sarveshhatti31523@gmail.com"
       And click on next
       And enters password as "Sarvesh@4612"
       And click on signin
       And click on staysignin
       And click on new message
       And click send 
       Then Verify user warned with message as "This message must have at least one recipient." 