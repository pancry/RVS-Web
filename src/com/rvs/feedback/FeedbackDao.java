package com.rvs.feedback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class FeedbackDao {
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// method to save Feedback
	public void saveFeedback(Feedback e) {
		template.save(e);
	}

	// method to update Feedback
	public void updateFeedback(Feedback e) {
		template.update(e);
	}

	// method to delete Feedback
	public void deleteFeedback(Feedback e) {
		template.delete(e);
	}

	// method to return one Feedback of given id
	public Feedback getById(int id) {
		Feedback e = (Feedback) template.get(Feedback.class, id);
		return e;
	}

	// method to return all Feedbacks
	public List<Feedback> getFeedbacks() {
		List<Feedback> list = new ArrayList<Feedback>();
		list = template.loadAll(Feedback.class);
		return list;
	}
}