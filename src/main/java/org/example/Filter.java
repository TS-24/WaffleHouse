package org.example;



public abstract class Filter {

    enum FilterName {
        Professor, Department, Timeslot, Credits;
    }

    Filter(FilterName filterName) {
        this.filterName = filterName;
    }
    abstract Filter apply();
}
