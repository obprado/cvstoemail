## How to build

Make sure maven & Java JDK 8 are installed and accessible from the command line.

mvn clean verify

## How to run

Run the build. Make sure Java JRE is in accessible from the command line.

java -jar /path/to/target/cvstoemail-DEV-SNAPSHOT-jar.jar <pathToFileWithRecipients>
## Libraries used

jUnit: it's basic for testing

assertJ: I'm used to asserting with it