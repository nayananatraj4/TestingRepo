FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/shoppingcart-0.0.1-SNAPSHOT.war shoppingcart-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-war","shoppingcart-0.0.1-SNAPSHOT.war"]