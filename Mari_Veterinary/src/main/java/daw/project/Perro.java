package daw.project;

import java.io.Serializable;;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "perro")
@NamedQueries({
    @NamedQuery(name = "Perro.findAll", query = "SELECT p FROM Perro p"),
    @NamedQuery(name = "Perro.findByIdPerro", query = "SELECT p FROM Perro p WHERE p.idPerro = :idPerro"),
    @NamedQuery(name = "Perro.findByNombre", query = "SELECT p FROM Perro p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Perro.findByRazaYcolor", query = "SELECT p FROM Perro p WHERE p.razaYcolor = :razaYcolor"),
    @NamedQuery(name = "Perro.findByPeso", query = "SELECT p FROM Perro p WHERE p.peso = :peso"),
    @NamedQuery(name = "Perro.findByIdVeterinario", query = "SELECT p FROM Perro p WHERE p.idVeterinario = :idVeterinario"),
    @NamedQuery(name = "Perro.findByIdPropietario", query = "SELECT p FROM Perro p WHERE p.idPropietario = :idPropietario")})
public class Perro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_perro")
    private Integer idPerro;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "razaYcolor")
    private String razaYcolor;
    @Column(name = "peso")
    private Integer peso;
    @Column(name = "id_veterinario")
    private Integer idVeterinario;
    @Column(name = "id_propietario")
    private Integer idPropietario;

    @ManyToOne
    @JoinColumn(name = "id_propietario", referencedColumnName = "id_propietario", insertable = false, updatable = false)
    private Propietario propietario;

    @ManyToOne
    @JoinColumn(name = "id_veterinario", referencedColumnName = "id_veterinario", insertable = false, updatable = false)
    private Veterinario veterinario;

    public Perro() {
    }

    public Perro(Integer idPerro, String nombre, String color, Integer peso, Integer idPropietario, Integer idVeterinario) {
        this.nombre = nombre;
        this.idPerro = idPerro;
        this.razaYcolor = color;
        this.peso = peso;
        this.idPropietario = idPropietario;
        this.idVeterinario = idVeterinario;
    }

    public Integer getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(Integer idPerro) {
        this.idPerro = idPerro;
    }

    public String getRazaYcolor() {
        return razaYcolor;
    }

    public void setRazaYcolor(String razaYcolor) {
        this.razaYcolor = razaYcolor;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerro != null ? idPerro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perro)) {
            return false;
        }
        Perro other = (Perro) object;
        if ((this.idPerro == null && other.idPerro != null) || (this.idPerro != null && !this.idPerro.equals(other.idPerro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "daw.project.Perro[ idPerro=" + idPerro + " ]";
    }
    
    public static Perro insertPe(int id, String nombre, String ryc,int peso, int idp, int idv){
        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        Perro p = new Perro(id, nombre, ryc, peso, idp, idv);
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        System.out.println(nombre + " guardado/a.");
        return p;
    }
    
    public static Perro updatePe(int id, String nombre, String ryc,int peso, int idp, int idv){
        EntityManager em = EntityManagerUtil.getEntityManager();
        Perro p = em.find(Perro.class, id);
        em.getTransaction().begin();
        p.setIdPropietario(idp);
        p.setIdVeterinario(idv);
        p.setNombre(nombre);
        p.setPeso(peso);
        p.setRazaYcolor(ryc);
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        System.out.println(nombre + " actualizado/a.");
        return p;
    }
    
    public static Perro selectPe(int id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Perro p = em.find(Perro.class, id);
        em.close();
        System.out.println("ID_Perro: " + p.getIdPerro());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Raza y Color: " + p.getRazaYcolor());
        System.out.println("Dueño : " +  p.getPropietario().getNombre());
        System.out.println("Veterinario : " +  p.getVeterinario().getNombre());
        System.out.println("");
        System.out.println("-----------------------------");
        return p;
    }

    public static Perro deletePe(int id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Perro p = em.find(Perro.class, id);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit(); 
        em.close();
        System.out.println(p.getNombre() + " eliminado.");
        return p;
    }

    public static void main(String[] args) {
        Perro pe1 = new Perro(1, "Urus", "Weimaraner Gris", 35, 1, 1);
        Perro pe2 = new Perro(2, "Leo", "Braco Marrón", 40, 2, 2);
        Perro pe3 = new Perro(3, "Noa", "Braco Marrón", 35, 3, 1);
        Perro pe4 = new Perro(4, "Joquer", "Braco Blanco y Marrón", 45, 2, 2);
        Perro pe5 = new Perro(5, "Mika", "Braco Blanco y Marrón", 30, 3, 1);
        Perro pe6 = new Perro(6, "Ibi", "Dálmata Blanco y Negro", 35, 2, 2);
        Perro pe7 = new Perro(7, "Nala", "Braco Marrón", 35, 2, 1);
        Perro pe8 = new Perro(8, "Lucas", "Braco Blanco y Negro", 45, 3, 2);
        Perro pe9 = new Perro(9, "Lola", "Braco Blanco y Marrón", 35, 3, 1);
        Perro pe10 = new Perro(10, "Yuri", "Pastor Alemán Negro", 35, 3, 2);

    }

}
