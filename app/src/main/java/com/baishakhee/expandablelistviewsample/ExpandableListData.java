package com.baishakhee.expandablelistviewsample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListData {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> javaTopic = new ArrayList<String>();
        javaTopic.add("Classes and Objects in Java.");
        javaTopic.add("Inheritance in Java.");
        javaTopic.add("Encapsulation in Java");
        javaTopic.add("Polymorphism in Java.");
        javaTopic.add("Abstraction in Java.");
        javaTopic.add("Overriding in Java.");
        javaTopic.add("Method Overloading in Java.");

        List<String> androidTopic = new ArrayList<String>();
        androidTopic.add("Basics of Android.");
        androidTopic.add("Android Layouts and Widgets.");
        androidTopic.add("Communication and Media.");
        androidTopic.add("Storage Techniques and Animation in Android");
        androidTopic.add("Web Services and Customizations of Widgets.");
        androidTopic.add("Advanced Android Concepts.");
        androidTopic.add("Publishing Android Apps on Google Play.");

        List<String> htmlTopic = new ArrayList<String>();
        htmlTopic.add("HTML Tutorial.");
        htmlTopic.add("HTML Forms.");
        htmlTopic.add("HTML Graphics.");
        htmlTopic.add("HTML Media.");
        htmlTopic.add("HTML APIs.");
        htmlTopic.add("HTML Examples.");
        htmlTopic.add("HTML References.");

        expandableListDetail.put("Java", javaTopic);
        expandableListDetail.put("Android", androidTopic);
        expandableListDetail.put("HTML", htmlTopic);
        return expandableListDetail;
    }
}
