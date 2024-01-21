# Notification Service

## Build Docker Image

If you want to build the image and push it to your own Docker Hub account, you need to change the image name.

```shell
pack build dragomiralin/deposit-service --builder docker.io/paketobuildpacks/builder-jammy-base:latest --env BP_JVM_VERSION=21
```

## Push Docker Image

Change the image name if you want to push it to your own Docker Hub account.

```shell
docker push dragomiralin/deposit-service:latest
```

## Deploy to Kubernetes

Deploy the application to Kubernetes.

```shell
kubectl apply -f kubernetes/
```

