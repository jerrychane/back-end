public class HelloWorld {
    public static void main(String[] args) {
    int score = 94;
    String sex = "女";
    if(score > 80 ) {
        if(sex == "女") {
            System.out.println("进入女子组决赛");
        }
    }
        char today='日';
        switch (today) {
            case '一':
            case '三':
            case '五':
                System.out.println("早餐吃包子");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println("早餐吃油条");
                break;
            case '日':
                System.out.println("吃主席套餐");
                break;
        }

    }
}

