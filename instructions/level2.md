# Level 2: Void-metoder med én parameter

## Begrebsgennemgang
Metoder kan modtage inputværdier kaldet parametre. Når du kalder en metode med en parameter, skal du angive en værdi (kaldet et argument), der matcher parameterens datatype. Du kan enten give en literal værdi (som `5` eller `"Hej"`) eller en variabel.

---

## Givet Klasse
Tag udgangspunkt i klassen MessageMaker. Alle metoder er allerede skrevet - de behøver kun at kalde dem fra `run()` metoden.

---

## Opgaver

### Opgave 2.1: Simpel String-parameter med literal
**Opgave:** Kald `greet()` metoden og send dit eget navn som en string-literal.

**Forventet Output:**
```
Hello, [DitNavn]!
```

---

### Opgave 2.2: Simpel Integer-parameter med literal
**Opgave:** Kald `printNumber()` metoden tre gange med forskellige tal: 42, 100 og -5.

**Forventet Output:**
```
The number is: 42
The number is: 100
The number is: -5
```

---

### Opgave 2.3: Brug af variabler som argumenter
**Opgave:** 
1. Opret en String-variabel kaldet `studentName` og tildel den værdien `"Alice"`
2. Opret en int-variabel kaldet `favoriteNumber` og tildel den værdien `7`
3. Kald `greet()` med `studentName` variablen
4. Kald `printNumber()` med `favoriteNumber` variablen

**Forventet Output:**
```
Hello, Alice!
The number is: 7
```

---

### Opgave 2.4: Udforskning af forskellige datatyper
**Opgave:** 
1. Kald `showPrice()` med den literale værdi `19.99`
2. Opret en double-variabel kaldet `total` med værdien `45.50` og kald `showPrice()` med den
3. Kald `repeatWord()` med den literale string `"Java"`

**Forventet Output:**
```
Price: $19.99
Price: $45.5
Java Java Java
```

---

### Opgave 2.5: Samme metode, forskellige argumenter
**Opgave:** Kald `greet()` metoden fire gange, hver gang med et forskelligt navn: "Bob", "Carol", "David" og "Emma". Brug en blanding af literale værdier og variabler (mindst én af hver).

**Forventet Output:**
```
Hello, Bob!
Hello, Carol!
Hello, David!
Hello, Emma!
```

---

### Opgave 2.6: Metode med mere kompleks adfærd
**Opgave:** 
1. Kald `countdown()` med værdien `5`
2. Kald `countdown()` med værdien `3`

**Forventet Output:**
```
Counting down from 5:
5
4
3
2
1
0
Counting down from 3:
3
2
1
0
```

---

### Opgave 2.7: Arbejde med Strings
**Opgave:** 
1. Opret en String-variabel kaldet `occasion` med værdien `"Birthday"`
2. Kald `celebrate()` med `occasion`
3. Kald `celebrate()` med den literale string `"Graduation"`
4. Kald `repeatWord()` med `"Hooray"`

**Forventet Output:**
```
🎉 Celebrating: Birthday 🎉
🎉 Celebrating: Graduation 🎉
Hooray Hooray Hooray
```

---

### Opgave 2.8: Kombination af alt
**Opgave:** Opret et lille program, der:
1. Opretter en String-variabel `userName` med dit navn
2. Opretter en int-variabel `age` med din alder
3. Opretter en double-variabel `lunch` med værdien `12.75`
4. Hilser på brugeren ved at kalde `greet()` med `userName`
5. Viser alderen ved at kalde `printNumber()` med `age`
6. Viser frokostprisen ved at kalde `showPrice()` med `lunch`
7. Gentager ordet "coding" ved hjælp af `repeatWord()`
8. Fejrer "Learning Java" ved hjælp af `celebrate()`

**Forventet Output:** (eksempel)
```
Hello, Maria!
The number is: 20
Price: $12.75
coding coding coding
🎉 Celebrating: Learning Java 🎉
```

---

## Tips til Studerende
- Sørg for at datatyperne på dit argument matcher parametertypen (String til String, int til int, osv.)
- Husk at sætte anførselstegn omkring String-literaler: `"sådan her"`
- Sæt ikke anførselstegn omkring tal: `42` ikke `"42"`
- Variabelnavne skal ikke have anførselstegn: `greet(mitNavn)` ikke `greet("mitNavn")`
- Al din kode skal placeres inde i `run()` metoden mellem tuborgklammerne `{}`
