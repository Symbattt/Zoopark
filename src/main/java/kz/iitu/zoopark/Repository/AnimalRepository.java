package kz.iitu.zoopark.Repository;
import kz.iitu.zoopark.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
