The feature branch consists of an extra functionality where the same app code can be deployed on multiple environments such as Dev, QA, Staging, or Prod. 


******* Docker commands******

./mvnw clean package

docker build -t image-name:V1

docker run -d -p 8080:8080 -e ENVIRONMENT=QA image-name:V1

The environment is passed as a variable in the deployment YAML file for kubernetes.

The webpage will display "you are accessing Dev/QA/Prod environment" depending on the variable. 

Expected:

![image](https://github.com/sahithyav9/Java-Springboot/assets/61227588/0e86508a-dc73-410c-8d9d-d48ba8d11914)


If no variable is mentioned, the webpage shows "you are accessing an unknown environment".

![image](https://github.com/sahithyav9/Java-Springboot/assets/61227588/d73aad8f-b470-473d-8a3e-bc61f88227af)

