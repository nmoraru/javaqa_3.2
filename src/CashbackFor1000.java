public class CashbackFor1000 {
    public static void main(String[] args) {
        int personalAccountInKopek = 10000;
        int paymentInKopek = 112139;
        int cashback;

        if (paymentInKopek > 100000) {
            cashback = paymentInKopek / 10000;
            personalAccountInKopek = personalAccountInKopek + paymentInKopek + cashback * 100;
            System.out.println(personalAccountInKopek);
        } else {
            personalAccountInKopek = personalAccountInKopek + paymentInKopek;
            System.out.println(personalAccountInKopek);
        }
    }
}
