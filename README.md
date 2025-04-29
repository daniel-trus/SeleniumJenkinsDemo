# 🔎 Selenium + Maven + Jenkins CI | Wikipedia Test Automation

## 🧪 Opis projektu

Ten projekt demonstruje prosty, ale w pełni funkcjonalny test automatyczny wykonany przy użyciu:
- **Java + Maven**
- **Selenium WebDriver**
- **JUnit**
- **Jenkins CI**
- **Git + GitHub**

Test sprawdza, czy po wyszukaniu frazy _"Selenium (software)"_ na stronie Wikipedia, użytkownik zostanie przeniesiony do odpowiedniego artykułu.

## ⚙️ Technologie

| Narzędzie          | Wersja       | Opis                               |
|--------------------|--------------|------------------------------------|
| Java               | 22+          | Język programowania                |
| Maven              | 3.x          | System budowania projektu          |
| Selenium           | 4.17         | Automatyzacja przeglądarki         |
| JUnit              | 5            | Framework testowy                  |
| Jenkins            | 2.x          | Continuous Integration             |
| Git + GitHub       | -            | Kontrola wersji i hosting kodu     |
| ChromeDriver       | 135.x        | Sterownik do przeglądarki Chrome   |

## 🧾 Scenariusz testowy

1. Wejdź na stronę https://www.wikipedia.org
2. Wpisz "Selenium (software)" w pole wyszukiwania
3. Kliknij przycisk "Search"
4. Sprawdź, czy tytuł strony to: `Selenium (software) – Wikipedia`

## 🏃 Jak uruchomić test lokalnie?

1. Sklonuj repozytorium:
   ```bash
   git clone https://github.com/twoj-login/test-automation-selenium.git
   cd test-automation-selenium

Upewnij się, że masz zainstalowaną Javę, Mavena i odpowiedni ChromeDriver.

Uruchom test:

bash
Kopiuj
Edytuj
mvn clean test


🤖 Jenkins CI
Projekt został zintegrowany z Jenkins CI:

Automatyczne uruchamianie testów po każdym git pull

Możliwość rozszerzenia o raporty (Allure, JUnit XML)

Konfiguracja lokalna Jenkinsfile / GUI (Build + Test)

🧠 Czego się nauczyłem?
Jak konfigurować testy Selenium z Mavenem

Jak integrować projekt z Jenkins CI

Jak pisać czytelne i stabilne testy UI

Jak tworzyć projekt rekrutacyjny pokazujący realne umiejętności




