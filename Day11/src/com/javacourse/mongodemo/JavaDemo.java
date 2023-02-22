package com.javacourse.mongodemo;
//

//
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoCredential;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaDemo {

	public static void main(String args[]) {
		// MongoClient mongo = new MongoClient("localhost", 27017);
		//
		// // Creating Credentials
		// MongoCredential credential;
		// credential = MongoCredential.createCredential("sampleUser", "myDb",
		// "password".toCharArray());
		// System.out.println("Connected to the database successfully");
		//
		// // Accessing the database
		// MongoDatabase database = mongo.getDatabase("myDb");
		// System.out.println("Credentials ::"+ credential);

		MongoClient mongoClient = new MongoClient(new MongoClientURI(
				"mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&directConnection=true&ssl=false"));
		MongoDatabase database = mongoClient.getDatabase("javademo");
		MongoCollection<Document> collection = database.getCollection("Player");

		// FindIterable<Document> result = collection.find(filter);
		MongoCursor<Document> iterator = collection.find().iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().toJson());
		}
	}
}