#!/usr/bin/env groovy
def call(String name = 'human') {
   // println "If you're seeing this, it means that the unapproved method worked just fine."
   // println currentBuild.getDurationString()
   getLastBuild()
}
