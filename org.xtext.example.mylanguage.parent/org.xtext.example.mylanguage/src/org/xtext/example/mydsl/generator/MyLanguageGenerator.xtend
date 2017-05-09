/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myLanguage.BatterySent
import org.xtext.example.mydsl.myLanguage.CENTIMETER
import org.xtext.example.mydsl.myLanguage.CirclePosition
import org.xtext.example.mydsl.myLanguage.DistanceToLocationSent
import org.xtext.example.mydsl.myLanguage.DistanceToObstaclesSent
import org.xtext.example.mydsl.myLanguage.DistanceUnit
import org.xtext.example.mydsl.myLanguage.EnvironmentSent
import org.xtext.example.mydsl.myLanguage.EqualSent
import org.xtext.example.mydsl.myLanguage.Given
import org.xtext.example.mydsl.myLanguage.GreaterSent
import org.xtext.example.mydsl.myLanguage.HOUR
import org.xtext.example.mydsl.myLanguage.KILOMETER
import org.xtext.example.mydsl.myLanguage.LessSent
import org.xtext.example.mydsl.myLanguage.METER
import org.xtext.example.mydsl.myLanguage.MILLIMETER
import org.xtext.example.mydsl.myLanguage.MINUTES
import org.xtext.example.mydsl.myLanguage.MissionGoalSent
import org.xtext.example.mydsl.myLanguage.MissionRiskLevelSent
import org.xtext.example.mydsl.myLanguage.MissionStatusSent
import org.xtext.example.mydsl.myLanguage.PercentUnit
import org.xtext.example.mydsl.myLanguage.RobotDistanceSent
import org.xtext.example.mydsl.myLanguage.RobotPositionSent
import org.xtext.example.mydsl.myLanguage.RobotSpeedSent
import org.xtext.example.mydsl.myLanguage.RobotStateSent
import org.xtext.example.mydsl.myLanguage.SECONDS
import org.xtext.example.mydsl.myLanguage.SpherePosition
import org.xtext.example.mydsl.myLanguage.Statement
import org.xtext.example.mydsl.myLanguage.Test
import org.xtext.example.mydsl.myLanguage.TestFile
import org.xtext.example.mydsl.myLanguage.Then
import org.xtext.example.mydsl.myLanguage.TimeInterval
import org.xtext.example.mydsl.myLanguage.TimeUnit
import org.xtext.example.mydsl.myLanguage.When

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyLanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var name = resource.toString.split("\\.").get(resource.toString.split("\\.").length - 2).replaceAll("[^A-Za-z0-9]", "");
		var index = name.indexOf("javafeatures");
		name = name.substring(index+12);
		for (e : resource.allContents.toIterable.filter(TestFile)) {
			fsa.generateFile(name + ".java", e.compile(name))
		}
	}

	def compile(TestFile f, String name) '''
		package features;
		import java.util.ArrayList;
		import java.util.List;
		
		import com.github.drone.subb.Application;
		import com.github.drone.subb.IDrone;
		
		import SimpleTester.*;
		import Units.*;
		
		public class «name» {
			private List<Test> tests = new ArrayList<Test>();
			private IDrone drone = null;
			private Application app = null;
			
			public «name»(IDrone drone, Application app){
				this.drone = drone;
				this.app = app;
				List<Statement> stat = new ArrayList<Statement>();
				Test test;
				«FOR Test t : f.tests»
					stat = new ArrayList<Statement>();
					test = new Test("«t.name»","«t.description»", this.app);
					«FOR Statement s : t.statements»
						stat.add(«s.createStatement()»);
					«ENDFOR»
					test.commitStatements(stat);
					this.tests.add(test);
				«ENDFOR»
			}
			
			public List<Test> getTests(){
				return this.tests;
			}
			
			public void run(){
				ArrayList<Thread> threads = new ArrayList<Thread>();
				for( Test t: this.getTests()){
					Thread th = new Thread(t);
					th.start();
					threads.add(th);
				}
				for(int i = 0; i < threads.size(); i++)
					try {
						threads.get(i).join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		}
	'''

	def createStatement(Statement obj) {
		switch obj {
			Given case (obj instanceof Given): '''new GivenStatement(«obj.createBody()»)'''
			Then case (obj instanceof Then): '''new ThenStatement(«obj.createBody()»)'''
			When case (obj instanceof When): '''new WhenStatement(«obj.createBody()»)'''
			default: '''new Statement("")'''
		}
	}

	def createBody(Statement obj) {
		var bod = obj.getBody
		switch bod {
			RobotPositionSent case (bod instanceof RobotPositionSent): '''«bod.createRunStat()»'''
			RobotSpeedSent case (bod instanceof RobotSpeedSent): '''«bod.createRunStat()»'''
			EnvironmentSent case (bod instanceof EnvironmentSent): '''«bod.createRunStat()»'''
			RobotStateSent case (bod instanceof RobotStateSent): '''«bod.createRunStat()»'''
			RobotDistanceSent case (bod instanceof RobotDistanceSent): '''«bod.createRunStat()»'''
			BatterySent case (bod instanceof BatterySent): '''«bod.createRunStat()»'''
			MissionGoalSent case (bod instanceof MissionGoalSent): '''«bod.createRunStat()»'''
			MissionRiskLevelSent case (bod instanceof MissionRiskLevelSent): '''«bod.createRunStat()»'''
			MissionStatusSent case (bod instanceof MissionStatusSent): '''«bod.createRunStat()»'''
			TimeInterval case (bod instanceof TimeInterval): '''«bod.createRunStat()»'''
			default: ''''''
		}
	}

	def createRunStat(RobotPositionSent body){
		var tolerance = body.tolerance;
		if (tolerance == null)
		{
			'''new RobotPosSentence(«body.posX», «body.posY» , «body.posZ», new SpherePosition(new Meter(0)), this.app , this.drone)'''
		}else{
			var sent = body.tolerance;
			switch sent {
				CirclePosition case (sent instanceof CirclePosition): '''new RobotPosSentence(«body.posX», «body.posY» , «body.posZ», «sent.createRunStat», this.app, this.drone)'''
				SpherePosition case (sent instanceof SpherePosition): '''new RobotPosSentence(«body.posX», «body.posY» , «body.posZ», «sent.createRunStat», this.app, this.drone)'''
			}
		}
	}
	def createRunStat(CirclePosition sent) '''new CirclePosition(«sent.tolerance.createRunStat»)'''
	def createRunStat(SpherePosition sent) '''new SpherePosition(«sent.tolerance.createRunStat»)'''
		
	def createRunStat(RobotSpeedSent body) '''new RobotSpdSentence(«body.speedX», «body.speedY» , «body.speedZ», this.app, this.drone)'''
	def createRunStat(RobotStateSent body) '''new RobotStSentence("«body.state»", this.app, this.drone)'''
	def createRunStat(RobotDistanceSent body) {
		var sent = body.sent
		switch sent{
			DistanceToLocationSent case(sent instanceof DistanceToLocationSent): '''new RobotDistSentence(«sent.createRunStat»)'''
			DistanceToObstaclesSent case(sent instanceof DistanceToObstaclesSent): '''new RobotDistToObsSentence(«sent.createRunStat»)'''
			default: '''foutje'''
			}
	}
	
	def createRunStat(DistanceToLocationSent sent) {
		var body = sent.body;
		switch body{
			EqualSent case (body instanceof EqualSent): '''new DistanceToLocSentence(«sent.posX», «sent.posY», «sent.posZ»,«body.createRunStat» , this.app, this.drone)'''
			GreaterSent case (body instanceof GreaterSent): '''new DistanceToLocSentence(«sent.posX», «sent.posY», «sent.posZ»,«body.createRunStat» , this.app, this.drone)'''
			LessSent case (body instanceof LessSent): '''new DistanceToLocSentence(«sent.posX», «sent.posY», «sent.posZ»,«body.createRunStat» , this.app, this.drone)'''
			default: '''foutje'''
			
			
		}
	}
	
	def createRunStat(DistanceToObstaclesSent sent) {
		var body = sent.body;
		switch body{
			EqualSent case (body instanceof EqualSent): '''«body.createRunStat», this.app, this.drone'''
			GreaterSent case (body instanceof GreaterSent): '''«body.createRunStat», this.app, this.drone'''
			LessSent case (body instanceof LessSent): '''«body.createRunStat», this.app, this.drone'''
			default: '''foutje'''
			
			
		}
	}
	
	def createRunStat(EqualSent sent) {
		var amount = sent.amount;
		switch amount{
			DistanceUnit case (amount instanceof DistanceUnit): '''new EqualSentence(«amount.createRunStat»)'''
			PercentUnit case (amount instanceof PercentUnit): '''new EqualSentence(«amount.createRunStat»)'''
		}
	
	}
	def createRunStat(GreaterSent sent) {
		var amount = sent.amount;
		switch amount{
			DistanceUnit case (amount instanceof DistanceUnit): '''new GreaterSentence(«amount.createRunStat»)'''
			PercentUnit case (amount instanceof PercentUnit): '''new GreaterSentence(«amount.createRunStat»)'''
		}
	}
	def createRunStat(LessSent sent) {
		var amount = sent.amount;
		switch amount{
			DistanceUnit case (amount instanceof DistanceUnit): '''new LessSentence(«amount.createRunStat»)'''
			PercentUnit case (amount instanceof PercentUnit): '''new LessSentence(«amount.createRunStat»)'''
		}
	}
	
	def createRunStat(MissionGoalSent sent) '''new MissionGoalSentence(«sent.posX», «sent.posY», «sent.posZ», this.app, this.drone)'''
	def createRunStat(MissionRiskLevelSent sent) '''new MissionRiskLevelSentence("«sent.risklevel»"", this.app, this.drone)'''
	def createRunStat(MissionStatusSent sent) '''new MissionStatusSentence("«sent.state»", this.app, this.drone)'''
	def createRunStat(TimeInterval sent) '''new timeIntervalSentence(«sent.first.createRunStat», «sent.second.createRunStat», this.app, this.drone, test)'''
	
	def createRunStat(BatterySent s) {
		var body = s.sent;
		switch body{
			EqualSent case (body instanceof EqualSent): '''new BatterySentence(«body.createRunStat» , this.app, this.drone)'''
			GreaterSent case (body instanceof GreaterSent): '''new BatterySentence(«body.createRunStat» , this.app, this.drone)'''
			LessSent case (body instanceof LessSent): '''new BatterySentence(«body.createRunStat» , this.app, this.drone)'''
			default: '''foutje'''
		}
	}
	
	def createRunStat(EnvironmentSent s) {
		var sent = s.body;
		switch sent{
			EqualSent case (sent instanceof EqualSent): '''new WindSpdSentence(«sent.createRunStat» , this.app, this.drone)'''
			GreaterSent case (sent instanceof GreaterSent): '''new WindSpdSentence(«sent.createRunStat» , this.app, this.drone)'''
			LessSent case (sent instanceof LessSent): '''new WindSpdSentence(«sent.createRunStat» , this.app, this.drone)'''
			default: '''foutje'''
		}
	}
	
	def createRunStat(DistanceUnit s){
		switch s {
			METER case (s instanceof METER): '''«s.createRunStat()»'''
			KILOMETER case (s instanceof KILOMETER): '''«s.createRunStat()»'''
			MILLIMETER case (s instanceof MILLIMETER): '''«s.createRunStat()»'''
			CENTIMETER case (s instanceof CENTIMETER): '''«s.createRunStat()»'''
			default: ''''''
		}
	}
	
	def createRunStat(TimeUnit s){
		switch s {
			SECONDS case (s instanceof SECONDS): '''«s.createRunStat()»'''
			MINUTES case (s instanceof MINUTES): '''«s.createRunStat()»'''
			HOUR case (s instanceof HOUR): '''«s.createRunStat()»'''
			default: ''''''
		}
	}
	
	def createRunStat(SECONDS sent) '''new Second(«sent.value»)'''
	def createRunStat(MINUTES sent) '''new Minute(«sent.value»)'''
	def createRunStat(HOUR sent) '''new Hour(«sent.value»)'''
	def createRunStat(METER sent) '''new Meter(«sent.value»)'''
	def createRunStat(KILOMETER sent) '''new Kilometer(«sent.value»)'''
	def createRunStat(MILLIMETER sent) '''new Millimeter(«sent.value»)'''
	def createRunStat(CENTIMETER sent) '''new Centimeter(«sent.value»)'''
	
	def createRunStat(PercentUnit sent) '''new Percent(«sent.value»)'''
	
	
}