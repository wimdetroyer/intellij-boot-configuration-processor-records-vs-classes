I added the spring metadata configuration processor, but intellij only partially seems to give me the correct hints.

Following image showcases the issue:
![img.png](only-class-javadoc-filled-in.png)

On both the record and the class, i've added a descriptive javadoc 'must be filled in', and I expect intellij to show me the hint for both, but it only seems to show up for the _class_, not the _record_.


The META-INF/spring-configuration-metadata.json file seems fine to me:

```json
{
  "groups": [
    {
      "name": "app-class",
      "type": "com.example.demo.ApplicationPropertiesClass",
      "sourceType": "com.example.demo.ApplicationPropertiesClass"
    },
    {
      "name": "app-record",
      "type": "com.example.demo.ApplicationPropertiesRecord",
      "sourceType": "com.example.demo.ApplicationPropertiesRecord"
    }
  ],
  "properties": [
    {
      "name": "app-class.foo",
      "type": "java.lang.String",
      "description": "must be filled in.",
      "sourceType": "com.example.demo.ApplicationPropertiesClass"
    },
    {
      "name": "app-record.foo",
      "type": "java.lang.String",
      "description": "Must be filled in.",
      "sourceType": "com.example.demo.ApplicationPropertiesRecord"
    }
  ],
  "hints": []
}
```

I am running intellij idea ultimate 2024.3.1.1.
I have reproduced this issue on both a windows and mac os x machine.
This happens for both _application.properties_ and _application.yml_

