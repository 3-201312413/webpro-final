package egovframework.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

import egovframework.student.service.StudentService;

import egovframework.student.StudentVO;
import egovframework.student.service.StudentDAO;


@Service("studentService")
public class StudentServiceImpl extends EgovAbstractServiceImpl implements
        StudentService {
        

    @Resource(name="studentDAO")
    private StudentDAO studentDAO;
    
    
    public void insertStudent(StudentVO vo) throws Exception {
    	studentDAO.insertStudent(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
    }


    public List<?> selectStudentList() throws Exception {
        return studentDAO.selectStudentList();
    }

}
