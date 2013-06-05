/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Javier Andana
 */
public class BD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("leyendo ....");
        //leerTurno();
        leerPart_tiene_turno();

    }
    //lee los turnos del archivo csv

    public static void leerTurno() {
        //si no se an leido antes
        if (!obtenerTodosTurnos()) {
            ObjectContainer bd = Db4oEmbedded.openFile("TURNO.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("TURNO.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Turno turno = new Turno(Integer.parseInt(stk.nextToken()), stk.nextToken(), stk.nextToken(), stk.nextToken());

                    bd.store(turno);

                    System.out.println(turno.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerTicket() {
        //si no se an leido antes
        if (!obtenerTodosTicket()) {
            ObjectContainer bd = Db4oEmbedded.openFile("TICKET.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("TICKET.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Ticket ticket = new Ticket(Integer.parseInt(stk.nextToken()), stk.nextToken(), stk.nextToken(), Integer.parseInt(stk.nextToken()), stk.nextToken());

                    bd.store(ticket);

                    System.out.println(ticket.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerSucursal() {
        //si no se an leido antes
        if (!obtenerTodosSucursal()) {
            ObjectContainer bd = Db4oEmbedded.openFile("SUCURSAL.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("SUCURSAL.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Sucursal sucursal = new Sucursal(Integer.parseInt(stk.nextToken()), stk.nextToken(), stk.nextToken(), Integer.parseInt(stk.nextToken()), stk.nextToken(), stk.nextToken(), stk.nextToken());

                    bd.store(sucursal);

                    System.out.println(sucursal.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerSala() {
        //si no se an leido antes
        if (!obtenerTodosSalas()) {
            ObjectContainer bd = Db4oEmbedded.openFile("SALA.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("SALA.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Sala sala = new Sala(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()), stk.nextToken());

                    bd.store(sala);

                    System.out.println(sala.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerRutina() {
        //si no se an leido antes
        if (!obtenerTodosRutinas()) {
            ObjectContainer bd = Db4oEmbedded.openFile("RUTINA.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("RUTINA.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Rutina rutina = new Rutina(stk.nextToken(), stk.nextToken());

                    bd.store(rutina);

                    System.out.println(rutina.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerProducto() {
        //si no se an leido antes
        if (!obtenerTodosProductos()) {
            ObjectContainer bd = Db4oEmbedded.openFile("PRODUCTO.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("PRODUCTO.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Producto producto = new Producto(Integer.parseInt(stk.nextToken()), stk.nextToken(), stk.nextToken(), Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));

                    bd.store(producto);

                    System.out.println(producto.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerPelicula() {
        //si no se an leido antes
        if (!obtenerTodosPeliculas()) {
            ObjectContainer bd = Db4oEmbedded.openFile("PELICULA.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("PELICULA.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Pelicula pelicula = new Pelicula(Integer.parseInt(stk.nextToken()), stk.nextToken(), stk.nextToken(), stk.nextToken(), stk.nextToken(), stk.nextToken());

                    bd.store(pelicula);

                    System.out.println(pelicula.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerPart_tiene_turno() {
        //si no se an leido antes
        if (!obtenerTodosPart_tiene_turnos()) {
            ObjectContainer bd = Db4oEmbedded.openFile("PART_TIENE_TURNO.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("PART_TIENE_TURNO.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", ":");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, ":");

                    Part_tiene_turno part = new Part_tiene_turno(stk.nextToken(), Integer.parseInt(stk.nextToken()));

                    bd.store(part);

                    System.out.println(part.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }

    public static void leerHorario() {
        //si no se an leido antes
        if (!obtenerTodosHorarios()) {
            ObjectContainer bd = Db4oEmbedded.openFile("Horario.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("Horario.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", "-");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, "-");

                    Horario horario = new Horario(Integer.parseInt(stk.nextToken()),
                            Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()),
                            Integer.parseInt(stk.nextToken()), stk.nextToken(),
                            stk.nextToken());

                    bd.store(horario);

                    System.out.println(horario.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }
    
    public static void leerEncargadoSucursal() {
        //si no se an leido antes
        if (!obtenerTodosEncargadoSucursales()) {
            ObjectContainer bd = Db4oEmbedded.openFile("ENCARGADO_SUCURSAL.yap");
            try {
                BufferedReader archivo = new BufferedReader(new InputStreamReader(new FileInputStream(new File("ENCARGADO_SUCURSAL.csv"))));

                archivo.readLine();//borro la linea de los nombres
                while (archivo.ready()) {
                    String linea = archivo.readLine().replaceAll("\",\"", ":");
                    linea = linea.replaceAll("\"", "");

                    StringTokenizer stk = new StringTokenizer(linea, ":");

                    Encargado_sucursal encargado = new Encargado_sucursal( stk.nextToken(),Integer.parseInt(stk.nextToken()),Integer.parseInt(stk.nextToken()),
                            
                            stk.nextToken());

                    bd.store(encargado);

                    System.out.println(encargado.toString());
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bd.close();
        }
    }
    
    
    //si tiene resultados retorna true so no false lo q significa q ta vacia
    private static boolean obtenerTodosTurnos() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("TURNO.yap");
        List<Turno> result = bd.query(new Predicate<Turno>() {
            @Override
            public boolean match(Turno t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosTicket() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("TICKET.yap");
        List<Ticket> result = bd.query(new Predicate<Ticket>() {
            @Override
            public boolean match(Ticket t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosSucursal() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("SUCURSAL.yap");
        List<Sucursal> result = bd.query(new Predicate<Sucursal>() {
            @Override
            public boolean match(Sucursal t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosSalas() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("SALA.yap");
        List<Sala> result = bd.query(new Predicate<Sala>() {
            @Override
            public boolean match(Sala t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosRutinas() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("RUTINA.yap");
        List<Rutina> result = bd.query(new Predicate<Rutina>() {
            @Override
            public boolean match(Rutina t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosProductos() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("PRODUCTO.yap");
        List<Producto> result = bd.query(new Predicate<Producto>() {
            @Override
            public boolean match(Producto t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosPeliculas() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("PELICULA.yap");
        List<Pelicula> result = bd.query(new Predicate<Pelicula>() {
            @Override
            public boolean match(Pelicula t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosPart_tiene_turnos() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("PART_TIENE_TURNO.yap");
        List<Part_tiene_turno> result = bd.query(new Predicate<Part_tiene_turno>() {
            @Override
            public boolean match(Part_tiene_turno t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }

    private static boolean obtenerTodosHorarios() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("Horario.yap");
        List<Horario> result = bd.query(new Predicate<Horario>() {
            @Override
            public boolean match(Horario t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }
    
     private static boolean obtenerTodosEncargadoSucursales() {
        //obtiene una lista con todos 
        ObjectContainer bd = Db4oEmbedded.openFile("ENCARGADO_SUCURSAL.yap");
        List<Encargado_sucursal> result = bd.query(new Predicate<Encargado_sucursal>() {
            @Override
            public boolean match(Encargado_sucursal t) {
                return true;
            }
        });
        if (result.isEmpty()) {
            bd.close();
            return false;
        } else {
            imprime(result);
            bd.close();
            return true;
        }


    }


    public static void imprime(List resultado) {
        //recorro la lista imprimiendo los objetos
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i).toString());
        }
    }
}
