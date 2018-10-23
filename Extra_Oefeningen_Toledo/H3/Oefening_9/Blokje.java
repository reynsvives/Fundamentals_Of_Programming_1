
/**
 Oefening 9.
 */
public class Blokje
{
   
   
   //Velden
   private double lengte;
   private double breedte;
   private double hoogte;
   
   //Constructor
   public Blokje(double lengte, double breedte, double hoogte)
   {
       this.lengte = lengte;
       this.breedte = breedte;
       this.hoogte = hoogte;
   }
   
   //getTotalArea: oppervlakte van alle vlakken bepalen
   
   public double getTotalArea()
   {
       double area;
       
       //Area = 2 * grondvlak + 2 * zijvlak1 + 2 * zijvlak2
        
       area = (lengte * breedte) * 2 + 
              (lengte * hoogte) * 2 + 
              (breedte * hoogte) * 2; 
       
       return(area);
   }
   
   //getContent: inhoud bepalen
   
   public double getContent()
   {
       double content;
       
       //Inhoud = lengte * breedte * hoogte
       
       content = lengte * breedte * hoogte;
       
       return(content);
   }
   
   //getArea1: Oppervlakte van 1 zijwand (lengte * breedte).   
   public double getArea1()
   {
       double area;
       
       area = lengte * breedte;
       
       return(area);
   }
   
   //past(): methode om te testen of er minstens 1 vlak even groot is 
    //voor beide blokjes.
    
   public boolean past(Blokje b)
   {
       boolean past;
       double opp_vlak1;
       double opp_vlak2;
       
       past = false;
       
       //De blokjes mogen gedraaid worden
       //Voor zijvlak 1 (rechts en links) 
       //Voor zijvlak 2 (onder en boven) 
       //voor zijvlak 3 (voor en achter) 
       
       //Alle combinaties van zijvlakken moeten met elkaar afgetoetst worden
       
       //Blok1.zijvlak1 = Blok2.zijvlak1
       
       if(
       (this.breedte == b.breedte && this.hoogte == b.hoogte)
       || (this.breedte == b.hoogte && this.hoogte == b.breedte))
       
       past = true;
       
       //Blok1.zijvlak1 = Blok2.zijvlak2
       
       if(
       (this.hoogte == b.lengte && this.breedte == b.breedte)
       || (this.hoogte == b.breedte && this.breedte == b.lengte))
       
       past = true;
       
       //Blok1.zijvlak1 = Blok2.zijvlak3
       
       if(
       (this.hoogte == b.hoogte && this.breedte == b.lengte)
       || (this.hoogte == b.lengte && this.breedte == b.hoogte))
       
       past = true;
       
       //Blok1.zijvlak2 = Blok2.zijvlak1
       
       if(
       (this.breedte == b.breedte && this.lengte == b.hoogte)
       || (this.breedte == b.hoogte && this.lengte == b.breedte))
       
       past = true;
       
       //Blok1.zijvlak2 = Blok2.zijvlak2
       
       if(
       (this.lengte == b.lengte && this.breedte == b.breedte)
       || (this.lengte == b.breedte && this.breedte == b.lengte))
       
       past = true;
       
       //Blok1.zijvlak2 = Blok2.zijvlak3
       
       if(
       (this.lengte == b.lengte && this.breedte == b.hoogte)
       || (this.lengte == b.hoogte && this.breedte == b.lengte))
       
       past = true;
       
       //Blok1.zijvlak3 = Blok2.zijvlak1
       
       if(
       (this.hoogte == b.hoogte && this.lengte == b.breedte)
       || (this.hoogte == b.breedte && this.lengte == b.breedte))
       
       past = true;
       
       //Blok1.zijvlak3 = Blok2.zijvlak2
       
       if(
       (this.lengte == b.lengte && this.hoogte == b.breedte)
       || (this.lengte == b.breedte && this.hoogte == b.lengte))
       
       past = true;
       
       //Blok1.zijvlak3 = Blok2.zijvlak3
       
       if(
       (this.lengte == b.lengte && this.hoogte == b.hoogte)
       || (this.lengte == b.hoogte && this.hoogte == b.lengte))
       
       past = true;
       
       return(past);
       
   }
   
}
