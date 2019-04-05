# TrainingProject4
VehicleProgram, 09/2018, Intellij IDEA

Följande uppgifter hänger ihop, och har alla med arv att göra:
Uppgift 1
En kund behöver ett program för att ta hand om olika fordon. Fordonen som avses är
bil, båt, flygplan, helikopter och motorcykel. Gör en klass för var och en av dessa och
skapa superklasser för gemensamma variabler och metoder.
● Alla fordon ska ha en vikt och ett pris.
● Alla landbaserade fordon (bil och motorcykel) ska ha en km-räknare som ökar
när man kör. Man kör m.h.a. metoden drive(int kms)
● Alla vattenbaserade (båt) ska ha en GPS-position som slumpvis ändras när man
åker med båten. Man åker m.h.a. metoden go()
● Alla flygande ska ha en höjd som ökar när man flyger (flygplan, helikopter). Man
flyger m.h.a. metoden fly(boolean isFlying). Om man skickar in false,
betyder det att man vill landa.
De klasser som är längst ner i trädet (dvs de olika fordon som beskrevs) behöver inte
ha något eget, utan ska bara vara subklasser till lämpliga klasser för gemensamma
saker.
Uppgift 2
Gör tre klasser: köpare, säljare, fordonshandlare. Varje klass ska ha namn, ålder, jobb
och pengar på banken. Hur ska man bäst göra detta?
Uppgift 3
Gör nu så att varje fordon kan ha en ägare.
Uppgift 4
Gör metoder till fordonshandlaren så ett fordon kan byta ägare. Ett fordon ska inte bara
byta ägare, utan säljaren ska få pengar av köparen och fordonshandlaren ska få sin
andel. Säljaren ska bara kunna bli av med ett fordon och en köpare ska bara kunna få
ett.
Uppgift 5
Skapa upp 3 köpare och 2 säljare och 1 fordonshandlare. Skapa upp ett flygplan, en
helikopter och en bil. 1 säljare ska äga flygplanet och helikoptern medan bilen ska ägas
av den andre.
Låt nu köparna köpa varsitt fordon. Skriv ut transaktionerna på skärmen.
