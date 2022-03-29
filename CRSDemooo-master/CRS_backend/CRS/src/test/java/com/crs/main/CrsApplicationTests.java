package com.crs.main;
/*
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrsApplicationTests {

	@Test
	void contextLoads() {
	}

}*/

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.crs.main.repository.ComplaintRepository;
import com.crs.main.repository.EngineerDutyRepository;
import com.crs.main.repository.FeedbackRepository;
import com.crs.main.model.Feedbacks;
import com.crs.main.model.Complaints;
import com.crs.main.model.EngineerDuty;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;




@SpringBootTest
class CrsApplicationTests {
	@Autowired
	FeedbackRepository feedbackRepository;

	@Test
	
	public void addFeedbacks() {
		Feedbacks feedback = new Feedbacks();
		feedback.setFeedbackId(49);
		feedback.setCustomerEmail("");
		feedback.setFeedback("");
		
		assertNotNull(feedbackRepository.findById(49).get());
	}
	@Test
	public void AllFeedback() {
		List<Feedbacks> list = feedbackRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void Feedback() {
		Feedbacks feedback = feedbackRepository.findById(49).get();
		assertEquals(49, feedback.getFeedbackId());


}
	
	@Autowired
	ComplaintRepository ComplaintsRepository;

	@Test
	
	public void addComplaint() {
		Complaints complaints = new Complaints();
		complaints.setTicketId(49);
		complaints.setCustomerEmail("");
		complaints.setPincode("");
            complaints.setComplaint("");
            complaints.setStatus("");
		
		assertNotNull(ComplaintsRepository.findById(49).get());
	}


	@Test
	public void Complaint() {
		Complaints complaints = ComplaintsRepository.findById(49).get();
		assertEquals(49, complaints.getTicketId());


}
	
	@Autowired
	EngineerDutyRepository engineerdutyRepository;

	@Test
	
	public void addEngineerDuty(){
		EngineerDuty duty = new EngineerDuty();
		duty.setEngineerDutyId(50);
		duty.setCustomerEmail("");
		duty.setEngineerEmail("");
        duty.setTicketId(49);
 
		
		assertNotNull(engineerdutyRepository.findById(47).get());
	}
	@Test
	public void AllEngineerDuty() {
	Iterable<EngineerDuty> list = engineerdutyRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void EngineerDuty() {
		EngineerDuty duty = engineerdutyRepository.findById(47).get();
		assertEquals(47, duty.getEngineerDutyId());

}
} 



