# Level 1: Void-metoder uden parametre

## Begrebsgennemgang
Metoder er kodeblokke, der udfører specifikke opgaver. For at bruge en metode skal du "kalde" den ved at skrive dens navn efterfulgt af parenteser `()`. I dette level vil du øve dig i at kalde metoder, der ikke kræver nogen inputværdier.

---

## Givet Klasse
Studerende skal bruge denne klasse. Alle metoder er allerede skrevet - de behøver kun at kalde dem fra `run()` metoden.

```java
public class Robot {
    
    private void sayHello() {
        System.out.println("Hello! I am a robot.");
    }
    
    private void drawLine() {
        System.out.println("====================");
    }
    
    private void beep() {
        System.out.println("*BEEP*");
    }
    
    private void introduce() {
        System.out.println("My name is RoboHelper 3000.");
    }
    
    private void showBattery() {
        System.out.println("Battery level: 100%");
    }
    
    private void wave() {
        System.out.println("  \\o/");
        System.out.println("   |");
        System.out.println("  / \\");
    }
    
    // Studerende skal skrive deres metodekald i run()
    public void run() {
        // Din kode her
    }
}
```

---

## Opgaver

### Opgave 1.1: Dit første metodekald
**Opgave:** Kald `sayHello()` metoden én gang.

**Forventet Output:**
```
Hello! I am a robot.
```

---

### Opgave 1.2: Multiple kald
**Opgave:** Kald `beep()` metoden tre gange.

**Forventet Output:**
```
*BEEP*
*BEEP*
*BEEP*
```

---

### Opgave 1.3: Rækkefølge er vigtig
**Opgave:** Kald disse metoder i præcis denne rækkefølge:
1. `sayHello()`
2. `introduce()`
3. `showBattery()`

**Forventet Output:**
```
Hello! I am a robot.
My name is RoboHelper 3000.
Battery level: 100%
```

---

### Opgave 1.4: Brug af samme metode flere gange
**Opgave:** 
1. Kald `drawLine()`
2. Kald `sayHello()`
3. Kald `drawLine()` igen

**Forventet Output:**
```
====================
Hello! I am a robot.
====================
```

---

### Opgave 1.5: Oprettelse af et mønster
**Opgave:** Opret dette mønster ved at kalde de relevante metoder:
- Beep én gang
- Tegn en linje
- Beep én gang
- Tegn en linje
- Beep én gang

**Forventet Output:**
```
*BEEP*
====================
*BEEP*
====================
*BEEP*
```

---

### Opgave 1.6: Bygning af en sekvens
**Opgave:** Få robotten til at udføre en hilsesekvens:
1. Tegn en linje
2. Sig hallo
3. Præsenter sig selv
4. Vink
5. Tegn en linje

**Forventet Output:**
```
====================
Hello! I am a robot.
My name is RoboHelper 3000.
  \o/
   |
  / \
====================
```

---

### Opgave 1.7: Kompleks rutine
**Opgave:** Opret en robot-opstartsrutine:
1. Beep to gange
2. Tegn en linje
3. Sig hallo
4. Præsenter
5. Vis batteriniveau
6. Vink
7. Tegn en linje
8. Beep én gang

**Forventet Output:**
```
*BEEP*
*BEEP*
====================
Hello! I am a robot.
My name is RoboHelper 3000.
Battery level: 100%
  \o/
   |
  / \
====================
*BEEP*
```

---

## Tips til Studerende
- Metodekald skal inkludere parenteser: `sayHello()` ikke `sayHello`
- Hvert metodekald skal være på sin egen linje
- Metoder udføres i den rækkefølge, du kalder dem (oppefra og ned)
- Du kan kalde den samme metode så mange gange, du har brug for
- Al din kode skal placeres inde i `run()` metoden mellem tuborgklammerne `{}`
