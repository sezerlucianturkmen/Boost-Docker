#once jdk gerekli paketleri yukluyoruz
FROM amazoncorretto:17
#jar dosyasini elle belirlemek icin arguman talep edilir
ARG JAR_FILE_NASILSIN=target/*.jar
#jar dosyasini / root klasorune kopyalanir
COPY ${JAR_FILE_NASILSIN} appbenbirjavauygulmasiyim.jar
#app uygulamamizin calismasini sagliyoruz
ENTRYPOINT ["java","-jar","/appbenbirjavauygulmasiyim.jar"]
