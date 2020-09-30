# Payment Microservice

## Présentation

Microservice de l'application Wild Adventure permettant la gestion des paiements enregistrés via la client web et l'API Paypal. Il communique avec le microservice booking pour actualiser l'état d'une réservation.
Il eregistre en persistence les informations concernants les transactions associés à un paiement.

Pour plus d'information sur le microservice, après son déploiement en local, rendez-vous sur : 

`http://localhost:12090/swagger-ui.html`

## Déploiement

Lancer le main de l'application via votre éditeur java (eclipse ou IntelliJ) ou en faisant un build du projet maven `mvn clean install` puis éxécutez le point jar généré dans le dossier target via `java -jar ******.jar`
