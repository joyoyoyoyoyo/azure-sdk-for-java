# Azure Communication Phone Numbers library for Java

> see https://aka.ms/autorest
## Getting Started

To build the SDK for Communication Phone Numbers library, simply Install AutoRest and in this folder, run:

### Setup
```ps
Fork and clone https://github.com/Azure/autorest.java
git checkout v4
git submodule update --init --recursive
mvn package -Dlocal
npm install
npm install -g autorest
```

### Generation
```ps
cd <swagger-folder>
autorest README.md --java --v4 --use=@autorest/java@4.0.2
```

### Code generation settings
``` yaml
input-file: https://raw.githubusercontent.com/Azure/azure-rest-api-specs/1ef769ae890b5f5a952f9ba6e46e0ef6d38241da/specification/communication/data-plane/Microsoft.CommunicationServicesPhoneNumbers/stable/2021-03-07/phonenumbers.json
override-client-name: PhoneNumberAdminClient
custom-types: PurchasedPhoneNumber,BillingFrequency,CommunicationError,PhoneNumberOperation,PhoneNumberOperationStatus,PhoneNumberOperationStatusCodes,PhoneNumberOperationType,PhoneNumberAssignmentType,PhoneNumberCapabilities,PhoneNumberCapabilitiesRequest,PhoneNumberCapabilityType,PhoneNumberCost,PhoneNumberSearchResult,PhoneNumberType,PhoneNumberCapability
custom-types-subpackage: models
models-subpackage: implementation.models
java: true
output-folder: ..\
license-header: MICROSOFT_MIT_SMALL
namespace: com.azure.communication.phonenumbers
generate-client-as-impl: true
sync-methods: all
context-client-method-parameter: true
```

### Add readonly attribute to PurchasedPhoneNumber properties
```yaml
directive:
  - from: swagger-document
    where: $.definitions.PurchasedPhoneNumber
    transform: >
      $["properties"]["id"].readOnly = true;
      $["properties"]["phoneNumber"].readOnly = true;
      $["properties"]["phoneNumberType"].readOnly = true;
      $["properties"]["countryCode"].readOnly = true;
      $["properties"]["capabilities"].readOnly = true;
      $["properties"]["assignmentType"].readOnly = true;
      $["properties"]["purchaseDate"].readOnly = true;
      $["properties"]["cost"].readOnly = true;
```

### Add readonly attribute to PhoneNumberCost properties
```yaml
directive:
  - from: swagger-document
    where: $.definitions.PhoneNumberCost
    transform: >
      $["properties"]["amount"].readOnly = true;
      $["properties"]["currencyCode"].readOnly = true;
      $["properties"]["billingFrequency"].readOnly = true;
```

### Add readonly attribute to PhoneNumberOperation properties
```yaml $(java)
directive:
  - from: swagger-document
    where: $.definitions.PhoneNumberOperation
    transform: >
      $["properties"]["status"].readOnly = true;
      $["properties"]["resourceLocation"].readOnly = true;
      $["properties"]["createdDateTime"].readOnly = true;
      $["properties"]["error"].readOnly = true;
      $["properties"]["id"].readOnly = true;
      $["properties"]["operationType"].readOnly = true;
      $["properties"]["lastActionDateTime"].readOnly = true;
```

### Add readonly attribute to PhoneNumberSearchResult properties
```yaml
directive:
  - from: swagger-document
    where: $.definitions.PhoneNumberSearchResult
    transform: >
      $["properties"]["searchId"].readOnly = true;
      $["properties"]["phoneNumbers"].readOnly = true;
      $["properties"]["cost"].readOnly = true;
      $["properties"]["searchExpiresBy"].readOnly = true;
      $["properties"]["phoneNumberType"].readOnly = true;
      $["properties"]["assignmentType"].readOnly = true;
      $["properties"]["capabilities"].readOnly = true;
```