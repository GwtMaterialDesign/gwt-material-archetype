# gwt-material-archetype
Archetype for a web application that uses GWT Material Design

# Current Version - 2.4.0-rc2
### Includes
- Updated GWT Version to 2.9.0
- Updated JQuery Version to 3.5.1
- Updated GMD Version to  2.4.0-rc2

# Usage:
1. Download the archetype
2. From the download folder, install the archetype in your local Maven repo by running this command: <code>mvn clean install</code>
3. Create a new project by running the following command in a folder of your choice: <code>mvn archetype:generate -DarchetypeGroupId=com.github.gwtmaterialdesign -DarchetypeArtifactId=gwt-material-archetype -DarchetypeVersion=2.3.0</code>
4. Follow the prompts

        mvn clean install archetype:update-local-catalog

3. Create a new project by running the following command in a folder of your choice:

        mvn archetype:generate -DarchetypeGroupId=com.github.gwtmaterialdesign \
          -DarchetypeArtifactId=gwt-material-archetype \
          -DarchetypeVersion=2.4.0-rc2

4. Follow the prompts. That's it!

5. Optionally you could specify all the parameters in the command line instead of following the prompts:

        mvn archetype:generate -DarchetypeGroupId=com.github.gwtmaterialdesign \
          -DarchetypeArtifactId=gwt-material-archetype \
          -DarchetypeVersion=2.4.0-rc2 \
          -DgroupId=your.company.domain \
          -Dpackage=your.company.domain.myapp \
          -DartifactId=your-project \
          -DprojectName=YourProjectName \
          -DmoduleName=myapp
          
6. You can also generate a project from Snapshot using the code below:

        mvn archetype:generate -DarchetypeGroupId=com.github.gwtmaterialdesign 
         -DarchetypeArtifactId=gwt-material-archetype 
         -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/
         -DarchetypeVersion=2.4.0-SNAPSHOT
     
# Test/Run

Executing the next line, it should open the `GWT Development Mode` window from which you can select `Launch Default Browser` to open the sample application in a browser.

      mvn gwt:devmode

# Package

The following command should leave your application `.war` file in the `target` folder. It's ready to deploy in your java server:

      mvn clean package
