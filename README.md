# gwt-material-archetype
Archetype for a web application that uses GWT Material Design

# Current Version - 2.0-rc2
### Includes
- Updated GWT Version to 2.8.0
- Updated GWTP Version to 1.5.3
- Updated GMD Version to 2.0-rc2
- Added GMD Table 1.0-rc2

# Usage:
1. Download the archetype
2. From the download folder, install the archetype in your local Maven repo by running this command: <code>mvn clean install</code>
3. Create a new project by running the following command in a folder of your choice: <code>mvn archetype:generate -DarchetypeGroupId=com.github.gwtmaterialdesign -DarchetypeArtifactId=gwt-material-archetype -DarchetypeVersion=2.0-rc2</code>
4. Follow the prompts

That's it!

# Test/Run
<code>mvn clean install</code>

<code>mvn gwt:run</code>

This should open the `GWT Development Mode` window from which you can select `Launch Default Browser` to open the sample application in a browser.
