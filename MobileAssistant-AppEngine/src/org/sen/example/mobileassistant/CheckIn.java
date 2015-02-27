package org.sen.example.mobileassistant;

import com.google.appengine.api.datastore.Key;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckIn {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Key key;

 private String placeId;

 private String userEmail;

 private Date checkinDate;

 public Key getKey() {
   return key;
 }
 
 void clearKey() {
   key = null;
 }

 public String getPlaceId() {
   return placeId;
 }

 public void setPlaceId(String placeId) {
   this.placeId = placeId;
 }

 public String getUserEmail() {
   return userEmail;
 }

 public void setUserEmail(String userEmail) {
   this.userEmail = userEmail;
 }

 public Date getCheckinDate() {
   return checkinDate;
 }

 public void setCheckinDate(Date date) {
   checkinDate = date;
 }
}
