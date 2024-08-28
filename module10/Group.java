public class Group {
    Person[] person;
    int index = 0;

    public Group(int size){
        this.person = new Person[size];
    }

    public void add(Person p){
        this.person[this.index++] = p;
    }

    public Person get(int index){
        return this.person[index];
    }

    public int size(){
        return this.person.length;
    }
}
