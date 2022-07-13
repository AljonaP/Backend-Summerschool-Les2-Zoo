
## Inleiding

Welkom bij de eerste opdracht van de Summer School. In deze opdracht ga jij als junior developer een applicatie maken voor een dierentuin, waar zowel personeel als bezoekers wat aan hebben.

## Opdrachtbeschrijving

Je gaat een applicatie programmeren die meerdere nieuwe dieren kan aanmaken. De dieren hebben overeenkomsten. Dit willen we efficient kunnen toepassen in de code.

![Dierentuin!](./uploads/dieren.JPG)

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Een `Superklasse`;
- 5 `subklassen`;
- Een _Main_-klasse met een _main_-`methode`;
- 4 `interfaces`;
- 1 `Enum`.

Alle methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.

## Stappenplan
Het is uitdagender om jouw eigen stappenplan te maken, maar als je niet weet waar je moet beginnen kun je dit stappenplan volgen.
1. Maak een _Main_-`klasse` aan in de `src`-map.
2. Maak vervolgens binnen de _main_-`klasse` een _main_-`methode` aan. Anders kun je de applicatie niet draaien!
3. Maak een _Animal_ klasse aan.
4. In de _Animal_ klasse maken we `variabelen` aan voor:
- `String` _name_;
- `String` _ feature_;
- `String` _dateOfBirth_;
- `String` _species_;
- `String` _nutrition_;
- `int` _weight_;
- `boolean` _givesBirth_;
- `String` _gender_;
5. Maak een `default constructor` en een gevulde `constructor` waar alle `variabelen `als `attribuut` worden meegegeven in de _Animal_ `klasse`.
6. Geef elk `private` `attribuut` een `public` `getter` en `setter`.
7. Maak de volgende `public methodes` aan in de _Animal_ klasse (deze returnen `void` en maken gebruik van een `System.out.println` met een toepasselijke zin):
- _makesSound()_;
- _getsFood()_;
- _sleeps()_;
- _swims()_;
- _walks()_;
- _flies()_;
- _reproduction()_ *(maak van deze `methode` een` if statement` die checkt of de waarde van _givesBirth_ waar of onwaar is. Bij `true` print je de tekst "Giving brith for reproduction", bij `false` de tekst "lays eggs for reproduction");
8. Maak de volgende nieuwe klassen aan:
- _Crocodile_;
- _Dolphin_;
- _Flamingo_;
- _Penguin_;
- _Shark_;
9. Je ziet nu dat alle `variabelen` uit de _Animal_ `klasse` toegepast kunnen worden voor alle `klassen` die je net hebt aangemaakt. Je kan dit oplossen door alles over te typen of te kopiëren. Echter heb je dan heel veel dubbele code in je applicatie. Dat is niet zo netjes. Maak de _Animal_ `klasse` een `Superklasse` waar geen niewe instantie van aangemaakt mag worden. Dit laatste kan je doen door de `klasse` `abstract` te maken.  
10. `Extent` nu de `Superklasse` in alle andere `klassen`. 
11. Als je nu een `constructor` maakt in elk van de dieren `klassen`, kun je deze de `attributen` meegeven van de `Superklasse`.
12. Dit maakt het mogelijk om van elke `Sub klasse` een `object` te instantiëren in de `public static void main` methode in je _Main_ `klasse`. Doe dit door bijvoorbeeld _Crocodile crocodile = new Crocodile(.....)_ erin te zetten. (zet op de puntjes de waarden van de `attributen`)
12. In de _Animal_ `klasse` had je ook `methodes` staan. Wat gebeurt er als je met een instantiatie van je _Crocodile_ `klasse`, één van deze `methodes` aanroept?
13. Nu kan je voor elk dier deze `methode` aanroepen, en hoef je niet de `methode` voor elke `klassen` weer uit te schrijven. Maar... de crocodile met de `methode` _makesSound()_ geeft hetzelfde als dolphin. Dát is wel raar, want deze klinken niet hetzelfde.
14. Laten we dit oplossen door alle `methodes` van de _Animal_ `klasse` in een `interface` te zetten. Geef deze `interface` de naam _MainFeatures_ en plaats hier alle `methodes` (Niet de `getters` en `setters`) in.
15. Omdat een `interface` alleen `abstracte methodes` verwacht geeft dit een probleem. Als we de `bodies` weghalen van de `methodes` zijn deze `abstract`. Maar kunnen we hier niet gelijk gebruik van maken. Wat wel kan is de `methode` overschrijven in de `klasse` waar je deze wilt hebben. 
16. Ga naar de _Animal_ `klasse` en plaats een `@Override` boven de bestaande `methodes`, deze mogen wel een `body` hebben, omdat deze de `abstracte methode` overschrijven. Echter als we nu de app draaien is er nog niets opgelost. 
17. Kijk eens goed naar de `methodes`, zijn er `methodes` die altijd hetzelfde kunnen teruggeven? Ja, de `methode` _sleeps()_ kan bijvoorbeeld de `string` "Zzz Zzz Zzz" printen. Dat kan voor elk dier hetzelfde zijn. Als we kijken naar de `methode` _reproduction()_ is de uitkomst ook gelijk voor elk dier. Deze laten we staan in de _Animal_ `klasse` zonder `@Override`. De andere `methodes` (excl. `getters` en `setters`) mogen uit deze `klassen` verwijderd worden. 
18. Haal deze 2 `methodes` weg uit de _MainFeatures_ `klasse`.
19.Je houdt de volgende `methodes` over in de `klasse` _MainFeatures_:
 - _makesSound()_;
 - _getsFood()_;
 - _swims()_;
 - _walking()_;
 - _flies()_.
 Deze `methodes` zijn niet voor elk dier van toepassing, maar als we een `interface` `implementeren` in een `klasse` moeten we wel alle `methodes` implementeren. Dit kan je oplossen door de laatste drie `methodes`, in een eigen `interface` te plaatsen. We kunnen namelijk meerdere `interfaces` `implementeren` in een `klasse`. 
20. Maak voor elk van de volgende `methodes` een eigen `interface`:
 - _swims()_;
 - _walking()_;
 - _flies()_;  
21. Implementeer de `interfaces` op de juiste `klassen` en geef de `methodes` hun eigen toepasselijke zin om te printen.
22. We hebben tot nu toe gebruik gemaakt van de `String` _gender_, maar eigenlijk willen we die omzetten naar een `Enumeratie` of wel een `Enum`. Dit wordt voorgedaan in de workshop bij deze opdracht.  
23. Gefeliciteerd! Je applicatie is klaar voor gebruik. Probeer vanuit je _main_ `methode` te experimenteren met wat allemaal mogelijk is en kijk of je misschien nieuwe dieren en of `methodes` kan toevoegen aan je applicatie.
