using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace appka
{
    internal class Shape
    {
        double x;
        double y;
        double Height;
        double Width;

        public virtual void draw() { Console.WriteLine("rysuje figure"); }
    }

}
