import clavier.In;

public class Main {
    public static void main(String[] args) {
        final  int NC = 1 ,_40 = 2, _30_5 = 3, _30_4 = 4, _30_3 = 5, _30_2 = 6, _30_1 = 7, _30 = 8, _15_5 = 9, _15_4 = 10;
        int points = 0, classement = 0,nbVictoireMax = 0, nbVictoire = 0, pointsGagne = 0 , classementAdvers = 0;
        System.out.println(""" 
                Entre ton classement:
                ------------------------------------------------------------
                | NC => 1   | 40 => 2  | 30/5 => 3 | 30/4 => 4 | 30/3 => 5 |
                ------------------------------------------------------------
                | 30/2 => 6 | 30/1 => 7| 30 => 8   | 15/5 => 9 | 15/4 => 10|
                ------------------------------------------------------------""");
        classement = In.readInteger();
        switch (classement) {
            case NC:
                points = 0;
                break;
            case _40:
                points = 2;
                break;
            case _30_5:
                points = 5;
                break;
            case _30_4:
                points = 10;
                break;
            case _30_3:
                points = 20;
                break;
            case _30_2:
                points = 30;
                break;
            case _30_1:
                points = 50;
                break;
            case _30:
                points = 80;
                break;
            case _15_5:
                points = 120;
                break;
            case _15_4:
                points = 160;
                break;
        }
        switch (classement) {
            case NC,_40,_30_5,_30_4:
                nbVictoireMax = 5;
                break;
            case _30_3,_30_2,_30_1,_30,_15_5,_15_4:
                nbVictoireMax = 6;
                break;
        }

        System.out.println("Le nombre de points de départ est de : " + points + " points");
        System.out.println("Le nombre de Victoire max est de : " + nbVictoireMax);
        System.out.println();
        System.out.print("Entre ton nombre de Victoire :");
        nbVictoire = In.readInteger();

        if (nbVictoire > nbVictoireMax) {
            for (int i = 0; i < nbVictoireMax; i++) {
                System.out.println(""" 
                Entre le classement des adversaire:
                ------------------------------------------------------------
                | NC => 1   | 40 => 2  | 30/5 => 3 | 30/4 => 4 | 30/3 => 5 |
                ------------------------------------------------------------
                | 30/2 => 6 | 30/1 => 7| 30 => 8   | 15/5 => 9 | 15/4 => 10|
                ------------------------------------------------------------""");
                System.out.print("Entre tes Victoire :");
                classementAdvers = In.readInteger();
                switch (classement) {
                    case NC:
                        switch (classementAdvers) {
                            case NC:
                                pointsGagne = 50;
                                points = points + pointsGagne;
                                break;
                            case _40:
                                pointsGagne = 100;
                                break;
                            default:
                                pointsGagne = 150;

                        };
                        break;
                    case _40:

                        break;
                    case _30_5:

                        break;
                    case _30_4:

                        break;
                    case _30_3:

                        break;
                    case _30_2:

                        break;
                    case _30_1:

                        break;
                    case _30:

                        break;
                    case _15_5:

                        break;
                    case _15_4:

                        break;
                }
                System.out.println(pointsGagne + " points");
            }


        }else {

        }
    }
}