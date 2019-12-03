# 2.28 Exercice (Graphor)

L'application Graphor est un outil de dessin vectoriel permettant de dessiner des modèles de type UML, BPMN, ER, _etc_.
Il doit pouvoir supporter les fonctionnaités suivantes :

1. Un même graphe doit pouvoir re édité simultanément selon plusieurs miss en formes.
2. Les formes peut être visible de manière détaillée (son contenu est affiché) ou condensée (représentée pra un pictogramme).
3. Une forme peut être visible de manière détaillée (son contenu est affiché) ou condensée (représentée pra un pictogramme).
4. Une forme peut être ajoutée à une librairie pour re réemployée ultérieurement.
5. Une forme sélectionnée change d'apparence et est "auréolée" d'une ombre
6. Les formes doivent pouvoir re déplacées (avec leur contenu) par un drag&drop
7. Les formes contenues dans une autre doivent pouvoir re déplacées par un SHIFT-drag&drop (par exemple, dans un diagramme de classes, déplacer une classe d'un package vers un autre package)
8. Sauver et charger les grahpes dans différents formats (XML, sérialisation Java, _etc_).
9. Charger et recharger des mises en forme pour un type de grahpe
10. Pouvoir copier/coller une partie d'un graphe dans un autre graphe
11. Pouvoir faire des undo/redo à volonté sur les opérations d'édition
12. Pouvoir charger dynamiquement des plugins afin d'exécuter des opérations sur le graphe courant (cela nécessite une connaissance plus approfondie de Java)
13. Les graphes devront pouvoir être imprimés
14. Les actions d'édition seront proposées aussi bien dans le menu général (en haut) que dans le menu contextuel, accessible par un click droit.

Conservez l'ossature de l'application comme un diagramme de classes en utilisant les design patterns les plus appropriés pour chaque exigence.

## Réponses

1. Observer ou Flyweight
2. Composite
3. State ou Decorator
4. Prototype (et Memento)
   > En fait l'idée c'était ici de réutiliser pleins de fois un objet. Du coup Prototype est parfait pour ça.
   > L'idée de garder l'état de l'objet qu'on a voulu sauvegarder peut être complété par le DP Memento
5. State
6. Command
7. Command
   > On peut aussi y ajouter Object Pool ou Composite
8. Strategy
   > On effectue la même tâche de plusieurs façons différentes donc Strategy c'est bien.
9. Prototype ou Memento
10. Prototype ou Memento + Composite
11. Command
12. Decorator ou Interceptor
13. Visitor ou Command
    > Visitor car on peut visiter tous les graphes/tous les noeuds pour imprimer le graphe
    > Command car il est possible de créer une commande pour imprimer le graphe
14. Command ou Bridge
    > Command est obvious
    > Bridge si on justifie par la réutilisation du code de la fonctionnalité à deux endroits de l'interface.
