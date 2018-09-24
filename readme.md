# acceptance test project

Run args: 

```
-Dwebdriver.driver=chrome 
-Dwebdriver.chrome.driver=/home/devsecops/dev/bin/drivers/chromedriver 
-Dcucumber.options="-t @Kiet_WIP"

```

## Run test with maven:

```
mvn -Dtest=AcceptanceTests -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=/home/devsecops/dev/bin/drivers/chromedriver -Dcucumber.options="-t @Kiet_WIP" test
```

Generate report with Maven:

```
-DskipTests verify
```

## selenium hub on openshift:

```
oc new-app --name selenium-hub selenium/standalone-chrome:3.14
```

## run acceptance tests with remote selenium server:

```
mvn -Dtest=AcceptanceTests -Dwebdriver.remote.driver=chrome -Dwebdriver.remote.url=http://selenium-hub-test-service.127.0.0.1.nip.io/wd/hub -Dcucumber.options="-t @Kiet_WIP" test
```