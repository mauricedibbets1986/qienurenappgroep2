package app.qienuren.controller;

import app.qienuren.model.InterneMedewerker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterneMedewerkerRepository extends JpaRepository<InterneMedewerker, Long> {
}
