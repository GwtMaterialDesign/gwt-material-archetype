var splashcontainer = document.createElement('div');
splashcontainer.id = "splashscreen";

var splashContent = document.createElement('div');

var image = document.createElement("img");
image.src = "https://gwtmaterialdesign.github.io/gmd-core-demo/launcher-icons/launcher2x.png";

var title = document.createElement("span");
title.className = "title";
title.innerHTML = "${projectName}";

var description = document.createElement("span");
description.className = "description";
description.innerHTML = "Some description";

var progress = document.createElement("div");
progress.className = "progress";

var progressFill = document.createElement("div");
progressFill.className = "indeterminate";
progress.append(progressFill);

splashContent.append(image);
splashContent.append(title);
splashContent.append(description);
splashContent.append(progress);

splashcontainer.append(splashContent);
document.body.appendChild(splashcontainer);