# Azure Communication SMS Service client library for Java

> see https://aka.ms/autorest
## Getting Started

To build the SDK for Sms Client, simply Install AutoRest and in this folder, run:

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

There is one swagger for Sms management APIs.

```ps
cd <swagger-folder>
autorest README.md --java --v4 --use=@autorest/java@4.0.1
```

## Update generated files for Sms service
To update generated files for Sms service, run the following command

> autorest README.md --java --v4 --use=@autorest/java@4.0.1

### Code generation settings
``` yaml
input-file: https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/specification/communication/data-plane/Microsoft.CommunicationServicesSms/stable/2021-03-07/communicationservicessms.json
java: true
output-folder: ..\
license-header: MICROSOFT_MIT_SMALL	
namespace: com.azure.communication.sms	
generate-client-as-impl: true	
custom-types: SmsSendOptions
custom-types-subpackage: models
models-subpackage: implementation.models
sync-methods: all
add-context-parameter: true
context-client-method-parameter: true

```
### Directive renaming "id" property to "identifier"
``` yaml
directive:
    from: swagger-document
    where: '$.definitions.SmsSendOptions.properties.enableDeliveryReport'
    transform: >
        $["x-ms-client-name"] = "deliveryReportEnabled";
```
