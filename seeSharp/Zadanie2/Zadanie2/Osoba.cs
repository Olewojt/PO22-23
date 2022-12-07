using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zadanie2
{
    internal class Osoba
    {
        protected String imie;
        protected String nazwisko;
        protected String pesel;

        public Osoba(String imie, String nazwisko, String pesel)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.pesel = pesel;
        }

        public void SetFirstName(String imie) { this.imie = imie; }
        public void SetLastName(String nazwisko) { this.nazwisko = nazwisko; }
        public void SetPesel(String pesel) { this.pesel = pesel; }
        public int GetAge() { return 2022 - int.Parse("19"+this.pesel[0] + this.pesel[1]); }
        public String GetGender() {
            if (pesel[9] % 2 == 0) return "Kobieta";
            else return "Mezczyzna";
        }
        public String GetEducationInfo() { return ""; }
        public String GetFullName() { return this.imie + " " + this.nazwisko; }
        public bool CanGoAloneToHome() {
            if (this.GetAge() >= 18) return true;
            else return false;
        }

    }
}
