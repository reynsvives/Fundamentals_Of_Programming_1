
/**
 * Write a description of class TestKlasse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class TestKlasse
{
    public static void main(String[] args)
    {
        //ArrayList voor boten
        ArrayList<Boot> boten = new ArrayList<>();
        ArrayList<Reservatie> reservaties = new ArrayList<>();
        ArrayList<Lid> leden = new ArrayList<>();
        
        //Zeilboten maken: Zeilboot(String p_naam, boolean p_heeftRadar, boolean heeftGPS)
        
        boten.add(new Zeilboot("Zeilboot, Radar, GPS", true, true)); //0
        boten.add(new Zeilboot("Zeilboot, Radar, geen GPS", true, false)); //1
        boten.add(new Zeilboot("Zeilboot, geen Radar, GPS", false, true)); //2
        boten.add(new Zeilboot("Zeilboot, geen Radar, geen GPS", false, false)); //3
        
        //Motorboten maken: Motorboot(String p_naam, boolean p_heeftRadar, boolean fishFinder)
        
        boten.add(new Motorboot("Motorboot, Radar, Fish", true, true)); //4
        boten.add(new Motorboot("Motorboot, Radar, geen Fish", true, false)); //5
        boten.add(new Motorboot("Motorboot, geen Radar, Fish", false, true)); //6
        boten.add(new Motorboot("Motorboot, geen Radar, geen Fish", false, false)); //7
        
        //Leden aanmaken: Lid(String p_naam, String p_telefoonNummer)
        
        leden.add(new Lid("Gewoon lid", "0477/417.442")); //0
        leden.add(new GoudenLid("Gouden lid", "0485/611.049", 10)); //1
        
        //Reservaties voor zeilboten: Reservatie(Lid p_Lid, Boot p_Boot, double p_aantalUren)
        
        System.out.println("Zeilboot, radar, gps, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(0), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(0).kostReservatie());
        
        System.out.println("Zeilboot, radar, gps, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(0), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(1).kostReservatie());
        
        System.out.println("Zeilboot, radar, geen gps, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(1), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(2).kostReservatie());
        
        System.out.println("Zeilboot, radar, geen gps, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(1), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(3).kostReservatie());
        
        System.out.println("Zeilboot, geen radar, gps, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(2), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(4).kostReservatie());
        
        System.out.println("Zeilboot, geen radar, gps, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(2), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(5).kostReservatie());
        
        System.out.println("Zeilboot, geen radar, geen gps, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(3), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(6).kostReservatie());
        
        System.out.println("Zeilboot, geen radar, geen gps, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(3), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(7).kostReservatie());
        
        //Reservaties voor motorboten
        
        System.out.println("Motorboot, radar, fish, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(4), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(8).kostReservatie());
        
        System.out.println("Motorboot, radar, fish, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(4), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(9).kostReservatie());
        
        System.out.println("Motorboot, radar, geen fish, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(5), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(10).kostReservatie());
        
        System.out.println("Motorboot, radar, geen fish, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(5), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(11).kostReservatie());
        
        System.out.println("Motorboot, geen radar, fish, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(6), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(12).kostReservatie());
        
        System.out.println("Motorboot, geen radar, fish, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(6), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(13).kostReservatie());
        
        System.out.println("Motorboot, geen radar, geen fish, gewoon lid");
        reservaties.add(new Reservatie(leden.get(0), boten.get(7), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(14).kostReservatie());
        
        System.out.println("Motorboot, geen radar, geen fish, gouden lid");
        reservaties.add(new Reservatie(leden.get(1), boten.get(7), 5.0));
        System.out.println("kost reservatie: " + reservaties.get(15).kostReservatie());
        
    }
}
