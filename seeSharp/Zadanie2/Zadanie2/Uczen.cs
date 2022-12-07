using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace Zadanie2
{
    internal class Uczen : Osoba
    {
        public Uczen(String imie, String nazwisko, String pesel)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.pesel = pesel;
        }


    }
}
