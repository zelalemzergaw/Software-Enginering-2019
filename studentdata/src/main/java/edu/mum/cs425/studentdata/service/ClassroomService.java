package edu.mum.cs425.studentdata.service;

import edu.mum.cs425.studentdata.model.Classroom;
import edu.mum.cs425.studentdata.repository.ClassRoomRepository;
import edu.mum.cs425.studentdata.service.services.ClassRoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService implements ClassRoomServiceImpl {
    @Autowired
    public ClassRoomRepository classRoomRepository;

    @Override
    public Classroom save(Classroom cr) {
        return classRoomRepository.save(cr);
    }



}

