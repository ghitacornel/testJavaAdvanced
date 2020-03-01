package design.builder;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DataModel {

    private long created;
    private String name;
    private int age;
    private Set<String> occupations;

    private DataModel(long created, String name, int age, Set<String> occupations) {
        this.created = created;
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    private static long $default$created() {
        return System.currentTimeMillis();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long created;
        private boolean created$set;
        private String name;
        private int age;
        private java.util.ArrayList<String> occupations;

        Builder() {
        }

        public Builder created(long created) {
            this.created = created;
            this.created$set = true;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder occupation(String occupation) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }
            this.occupations.add(occupation);
            return this;
        }

        public Builder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }
            this.occupations.addAll(occupations);
            return this;
        }

        public Builder clearOccupations() {
            if (this.occupations != null) {
                this.occupations.clear();
            }
            return this;
        }

        public DataModel build() {
            // complicated switch statement to produce a compact properly sized immutable set omitted.
            Set<String> occupations = new HashSet<>();
            return new DataModel(created$set ? created : DataModel.$default$created(), name, age, occupations);
        }

        @java.lang.Override
        public String toString() {
            return "BuilderExample.BuilderExampleBuilder(created = " + this.created + ", name = " + this.name + ", age = " + this.age + ", occupations = " + this.occupations + ")";
        }
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "created=" + created +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupations=" + occupations +
                '}';
    }
}