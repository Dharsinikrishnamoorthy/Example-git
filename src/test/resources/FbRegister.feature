Feature: To validate the account creation of FB application

Scenario: To create new account
Given To launch the browser and mazmize window
When To launch the url application
And To click the create new account button

#One Dimensional List
And To pass first name in first name text box
|Java|Inmakes|Infotech|Seleinum|PHP|

#One Dimensional Map
And To pass second name in surname text box
#key            value
|firstname1|Jananee|
|firstname2|Priya|
|firstname3|Sini|
#Two Dimensional List
And To pass phoneno or email in email text box
|7896541230|inmakes@gmail.com|9638527410|infotech@gmail.com|
|software@gmail.com|8520741963|testing@gmail.com|7410852096|
|8259367410|automation@gmail.com|7539541852|951753852|

#Two Dimensional Map
And To create new password using new password text box
|password1|password2|password3|
|789654123|dgarsni@1243|456545|
|sini@23|21302|78964413|

Then To close the chrome processor