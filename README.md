
## Inleiding

Welkom bij de eerste opdracht van de Summerschool. Deze opdracht gaat over een dierentuin. De dierentuin wil graag een applicatie hebben, waar personeel en bezoekers wat aan hebben. En deze opdracht ga jij maken. 

## Opdrachtbeschrijving

Je gaat een applicatie programmeren die meerdere nieuwe dieren kan aanmaken. Deze dieren hebben veel dingen gemeen, daarom gaan we kijken hoe we dit kunnen toepassen op een efficiënte manier in je code. 

![Pokemon!](./Assets/pokemon.JPG)

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Een `Super klasse`;
- 5 `subklassen`;
- Een `main`-klasse met een `main`-methode;
- 4 `interfaces`;
- 1 `Enum`.

Alle methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.

## Stappenplan
Het is uitdagender om jouw eigen stappenplan te maken, maar als je niet weet waar je wil beginnen kun je dit stappenplan volgen.
1. Maak een `main`-klasse aan in de `src`-map.
2. Maak vervolgens binnen de `main`-klasse een `main`-methode aan. Anders kun je de applicatie immers niet draaien!
3. Maak een _Animal_ klasse aan.
4. In de _Animal_ klasse maken we variabelen aan voor:
- `String` name;
- `String` feature;
- `String` dateOfBirth;
- `String` species;
- `String` nutrition;
- `int` weight;
- `boolean` givesBirth;
- `String` gender;
5. Maak een default `constructor` en een gevulde `constructor` met alle variabelen als `attribuut` mee gegeven, in de _Animal_ klasse.
6. Maak de volgende ` plubic methodes` aan in de _Animal_ klasse (deze returnen `void` en maken gebruik van een `System.out.println` met een toepasselijk zin):
- makesSound();
- getsFood();
- swims();
- walking();
- flies();
- reproduction() *(maak van deze methode een if statement die checkt of de waarde van givesBirth waar of onwaar is. Bij true print je de tekst giving brith for reproduction, bij false de tekst lays eggs for reproduction);
7. Maak de volgende nieuwe klassen aan:
- _Crocodile_;
- _Dolphin_;
- _Flamingo_;
- _Penguin_;
- _Shark_;
8. Je ziet nu dat alle `variabelen` uit de _Animal_ klasse toepasselijk zijn voor alle `klassen` die je net hebt aangemaakt. je kan dit oplossen door alles over te typen of te kopieren. Echter heb je dan heel veel dubbele code in je app. Dat is niet zo netjes. Dit is oplosbaar door de _Animal_ klasse abstract te maken. Dan maak je namelijk de _Animal_ klasse een `Super` klasse. 
9. Extend nu de `Super` klasse in alle andere klassen. 
10. Als je nu een constructor maakt in elk van de dieren klassen, kun je deze de attributen meegeven van de `Super` klasse.
11. Dit maakt het mogelijk voor je om van elke `Sub` klasse een object te instantieren in de `public static void main` methode in je `Main` klasse. Doe dit door bijv. 
 _Crocodile crocodile = new Crocodile(.....)_ (zet op de puntjes de waardes van de attributen).
12. In de _Animal_ klasse had je ook methodes staan. Wat gebeurt er als je nu met een instantiatie van je _Crocodile_ klasse, zo een methode aanroept?
13. Dat is handig nu kan je voor elk dier deze methode aanroepen, en hoef je niet de `methode` voor elke `klassen` weer uit te schrijven. Maar dit houd in dat bijvoorbeeld de croccodile met de methode makesSound() hetzelfde geeft als dolphin. En dat is wel raar, want deze klinken niet hetzelfde.
14. Laten we dit oplossen door alle methodes van de _Animal_ klasse in een interface te zetten. Geef deze interface de naam _MainFeatures_ en plaats hier alle methodes in. 
15. Omdat een interface alleen abstracte methodes verwacht geeft dit een probleem. Als we de bodies weghalen van de methodes zijn deze abstract. Maar kunnen we hier niet gelijk gebruik van maken. Wat wel kan is de methode overschrijven in de Klasse waar wj deze wilt hebben. 
16. Ga naar de _Animal_ klasse en plaats een `@Override` boven de bestaande methodes, deze mogen wel een body hebben, omdat deze de abstracte methode overschrijven. Echter als we nu de app draaien is er nog niets opgelost. 
17. Kijk eens goed naar de methodes, zijn er methodes die altijd hetzelfde kunnen terug geven? Ja, de methode sleeps() bijv. die kan de string "Zzz Zzz Zzz" printen. dat kan voor elk dier hetzelfde zijn. Als we kijken naar de methode reproduction is de uitkomst ook gelijk voor elk dier. Deze laten we staan in de _Animal_ klasse zonder `@Override`.
18. Haal deze 2 methodes weg uit de _MainFeatures_. **** hier gebleven ****





## Bonusopdrachten

1. Bedenk of het mogelijk zou zijn om een abstracte klasse te implementeren in deze appplicatie. En zo ja, implementeer deze abstracte klasse dan in jouw project;
2. Bedenk of het mogelijk zou zijn om één of meer abstracte methodes te implementeren. En zo ja, implementeer deze!
3. Probeer een manier te vinden waardoor één Pokèmon twee verschillende types tegelijk zou kunnen zijn. Kun je dit implementeren?
