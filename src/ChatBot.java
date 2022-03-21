import java.util.*;
public class ChatBot
{
    static Stack<String> chatbot=new Stack<>();
    public static void main(String[] args)
    {
        Language lang=new Language();
        lang.selectLanguage();
    }
}
class Language
{
    Scanner sc=new Scanner(System.in);
    void selectLanguage()
    {
        System.out.println("Select your Language\n1.Tamil\n2.English\n3.Hindi\n0.Exit");
        int language=sc.nextInt();
        switch (language) {
            case 1 -> {
                ChatBot.chatbot.push("Tamil");
                Tamil tamil = new Tamil();
                tamil.selectTamil();
            }
            case 2 -> {
                ChatBot.chatbot.push("English");
                English english = new English();
                english.selectEnglish();
            }
            case 3 -> {
                ChatBot.chatbot.push("Hindi");
                Hindi hindi=new Hindi();
                hindi.selectHindi();
            }
            case 0 -> {
                System.exit(0);
            }
        }
    }
}
class Tamil
{
    Scanner sc=new Scanner(System.in);
    Language lang = new Language();
    void selectTamil()
    {
        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n1.ரீசார்ஜ்\n2.காலர் டியூன்\n3.டிடீஹச்\n4.நியூ ஆஃபர்\n9.பின் செல்ல\n0.வெளியே செல்ல");
        int option=sc.nextInt();
        switch (option) {
            case 1 -> {
                ChatBot.chatbot.push("Recharge");
                Recharge recharge = new Recharge();
                recharge.selectoffer();
            }
            case 2 -> {
                ChatBot.chatbot.push("Caller_Tune");
                CallerTune caller_tune = new CallerTune();
                caller_tune.selectoffer();
            }
            case 3 -> {
                ChatBot.chatbot.push("DTH");
                DTH dth = new DTH();
                dth.selectoffer();
            }
            case 4 -> {
                ChatBot.chatbot.push("New_Offer");
                NewOffer new_offer = new NewOffer();
                new_offer.selectoffer();
            }
            case 9 -> {
                ChatBot.chatbot.pop();
                lang.selectLanguage();
            }
            case 0 -> System.exit(0);
        }
    }
}
class Recharge
{
    Scanner sc=new Scanner(System.in);
    Tamil tamil=new Tamil();
    void selectoffer()
    {
        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n1.179:2GB+1GB/Day+UL,28 days\n2.50TT,28 days\n3.399:1.5GB/Day+UL,56 days");
        System.out.println("4.239:1.5GB/Day+UL,28 days\n9.பின் செல்ல\n0.வெளியே செல்ல");
        int option=sc.nextInt();
        switch (option) {
            case 1 -> {
                ChatBot.chatbot.push("179:2GB+1GB/Day+UL,28 days");
                System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                int opt=sc.nextInt();
                if(opt==9) {
                    ChatBot.chatbot.pop();
                    tamil.selectTamil();
                }
                else
                {
                    System.exit(0);
                }
            }
            case 2 ->
                    {
                        ChatBot.chatbot.push("50TT,28 days");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("399:1.5GB/Day+UL,56 days");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("239:1.5GB/Day+UL,28 days");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                tamil.selectTamil();
            }
            case 0 -> System.exit(0);
        }
    }
}
class CallerTune
{
    Scanner sc=new Scanner(System.in);
    Tamil tamil=new Tamil();
    void selectoffer()
    {
        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n1.சிரிக்காதே சிரிக்காதே(ரெமோ)\n2.கண் இரண்டில் மோதி(உத்தம புத்திரன்)");
        System.out.println("3.யாரோ என் நெஞ்சை(குட்டி)\n4.செல்லம்மா செல்லம்மா(டாக்டர்)\n9.பின் செல்ல\n0.வெளியே செல்ல");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("சிரிக்காதே சிரிக்காதே(ரெமோ)");
                        System.out.println("காலர் டியூன் உறுதிசெய்யப்பட்டது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("கண் இரண்டில் மோதி(உத்தம புத்திரன்)");
                        System.out.println("காலர் டியூன் உறுதிசெய்யப்பட்டது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("யாரோ என் நெஞ்சை(குட்டி)");
                        System.out.println("காலர் டியூன் உறுதிசெய்யப்பட்டது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("செல்லம்மா செல்லம்மா(டாக்டர்)");
                        System.out.println("காலர் டியூன் உறுதிசெய்யப்பட்டது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                tamil.selectTamil();
            }
            case 0 -> System.exit(0);
        }
    }
}
class DTH
{
    Scanner sc=new Scanner(System.in);
    Tamil tamil=new Tamil();
    void selectoffer()
    {
        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n1.200/Month,தமிழ் சேனல் மட்டுமே\n2.500/Month,அனைத்து சேனல்களும்");
        System.out.println("3.100/Month,பாட்டு சேனல் மட்டுமே\n4.250/Month,தமிழ் மற்றும் இங்கிலிஷ் சேனல் மட்டுமே\n9.பின் செல்ல\n0.வெளியே செல்ல");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("200/Month,தமிழ் சேனல் மட்டுமே");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("500/Month,அனைத்து சேனல்களும்");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("100/Month,பாட்டு சேனல் மட்டுமே");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("250/Month,தமிழ் மற்றும் இங்கிலிஷ் சேனல் மட்டுமே");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                tamil.selectTamil();
            }
            case 0 -> System.exit(0);
        }
    }
}
class NewOffer
{
    Scanner sc=new Scanner(System.in);
    Tamil tamil=new Tamil();
    void selectoffer()
    {
        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n1.1000: UL இன்டெர் நேஷனல் கால்ஸ்,5 days \n2.1700: UL இன்டெர் நேஷனல் கால்ஸ்,15 days");
        System.out.println("9.பின் செல்ல\n0.வெளியே செல்ல");
        int book=sc.nextInt();
        switch (book) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("1000: UL இன்டெர் நேஷனல் கால்ஸ்,5 days");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("1700: UL இன்டெர் நேஷனல் கால்ஸ்,15 days");
                        System.out.println("வெற்றிகரமாக ரீசார்ஜ் செய்யபட்டுள்ளது");
                        System.out.println("என்டர் யுவர் ஆப்ச்சென்:\n9.பின் செல்ல\n0.வெளியே செல்ல");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            tamil.selectTamil();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                tamil.selectTamil();
            }
            case 0 -> System.exit(0);
        }
    }
}
class English
{
    Scanner sc=new Scanner(System.in);
    Language lang=new Language();
    void selectEnglish()
    {
        System.out.println("Enter Your Option:\n1.Recharge\n2.Caller Tune\n3.DTH\n4.New Offer\n9.Back\n0.Exit");
        int option=sc.nextInt();
        switch (option) {
            case 1 -> {
                ChatBot.chatbot.push("Recharge");
                RechargeEnglish re = new RechargeEnglish();
                re.selectoffer();
            }
            case 2 -> {
                ChatBot.chatbot.push("Caller_Tune");
                CallerTuneEnglish cte=new CallerTuneEnglish();
                cte.selectoffer();
            }
            case 3 -> {
                ChatBot.chatbot.push("DTH");
                DTHEnglish dthe=new DTHEnglish();
                dthe.selectoffer();
            }
            case 4 -> {
                ChatBot.chatbot.push("New_Offer");
                NewOfferEnglish noe=new NewOfferEnglish();
                noe.selectoffer();
            }
            case 9 -> {
                ChatBot.chatbot.pop();
                lang.selectLanguage();
            }
            case 0 -> System.exit(0);
        }
    }
}
class RechargeEnglish
{
    Scanner sc=new Scanner(System.in);
    English english=new English();
    void selectoffer()
    {
        System.out.println("Enter Your Option:\n1.179:2GB+1GB/Day+UL,28 days\n2.50TT,28 days\n3.399:1.5GB/Day+UL,56 days");
        System.out.println("4.239:1.5GB/Day+UL,28 days\n9.Back\n0.Exit");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("179:2GB+1GB/Day+UL,28 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("50TT,28 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("399:1.5GB/Day+UL,56 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("239:1.5GB/Day+UL,28 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                english.selectEnglish();
            }
            case 0 -> System.exit(0);
        }
    }
}
class CallerTuneEnglish
{
    Scanner sc=new Scanner(System.in);
    English english=new English();
    void selectoffer()
    {
        System.out.println("Enter Your Option:\n1.Sirikathae Sirikathae(Remo)\n2.Kannirandil(Uthama puthiran)");
        System.out.println("3.Yaaro En Nenjai(Kutty)\n4.Chellamma Chellamma(Doctor)\n9.Back\n0.Exit");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("Sirikathae Sirikathae(Remo)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("Kannirandil(Uthama puthiran)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("Yaaro En Nenjai(Kutty)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("Chellamma Chellamma(Doctor)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                english.selectEnglish();
            }
            case 0 -> System.exit(0);
        }
    }
}
class DTHEnglish
{
    Scanner sc=new Scanner(System.in);
    English english=new English();
    void selectoffer()
    {
        System.out.println("Enter Your Option:\n1.200/Month,Only Tamil Channels\n2.500/Month,All Channels");
        System.out.println("3.100/Month,Only Music Channel\n4.250/Month,Tamil and English Channels\n9.Back\n0.Exit");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("200/Month,Only Tamil Channels");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("500/Month,All Channels");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("100/Month,Only Music Channel");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("250/Month,Tamil and English Channels");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                english.selectEnglish();
            }
            case 0 -> System.exit(0);
        }
    }
}
class NewOfferEnglish
{
    Scanner sc=new Scanner(System.in);
    English english=new English();
    void selectoffer()
    {
        System.out.println("Enter Your Option:\n1.1000: UL International Calls,5 days \n2.1700: UL International Calls,15 days");
        System.out.println("9.Back\n0.Exit");
        int book=sc.nextInt();
        switch (book) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("1000: UL International Calls,5 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("1700: UL International Calls,15 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            english.selectEnglish();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                english.selectEnglish();
            }
            case 0 -> System.exit(0);
        }
    }
}
class Hindi
{
    Scanner sc=new Scanner(System.in);
    Language lang=new Language();
    void selectHindi()
    {
        System.out.println("Enter Your Option:\n1.Recharge\n2.Caller Tune\n3.DTH\n4.New Offer\n9.Back\n0.Exit");
        int option=sc.nextInt();
        switch (option) {
            case 1 -> {
                ChatBot.chatbot.push("Recharge");
                RechargeHindi reh = new RechargeHindi();
                reh.selectoffer();
            }
            case 2 -> {
                ChatBot.chatbot.push("Caller_Tune");
                CallerTuneHindi cteh=new CallerTuneHindi();
                cteh.selectoffer();
            }
            case 3 -> {
                ChatBot.chatbot.push("DTH");
                DTHHindi dtheh=new DTHHindi();
                dtheh.selectoffer();
            }
            case 4 -> {
                ChatBot.chatbot.push("New_Offer");
                NewOfferHindi noeh=new NewOfferHindi();
                noeh.selectoffer();
            }
            case 9 -> {
                ChatBot.chatbot.pop();
                lang.selectLanguage();
            }
            case 0 -> System.exit(0);
        }
    }
}
class RechargeHindi
{
    Scanner sc=new Scanner(System.in);
    Hindi hindi=new Hindi();
    void selectoffer()
    {
        System.out.println("apana vikalp darj karen:\n1.179:2GB+1GB/Day+UL,28 days\n2.50TT,28 days\n3.399:1.5GB/Day+UL,56 days");
        System.out.println("4.239:1.5GB/Day+UL,28 days\n9.vaapas\n0.baahar jaen");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("179:2GB+1GB/Day+UL,28 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("50TT,28 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("399:1.5GB/Day+UL,56 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("239:1.5GB/Day+UL,28 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                hindi.selectHindi();
            }
            case 0 -> System.exit(0);
        }
    }
}
class CallerTuneHindi
{
    Scanner sc=new Scanner(System.in);
    Hindi hindi=new Hindi();
    void selectoffer()
    {
        System.out.println("apana vikalp darj karen:\n1.Dheere Dheere Se Meri Zindagi Mein Aana(Aashiqui)\n2.Tum Hi Ho(Aashiqui 2)");
        System.out.println("3.Galliyan(Ek Villain)\n4.Chaka Chak(Atrangi Re)\n9.vaapas\n0.baahar jaen");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("Dheere Dheere Se Meri Zindagi Mein Aana(Aashiqui)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("Tum Hi Ho(Aashiqui 2)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("Galliyan(Ek Villain)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("Chaka Chak(Atrangi Re)");
                        System.out.println("Caller Tune added Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                hindi.selectHindi();
            }
            case 0 -> System.exit(0);
        }
    }
}
class DTHHindi
{
    Scanner sc=new Scanner(System.in);
    Hindi hindi=new Hindi();
    void selectoffer()
    {
        System.out.println("apana vikalp darj karen:\n1.200/Month,keval Hindi chainalon\n2.500/Month,sab chainalon");
        System.out.println("3.100/Month,keval sangeet chainalon\n4.250/Month,Hindi tatha English chainalon\n9.vaapas\n0.baahar jaen");
        int option=sc.nextInt();
        switch (option) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("200/Month,keval Hindi chainalon");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("500/Month,sab chainalon");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 3 ->
                    {
                        ChatBot.chatbot.push("100/Month,keval sangeet chainalon");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 4 ->
                    {
                        ChatBot.chatbot.push("250/Month,Hindi tatha English chainalon");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                hindi.selectHindi();
            }
            case 0 -> System.exit(0);
        }
    }
}
class NewOfferHindi
{
    Scanner sc=new Scanner(System.in);
    Hindi hindi=new Hindi();
    void selectoffer()
    {
        System.out.println("apana vikalp darj karen\n1.1000: UL antararaashtreey kol,5 days \n2.1700: UL antararaashtreey kol,15 days");
        System.out.println("9.vaapas\n0.baahar jaen");
        int book=sc.nextInt();
        switch (book) {
            case 1 ->
                    {
                        ChatBot.chatbot.push("1000: UL antararaashtreey kol,5 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 2 ->
                    {
                        ChatBot.chatbot.push("1700: UL antararaashtreey kol,15 days");
                        System.out.println("Recharged Successfully");
                        System.out.println("Enter Your Option:\n9.Back\n0.Exit");
                        int opt=sc.nextInt();
                        if(opt==9) {
                            ChatBot.chatbot.pop();
                            hindi.selectHindi();
                        }
                        else
                        {
                            System.exit(0);
                        }
                    }
            case 9 -> {
                ChatBot.chatbot.pop();
                hindi.selectHindi();
            }
            case 0 -> System.exit(0);
        }
    }
}

