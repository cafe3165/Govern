package com.appleyk.RelationRepository;

import com.appleyk.relation.LocatedIn;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface UserLocatedInRepository extends GraphRepository<LocatedIn> {
    @Query("MATCH(u:User),(l:Location) WHERE u.lName=l.lName"
            + " CREATE p = (u)-[r:LocatedIn]->(l) return p ")
    List<LocatedIn> createlocatedIn();

}
