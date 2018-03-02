properties([disableConcurrentBuilds(), buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10')), pipelineTriggers([pollSCM('H/2 * * * *')])])
/*
* #######################################################################
* # Copyright (c) 2017 ACID - Altran B.V.                               #
* # All Rights Reserved                                                 #
* #                                                                     #
* # MDE-Skeleton is protected by copyright and distributed under       #
* # licenses restricting copying, distribution and decompilation.       #
* #######################################################################
*/

def buildNodeLabel = env.BUILD_TAG
def buildNumber = env.BUILD_ID
def branchName = env.BRANCH_NAME

//Kubernetes podTemplate
podTemplate( // Open Kubernetes podTemplate parameters
    name: 'build-slave',
    label: buildNodeLabel,
    containers:[
        /* Inside container templates, we use 'ttyEnabled: true' and
         * 'command: 'cat'' to prevent the container from exiting early
         * See https://github.com/jenkinsci/kubernetes-plugin#constraints
         */
        containerTemplate(
            name: 'maven',
            image: 'registry.manatree.io/maven:0.0.1',
            workingDir: '/home/jenkins',
            alwaysPullImage: false,
            privileged: false,
            ttyEnabled: true,
            command: 'cat'),
        containerTemplate(
            name: 'acid-base',
            image: 'registry.manatree.io/acid-base:0.0.1',
            workingDir: '/home/jenkins',
            alwaysPullImage: false,
            privileged: false,
            ttyEnabled: true,
            command: 'cat')
    ]
) // Close Kubernetes podTemplate parameters
{ // Open Kubernetes podTemplate body

    node(buildNodeLabel) {
        Integer TimeOutMinutes = 20
        // define the Vault secrets and the ENV variables 
        def vaultSecretsCollection = [
           [$class: 'VaultSecret', path: 'secret/mde-artifact', secretValues: [
                [$class: 'VaultSecretValue', envVar: 'ArtifactStoreUserName', vaultKey: 'Username'],
                [$class: 'VaultSecretValue', envVar: 'ArtifactStorePassword', vaultKey: 'Password']]]
        ]

        wrap([$class: 'VaultBuildWrapper', vaultSecrets: vaultSecretsCollection]) {

                          
            sh 'rm -rf *'
            checkout scm;
           
            //give all scripts execute access
            sh 'chmod -R +x ./scripts'
            
            if(branchName == null){
                branchName = scm.branches[0].name.drop(2)
            }

            stage('build') {
                timeout(TimeOutMinutes) {
                    container('maven'){
                        sh './scripts/build.py -br ' + branchName + ' -bn ' + buildNumber + ' -tp sirius5.oxygen'
                    }
                }
            }
            stage('publish') {
                timeout(TimeOutMinutes) {
                    container('acid-base'){
                        sh './scripts/publish.py -tp sirius5.oxygen'
                    }
                }
            }
        } // Close Vault Wrapper
    } // Close node
} // Close podTemplate body
