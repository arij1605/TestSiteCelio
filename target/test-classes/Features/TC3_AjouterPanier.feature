#Author Arij

Feature: page produit

Scenario: utilisateur ajoute un produit au panier 

Given utilisateur est sur la page du produit

When utilisateur click sur Ajouter au panier

Then le produit "Jean barrel 100% coton - bleu brut" est ajouté au panier 

