class Person3{
    //멤버 필드
    private String name;
    private int age;
    //생성자
    public Person3(String name, int age){
        this.name=name;
        this.age=age;
    }
    //getter와 setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
