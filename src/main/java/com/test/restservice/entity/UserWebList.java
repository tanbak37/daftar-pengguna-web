package com.test.restservice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.access.event.PublicInvocationEvent;

@Entity
public class UserWebList {

		@Id
		private String idWeb;
		private String web;
		
		public String getIdWeb() {
			return idWeb;
		}

		public void setIdWeb(String idWeb) {
			this.idWeb = idWeb;
		}

		public String getWeb() {
			return web;
		}

		public void setWeb(String web) {
			this.web = web;
		}
		
		
		@Override
		public String toString() {
			return "UserWebList{" + "idWeb='" + idWeb + '\'' + ", web='" + web + '\''  + '}';
		}
	
	
	
	
}
