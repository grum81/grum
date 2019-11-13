package uk.co.grahamslaven.grum.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import uk.co.grahamslaven.grum.models.Contact;
import uk.co.grahamslaven.grum.repositories.ContactRepository;

@RestController
public class GrumAPIController {

	@Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = "/api/", method = RequestMethod.GET)
    public List<Contact> index(ModelAndView model) {  
        List<Contact> contacts = contactRepository.getAll();
        
        return contacts;
    }

    @RequestMapping(value = "/api/{id}", method = RequestMethod.GET)
    public Contact getById(ModelAndView model, @PathVariable String id) {
        Contact contact = contactRepository.findById(Long.parseLong(id));

        return contact;
    }

    @RequestMapping(value = "/api", method = RequestMethod.POST)
    public Contact createContactProcess(@ModelAttribute Contact contact) {
    	contactRepository.create(contact);

        return contact;
    }

    @RequestMapping(value = "/api/{id}", method = RequestMethod.POST)
    public Contact updateContactProcess(@ModelAttribute Contact contact) {
    	contactRepository.update(contact);

        return contact;
    }

    @RequestMapping(value = "/api/{id}", method = RequestMethod.DELETE)
    public void deleteContactProcess(@ModelAttribute Contact contact) {
    	contactRepository.delete(contact.getId());
    }

}
