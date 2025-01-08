# Guide d’utilisation de Keycloak

## 1. Préparation

### Installation de Keycloak
Assurez-vous d'avoir téléchargé Keycloak (édition utilisée ici : **keycloak-26.0.7**). Placez-le dans le répertoire souhaité.

## 2. Lancer Keycloak

Accédez au répertoire où Keycloak est installé :
```bash
cd /Users/macbookair/Downloads/keycloak-26.0.7
```

Démarrez Keycloak en mode développement :
```bash
bin/kc.sh start-dev
```
![2  Démarrer Keycloak - Doc](https://github.com/user-attachments/assets/02c3d9c9-170f-4704-b3d0-c482fb715208)

## 3. Créer un compte administrateur

Pour configurer un compte administrateur, exécutez la commande suivante :
```bash
bin/kc.sh bootstrap-admin user --bootstrap-admin-username admin --bootstrap-admin-password admin
```

## 4. Configuration de Keycloak

### Création d'une Realm
1. Connectez-vous à l’interface Keycloak.
2. Naviguez vers **Realm Settings** et créez une nouvelle realm.
   ![1](https://github.com/user-attachments/assets/2b53ba9d-c324-4257-8474-3416c9a78b85)

### Création d’un client à sécuriser
1. Dans la realm créée, ajoutez un client via la section **Clients**.

![2](https://github.com/user-attachments/assets/823546a0-e50e-4962-aa9f-b0e4ed54d1bf)
### Gestion des utilisateurs
1. Ajoutez des utilisateurs à la realm via la section **Users**.
2. Assignez des rôles à chaque utilisateur.

### Gestion des rôles
1. Créez des rôles dans la section **Roles**.
2. Affectez ces rôles aux utilisateurs.

## 5. Test avec Postman

### Obtenir la configuration OpenID
1. Allez dans **Realm Settings** → **OpenID Endpoint Configuration**.
2. Récupérez l'URL pour tester l’authentification :
   ```
   http://localhost:8080/realms/sdia-realm/.well-known/openid-configuration
   ```
![3](https://github.com/user-attachments/assets/617f4a57-4c3a-4228-b2ca-0c37b4aaa7df)
### Scénarios de test
1. **Tester l’authentification avec un mot de passe** :
   - Utilisez les endpoints de l'API pour vérifier les échanges de jetons.
   ![4](https://github.com/user-attachments/assets/ad70d566-4994-4bd6-9d12-6b70ef107001)
   ![5](https://github.com/user-attachments/assets/b5c28b70-8a60-4899-840d-cc72d8049ce7)
2. **Analyser les contenus des jetons JWT** (Access Token et Refresh Token).
4. **Tester l’authentification avec le Refresh Token**.
   ![6](https://github.com/user-attachments/assets/dfb06c65-34e9-4cb5-bcc1-371b8773ab96)
6. **Tester l’authentification avec Client ID et Client Secret**.
![7](https://github.com/user-attachments/assets/919665f0-ecc2-41c8-b17a-ca8d64b768c1)


