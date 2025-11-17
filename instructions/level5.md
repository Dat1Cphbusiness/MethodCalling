# Level 5: Metoder med returværdier

## Level 5 fokuserer på:
- Kalde metoder der returnerer værdier
- Udskrive returværdier direkte med `System.out.println()`
- Tildele returværdier til variabler
- Bruge returværdier i udtryk og beregninger
- Arbejde med forskellige returtyper (int, double, String, boolean)
- Kombinere metodekald med andre operationer

---

## Begrebsgennemgang
Indtil nu har du arbejdet med void-metoder, der udfører handlinger men ikke returnerer nogen værdi. Nu skal du arbejde med metoder der returnerer værdier. Når en metode returnerer en værdi, kan du:
1. Udskrive den direkte: `System.out.println(add(5, 3));`
2. Gemme den i en variabel: `int sum = add(5, 3);`
3. Bruge den i beregninger: `int total = add(5, 3) + 10;`

**Tag udgangspunkt i klassen Calculator.**

---

## Tips
- Når en metode returnerer en værdi, skal du enten gemme den eller bruge den med det samme
- Returtypen skal matche variablen: hvis metoden returnerer `int`, gem den i en `int`-variabel
- Du kan printe returværdier direkte: `System.out.println(add(3, 5));`
- Du kan bruge returværdier i udtryk: `int total = add(3, 5) + multiply(2, 4);`
- boolean-metoder returnerer `true` eller `false` - perfekt til if-statements
- String-metoder returnerer tekst som du kan printe eller sammensætte
- Al din kode skal placeres inde i `run()` metoden mellem tuborgklammerne `{}`

---

## Opgaver

### Opgave 5.1: Print direkte
**Opgave:** Kald `add()` med 10 og 5, og print resultatet direkte.

**Forventet Output:**
```
15
```

---

### Opgave 5.2: Gem i variabel
**Opgave:** 
1. Kald `multiply()` med 6 og 7, og gem resultatet i en int-variabel kaldet `product`
2. Print `product`

**Forventet Output:**
```
42
```

---

### Opgave 5.3: String-returværdi
**Opgave:** 
1. Kald `makeFullName()` med `"Anna"` og `"Jensen"`, print resultatet direkte
2. Kald `makeFullName()` med `"Lars"` og `"Nielsen"`, gem i en String-variabel `name`, og print variablen

**Forventet Output:**
```
Anna Jensen
Lars Nielsen
```

---

### Opgave 5.4: Boolean-returværdi
**Opgave:** 
1. Kald `isEven()` med 8 og print resultatet
2. Kald `isEven()` med 7 og print resultatet
3. Kald `isAdult()` med 20 og print resultatet
4. Kald `isAdult()` med 15 og print resultatet

**Forventet Output:**
```
true
false
true
false
```

---

### Opgave 5.5: Brug returværdi i udtryk
**Opgave:** 
1. Opret en int-variabel `sum` der indeholder resultatet af `add(10, 5)` plus 20
2. Print `sum`
3. Opret en int-variabel `result` der indeholder `multiply(3, 4)` plus `add(5, 5)`
4. Print `result`

**Forventet Output:**
```
35
22
```

---

### Opgave 5.6: Double-returværdi
**Opgave:** 
1. Kald `calculateAverage()` med 80, 90, og 100, gem i en double-variabel `average`
2. Print `average`
3. Kald `calculateArea()` med 5.5 og 3.0, print direkte

**Forventet Output:**
```
90.0
16.5
```

---

### Opgave 5.7: String-manipulation
**Opgave:** 
1. Kald `greet()` med `"Emma"` og `"morning"`, gem i en String-variabel `greeting`
2. Print `greeting`
3. Kald `repeat()` med `"Ha"` og 3, print direkte
4. Opret en String-variabel `laugh` der indeholder resultatet af `repeat("Ho", 3)` plus `"!"`
5. Print `laugh`

**Forventet Output:**
```
Good morning, Emma!
HaHaHa
HoHoHo!
```

---

### Opgave 5.8: Sammenligning med max()
**Opgave:** 
1. Kald `max()` med 15 og 23, print direkte
2. Opret tre variabler: `int a = 45`, `int b = 78`, `int c = max(a, b)`
3. Print `c`
4. Print resultatet af `max(max(10, 20), max(15, 25))` direkte (nested calls)

**Forventet Output:**
```
23
78
25
```

---

### Opgave 5.9: Arbejde med boolean i logik
**Opgave:** 
1. Opret en int-variabel `age = 17`
2. Opret en boolean-variabel `canVote = isAdult(age)`
3. Print `canVote`
4. Opret en int-variabel `number = 42`
5. Opret en boolean-variabel `inRange = isInRange(number, 1, 100)`
6. Print `inRange`

**Forventet Output:**
```
false
true
```

---

### Opgave 5.10: Kompleks String-opbygning
**Opgave:** 
1. Kald `buildMessage()` med `"Alice"`, 1, og `true`, print direkte
2. Kald `buildMessage()` med `"Bob"`, 2, og `false`, gem i en String-variabel `msg`
3. Print `msg`
4. Opret en String `fullMessage` der kombinerer `buildMessage("Carol", 3, true)` med teksten `" - Please respond immediately"`
5. Print `fullMessage`

**Forventet Output:**
```
[URGENT] Message #1 to Alice
Message #2 to Bob
[URGENT] Message #3 to Carol - Please respond immediately
```

---

### Opgave 5.11: Beregninger med returværdier
**Opgave:** 
1. Opret en double-variabel `originalPrice = 100.0`
2. Opret en double-variabel `discounted = applyDiscount(originalPrice, 20)`
3. Print `discounted`
4. Print resultatet af `applyDiscount(applyDiscount(200.0, 10), 10)` direkte (dobbelt rabat)

**Forventet Output:**
```
80.0
162.0
```

---

### Opgave 5.12: Komplet program
**Opgave:** Opret et program der:
1. Opretter variabler: `String fornavn = "Maria"`, `String efternavn = "Andersen"`, `int alder = 25`
2. Bruger `makeFullName()` til at lave det fulde navn og gem det i en variabel
3. Printer det fulde navn
4. Bruger `isAdult()` til at tjekke om personen er myndig og printer resultatet
5. Beregner et gennemsnit af tre tal (vælg selv) med `calculateAverage()` og printer det
6. Opretter en hilsen med `greet()` og printer den
7. Finder det største af to tal med `max()` og printer det

**Forventet Output:** (eksempel)
```
Maria Andersen
true
85.0
Good afternoon, Maria!
99
```

---

## Ekstra Udfordringer

### Udfordring 1: Kæd beregninger
**Opgave:** Opret en enkelt linje der beregner: `add(multiply(3, 4), multiply(5, 2))` og printer resultatet.

**Forventet Output:**
```
22
```

---

### Udfordring 2: Kompleks boolean-logik
**Opgave:** 
1. Opret en variabel `int score = 75`
2. Tjek om scoren er både i range (0-100) OG et lige tal
3. Print resultatet

**Forventet Output:**
```
false

```