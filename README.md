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

- mvn clean test

🤖 Jenkins CI
Projekt został zintegrowany z Jenkins CI:

- Automatyczne uruchamianie testów po każdym git pull
- Możliwość rozszerzenia o raporty (Allure, JUnit XML)
- Konfiguracja lokalna Jenkinsfile / GUI (Build + Test)

🧠 Czego się nauczyłem?
Jak konfigurować testy Selenium z Mavenem

- Jak integrować projekt z Jenkins CI
- Jak pisać czytelne i stabilne testy UI

Rezultat:

C:\Users\Daniel\IdeaProjects\SeleniumJenkinsDemo>mvn clean test
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< pl.demo:SeleniumJenkinsDemo >---------------------
[INFO] Building SeleniumJenkinsDemo 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ SeleniumJenkinsDemo ---
[INFO] Deleting C:\Users\Daniel\IdeaProjects\SeleniumJenkinsDemo\target
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ SeleniumJenkinsDemo ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Daniel\IdeaProjects\SeleniumJenkinsDemo\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ SeleniumJenkinsDemo ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ SeleniumJenkinsDemo ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource from src\test\resources to target\test-classes
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ SeleniumJenkinsDemo ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 2 source files with javac [debug target 21] to target\test-classes
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ SeleniumJenkinsDemo ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running SimpleTest
kwi 29, 2025 4:30:37 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 135
kwi 29, 2025 4:30:37 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 135.0.7049.115. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.17.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
Tytuł strony: Google
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.376 s -- in SimpleTest
[INFO] Running WikipediaSearchTest
kwi 29, 2025 4:30:40 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 135
kwi 29, 2025 4:30:40 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 135.0.7049.115. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.17.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.495 s -- in WikipediaSearchTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.167 s
[INFO] Finished at: 2025-04-29T16:30:43+02:00
[INFO] ------------------------------------------------------------------------



