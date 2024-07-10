Prerequisites for Deployment:

Java Development Kit (JDK) 17

Docker


To build the application use the commands:

./mvnw clean package

docker build -t image-name:V1

docker run -d -p 8080:8080  image-name:V1

![image](https://github.com/sahithyav9/Java-Springboot/assets/61227588/7b14ae97-a935-4be2-92f0-560395111bb7)


## Acknowledgements
This project uses [particles.js](https://github.com/VincentGarreau/particles.js) library for background particle effects, which is available under the MIT License.
