# 2.4 Exercice (Configuration)

Le modèle **ISO** est une norme de communication réseau qui impose l'organisation de chaque entité communicante en 7 couches. Les couches doivent pouvoir être utilisées du haut vers le bas et réciproquement (c'est à dire envoi et réception). Chaque couche offre donc des primitives `send(...)` et `receive(...)` (entre autres).

Proposez une implémentation du design pattern **Configuration** pour permettre la configuration des trois premières couches du modèle ISO

- Physique
- Données
- Réseau
