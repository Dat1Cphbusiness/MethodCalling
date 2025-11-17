# Level 3: Void-metoder med flere parametre

### Level 3 fokuserer på:

- To parametre med samme type (int, int)
- To parametre med forskellige typer (String, int)
- Tre parametre med blandede typer
- Fire parametre (double, double, double, double)
- Vigtigheden af parameter-rækkefølge
- Blanding af literaler og variabler

## Begrebsgennemgang
Metoder kan modtage flere parametre samtidig. Når du kalder en metode med flere parametre, er det vigtigt at give argumenterne i den korrekte rækkefølge og med de korrekte datatyper. For eksempel, hvis en metode er defineret som `displayPerson(String name, int age)`, skal du først give en String og derefter et int.

---

## Givet Klasse
Tag udgangspunkt i klassen InfoDisplay. Alle metoder er allerede skrevet - de behøver kun at kalde dem fra `run()` metoden.

---

## Tips
- Argumenternes **rækkefølge** skal matche parametrenes rækkefølge i metode-signaturen
- Argumenternes **datatyper** skal matche parametrenes datatyper
- Hvis en metode kræver `(String, int)`, kan du ikke give `(int, String)`
- Brug komma `,` til at adskille flere argumenter
- Husk at tælle dine argumenter - hvis metoden har 3 parametre, skal du give 3 argumenter
- Al din kode skal placeres inde i `run()` metoden mellem tuborgklammerne `{}`

---

## Opgaver

### Opgave 3.1: To parametre med samme type
**Opgave:** Kald `printRectangle()` med bredde `10` og højde `5`.

**Forventet Output:**
```
Rectangle: 10 x 5
Area: 50
```

---

### Opgave 3.2: To parametre med forskellige typer
**Opgave:** Kald `displayPerson()` med navnet `"Emma"` og alderen `25`.

**Forventet Output:**
```
Emma is 25 years old.
```

---

### Opgave 3.3: Rækkefølge er vigtig!
**Opgave:**
1. Kald `makeGreeting()` med `"Hello"` og `"Alice"`
2. Kald `makeGreeting()` med `"Godmorgen"` og `"Bob"`
3. Kald `makeGreeting()` med `"Hi"` og `"Carol"`

**Forventet Output:**
```
Hello, Alice!
Godmorgen, Bob!
Hi, Carol!
```

---

### Opgave 3.4: Brug af variabler
**Opgave:**
1. Opret en String-variabel `titel` med værdien `"Velkommen"`
2. Opret en String-variabel `undertitel` med værdien `"til Java-kurset"`
3. Kald `createTitle()` med de to variabler

**Forventet Output:**
```
========================================
Velkommen
til Java-kurset
========================================
```

---

### Opgave 3.5: Tre parametre
**Opgave:** Kald `showProduct()` med produktnavnet `"Laptop"`, prisen `999.99` og antallet `3`.

**Forventet Output:**
```
Product: Laptop
Price: $999.99
Quantity: 3
Total: $2999.97
```

---

### Opgave 3.6: Arbejde med tal-ranges
**Opgave:**
1. Kald `printRange()` med start `1` og slut `5`
2. Kald `printRange()` med start `10` og slut `15`

**Forventet Output:**
```
Range from 1 to 5: 1 2 3 4 5 
Range from 10 to 15: 10 11 12 13 14 15 
```

---

### Opgave 3.7: Fire parametre med doubles
**Opgave:**
1. Kald `calculateDistance()` med punktet (0.0, 0.0) til punktet (3.0, 4.0)
2. Kald `calculateDistance()` med punktet (1.0, 1.0) til punktet (4.0, 5.0)

**Forventet Output:**
```
Distance from (0.0, 0.0) to (3.0, 4.0): 5.0
Distance from (1.0, 1.0) to (4.0, 5.0): 5.0
```

---

### Opgave 3.8: Blandede datatyper
**Opgave:**
1. Opret en int-variabel `dag` med værdien `17`
2. Opret en String-variabel `maaned` med værdien `"November"`
3. Opret en int-variabel `aar` med værdien `2025`
4. Kald `showDate()` med de tre variabler

**Forventet Output:**
```
Date: 17 November 2025
```

---

### Opgave 3.9: Flere kald med forskellige værdier
**Opgave:**
1. Kald `displayPerson()` tre gange med forskellige navne og aldre
2. Kald `printRectangle()` to gange med forskellige dimensioner

**Forventet Output:** (eksempel)
```
Anna is 22 years old.
Mikkel is 30 years old.
Sofie is 19 years old.
Rectangle: 8 x 6
Area: 48
Rectangle: 15 x 3
Area: 45
```

---

### Opgave 3.10: Komplet program
**Opgave:** Opret et lille program, der:
1. Opretter en titel med `"Min Butik"` og `"Produktoversigt"`
2. Viser tre produkter med `showProduct()`:
    - "Keyboard", pris 49.99, antal 5
    - "Mouse", pris 29.99, antal 10
    - "Monitor", pris 199.99, antal 2
3. Opretter en ny titel med `"Kunde Information"` og `"Aktive kunder"`
4. Viser to personer med `displayPerson()`

**Forventet Output:** (eksempel)
```
========================================
Min Butik
Produktoversigt
========================================
Product: Keyboard
Price: $49.99
Quantity: 5
Total: $249.95
Product: Mouse
Price: $29.99
Quantity: 10
Total: $299.9
Product: Monitor
Price: $199.99
Quantity: 2
Total: $399.98
========================================
Kunde Information
Aktive kunder
========================================
Lars is 45 years old.
Maria is 32 years old.
```

