package gov.ffx.fire.rest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("stations")
@Tag(name = "Stations", description = "Perform actions related to fire stations")
public class StationController {

	@GetMapping("/list")
	@Operation(summary = "Get a list of all stations")
	public List<String> getStations() {
		return List.of("Station One", "Station Two", "Station Three");
	}
}
