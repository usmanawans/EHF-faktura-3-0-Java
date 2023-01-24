# EHF Faktura 3.0 format

Denne applikasjonen skal generere PEPPOL BIS XML-format i GUI.


| Status | Oppgaver                                          |
|--------|---------------------------------------------------|
| `DONE` | Lage **PEPPOL BIS** modeller                      |
| `TODO` | Lage Httpklient mot **Brønnøysundregistrene API** |
| `TODO` | Lage to **skjemaer** på frontend                  |
| `TODO` | Parse opplysninger til **PEPPOL BIS XML**-format  |

```bash
Spring Boot 3
React frontend
OpenJDK 17
Maven
```

```bash
# Kjør for å bygge war-fil
mvn clean install
```


### Hva er EHF?

Den norske varianten av det europeiske PEPPOL BIS-formatet fikk navnet EHF, eller elektronisk handelsformat, og er statens standardformat for elektroniske handelsdokumenter. I 2012, altså fire år etter PEPPOL-prosjektet startet opp i EU, ble det satt krav om at fakturaer og kreditnotaer til statlige virksomheter skulle sendes med standard EHF-format i Norge.

Fra og med 1. januar 2015 ble også alle norske kommuner pålagt å kunne ta imot EHF-fakturaer. I dag har mange kommuner og bedrifter gått over til EHF, og godtar ikke lenger fakturaer på papir.

For å forstå hvor vi er i dag, med EHF og PEPPOL BIS 3.0, er det nødvendig med en innføring i disse to begrepene, men hvor er vi egentlig i dag?


### EHF vs. PEPPOL BIS 3.0

Fra og med 1. januar 2019, kom et nytt obligatorisk EHF-format som gjelder i hele EU. Dette formatet er i EU kjent som Peppol BIS 3.0, men blir i Norge betegnet som EHF 3.0. I motsetning til tidligere, der EHF var en norsk variant av det europeiske PEPPOL BIS-formatet, er det nå ikke lenger noe særnorsk format.

### Referanser
* [PEPPOL BIS 3.0 – hva er det?](https://blog.compello.com/no/peppol-bis-3.0-hva-er-det-1)