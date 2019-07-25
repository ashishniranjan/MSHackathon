package com.example.rahul.mshack.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserData {

    public ArrayList<SingleUser> users;
   public UserData()
   {
       users = new ArrayList<>();
       seedData();
   }

   public void seedData()
   {
       ArrayList<String> techs = new ArrayList<>();
       ArrayList<String> links = new ArrayList<>();

       techs.add("BizTalk");techs.add("LogicApps");techs.add("SSIS");
       links.add("https://www.youtube.com/watch?v=SSgqfMrF240");
       links.add("https://www.youtube.com/watch?v=0ikNenDyNw");
       links.add("https://www.youtube.com/watch?v=S5r1pSURaKM");
       users.add(
               new SingleUser("Vignesh", "Vignesh", "visukuma@microsoft.com", techs, links )
       );

       techs.clear();
       links.clear();

       techs.add("Azure");techs.add("Cognitive Service");
       links.add("https://www.youtube.com/watch?v=0bPJPiX89K0");
       links.add("https://www.youtube.com/watch?v=3Arj5zlUPG4");
       links.add("https://www.youtube.com/watch?v=f4XBxNuEifQ");
       users.add(
               new SingleUser("AshishJ", "AshishJ", "ashjai@microsoft.com", techs, links )
       );

       techs.clear();
       links.clear();

       techs.add("ML");techs.add("Data Science");
       links.add("https://www.youtube.com/watch?v=ukzFI9rgwfU");
       links.add("https://www.youtube.com/watch?v=VwVg9jCtqaU");
       links.add("https://www.youtube.com/watch?v=X3paOmcrTjQ");
       users.add(
               new SingleUser("AshishN", "AshishN", "t-asnira@microsoft.com", techs, links )
       );

       techs.clear();
       links.clear();

       techs.add("Android");techs.add("Java");
       links.add("https://www.youtube.com/watch?v=XgCF58tuo2k");
       links.add("https://www.youtube.com/watch?v=5CgQUbnf1Qk");
       links.add("https://www.youtube.com/watch?v=eIrMbAQSU34");
       users.add(
               new SingleUser("Rahul", "Rahul", "t-rathap@microsoft.com", techs, links )
       );

       techs.clear();
       links.clear();

       techs.add("Data Science");techs.add("C#");
       links.add("https://www.youtube.com/watch?v=X3paOmcrTjQ");
       links.add("https://www.youtube.com/watch?v=KdgQvgE3ji4");
       links.add("https://www.youtube.com/watch?v=SXmVym6L8dw");
       users.add(
               new SingleUser("Sachin", "Sachin", "sacsingh@microsoft.com", techs, links )
       );
   }
}