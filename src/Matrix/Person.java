package Matrix;

public record Person(String name, int day, int month, int year) {

    //calc days
    @Override
    public int day() {
        if (day > 22 && day <= 31) {
            String buf = String.valueOf(day);
            int sum = 0;
            for (int i = 0; i < buf.length(); i++)
                sum += (buf.charAt(i) - 48);
            return sum;
        } else if (day > 31) {
            System.out.print("некоректное число дня");
            int status = 418;
            Runtime.getRuntime().exit(status);
        }
        return day;
    }
//name person
    @Override
    public String name() {
        return name;
    }

    //calc match day for numbs arcans
    static int calc(int sum) {
        if (sum > 22) {
            String buffer = String.valueOf(sum);
            int s = 0;
            for (int i = 0; i < buffer.length(); i++)
                s += (buffer.charAt(i) - 48);
            return s;
        } else return sum;
    }

    @Override         // month person
    public int month() {
        if (month > 12) {
            System.out.print("некоректное число месяца");
            int status = 418;
            Runtime.getRuntime().exit(status);
        }
        return month;
    }

    @Override
    public int year() {
        String buf = String.valueOf(year);
        int sum = 0;
        for (int i = 0; i < buf.length(); i++)
            sum += (buf.charAt(i) - 48);
        return calc(sum);
    }

    public int sum3() {
        int sum = day() + month() + year();
        return calc(sum);
    }

    public int sum4() {
        int sum = day() + month() + year() + sum3();
        return calc(sum);
    }

    public int energy() {
        int sum = month() + sum3();
        return calc(sum);
    }

    public int material() {
        int sum = day() + year();
        return calc(sum);
    }

    public int destiny() {
        int sum = material() + energy();
        return calc(sum);
    }

    public int m() {
        int sum = day() + month();
        return calc(sum);
    }

    public int z() {
        int sum = sum3() + year();
        return calc(sum);
    }

    public int muj() {
        int sum = m() + z();
        return calc(sum);
    }

    public int seven() {
        int sum = day() + sum3();
        return calc(sum);
    }

    public int j() {
        int sum = month() + year();
        return calc(sum);
    }

    public int jen() {
        int sum = j() + seven();
        return calc(sum);
    }

    public int social() {
        int sum = muj() + jen();
        return calc(sum);
    }

    public int three() {
        int sum = destiny() + social();
        return calc(sum);
    }

    public int four() {
        int sum = social() + three();
        return calc(sum);
    }

    public int materialProblem() {
        int sum = year() + sum4();
        return calc(sum);
    }

    public int n() {
        int sum = sum3() + sum4();
        return calc(sum);
    }

    public int w() {
        int sum = day() + year();
        return calc(sum);
    }

    public int q() {
        int sum = n() + materialProblem();
        return calc(sum);
    }

    public int e() {
        int sum = q() + n();
        return calc(sum);
    }

    @Override
    public String toString() {
        if (destiny() == 20)
            System.out.println("""
                    Прогноз на год:
                    Время будет правильно использовать для налаживания связей с членами рода, особенно c\s
                    родителями. Именно в этот период чаще всего проявляются скрытые проблемы и застарелые обиды\s
                    родом из детства. Важно отследить это в себе и принять, а не прятать. Обиды следует проработать
                    и отпустить, приняв родителей, такими, какие они есть, со всеми ошибками. В налаживании\s
                    семейных связей поможет общение со старшими членами рода, будет полезно узнать историю семьи и\s
                    составить генеалогическое древо. В общественном, глобальном уровне можно выйти на новую ступень
                    развития, поучаствовать в крупном проекте, стать востребованным профессионалом в своей сфере.
                     Но такое случится только в том случае, если вам комфортно в своей среде, на своём месте и вы\s
                    абсолютно принимаете себя, довольны своей жизнью, работой, состоянием. Тогда жизнь может\s
                    подарить уникальные возможности для того, чтобы человек проявил себя и получил славу,
                    известность, рост и успех. В противном случае, если человек критикует всё вокруг, не любит свою
                    работу, страну, город, не наладил отношения с близкими - все возможности закрываются. Возможны
                    ключевые события: Положительные:
                    Хорошие семейные отношения, укрепление рода, воссоединение семьи. Возможно объединение родов,\s
                    удачный прочный брак и поддержка от членов семьи, основание и успешное ведение семейного бизнеса
                    """);
        return "Ваше имя: " + name() + "\nЛичные качества (какой вы): " + day()
                + " аркан\nТворческие способности(энергия которая ведет нас по" +
                " жизни): " + month() + " аркан\nДеньги" +
                " и здоровье (материальные задачи, которые наша душа в прошлой " +
                "жизни не справилась (материальная карма)): " + year() + " аркан\n" +
                "Кармический хвост прошлой жизни: " + sum3() + " аркан\nЗона" +
                " комфорта, то, чего вы хотите всем сердцем (ваши задачи и поступки," +
                " куда стремтся ваша душа): " + sum4() + " аркан\nВаш " +
                "энергетический потенциал: " + energy() + " аркан\nМатериальный потенциал: "
                + material() + " аркан\n" + "Психологический портрет который нужно реализовать" +
                " до 40 лет(предназначение, поиск себя): " + destiny() + " аркан" +
                "\n2 Предназначение, социализация (признания в социуме): " + social() +
                " аркан\nТретье" + " предназначение: " + three() + " аркан\nЧетвертое" +
                " предназначение: " + four() + " аркан\nПроблемы с зарабатыванием " +
                "денег(денежный канал): " + materialProblem() + " аркан";
    }
}