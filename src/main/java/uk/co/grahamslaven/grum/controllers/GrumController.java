package uk.co.grahamslaven.grum.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uk.co.grahamslaven.grum.models.Contact;
import uk.co.grahamslaven.grum.repositories.ContactRepository;

@Controller
public class GrumController {

	@Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView model) {        
        List<Contact> contacts = contactRepository.getAll();

        model.setViewName("contactList");
        model.addObject("contacts", contacts);

        return model;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView getById(ModelAndView model, @PathVariable String id) {
        Contact contact = contactRepository.findById(Long.parseLong(id));              

        model.setViewName("contactDetails");
        model.addObject("contact", contact);

        return model;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createContactForm(ModelAndView model) {    
        Contact contact = new Contact();

        model.setViewName("contactCreate");
        model.addObject("contact", contact);

        return model;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createContactProcess(@ModelAttribute Contact contact) {
    	contactRepository.create(contact);

        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView updateContactForm(ModelAndView model, @PathVariable String id) {    
        Contact contact = contactRepository.findById(Long.parseLong(id));

        model.setViewName("contactUpdate");
        model.addObject("contact", contact);

        return model;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ModelAndView updateContactProcess(@ModelAttribute Contact contact) {
    	contactRepository.update(contact);

        return new ModelAndView("redirect:/{id}");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteContactForm(ModelAndView model, @PathVariable String id) {    
        Contact contact = contactRepository.findById(Long.parseLong(id));

        model.setViewName("contactDelete");
        model.addObject("contact", contact);

        return model;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ModelAndView deleteContactProcess(@ModelAttribute Contact contact) {
    	contactRepository.delete(contact.getId());

        return new ModelAndView("redirect:/");
    }

}
