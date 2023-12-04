package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.context.ApplicationContext;

@Controller
public class AssignmentController {


    @Autowired
    private ApplicationContext context;

    @GetMapping("/items/assign")
    public String showAssignItemPage(Model model) {
        model.addAttribute("assemblies", getAppStore().getAssemblyStore());
        model.addAttribute("items", getAppStore().getItemStore());
        
        return "assignItemToAssembly";
    }

    @PostMapping("/items/assign")
    public String assignItemToAssembly(
            @RequestParam("itemId") int itemId,
            @RequestParam("assemblyId") int assemblyId) {
        getAppStore().assignItemToAssembly(itemId, assemblyId);
        return "redirect:/items/assign";
    }

    private AppStore getAppStore() {
        // Implement the logic to get the AppStore instance
        // For example, you can use the ApplicationContext to retrieve the bean
        return context.getBean(AppStore.class);
    }
}
