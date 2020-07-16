using System;

namespace prueba2
{
    class Program
    {
        static void Main(string[] args)
        {
           int[,,] matriz = new int[3, 3, 3];
            int[] suma = new int[3];
            double[] prom = new double[3];

 

            for (int mes = 0; mes < 4; mes++)
            {
                Console.WriteLine("Mes " + (mes + 1));
                for (int est = 0; est < 4; est++)
                {
                    for (int not = 0; not < 4; not++)
                    {
                        matriz[est, not, mes] = Convert.ToInt32(Console.ReadLine());
                        suma[mes] += matriz[est, not, mes];
                    }
                }
                prom[mes] = suma[mes] / 9;
            }
            for(int i =0; i<prom.Length;i++)
            {
                Console.WriteLine(prom[i]);
            }
        }
    }
    }
        