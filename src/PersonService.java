import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
