node('master') {
	stage ('checkout code'){
		checkout scm
	}
	
	stage ('Build'){
		sh "mvn clean install -Dmaven.test.skip=true"
	}

	stage ('Test Cases Execution'){
		sh "mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Pcoverage-per-test"
	}

	stage ('Sonar Analysis'){
		sh 'mvn sonar:sonar -Dsonar.host.url=http://localhost:9090 -Dsonar.login=89cbf1e129ee5be1f9285762551832d4a624b90e'
	}

	stage ('Archive Artifacts'){
		//archiveArtifacts artifacts: 'target/*.war'
	}
	
	stage ('Deployment'){
		//sh 'cp target/*.war /opt/tomcat8/webapps'
	}
	stage ('Notification'){
		//slackSend color: 'good', message: 'Deployment Sucessful'
		emailext (
		      subject: "Job Completed",
		      body: "Jenkins Pipeline Job for Maven Build got completed !!!",
		      to: "sathy2812@gmail.com"
		    )
	}
}
