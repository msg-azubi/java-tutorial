# Read me

Diese Datei (README.md) beschreibt das  _java-tutorial_ Projekt, dass über URL
https://github.com/msg-azubi/java-tutorial auf der Plattform _GitHub_ allgemein zugänglich ist.

## Über die Plattform _GitHub_ und die automatische `README.md` Formatierung

Die Plattform _GitHub_ ist eine Online Plattform für die Veröffentlichung von Git-Repositories.
Auf der Plattform ist es üblich, dass jedes Repository im Wurzelverzeichnis (engl. _root directory_)
des Projekts eine `README.md` hat.

Diese Datei`README.md` hat eine Dateiendung (`.md`). Damit erkennt die Plattform, dass der Inhalt
der Datei ASCII-Code und Texte mittels der _MarkDown_ Syntax formatierbar ist. 
_GitHub_ nutzt diese Information, um den Inhalt formatiert darzustellen.

Die _GitHub_
zeigt unter https://github.com/msg-azubi/java-tutorial eine formatierte Ausgabe  der `README.md` Datei.
Die unformatierte Ausgabe der `README.md` Datei zeigt _GitHub_ über den Link 
https://raw.githubusercontent.com/msg-azubi/java-tutorial/master/README.md.

Information zu MarkDown bieten folgende Seiten:
-  [Mastering MarkDown](https://guides.github.com/features/mastering-markdown/) veröffentlicht auf
   [guides.github.com](https://guides.github.com). (englisch)
-  [markdown.de/](https://markdown.de/) (deutsch)
-  [Formatieren von Text mit Markdown](https://support.zendesk.com/hc/de/articles/203691016-Formatieren-von-Text-mit-Markdown)
   veröffentlicht auf _support.zendesk.com_
   
 
##  Über die Struktur des  Projekt  `java-tutorial`

- Das Tutorial gliedert sich in Lerneinheiten (engl _units_).
  
  Dementsprechend gibt es einen Ordner `units`, der alle Lerneinheiten als Unterordner enthält.
  Unter IntelliJ gilt ist der Ordner `units` in der _Project Structure_ als ein _Module_ integriert.
  
  IntelliJ Module haben allgemein einen Unterordner `src`, der vor allem den Code zum Kompilieren enthält,
  so ist es auch hier. 
  
 
  - Jede Lernunit, `unit_XY`, enthält eine Datei `Lernziele.adoc, 
    die über die _Lernziele_ der Unit inform
  
    Das ist eine Datei im _AsciiDoc_-Format, diese kann wird über
    das IntelliJ-Plugin _AsciiDoc_ formatiert angesehen werden.
    
    
  - Der Code zu den Lernunits ist im Ordner `units/src` für jede Unit abgelegt.
    
        unit_xy/excercise_z/code
    
    Für IntelliJ ist der Ordner `units/src` die  _Source Root_ des Modules `units`.
    (siehe IntelliJ Help: [Folder Categories](https://www.jetbrains.com/help/idea/2019.2/content-roots.html#folder-categories) )
          
## Wesentlichen Vorbereitungen zum Arbeiten mit dem `java-tutorial` Projekt

1. Git als VCS installieren.
2. IntelliJ als IDE installieren.

   a. das IntelliJ-Plugin für _AsciiDoc_ installieren
   
Das sind die wesentlichen Voraussetzungen.   








