# Weather-Sensor-Abstract-Factory
Implemented the Abstract Factory design pattern in Java for a weather simulation system. Developed region-specific sensor classes and sensor factories that generate correct sensor variants (active/passive). Integrated with a provided JAR and tested using the supplied Main class to ensure correct deployment output.

Java implementation of the Abstract Factory pattern for a weather simulation platform. Factories create region-specific sensors (Mountain, Desert, Coastal) for Active and Passive deployment modes using provided interfaces and JAR utilities.

Project structure (where files go):

src/acsse/csc2a/sim/ConcreteProduct/ → all sensor classes (e.g., ActiveMountainSensor, PassiveDesertSensor)

src/acsse/csc2a/sim/ConcreteFactory/ → factory classes (e.g., ActiveFactory, PassiveFactory)

src/ → Main (provided, not modified)

lib/ → provided Sim.jar

docs/ → UML + batch file + PDFs

data/ → any runtime data (if required)

bin/ → compiled output after build

Run:
Compile with the JAR in lib, then run the provided Main class to deploy sensors.
