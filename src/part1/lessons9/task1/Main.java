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
        man Ivan = new man("Ivan","Ivanov");
        woman Sveta=new woman("Sveta","Ivanova");
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
        System.out.println("-------------");
        System.out.println("Мужчина"+" "+ Ivan.getFirst_name()+ " "+Ivan.getLast_name());
        Ivan.Running(1);
        Ivan.Swimmming(0);
        System.out.println("-------------");
        System.out.println("Женщина"+ " "+ Sveta.getFirst_name()+ " "+Sveta.getLast_name());
        Sveta.Running(2);
        Sveta.Swimmming(2);



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


        public void swim() {

        }


    }
    static class  duck extends animails implements Run,Swim,Fly{
        private String name;
        private String color;

        duck(String klas, String sex, String dikieordomashnie, String poroda, int age,String name, String color) {
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


        public void fly() {

        }


        public void swim() {

        }
    }
    interface Running{
        int STAIT= 0;
        int WALK =1;
        int RUN =2;
        void stait(int a);

    }
    interface Swimmming{
        int MAN_STAND_ON_THE_GROUND =0;
        int MAN_IN_THE_WATER=1;
         void stait_on (int b);

    }

    static abstract class human implements Running,Swimmming{
        private String first_name;
        private String last_name;
        human(String first_name,String last_name){
            this.setFirst_name(first_name);
            this.setLast_name(last_name);
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
    }
     public static class man extends human{

        man(String first_name, String last_name) {
            super(first_name, last_name);
        }

        public void Running(int a) {
            switch (a) {
                case STAIT:
                    System.out.println("Человек стоит");
                    break;
                case WALK:
                    System.out.println("Человек идет");
                    break;
                case RUN:
                    System.out.println("Человек бежит");
                    break;
                default:
                    System.out.println("По умолчанию стоит");
            }


        }
        public void Swimmming(int b){
                switch (b) {
                    case MAN_STAND_ON_THE_GROUND:
                        System.out.println("Человек стоит на земле");
                        break;
                    case MAN_IN_THE_WATER:
                        System.out.println("Человек поплыл");
                        break;
                    default:
                        System.out.println("По умолчанию человек стоит на земле");
                        break;
                }

            }



         @Override
         public void stait(int a) {

         }

         @Override
         public void stait_on(int b) {

         }
     }
    public static class woman extends human{

        woman(String first_name, String last_name) {
            super(first_name, last_name);
        }

        public void Running(int a) {
            switch (a) {
                case STAIT:
                    System.out.println("Человек стоит");
                    break;
                case WALK:
                    System.out.println("Человек идет");
                    break;
                case RUN:
                    System.out.println("Человек бежит");
                    break;
                default:
                    System.out.println("По умолчанию стоит");
            }


        }
        public void Swimmming(int b){
            switch (b) {
                case MAN_STAND_ON_THE_GROUND:
                    System.out.println("Человек стоит на земле");
                    break;
                case MAN_IN_THE_WATER:
                    System.out.println("Человек поплыл");
                    break;
                default:
                    System.out.println("По умолчанию человек стоит на земле");
                    break;
            }

        }



        @Override
        public void stait(int a) {

        }

        @Override
        public void stait_on(int b) {

        }
    }

}



