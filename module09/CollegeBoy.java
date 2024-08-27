public class CollegeBoy extends Student{
    private int no;
    private String name;
    private String departmentName;
    private String cellPhone;
    private String gender;

    private CollegeBoy(Builder builder){
        this.no = builder.no;
        this.name = builder.name;
        this.departmentName = builder.departmentName;
        this.cellPhone = builder.cellPhone;
        this.gender = builder.gender;
    }

    public static class Builder{
        private int no;
        private String name;
        private String departmentName;
        private String cellPhone;
        private String gender;

        public Builder no(int no){
            this.no = no;
            return this;
        }

        public Builder name(String name){
            this.name = name;

            return this;
        }

        public Builder department(String department){
            this.departmentName = department;

            return this;
        }

        public Builder cellPhone(String cellphone){
            this.cellPhone = cellphone;

            return this;
        }

        public Builder gender(String gender){
            this.gender = gender;

            return this;
        }

        public CollegeBoy build(){
            return new CollegeBoy(this);
        }
    }

    // public CollegeBoy(int no, String name, String departmentName) {
    //     super(no, name);
    //     this.departmentName = departmentName;
    // }
}
