package app.qienuren.controller;

import app.qienuren.model.WerkDag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class WerkDagService {

    @Autowired
    WerkDagRepository werkdagrepository;

    public WerkDag addNieuwWerkDag(WerkDag werkdag) {
        System.out.println("Dag aangemaakt");
        return werkdagrepository.save(werkdag);
    }

    public Iterable<WerkDag> alleWerkDagen() {
        System.out.println("alle werkdagen");
        return werkdagrepository.findAll();
    }

    public void removeWerkDagen() {
        werkdagrepository.deleteAll();
    }

}
