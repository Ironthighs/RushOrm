package co.uk.rushexample.testobjects;

import java.util.ArrayList;
import java.util.List;

import co.uk.rushorm.core.RushObject;
import co.uk.rushorm.core.annotations.RushList;
import co.uk.rushorm.core.annotations.RushTableAnnotation;

/**
 * Created by stuartc on 19/02/15.
 */
@RushTableAnnotation
public class Bug7Parent extends RushObject {

    @RushList(classname = "co.uk.rushexample.testobjects.Bug7Child")
    private List<Bug7Child> children;

    public Bug7Parent() {
        this.children = new ArrayList<Bug7Child>();
    }

    public boolean add(Bug7Child child) {
        return children.add(child);
    }

    public boolean remove(Bug7Child child) {
        return children.remove(child);
    }

    public List<Bug7Child> getChildren() {
        return children;
    }

}

