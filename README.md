# Tasks :
##
## TP WS CRUD

### Créer une API web avec Jakarta qui permette de gérer les tigres qu’on trouve dans un zoo.

### Un tigre aura ces informations:

### - id
### - nom
### - couleur
### - age

### Créer l’API suivante:

### - POST /api/tigres
### - GET /api/tigres
### - DELETE /api/tigres/4
### - GET /api/tigres/4
### - PUT /api/tigres/4
##
##
## TP : Un Service de réservation de places de spectacle

### Nous envisageons de développer un système en ligne pour la réservation de places pour des concerts. Ce service, accessible via une interface de programmation d'applications (API) sur le Web, sera intégré dans des applications mobiles. Ce système ne comprend pas une base de données pour les utilisateurs : chaque utilisateur est identifié uniquement par un pseudo lorsqu'il effectue une réservation.

### Les fonctionnalités prévues sont les suivantes :

### - L'utilisateur consulte la liste des spectacles disponibles.
### - L'utilisateur effectue une réservation pour un spectacle en utilisant un pseudo.
### - L'utilisateur peut annuler sa réservation.
### - L'utilisateur valide définitivement sa réservation.
### - L'administrateur du système accède à la liste des réservations validées pour un spectacle spécifique.

### Note importante : une réservation confirmée par un utilisateur ne peut plus être annulée !

### Développez une API Web avec des exemples de requêtes et réponses HTTP qui supportent les fonctionnalités mentionnées ci-dessus.
### Obtenir la liste des spectacles :
### - Requête : GET /api/spectacles
### - Réponse : JSON représentant la liste des spectacles.
### Ajouter un spectacle
### - POST /api/spectacles
### Créer une réservation :
### - Requête : POST /api/reservations avec le JSON de la réservation.
### - Réponse : Confirmation de la création de la réservation.
### Annuler une réservation :
### - Requête : DELETE /api/reservations/{id}
### - Réponse : Confirmation de l'annulation.
### Valider une réservation :
### - Requête : PUT /api/reservations/{id}/validation
### - Réponse : Confirmation de la validation.
### Obtenir les réservations validées pour un spectacle :
### - Requête : GET /api/spectacles/{id}/reservations
### - Réponse : JSON représentant les réservations validées.

### Pas besoin de gérer les Clients ou les Admins. Lors d’une reservation on envoie juste un String qui est le pseudo du client
### Je vous conseille de créer une classe ou 2 pour stocker et manipuler les Spectacles et les Reservations. C’est ici que vous gérez le calcul des identifiants
### Conseil pour démarrer plus facilement: codez uniquement la gestion des Spectacles puis après seulement ajoutez les Reservations

