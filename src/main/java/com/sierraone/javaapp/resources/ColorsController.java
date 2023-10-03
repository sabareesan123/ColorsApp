package com.sierraone.javaapp.resources;




import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sierraone.javaapp.entities.Colors;
import com.sierraone.javaapp.entities.Votes;
import com.sierraone.javaapp.service.ColorsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("colors")
@RequiredArgsConstructor
public class ColorsController {

	
	final private ColorsService colorsService;



	@GetMapping
	public List<String> get() {
		System.out.println("ji " + colorsService.get());
		return colorsService.get().stream().map( color -> color.getColor()).toList();
	}

	@GetMapping("{color}")
	public List<Votes> getVotes(@PathVariable String  color) {
		System.out.println("co " + color);
		List<Votes> votes = colorsService.getVotes(color);
		if( votes.size() > 0 )
			{System.out.println("ji2 " + votes);
			return votes;
			}		 else {
			System.out.println("error ");
		}
		return null;
	}


}
