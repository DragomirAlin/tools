# Account Service

## Build Docker Image
```shell
pack build dragomiralin/account-service --builder docker.io/paketobuildpacks/builder-jammy-base:latest --env BP_JVM_VERSION=21
```

## Push Docker Image
```shell
docker push dragomiralin/account-service:latest
```

## Deploy to Kubernetes
```shell
kubectl apply -f kubernetes/
```

