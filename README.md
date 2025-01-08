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

### Création d’un client à sécuriser
1. Dans la realm créée, ajoutez un client via la section **Clients**.

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

### Scénarios de test
1. **Tester l’authentification avec un mot de passe** :
   - Utilisez les endpoints de l'API pour vérifier les échanges de jetons.
2. **Analyser les contenus des jetons JWT** (Access Token et Refresh Token).
3. **Tester l’authentification avec le Refresh Token**.
4. **Tester l’authentification avec Client ID et Client Secret**.



