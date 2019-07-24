package com.appleyk.RelationRepository;

import com.appleyk.relation.LocatedIn;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface ContextLocatedInRepository extends GraphRepository<LocatedIn> {

    @Query("MATCH(c:Context),(l:Location) WHERE c.lName=l.lName"
            + " CREATE p = (c)-[r:LocatedIn]->(l) return p ")
    List<LocatedIn> createlocatedIn();
}
