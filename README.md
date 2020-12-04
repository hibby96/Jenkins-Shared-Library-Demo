# Jenkins-Shared-Library-Demo
Configure your Jenkins instance to look here for a shared library, basic tutorial here: https://tomd.xyz/jenkins-shared-library/

Configure a Jenkins job with the following pipeline:
```
@Library('Jenkins-Shared-Library-Demo')_
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                step1()
                step2()
                // Alternatively, provide an argument for a custom name:
                // step1 'Will'
            }
        }
    }
}
```
