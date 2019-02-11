package com.h.jamil.api.test.school.controller;

import com.h.jamil.api.test.school.domain.Student;
import com.h.jamil.api.test.school.impl.SchoolTestAPIImpl;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableSwagger2
@Api(tags = "School.Test", value = "/h/jamil/rest/v1/school/test", description = "HJamil School Test API")
@RequestMapping(value = "/v1/school/test")
public class SchoolTestAPI {

    @Autowired
    private SchoolTestAPIImpl controllerImpl;

    // GET: /v1/school/test/student/{studentId}

    // Define information of this API for displaying on Swagger
    @ApiOperation(value = "Inquiry a student", nickname = "getStudent", notes = "This API is used for inquiry a student.")
    // Define information of HTTP response for this API for displaying on Swagger
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = Student.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict"),
            @ApiResponse(code = 500, message = "Internal server error occurred"),
            @ApiResponse(code = 503, message = "Service Unavailable"),
            @ApiResponse(code = 504, message = "Gateway Timeout")})
    @RequestMapping(value = "/student/{studentId}", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    Student getStudent(@NotBlank
                       @ApiParam(name = "studentId", value = "Id of the Student", required = true)
                       @PathVariable(value = "studentId") Integer studentId,
                       HttpServletRequest request) throws Exception {

        return controllerImpl.getStudent(studentId);
    }

    // GET: /v1/school/test/student

    // Define information of this API for displaying on Swagger
    @ApiOperation(value = "List students", nickname = "getStudents", notes = "This API is used to list students.")
    // Define information of HTTP response for this API for displaying on Swagger
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = Student.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict"),
            @ApiResponse(code = 500, message = "Internal server error occurred"),
            @ApiResponse(code = 503, message = "Service Unavailable"),
            @ApiResponse(code = 504, message = "Gateway Timeout")})
    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    List<Student> getStudents(HttpServletRequest request) throws Exception {

        return controllerImpl.getStudents();
    }
}
