package com.project.BodaProject.domain;//package com.project.BodaProject.domain;
//
//import com.project.BodaProject.repository.ExhibitionAllRepository;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.net.URLDecoder;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Builder
//public class Search {
//    @Autowired
//    private ExhibitionAllRepository exhibitionAllRepository;
//
//    public void PlaceSearch(ExhibitionAll exhibition) {
//        String searchKey = "";
//        String[] splitPlace = exhibitionAllRepository
//                .findByPlaceAndStartDateAndSubject(exhibition.getPlace(), exhibition.getStartDate(), exhibition.getSubject())
//                .getPlaces();
//
//        //API에서 return 받아올 때 값 찾아보고 다시 설정하기
//        try {
//            if (splitPlace[0].equals("갤러리") || splitPlace[0].equals("Gallery")) {
//                searchKey = splitPlace[0] + " " + splitPlace[1];
//
//                //API > searchKey > search > return
//
//            } else {
//                for (int i = 0; i < splitPlace.length; i++) {
//                    searchKey = splitPlace[i];
//                    if (/*API > searchKey > search > return not null*/) {
//                        //result return
//                    } else {
//                        searchKey = splitPlace[0] + " " + splitPlace[1];
//
//                        //API > searchKey > search > return
//
//                        if (/*API > searchKey > search > return null*/) {
//                            searchKey = searchKey + " " + splitPlace[2];
//
//                            //API > searchKey > search > return
//
//                        } else {
//                            searchKey = splitPlace[splitPlace.length - 2] + " " + splitPlace[splitPlace.length - 1];
//
//                            //API > searchKey > search > return
//                        }
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
