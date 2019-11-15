# 2.5 Exercice (SingletonZ)

Comment pourrait-on généraliser le pattern **Singleton** pour en gérer plusieurs selon un certain contexte ?

Exemple : un serveur a été conçu pour ne supporter qu'une session à la fois et la session est définie comme un objet singleton.

Cependant l'évolution du système nécessite maintenant de gérer plusieurs sessions en parallèle, à raison d'une session par adresse IP du client.
