package com.animals;

import com.design.EatAndFly;
import com.design.EatAndwalk;

public class Robot {
    private EatAndFly eatAndFly= new EatAndFly ();
    private EatAndwalk eatAndwalk = new EatAndwalk ();
    public void eat(){
        eatAndFly.eat ();
    }
    public void walk(){
        eatAndwalk.walk ();
    }
   public void fly(){
        eatAndFly.fly ();

    }

}
