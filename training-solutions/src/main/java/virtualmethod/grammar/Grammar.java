package virtualmethod.grammar;

import java.lang.ref.PhantomReference;

public class Grammar {
    public static void main(String[] args) {
        Verb verbPrhasal = new PhrasalVerb("mondj","el");
        System.out.println(verbPrhasal.word);
        System.out.println(verbPrhasal.getWord());
        System.out.println("vege");

        Verb verbSuffix = new PhrasalVerbWithSuffix("mondj","meg","valamit");
        System.out.println(verbSuffix.word);
        System.out.println(verbSuffix.getWord());
        System.out.println("vege");

        Preposition prepPhrasal = new PhrasalVerb("kelj","fel");
        System.out.println(prepPhrasal.getPreposition());
        System.out.println(prepPhrasal.getWholeWord());
        System.out.println("vege");

        Preposition prepSuffix = new PhrasalVerbWithSuffix("edd","meg","azt");
        System.out.println(prepSuffix.getWholeWord());
        System.out.println(prepSuffix.getPreposition());
        System.out.println("vege");

        PhrasalVerb phrasPhras = new PhrasalVerb("állj","le");
        System.out.println(phrasPhras.getPreposition());
        System.out.println(phrasPhras.getWord());
        System.out.println(phrasPhras.getWholeWord());
        System.out.println(phrasPhras.word);
        System.out.println(phrasPhras.preposition);
        System.out.println("vege");

        PhrasalVerb phrasSuffix = new PhrasalVerbWithSuffix("ülj","le","oda");
        System.out.println(phrasSuffix.preposition);
        System.out.println(phrasSuffix.word);
        System.out.println(phrasSuffix.getWord());
        System.out.println(phrasSuffix.getWholeWord());
        System.out.println(phrasSuffix.getPreposition());
        System.out.println("vege");


        Suffix sufffix = new PhrasalVerbWithSuffix("menj","ide","oda");
        System.out.println(sufffix.getSuffix());

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("volt","elég","már");
        System.out.println(phrasalVerbWithSuffix.preposition);
        System.out.println(phrasalVerbWithSuffix.word);
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println("vege");

    }




}
