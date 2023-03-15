# sheep counter

This repository is for the training purposes. Application that is built runs for long time, and echoes sheep count counted by application. it demonstrated functionality of application that is runing for long time


Repository also contains unitests, however, tests have no interenal functionality, just pass in any case, which is fine for demonstration pipeline

Pipelines are located in Jenkins directory

CI Pipelines:
  - JenkinsNative - this pipeline makes standard maven build. 
  
CD Pipelines:
  - JenkinsCD - this pipeline is triggered by JenkinsNative, and at the end, it runs sheep-counter for a long time. when pipeline runs next time, it checks if sheep-counter from previous run is still running, and if that is the case, it terminates it. This simulates long running processing, where you run processing on higher amount of data, and in case of processing you need to process unprocessed data with new code immidiatelly. Output of processing is outputed to jenkins log, so you can watch it oon jenkins build for CD pipeline
  
STOP Pipeline:
  - JenkinsSTOP - this pipeline is very simple. it stops run of JenkinsCD pipeline. it is useful for operator who is monitoring output of processing running from JenkinsCD pipeline, and needs to terminate job without access to dsystem ewhere artifact is deployed

