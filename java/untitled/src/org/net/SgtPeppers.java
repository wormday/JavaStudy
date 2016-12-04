package net;

import org.springframework.stereotype.Component;

/**
 * Created by sunwq on 2016/12/3.
 */

@Component
public class SgtPeppers implements ICompactDisc {
    public String play(){
        return "SgtPeppers.play";
    }
}
