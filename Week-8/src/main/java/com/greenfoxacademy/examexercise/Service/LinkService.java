package com.greenfoxacademy.examexercise.Service;

import com.greenfoxacademy.examexercise.Model.Link;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LinkService {

    Link saveLink(Link link);

    Link createLink(Link link);

    List<String> returnAllCodes();

    int checkIfAliasIsFree(String linkAlias);


}
