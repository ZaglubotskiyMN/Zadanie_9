package part1.lessons9.task1;

public class Main {


    public static void main(String[] args) {
        dog sharik = new dog("Млекопитающие","male","Домашнее животное","Шпиц",1,"Шарик","Серый");
        cat murzik = new cat("Млекопитающие","male","Домашнее животное","Метис",1,"Мурзик","белый");
        duck donald = new duck("Млекопитающие","male","Домашнее животное","Пекинская",1,"Дональд","Белый");
        System.out.println("Name dog"+ " "+ sharik.getName());
        System.out.println("name cat"+ " "+ murzik.getName());
        System.out.println("name duck"+" "+ donald.getName());

    }


    static class animails {
        private String klas;
        private String sex;
        private String dikieordomashnie;
        private String poroda;
        private int age;

        animails(String klas, String sex, String dikieordomashnie,String poroda,int age) {
            this.setKlas(klas);
            this.setSex(sex);
            this.setDikieordomashnie(dikieordomashnie);
            this.setPoroda(poroda);
            this.setAge(age);

        }


        public String getKlas() {
            return klas;
        }

        public void setKlas(String klas) {
            this.klas = klas;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getDikieordomashnie() {
            return dikieordomashnie;
        }

        public void setDikieordomashnie(String dikieordomashnie) {
            this.dikieordomashnie = dikieordomashnie;
        }

        public String getPoroda() {
            return poroda;
        }

        public void setPoroda(String poroda) {
            this.poroda = poroda;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static class dog extends animails{
        private String name;
        private String color;



        dog(String klas, String sex, String dikieordomashnie, String poroda, int age,String name,String color) {
            super(klas, sex, dikieordomashnie, poroda, age);
            this.setName(name);
            this.setColor(color);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    static class cat extends animails {
        private String name;
        private String color;

        cat(String klas, String sex, String dikieordomashnie, String poroda, int age,String name,String color) {
            super(klas, sex, dikieordomashnie, poroda, age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    static class  duck extends animails{
        private String name;
        private String color;

        duck(String klas, String sex, String dikieordomashnie, String poroda, int age,String name, String color) {
            super(klas, sex, dikieordomashnie, poroda, age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

}



