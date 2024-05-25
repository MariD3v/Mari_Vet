package daw.project;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "propietario")
@NamedQueries({
    @NamedQuery(name = "Propietario.findAll", query = "SELECT p FROM Propietario p"),
    @NamedQuery(name = "Propietario.findByIdPropietario", query = "SELECT p FROM Propietario p WHERE p.idPropietario = :idPropietario"),
    @NamedQuery(name = "Propietario.findByNombre", query = "SELECT p FROM Propietario p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Propietario.findByDni", query = "SELECT p FROM Propietario p WHERE p.dni = :dni")})
public class Propietario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_propietario")
    private Integer idPropietario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dni")
    private String dni;

    @OneToMany
    @JoinColumn(name = "id_propietario", referencedColumnName = "id_propietario")
    private List<Perro> perros;

    public Propietario() {
    }

    public Propietario(Integer idPropietario, String nombre, String dni) {
        this.nombre = nombre;
        this.idPropietario = idPropietario;
        this.dni = dni;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
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
        hash += (idPropietario != null ? idPropietario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietario)) {
            return false;
        }
        Propietario other = (Propietario) object;
        if ((this.idPropietario == null && other.idPropietario != null) || (this.idPropietario != null && !this.idPropietario.equals(other.idPropietario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "daw.project.Propietario[ idPropietario=" + idPropietario + " ]";
    }
    
    public static Propietario insertPro(int id, String nombre, String dni){
        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        Propietario p = new Propietario(id,nombre,dni);
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        System.out.println(nombre + " guardado/a.");
        return p;
    }
    
    public static Propietario updatePro(int id, String nombre, String dni){
        EntityManager em = EntityManagerUtil.getEntityManager();
        Propietario p = em.find(Propietario.class, id);
        em.getTransaction().begin();
        p.setDni(dni);
        p.setNombre(nombre);
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        System.out.println(nombre + " actualizado/a.");
        return p;
    }

    public static Propietario selectPro(int id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Propietario p = em.find(Propietario.class, id);
        em.close();
        System.out.println("ID_Propietario: " + p.getIdPropietario());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("DNI: " + p.getDni());
        System.out.println("Propietario de: ");
        List<Perro> pe = p.getPerros();
        for (Perro perro : pe) {
            System.out.print(perro.getNombre()+ " ");
        }
        System.out.println("");
        System.out.println("-----------------------------");
        return p;
    }

    public static Propietario deletePro(int id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Propietario p = em.find(Propietario.class, id);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit(); 
        em.close();
        System.out.println(p.getNombre() + " eliminado.");
        return p;
        
    }

    public static void main(String[] args) {
        Propietario p1 = new Propietario(1, "Maria", "23412342-X");
        Propietario p2 = new Propietario(2, "Maria Jose", "12312612-M");
        Propietario p3 = new Propietario(3, "Jose Antonio", "19312383-L");
        
    }
}
