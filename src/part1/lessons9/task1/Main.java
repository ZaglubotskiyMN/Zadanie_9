package part1.lessons9.task1;

public class Main {

    interface Fly{
       static void fly(){
           System.out.println("умеет летать");
       };
    }
     interface Run{
        static void run(){
            System.out.println("умеет бегать");
        };
     }
     interface Swim{
       static void swim(){
           System.out.println("умеет плавать");
       };
     }


    public static void main(String[] args) {
        dog sharik = new dog("Млекопитающие","male","Домашнее животное","Шпиц",1,"Шарик","Серый");
        cat murzik = new cat("Млекопитающие","male","Домашнее животное","Метис",1,"Мурзик","белый");
        duck donald = new duck("Млекопитающие","male","Домашнее животное","Пекинская",1,"Дональд","Белый");
        System.out.println("Name dog"+ " "+ sharik.getName());
        System.out.print("Животное"+ " " );Run.run();
        System.out.print("Животное"+ " " );Swim.swim();
        System.out.println("-------------");
        System.out.println("name cat"+ " "+ murzik.getName());
        System.out.print("Животное"+ " " );Run.run();
        System.out.print("Животное"+ " " );Swim.swim();
        System.out.println("-------------");
        System.out.println("name duck"+" "+ donald.getName());
        System.out.print("Животное"+ " " );Run.run();
        System.out.print("Животное"+ " " );Swim.swim();
        System.out.print("Животное"+ " " );Fly.fly();

    }


    abstract static class animails {
        private String klas;
        private String sex;
        private String dikieordomashnie;
        private String poroda;
        private int age;
        //String name;

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

    static class dog extends animails implements Run,Swim{
        private String name;
        private String color;



        dog(String klas, String sex, String dikieordomashnie, String poroda, int age,String name,String color) {
            super(klas, sex, dikieordomashnie, poroda, age);
            this.setName(name);
            this.setColor(color);
        }
        public void run(){
            System.out.println("Гав");
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


        public void swim() {

        }
    }
    static class cat extends animails implements Run,Swim {
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


        public void swim() {

        }


    }
    static class  duck extends animails implements Run,Swim,Fly{
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


        public void fly() {

        }


        public void swim() {

        }
    }

}



