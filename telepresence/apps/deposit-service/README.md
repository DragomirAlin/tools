# Notification Service

## Build Docker Image
```shell
pack build dragomiralin/deposit-service --builder docker.io/paketobuildpacks/builder-jammy-base:latest --env BP_JVM_VERSION=21
```

## Push Docker Image
```shell
docker push dragomiralin/deposit-service:latest
```

## Deploy to Kubernetes
```shell
kubectl apply -f kubernetes/
```

