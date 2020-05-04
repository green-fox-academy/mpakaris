package com.greenfoxacademy.examexercise.Service;

import com.greenfoxacademy.examexercise.Model.Link;
import com.greenfoxacademy.examexercise.Repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class LinkServiceImpl implements LinkService{

    @Autowired
    LinkRepository linkRepository;

    @Override
    public Link createLink(Link link) {

        List<String> allCodes = returnAllCodes();

        Random random = new Random();
        String secretCode = "";
        String[] numbersArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(10);
            secretCode += numbersArray[randomNumber];
        }

        Link newLink = new Link(link.getLinkURL(), link.getLinkAlias(), secretCode);
        return saveLink(newLink);
    }

    private String createSecretCode() {
     return "null";
    }

    @Override
    public List<String> returnAllCodes() {
        List<Link> listAllLinks = new ArrayList<>();
        List<String> listAllCodes = new ArrayList<>();
        linkRepository.findAll().forEach(listAllLinks::add);
        listAllCodes = listAllLinks.stream()
                .map(link -> link.getSecretCode())
                .collect(Collectors.toList());
        return listAllCodes;
    }

    @Override
    public int checkIfAliasIsFree(String linkAlias) {

        List<Link> listAllAliases = new ArrayList<>();
        linkRepository.findAll().forEach(listAllAliases::add);
        List<String> aliases = listAllAliases
                                    .stream()
                                    .filter(item -> item.getLinkAlias().toLowerCase().equals(linkAlias.toLowerCase()))
                                    .map(item -> item.getLinkAlias())
                                    .collect(Collectors.toList());

        if (aliases == null) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public Link saveLink(Link link) {
       linkRepository.save(link);
        return link;
    }


}
