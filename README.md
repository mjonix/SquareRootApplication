# Aprašymas

Ši aplikacija skirta sveikojo skaičiaus šaknies apskaičiavimui. Parametras {x} (skaičius, kurio šaknį norima apskaičiuoti) yra
paduodamas per URL adresą naršyklėje formatu http://localhost:8080/{x}. Atsidariusiame puslapyje pateikiamas rezultatas,
gautas panaudojant Niutono metodą. Jeigu įvedamas neteisingas URL adresas, arba paduodamas parametras nėra skaičius, sistema
grąžina klaidą 404. Paduodant neigiamą skaičių grąžinama klaida 400, nes neigiami skaičiai kvadratinių šaknų neturi.
