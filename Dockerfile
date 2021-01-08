FROM gradle:jdk11 as resolved-dependencies

ENV GRADLE_USER_HOME /home/gradle/cache

WORKDIR /home/gradle/app/
RUN mkdir -p ${GRADLE_USER_HOME}
COPY ./build.gradle /home/gradle/app/build.gradle
RUN gradle downloadDependencies
