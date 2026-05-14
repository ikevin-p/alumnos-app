# Stage 1: Build con Gradle
FROM gradle:8.5-jdk21-alpine AS builder
WORKDIR /app
# Copiamos todo el código fuente
COPY . .
# Construimos el .jar omitiendo los tests para mayor velocidad
RUN gradle build -x test

# Stage 2: Runtime ligero
FROM eclipse-temurin:21-jre-alpine
# Creamos el usuario no root por seguridad
RUN addgroup -S springgroup && adduser -S springuser -G springgroup
USER springuser

# Copiamos el .jar generado en la etapa anterior
COPY --from=builder /app/build/libs/*.jar /app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
