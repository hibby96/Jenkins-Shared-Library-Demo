# Jenkins-Shared-Library-Demo
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