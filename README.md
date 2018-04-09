# SpringBoot_OAuth2_Gmail_Login
SpringBoot_OAuth2_Gmail_Login


Microservice using OAuth 2.0 and OpenID Connect to authenticate in the Google and get information to user.

<b>Technology stack:</b>
<ul><li>Maven</li>
    <li>Spring Boot</li>
    <li>Spring Web</li>
    <li>Spring Security</li>
    <li>OAuth2 authentication</li>
</ul>

<b>For registration your app in Google App, perform the following steps:</b>
<ul>
    <li>Go to https://console.developers.google.com and login with your Google account (this will be the developer account and the email of this account will be published when someone tries to authenticate with the Google application).</li>
    <li>If you don't have a project create a new one and then click into the project.</li>
    <li>In the menu "API manager" on the left side select "Credentials" --> "Create credentials" --> "OAuth client ID".</li>
    <li><img src='https://camo.githubusercontent.com/9311f42910571a1b1bf6f3aa1d6cbf5bad189c33/687474703a2f2f692e70696363792e696e666f2f69392f63383862373265326438356639613561373534626465383732363664326435332f313438303639333139342f37303430382f313038353035352f6f61757468312e6a7067'/></li>
    <li>Application Type -> "Web Application"</li>
    <li>Authorized Javascript Origins -> " "</li>
    <li>Authorized Redirect URI -> http://localhost:7070/google/login</li>
    <li><img src='https://camo.githubusercontent.com/a27744bfc1fcb38ff82f19f770268fc35404766b/687474703a2f2f692e70696363792e696e666f2f69392f61356364366262363961396538613234336133313338363334316335373234352f313438303639333837352f38393837362f313038353035352f6f61757468322e6a7067'/></li>
    <li>Copy the client ID and client Secret and update the application.properties</li>
    <li><img src='https://camo.githubusercontent.com/9d7cc9e8e4e1507680c32e36acea9aa085a2ea59/687474703a2f2f692e70696363792e696e666f2f69392f39623533366364396530623439643861313139396466353239613437373139632f313438303639383335312f32393532382f313038353035352f6f61757468332e6a7067'/></li>
    
</ul>
