


# Introduktion til Metoder i Java

## Hvad er en metode?
En metode er en blok af kode, der udfører en specifik opgave. Metoder hjælper os med at organisere vores kode, undgå gentagelser, og gøre programmer nemmere at læse og vedligeholde.

## Sådan kalder du en metode
For at bruge en metode skal du "kalde" den ved at skrive dens navn efterfulgt af parenteser:
```java
sayHello();  // Metode uden parametre
```

## Metoder med parametre
Mange metoder har brug for information for at fungere. Denne information kaldes **parametre** (eller **argumenter** når du sender dem til metoden):
```java
greet("Anna");                    // Én parameter
displayPerson("Bob", 25);         // To parametre
showProduct("Laptop", 999.99, 3); // Tre parametre
```

### Datatyper er vigtige
Når du kalder en metode, skal dine argumenter matche metodens parametre:
- **String**: tekst i dobbelte anførselstegn `"tekst"`
- **int**: heltal uden decimaler `42`
- **double**: tal med decimaler `3.14`
- **boolean**: kun `true` eller `false`
- **char**: ét enkelt tegn i enkelte anførselstegn `'A'`

### Rækkefølge betyder noget
Hvis en metode er defineret som `displayPerson(String name, int age)`, skal du give en String først og derefter et int:
```java
displayPerson("Maria", 30);  // ✓ Korrekt
displayPerson(30, "Maria");  // ✗ Forkert rækkefølge
```

## Metoder med returværdier
Nogle metoder giver dig en værdi tilbage. Disse kan du:

**Printe direkte:**
```java
System.out.println(add(5, 3));  // Printer: 8
```

**Gemme i en variabel:**
```java
int sum = add(5, 3);
System.out.println(sum);  // Printer: 8
```

**Bruge i beregninger:**
```java
int total = add(5, 3) + multiply(2, 4);  // total = 8 + 8 = 16
```

## Progressionen gennem øvelserne
I disse øvelser vil du arbejde gennem en gradvis progression:

1. **Level 1**: Kalde simple metoder uden parametre
2. **Level 2**: Kalde metoder med én parameter af forskellige typer
3. **Level 3**: Kalde metoder med flere parametre
4. **Level 4**: Arbejde med blandede datatyper (boolean, char, int, double, String)
5. **Level 5**: Arbejde med metoder der returnerer værdier

## Tips
- Læs fejlmeddelelser omhyggeligt - de fortæller dig ofte præcis, hvad der er galt
- Husk parenteser: `metodeNavn()` ikke bare `metodeNavn`
- Husk semikolon `;` i slutningen af hver linje
- Brug komma `,` til at adskille flere argumenter
- Match altid datatyper mellem dine argumenter og metodens parametre
  - Hvis en metode kræver en String, skal du give den tekst fx. "hej". Eller en variabel du ved har datatypen String.
  - Hvis en metode kræver et int (heltal), skal du give den et int
- Du kan oprette variabler først og derefter bruge dem som parametre i metodekald.




## Hvor skriver jeg min kode?
I alle øvelserne skriver du din kode inde i `run()` metoden mellem tuborgklammerne `{}`. Alle metoderne du skal kalde er allerede skrevet for dig - du skal bare kalde dem i den rigtige rækkefølge med de rigtige argumenter.

God fornøjelse med øvelserne! 🚀


