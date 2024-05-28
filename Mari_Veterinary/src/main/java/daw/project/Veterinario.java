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
@Table(name = "veterinario")
@NamedQueries({
    @NamedQuery(name = "Veterinario.findAll", query = "SELECT v FROM Veterinario v"),
    @NamedQuery(name = "Veterinario.findByIdVeterinario", query = "SELECT v FROM Veterinario v WHERE v.idVeterinario = :idVeterinario"),
    @NamedQuery(name = "Veterinario.findByNombre", query = "SELECT v FROM Veterinario v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "Veterinario.findByEdad", query = "SELECT v FROM Veterinario v WHERE v.edad = :edad")})
public class Veterinario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_veterinario")
    private Integer idVeterinario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private Integer edad;

    @OneToMany
    @JoinColumn(name = "id_veterinario", referencedColumnName = "id_veterinario")
    private List<Perro> perros;

    public Veterinario() {
    }

    public Veterinario(Integer idVeterinario, String nombre, Integer edad) {
        this.nombre = nombre;
        this.idVeterinario = idVeterinario;
        this.edad = edad;
    }

    public Integer getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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
        hash += (idVeterinario != null ? idVeterinario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veterinario)) {
            return false;
        }
        Veterinario other = (Veterinario) object;
        if ((this.idVeterinario == null && other.idVeterinario != null) || (this.idVeterinario != null && !this.idVeterinario.equals(other.idVeterinario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "daw.project.Veterinario[ idVeterinario=" + idVeterinario + " ]";
    }

    public static Veterinario insertVe(int id, String nombre, int edad){
        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        Veterinario v = new Veterinario(id,nombre,edad);
        em.persist(v);
        em.getTransaction().commit();
        em.close();
        System.out.println(nombre + " guardado/a.");
        return v;
    }
    
    public static Veterinario updateVe(int id, String nombre, int edad){
        EntityManager em = EntityManagerUtil.getEntityManager();
        Veterinario v = em.find(Veterinario.class, id);
        em.getTransaction().begin();
        v.setEdad(edad);
        v.setNombre(nombre);
        em.merge(v);
        em.getTransaction().commit();
        em.close();
        System.out.println(nombre + " actualizado/a.");
        return v;
    }
    
    public static Veterinario selectVe(int id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Veterinario v = em.find(Veterinario.class, id);
        em.close();
        System.out.println("ID_Veterinario: " + v.getIdVeterinario());
        System.out.println("Nombre: " + v.getNombre());
        System.out.println("Edad: " + v.getEdad());
        System.out.println("Perros a su cuidado: ");
        List<Perro> p = v.getPerros();
        for (Perro perro : p) {
            System.out.print(perro.getNombre()+ " ");
        }
        System.out.println("");
        System.out.println("-----------------------------");
        return v;
    }

    public static Veterinario deleteVe(int id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Veterinario v = em.find(Veterinario.class, id);
        em.getTransaction().begin();
        em.remove(v);
        em.getTransaction().commit(); 
        em.close();
        System.out.println(v.getNombre() + " eliminado.");
        return v;
    }

    public static void main(String[] args) {
        Veterinario v1 = new Veterinario(1, "Miguel Alonso", 26);
        Veterinario v2 = new Veterinario(2, "Juan Antonio", 24);
        
    }

}
