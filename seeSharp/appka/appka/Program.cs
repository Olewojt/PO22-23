using appka;

List<Shape> lista = new List<Shape>(5);
lista.Add(new Rectangle());
lista.Add(new Circle());
lista.Add(new Triangle());

for(int i=0; i<3; i++)
{
    lista[i].draw();
}