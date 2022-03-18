
[jetty]: http://eclipse.org/jetty/
[maven]: http://maven.apache.org/
[java]: https://www.oracle.com/java/index.html
[git]: https://git-scm.com/

[make]: https://www.gnu.org/software/make



NDEx Enrichment Object Model Repo ([MOVED](https://github.com/cytoscape/ndex-enrichment-rest))
============================================================

**As of release 0.8.0, classes in this repo have been moved into 
[NDEx Pathway Relevance REST Service](https://github.com/cytoscape/ndex-enrichment-rest)**


Formerly contained Java Pojo objects needed by NDEx Enrichment services



Requirements
============

* [Java][java] 11+ **(jdk to build)**


Building  
========

Build requirements:

* [Java 11+][java] JDK
* [Make][make] **(to build)**
* [Maven][maven] 3.3 or higher **(to build)** -- tested with 3.6


```Bash
# In lieu of git one can just download repo and unzip it
git clone https://github.com/cytoscape/ndex-enrichment-rest-model.git

cd ndex-enrichment-rest-model
mvn install

```

The above command will create a jar file under **target/** named 
**ndex-enrichment-rest-model-\<VERSION\>.jar** 




COPYRIGHT AND LICENSE
=====================

TODO

Acknowledgements
================

TODO

**As of release 0.8.0, classes in this repo have been moved into 
[NDEx Pathway Relevance REST Service](https://github.com/cytoscape/ndex-enrichment-rest)**
