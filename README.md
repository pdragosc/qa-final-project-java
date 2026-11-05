# qa-final-project-java

## Ce face proiectul
Proiect de QA Automation pentru Java/Maven: 
structura de proiect, configurare YAML, un plan de test API (pseudocod), Dockerfile si un pipeline CI/CD cu GitHub Actions care ruleaza testele si publica imaginea Docker pe Docker Hub.

## Cum rulezi testele local
```bash
mvn test
```

## Cum construiesti si rulezi imaginea Docker
```bash
docker build -t qa-final-project-java .
docker run qa-final-project-java
```
