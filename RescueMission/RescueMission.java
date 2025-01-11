/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RescueMission;

import java.util.Scanner;

/**
 *
 * @author KMNS
 */
public class RescueMission {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean ischoscse = false;
        
        int sot = 0;
        long startTime = 0;
        int fuel = 0;
        int point = 0;
        int pts = 0;
        String name = "Player";
        int user = 0;
        int area = 0;
        int survivors = 0;
        int hazards = 0;
        int hazardscost = 0;
        int fuelLosee = 0;
        int RescuingSurvivor = 0;
        int Rescue = 0;
        String GameDifficulty = "";
        System.out.println("********* Welcome to Rescue Mission! *********");
        do {
            System.out.println(" *** Main Page:-   ");
            System.out.println("1 – Change your name\n"
                    + "2 – Set game difficulty\n"
                    + "3 - Start game\n"
                    + "4 – Exit game");
            user = in.nextInt();

            if (user == 1) {
                System.out.println("Write your name :");
                name = in.next();
            } else if (user == 2) {
                System.out.println("Please select the game difficulty");
                System.out.println("E) Easy:\n"
                        + "M) Medium:\n"
                        + "H) Hard:");
                GameDifficulty = in.next();
                switch (GameDifficulty) {
                    case "e":
                    case "E":
                        System.out.println("A game area of 10x10 will be used.\n"
                                + "There are 3 survivors and 5 hazards.\n"
                                + "Each movement will consume 2 liters of fuel.\n"
                                + "Rescuing a survivor rewards 5 points.\n"
                                + "Initial fuel of the rescue team is 150 liters.");
                        fuelLosee = 2;
                        area = 10;
                        survivors = 3;
                        fuel = 150;
                        point = 5;
                        ischoscse = true;
                        break;
                    case "m":
                    case "M":
                        System.out.println("o A game area of 15x15 will be used.\n"
                                + "o There are 4 survivors and 8 hazards.\n"
                                + "o Each movement will consume 3 liters of fuel.\n"
                                + "o Rescuing a survivor rewards 10 points.\n"
                                + "o Initial fuel of the rescue team is 120 liters.");

                        area = 15;
                        survivors = 4;
                        fuel = 120;
                        fuelLosee = 3;
                        point = 10;
                        ischoscse = true;
                        break;
                    case "h":
                    case "H":
                        System.out.println("A game area of 20x20 will be used.\n"
                                + "o There are 5 survivors and 10 hazards.\n"
                                + "o Each movement will consume 5 liters of fuel.\n"
                                + "o Rescuing a survivor rewards 15 points.\n"
                                + "o Initial fuel of the rescue team is 100 liters");
                        area = 20;
                        survivors = 5;
                        fuel = 100;
                        fuelLosee = 5;
                        point = 15;
                        ischoscse = true;
                    default:
                        System.out.println("Invalid chosce! Use E , M OR H.");
                }
            } else if (user == 3) {
                if (!ischoscse) {
                    System.out.println("First you want chosce the difficulty.");
                    continue;
                }
                startTime = (System.currentTimeMillis() / 1000);
                int playerx = 0;
                int playery = 0;

                switch (area) {
                    case 10:

                        /////////////////////////////////////////////////////
                        int Wildanimalencounter1x = (int) (Math.random() * area + 1); //مواجهة حيوان بري
                        int Wildanimalencounter1y = (int) (Math.random() * area + 1);
                        while (Wildanimalencounter1x == 0 && Wildanimalencounter1y == 0) {
                            Wildanimalencounter1y = (int) (Math.random() * area + 1);
                        }
                        int Wildanimalencounter2x = (int) (Math.random() * area + 1);
                        ;
                        int Wildanimalencounter2y = (int) (Math.random() * area + 1);
                        ;
                        while (Wildanimalencounter2x == 0 && Wildanimalencounter2y == 0) {
                            Wildanimalencounter2x = (int) (Math.random() * area + 1);
                        }
                        int BlockedPathsx = (int) (Math.random() * area + 1);
                        int BlockedPathsy = (int) (Math.random() * area + 1); //المسارات المحظورة
                        while (BlockedPathsx == 0 && BlockedPathsy == 0) {
                            BlockedPathsx = (int) (Math.random() * area + 1);
                        }
                        int SnowDriftsx = (int) (Math.random() * area + 1);
                        int SnowDriftsy = (int) (Math.random() * area + 1); //الانجرافات الثلجية
                        while (SnowDriftsx == 0 && SnowDriftsy == 0) {
                            SnowDriftsx = (int) (Math.random() * area + 1);
                        }
                        int ColdSnapx = (int) (Math.random() * area + 1);
                        int ColdSnapy = (int) (Math.random() * area + 1); //انخفاض درجة الحرارة المفاجئ
                        while (ColdSnapx == 0 && ColdSnapy == 0) {
                            ColdSnapx = (int) (Math.random() * area + 1);
                        }
                        /////////////////////////////////////////////////////
                        int survivors1x = (int) (Math.random() * area + 1);// الناجين
                        int survivors1y = (int) (Math.random() * area + 1);
                        while (survivors1x == 0 && survivors1y == 0) {
                            survivors1x = (int) (Math.random() * area + 1);
                        }
                        int survivors2x = (int) (Math.random() * area + 1);
                        int survivors2y = (int) (Math.random() * area + 1);
                        while (survivors2x == 0 && survivors2y == 0) {
                            survivors2x = (int) (Math.random() * area + 1);
                        }
                        int survivors3x = (int) (Math.random() * area + 1);
                        int survivors3y = (int) (Math.random() * area + 1);
                        while (survivors3x == 0 && survivors3y == 0) {
                            survivors3x = (int) (Math.random() * area + 1);
                        }
                        System.out.println("Start the game");
                        System.out.println("position of " + name + ": ( " + playerx + " , " + playery + " )");

                        /////////////////////////////////////////////////////
                        while (fuel > 0 && survivors != 0) {
                            Rescue++;
                            System.out.println("Move? Use (W/A/S/D) ");
                            char move = in.next().toUpperCase().charAt(0);

                            int playernewx = playerx;
                            int playernewy = playery;

                            switch (move) {
                                case 'W':
                                    playernewy++;
                                    break;
                                case 'S':
                                    playernewy--;
                                    break;
                                case 'D':
                                    playernewx++;
                                    break;
                                case 'A':
                                    playernewx--;
                                default:
                                    System.out.println("Invalid move! Use W/A/S/D.");
                                    continue;
                            }

                            if (playernewx < 0 || playernewx > area || playernewy < 0 || playernewy > area) {
                                System.out.println("You can't move outside the grid!");
                                continue;
                            }

                            playerx = playernewx;
                            playery = playernewy;

                            System.out.println("position of " + name + ": ( " + playerx + " , " + playery + " )");
                            System.out.println("Movement cost: (- 2 liters)");
                            fuel -= fuelLosee;
                            if (playerx == survivors1x && playery == survivors1y || playerx == survivors2x && playery == survivors2y || playerx == survivors3x && playery == survivors3y) {
                                RescuingSurvivor++; // عدد الناجي
                                pts += point;
                                System.out.println("A survivor found: (+ " + point + " pts)");
                            } else {
                                System.out.println("No survivors found: (+ 0 pts)");
                            }
                            // هذا للمشاكل الذي ستواجهك        
                            if (playerx == Wildanimalencounter1x && playery == Wildanimalencounter1y || playerx == Wildanimalencounter2x && playery == Wildanimalencounter2y) {
                                int random = 2 + (int) (Math.random() * 7);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Wild animal encounter: (- " + random + " liters)");
                            } else if (playerx == BlockedPathsx && playery == BlockedPathsy) {
                                int random = 10 + (int) (Math.random() * 7);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Blocked Paths: (- " + random + " liters)");
                            } else if (playerx == SnowDriftsx && playery == SnowDriftsy) {
                                int random = 2 + (int) (Math.random() * 5);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Snow Driftsx: (- " + random + " liters)");
                            } else if (playerx == ColdSnapx && playery == ColdSnapy) {
                                int random = 5 + (int) (Math.random() * 5);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Cold Snap: (- " + random + " liters)");
                            } else {
                                System.out.println("0 hazards encounter: (- 0 liters)");
                            }
                            System.out.println("Current fuel:" + fuel + " liters");

                        }// end of the reperd of uer move.

                        if (survivors == RescuingSurvivor && fuel > 0) {
                            System.out.println("******* " + name + " HAS WON *******");
                        } else {
                            System.out.println("******* " + name + " HAS LOST *******");
                        }
                        System.out.print("Rescue team moved " + Rescue + " times. ");
                        System.out.println("This cost you " + (fuelLosee * Rescue) + " liters of fuel.");
                        long LastTime = (System.currentTimeMillis() / 1000);
                        System.out.println("The elapsed time is " + (LastTime - startTime) + " seconds.");
                        System.out.println(RescuingSurvivor + " survivors are rescued.");
                        System.out.println(hazards + " hazards are encountered. This cost you " + hazardscost + " liters of fuel.");
                        System.out.println("Final score is " + pts + " points.");
                        break;
                    case 15: //                            case of 15
                        /////////////////////////////////////////////////////

                        Wildanimalencounter1x = (int) (Math.random() * (area + 1)); //مواجهة حيوان بري
                        Wildanimalencounter1y = (int) (Math.random() * (area + 1));
                        while (Wildanimalencounter1x == 0 && Wildanimalencounter1y == 0) {
                            Wildanimalencounter1y = (int) (Math.random() * (area + 1));
                        }
                        Wildanimalencounter2x = (int) (Math.random() * (area + 1));
                        ;
                        Wildanimalencounter2y = (int) (Math.random() * (area + 1));
                        ;
                        while (Wildanimalencounter2x == 0 && Wildanimalencounter2y == 0) {
                            Wildanimalencounter2x = (int) (Math.random() * (area + 1));
                        }
                        BlockedPathsx = (int) (Math.random() * (area + 1));
                        BlockedPathsy = (int) (Math.random() * (area + 1)); //المسارات المحظورة
                        while (BlockedPathsx == 0 && BlockedPathsy == 0) {
                            BlockedPathsx = (int) (Math.random() * (area + 1));
                        }
                        int BlockedPathsx1 = (int) (Math.random() * (area + 1));
                        int BlockedPathsy1 = (int) (Math.random() * (area + 1)); //المسارات المحظورة
                        while (BlockedPathsx1 == 0 && BlockedPathsy1 == 0) {
                            BlockedPathsx1 = (int) (Math.random() * (area + 1));
                        }

                        SnowDriftsx = (int) (Math.random() * (area + 1));
                        SnowDriftsy = (int) (Math.random() * (area + 1)); //الانجرافات الثلجية
                        while (SnowDriftsx == 0 && SnowDriftsy == 0) {
                            SnowDriftsx = (int) (Math.random() * (area + 1));
                        }
                        int SnowDriftsx1 = (int) (Math.random() * (area + 1));
                        int SnowDriftsy1 = (int) (Math.random() * (area + 1)); //الانجرافات الثلجية
                        while (SnowDriftsx1 == 0 && SnowDriftsy1 == 0) {
                            SnowDriftsx1 = (int) (Math.random() * (area + 1));
                        }
                        ColdSnapx = (int) (Math.random() * (area + 1));
                        ColdSnapy = (int) (Math.random() * (area + 1)); //انخفاض درجة الحرارة المفاجئ
                        while (ColdSnapx == 0 && ColdSnapy == 0) {
                            ColdSnapx = (int) (Math.random() * (area + 1));
                        }
                        int ColdSnapx1 = (int) (Math.random() * (area + 1));
                        int ColdSnapy1 = (int) (Math.random() * (area + 1)); //انخفاض درجة الحرارة المفاجئ
                        while (ColdSnapx1 == 0 && ColdSnapy1 == 0) {
                            ColdSnapx1 = (int) (Math.random() * (area + 1));
                        }
                        /////////////////////////////////////////////////////
                        survivors1x = (int) (Math.random() * (area + 1));// الناجين
                        survivors1y = (int) (Math.random() * (area + 1));
                        while (survivors1x == 0 && survivors1y == 0) {
                            survivors1x = (int) (Math.random() * (area + 1));
                        }
                        survivors2x = (int) (Math.random() * (area + 1));
                        survivors2y = (int) (Math.random() * (area + 1));
                        while (survivors2x == 0 && survivors2y == 0) {
                            survivors2x = (int) (Math.random() * (area + 1));
                        }
                        survivors3x = (int) (Math.random() * (area + 1));
                        survivors3y = (int) (Math.random() * (area + 1));
                        while (survivors3x == 0 && survivors3y == 0) {
                            survivors3x = (int) (Math.random() * (area + 1));
                        }
                        int survivors4x = (int) (Math.random() * (area + 1));
                        int survivors4y = (int) (Math.random() * (area + 1));
                        while (survivors4x == 0 && survivors4y == 0) {
                            survivors4x = (int) (Math.random() * (area + 1));
                        }
                        System.out.println("Start the game");
                        System.out.println("position of " + name + ": ( " + playerx + " , " + playery + " )");

                        /////////////////////////////////////////////////////
                        while (fuel > 0 && survivors != 0) {
                            Rescue++;
                            System.out.println("Move? ");
                            char move = in.next().toUpperCase().charAt(0);

                            int playernewx = playerx;
                            int playernewy = playery;

                            switch (move) {
                                case 'W':
                                    playernewy++;
                                    break;
                                case 's':
                                    playernewy--;
                                    break;
                                case 'D':
                                    playernewx++;
                                    break;
                                case 'A':
                                    playernewx--;
                                default:
                                    System.out.println("Invalid move! Use W/A/S/D.");
                                    continue;
                            }

                            if (playernewx < 0 || playernewx > area || playernewy < 0 || playernewy > area) {
                                System.out.println("You can't move outside the grid!");
                                continue;
                            }

                            playerx = playernewx;
                            playery = playernewy;

                            System.out.println("position of " + name + ": ( " + playerx + " , " + playery + " )");
                            System.out.println("Movement cost: (- 2 liters)");
                            fuel -= fuelLosee;
                            if (playerx == survivors1x && playery == survivors1y || playerx == survivors2x && playery == survivors2y || playerx == survivors3x && playery == survivors3y || playerx == survivors4x && playery == survivors4y) {
                                RescuingSurvivor++; // عدد الناجي
                                pts += point;
                                System.out.println("A survivor found: (+ " + point + " pts)");
                            } else {
                                System.out.println("No survivors found: (+ 0 pts)");
                            }
                            // هذا للمشاكل الذي ستواجهك        
                            if (playerx == Wildanimalencounter1x && playery == Wildanimalencounter1y || playerx == Wildanimalencounter2x && playery == Wildanimalencounter2y) {
                                int random = 2 + (int) (Math.random() * 7);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Wild animal encounter: (- " + random + " liters)");
                            } else if (playerx == BlockedPathsx && playery == BlockedPathsy || playerx == BlockedPathsx1 && playery == BlockedPathsy1) {
                                int random = 10 + (int) (Math.random() * 7);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Blocked Paths: (- " + random + " liters)");
                            } else if (playerx == SnowDriftsx && playery == SnowDriftsy || playerx == SnowDriftsx1 && playery == SnowDriftsy1) {
                                int random = 2 + (int) (Math.random() * 5);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Snow Driftsx: (- " + random + " liters)");
                            } else if (playerx == ColdSnapx && playery == ColdSnapy || playerx == ColdSnapx1 && playery == ColdSnapy1) {
                                int random = 5 + (int) (Math.random() * 5);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Cold Snap: (- " + random + " liters)");
                            } else {
                                System.out.println("0 hazards encounter: (- 0 liters)");
                            }
                            System.out.println("Current fuel:" + fuel + " liters");

                        }// end of the reperd of uer move.

                        if (RescuingSurvivor == survivors && fuel > 0) {
                            System.out.println("******* " + name + " HAS WON *******");
                        } else {
                            System.out.println("******* " + name + " HAS LOST *******");
                        }
                        System.out.print("Rescue team moved " + Rescue + " times. ");
                        System.out.println("This cost you " + (fuelLosee * Rescue) + " liters of fuel.");
                        long LastTime1 = (System.currentTimeMillis() / 1000);
                        System.out.println("The elapsed time is " + (LastTime1 - startTime) + " seconds.");
                        System.out.println(RescuingSurvivor + " survivors are rescued.");
                        System.out.println(hazards + " hazards are encountered. This cost you " + hazardscost + " liters of fuel.");
                        System.out.println("Final score is " + pts + " points.");
                        break;
                    case 20:
                        /////////////////////////////////////////////////////

                        Wildanimalencounter1x = (int) (Math.random() * (area + 1)); //مواجهة حيوان بري
                        Wildanimalencounter1y = (int) (Math.random() * (area + 1));
                        while (Wildanimalencounter1x == 0 && Wildanimalencounter1y == 0) {
                            Wildanimalencounter1y = (int) (Math.random() * (area + 1));
                        }
                        Wildanimalencounter2x = (int) (Math.random() * (area + 1));
                        ;
                        Wildanimalencounter2y = (int) (Math.random() * (area + 1));
                        ;
                        while (Wildanimalencounter2x == 0 && Wildanimalencounter2y == 0) {
                            Wildanimalencounter2x = (int) (Math.random() * (area + 1));
                        }
                        BlockedPathsx = (int) (Math.random() * (area + 1));
                        BlockedPathsy = (int) (Math.random() * (area + 1)); //المسارات المحظورة
                        while (BlockedPathsx == 0 && BlockedPathsy == 0) {
                            BlockedPathsx = (int) (Math.random() * (area + 1));
                        }
                        BlockedPathsx1 = (int) (Math.random() * (area + 1));
                        BlockedPathsy1 = (int) (Math.random() * (area + 1)); //المسارات المحظورة
                        while (BlockedPathsx1 == 0 && BlockedPathsy1 == 0) {
                            BlockedPathsx1 = (int) (Math.random() * (area + 1));
                        }
                        int BlockedPathsx2 = (int) (Math.random() * (area + 1));
                        int BlockedPathsy2 = (int) (Math.random() * (area + 1)); //المسارات المحظورة
                        while (BlockedPathsx2 == 0 && BlockedPathsy2 == 0) {
                            BlockedPathsx2 = (int) (Math.random() * (area + 1));
                        }

                        SnowDriftsx = (int) (Math.random() * (area + 1));
                        SnowDriftsy = (int) (Math.random() * (area + 1)); //الانجرافات الثلجية
                        while (SnowDriftsx == 0 && SnowDriftsy == 0) {
                            SnowDriftsx = (int) (Math.random() * (area + 1));
                        }
                        SnowDriftsx1 = (int) (Math.random() * (area + 1));
                        SnowDriftsy1 = (int) (Math.random() * (area + 1)); //الانجرافات الثلجية
                        while (SnowDriftsx1 == 0 && SnowDriftsy1 == 0) {
                            SnowDriftsx1 = (int) (Math.random() * (area + 1));
                        }
                        ColdSnapx = (int) (Math.random() * (area + 1));
                        ColdSnapy = (int) (Math.random() * (area + 1)); //انخفاض درجة الحرارة المفاجئ
                        while (ColdSnapx == 0 && ColdSnapy == 0) {
                            ColdSnapx = (int) (Math.random() * (area + 1));
                        }
                        ColdSnapx1 = (int) (Math.random() * (area + 1));
                        ColdSnapy1 = (int) (Math.random() * (area + 1)); //انخفاض درجة الحرارة المفاجئ
                        while (ColdSnapx1 == 0 && ColdSnapy1 == 0) {
                            ColdSnapx1 = (int) (Math.random() * (area + 1));
                        }
                        int ColdSnapx2 = (int) (Math.random() * (area + 1));
                        int ColdSnapy2 = (int) (Math.random() * (area + 1)); //انخفاض درجة الحرارة المفاجئ
                        while (ColdSnapx2 == 0 && ColdSnapy2 == 0) {
                            ColdSnapx2 = (int) (Math.random() * (area + 1));
                        }
                        /////////////////////////////////////////////////////
                        survivors1x = (int) (Math.random() * (area + 1));// الناجين
                        survivors1y = (int) (Math.random() * (area + 1));
                        while (survivors1x == 0 && survivors1y == 0) {
                            survivors1x = (int) (Math.random() * (area + 1));
                        }
                        survivors2x = (int) (Math.random() * (area + 1));
                        survivors2y = (int) (Math.random() * (area + 1));
                        while (survivors2x == 0 && survivors2y == 0) {
                            survivors2x = (int) (Math.random() * (area + 1));
                        }
                        survivors3x = (int) (Math.random() * (area + 1));
                        survivors3y = (int) (Math.random() * (area + 1));
                        while (survivors3x == 0 && survivors3y == 0) {
                            survivors3x = (int) (Math.random() * (area + 1));
                        }
                        survivors4x = (int) (Math.random() * (area + 1));
                        survivors4y = (int) (Math.random() * (area + 1));
                        while (survivors4x == 0 && survivors4y == 0) {
                            survivors4x = (int) (Math.random() * (area + 1));
                        }
                        int survivors5x = (int) (Math.random() * (area + 1));
                        int survivors5y = (int) (Math.random() * (area + 1));
                        while (survivors5x == 0 && survivors5y == 0) {
                            survivors5x = (int) (Math.random() * (area + 1));
                        }

                        System.out.println("Start the game");
                        System.out.println("position of " + name + ": ( " + playerx + " , " + playery + " )");

                        /////////////////////////////////////////////////////
                        while (fuel > 0 && survivors != 0) {
                            Rescue++;
                            System.out.println("Move? ");
                            char move = in.next().toUpperCase().charAt(0);

                            int playernewx = playerx;
                            int playernewy = playery;

                            switch (move) {
                                case 'W':
                                    playernewy++;
                                    break;
                                case 's':
                                    playernewy--;
                                    break;
                                case 'D':
                                    playernewx++;
                                    break;
                                case 'A':
                                    playernewx--;
                                default:
                                    System.out.println("Invalid move! Use W/A/S/D.");
                                    continue;
                            }

                            if (playernewx < 0 || playernewx > area || playernewy < 0 || playernewy > area) {
                                System.out.println("You can't move outside the grid!");
                                continue;
                            }

                            playerx = playernewx;
                            playery = playernewy;

                            System.out.println("position of " + name + ": ( " + playerx + " , " + playery + " )");
                            System.out.println("Movement cost: (- 2 liters)");
                            fuel -= fuelLosee;
                            if (playerx == survivors1x && playery == survivors1y || playerx == survivors2x && playery == survivors2y || playerx == survivors3x && playery == survivors3y || playerx == survivors4x && playery == survivors4y || playerx == survivors5x && playery == survivors5y) {
                                RescuingSurvivor++; // عدد الناجي
                                pts += point;
                                System.out.println("A survivor found: (+ " + point + " pts)");
                            } else {
                                System.out.println("No survivors found: (+ 0 pts)");
                            }
                            // هذا للمشاكل الذي ستواجهك        
                            if (playerx == Wildanimalencounter1x && playery == Wildanimalencounter1y || playerx == Wildanimalencounter2x && playery == Wildanimalencounter2y) {
                                int random = 2 + (int) (Math.random() * 7);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Wild animal encounter: (- " + random + " liters)");
                            } else if (playerx == BlockedPathsx && playery == BlockedPathsy || playerx == BlockedPathsx1 && playery == BlockedPathsy1 || playerx == BlockedPathsx2 && playery == BlockedPathsy2) {
                                int random = 10 + (int) (Math.random() * 7);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Blocked Paths: (- " + random + " liters)");
                            } else if (playerx == SnowDriftsx && playery == SnowDriftsy || playerx == SnowDriftsx1 && playery == SnowDriftsy1) {
                                int random = 2 + (int) (Math.random() * 5);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Snow Driftsx: (- " + random + " liters)");
                            } else if (playerx == ColdSnapx && playery == ColdSnapy || playerx == ColdSnapx1 && playery == ColdSnapy1 || playerx == ColdSnapx2 && playery == ColdSnapy2) {
                                int random = 5 + (int) (Math.random() * 5);
                                fuel -= random;
                                hazardscost += random;
                                hazards++;
                                System.out.println("You encountered a Cold Snap: (- " + random + " liters)");
                            } else {
                                System.out.println("0 hazards encounter: (- 0 liters)");
                            }
                            System.out.println("Current fuel:" + fuel + " liters");

                        }// end of the reperd of uer move.

                        if (survivors == RescuingSurvivor && fuel > 0) {
                            System.out.println("******* " + name + " HAS WON *******");
                        } else {
                            System.out.println("******* " + name + " HAS LOST *******");
                        }
                        System.out.print("Rescue team moved " + Rescue + " times. ");
                        System.out.println("This cost you " + (fuelLosee * Rescue) + " liters of fuel.");
                        long LastTime2 = (System.currentTimeMillis() / 1000);
                        System.out.println("The elapsed time is " + (LastTime2 - startTime) + " seconds.");
                        System.out.println(RescuingSurvivor + " survivors are rescued.");
                        System.out.println(hazards + " hazards are encountered. This cost you " + hazardscost + " liters of fuel.");
                        System.out.println("Final score is " + pts + " points.");
                        break;
                }

            } else if (user == 4 ) {
                System.out.println("Good bye!");
            } else {
                System.out.println("Invalid choices! Use 1 to 4.");
            }
           
            
        } while (user != 4 );
        ///             the last the game //

    }
}
