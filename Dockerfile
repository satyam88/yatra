# Pull tomcat latest image from dockerhub
FROM tomcat:8.0.51-jre8-alpine
MAINTAINER satyam@gmail.com
# copy war file on to container
COPY ./target/yatra*.war /usr/local/tomcat/webapps
EXPOSE  8080 80
USER cowinapp
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh","run"]