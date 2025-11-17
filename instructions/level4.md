# Level 4: Void-metoder med blandede datatyper

## Level 4 fokuserer på:
- Kalde metoder med flere parametre af forskellige datatyper
- Arbejde med boolean-parametre (true/false)
- Arbejde med char-parametre (enkelte tegn)
- Kombinere int, double, String, boolean og char i samme metodekald
- Forstå vigtigheden af korrekt type-matching
- Håndtere komplekse metode-signaturer med 4+ parametre

---

## Begrebsgennemgang
I dette level skal du arbejde med metoder, der kombinerer mange forskellige datatyper. Du skal være særlig opmærksom på:
- **boolean**: kan kun være `true` eller `false` (ingen anførselstegn)
- **char**: et enkelt tegn i enkelte anførselstegn, f.eks. `'A'` eller `'*'`
- **int**: heltal uden decimaler
- **double**: tal med decimaler
- **String**: tekst i dobbelte anførselstegn

**Tag udgangspunkt i klassen DataProcessor.**


---

## Tips
- **boolean**: brug kun `true` eller `false` (små bogstaver, ingen anførselstegn)
- **char**: brug enkelte anførselstegn `'A'` ikke dobbelte `"A"`
- **String**: brug dobbelte anførselstegn `"tekst"`
- Vær meget præcis med rækkefølgen af parametre
- Hvis du får en fejl om "incompatible types", tjek om du bruger den rigtige datatype
- Husk at char er ét tegn, String kan være mange tegn
- Al din kode skal placeres inde i `run()` metoden mellem tuborgklammerne `{}`

---

## Opgaver

### Opgave 4.1: Boolean-parameter
**Opgave:** Kald `formatMessage()` to gange:
1. Med beskeden `"hello"`, antal `2`, og `true` (uppercase)
2. Med beskeden `"hello"`, antal `2`, og `false` (lowercase)

**Forventet Output:**
```
HELLO
HELLO
hello
hello
```

---

### Opgave 4.2: Char-parameter
**Opgave:** Kald `createBox()` med indholdet `"Java"`, bredde `10`, og border-tegnet `'*'`.

**Forventet Output:**
```
**********
* Java *
**********
```

---

### Opgave 4.3: Fire forskellige datatyper
**Opgave:** Kald `calculatePrice()` med:
- Base price: `99.99`
- Quantity: `3`
- Discount: `true`
- Tax rate: `0.25`

**Forventet Output:**
```
Base price: $99.99
Quantity: 3
Discount applied: true
Tax rate: 25.0%
Total: $337.4662500000000
```

---

### Opgave 4.4: Arbejde med char og boolean
**Opgave:**
1. Kald `printPattern()` med symbol `'#'`, 4 rækker, 6 kolonner, og `true` (filled)
2. Kald `printPattern()` med symbol `'O'`, 4 rækker, 6 kolonner, og `false` (hollow)

**Forventet Output:**
```
# # # # # # 
# # # # # # 
# # # # # # 
# # # # # # 
O O O O O O 
O         O 
O         O 
O O O O O O 
```

---

### Opgave 4.5: Brug af variabler med blandede typer
**Opgave:**
1. Opret variablerne: `String bruger = "Anna"`, `int niveau = 5`, `double fremgang = 78.5`, `boolean aktiv = true`
2. Kald `showStatus()` med disse fire variabler

**Forventet Output:**
```
User: Anna
Level: 5
Progress: 78.5%
Status: Active
---
```

---

### Opgave 4.6: Char-parametre til konvertering
**Opgave:**
1. Kald `convertTemperature()` med `100.0`, `'C'`, `'F'`
2. Kald `convertTemperature()` med `32.0`, `'F'`, `'C'`
3. Kald `convertTemperature()` med `273.15`, `'K'`, `'C'`

**Forventet Output:**
```
100.0°C = 212.0°F
32.0°F = 0.0°C
273.15°K = 0.0°C
```

---

### Opgave 4.7: Kompleks kombination
**Opgave:** Kald `displayScore()` tre gange:
1. Spiller "Emma", score 1500, accuracy 95.5, high score `true`
2. Spiller "Mikkel", score 1200, accuracy 88.0, high score `false`
3. Opret variabler for den tredje spiller og kald metoden med variablerne

**Forventet Output:** (eksempel)
```
=== SCORE REPORT ===
Player: Emma
Score: 1500
Accuracy: 95.5%
🏆 NEW HIGH SCORE! 🏆
====================
=== SCORE REPORT ===
Player: Mikkel
Score: 1200
Accuracy: 88.0%
====================
=== SCORE REPORT ===
Player: Lars
Score: 1800
Accuracy: 92.3%
🏆 NEW HIGH SCORE! 🏆
====================
```

---

### Opgave 4.8: Tabel med headers
**Opgave:**
1. Kald `makeTable()` med 3 rækker, 3 kolonner, separator `'|'`, headers `true`
2. Kald `makeTable()` med 2 rækker, 4 kolonner, separator `'-'`, headers `false`

**Forventet Output:**
```
Col1 | Col2 | Col3 | 
||||||||||||||||||||||||
R1C1  | R1C2  | R1C3  | 
R2C1  | R2C2  | R2C3  | 
R3C1  | R3C2  | R3C3  | 
R1C1  - R1C2  - R1C3  - R1C4  - 
R2C1  - R2C2  - R2C3  - R2C4  - 
```

---

### Opgave 4.9: Forskellige borders
**Opgave:** Opret tre bokse med `createBox()`:
1. Indhold "Hello", bredde 12, border `'='`
2. Indhold "World", bredde 12, border `'#'`
3. Indhold "Java", bredde 12, border `'+'`

**Forventet Output:**
```
============
= Hello =
============
############
# World #
############
++++++++++++
+ Java +
++++++++++++
```

---

### Opgave 4.10: Komplet anvendelse
**Opgave:** Opret et lille program der:
1. Viser en boks med teksten "Game Stats" (vælg selv bredde og border)
2. Viser status for to spillere med `showStatus()`
3. Viser score for de samme to spillere med `displayScore()`
4. Printer et mønster med `printPattern()` (vælg selv parametre)

**Forventet Output:** (dit eget design)

