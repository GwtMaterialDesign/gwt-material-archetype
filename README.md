# gwt-material-archetype
Archetype for a web application that uses GWT Material Design

# Current Version - 2.0-rc6
### Includes
- Updated GWT Version to 2.8.1
- Updated GWTP Version to 1.5.3
- Updated GMD Version to 2.0-rc6

# Usage:
1. Download the archetype
2. From the download folder, install the archetype in your local Maven repo by running this command:

        mvn clean install archetype:update-local-catalog

3. Create a new project by running the following command in a folder of your choice:

        mvn archetype:generate -DarchetypeGroupId=com.github.gwtmaterialdesign \
          -DarchetypeArtifactId=gwt-material-archetype \
          -DarchetypeVersion=2.0-rc5

4. Follow the prompts. That's it!

5. Optionally you could specify all the parameters in the command line instead of following the prompts:

        mvn archetype:generate -DarchetypeGroupId=com.github.gwtmaterialdesign \
          -DarchetypeArtifactId=gwt-material-archetype \
          -DarchetypeVersion=2.0-rc5 \
          -DgroupId=your.company.domain \
          -Dpackage=your.company.domain.myapp \
          -DartifactId=your-project \
          -DprojectName=YourProjectName \
          -DmoduleName=myapp

# Test/Run

Executing the next line, it should open the `GWT Development Mode` window from which you can select `Launch Default Browser` to open the sample application in a browser.

      mvn gwt:devmode

# Package

The following command should leave your application `.war` file in the `target` folder. It's ready to deploy in your java server:

      mvn clean package
