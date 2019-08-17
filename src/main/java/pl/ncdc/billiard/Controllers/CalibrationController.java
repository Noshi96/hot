package pl.ncdc.billiard.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
import pl.ncdc.billiard.models.CalibrationParams;
import pl.ncdc.billiard.service.CalibrationService;

@RestController
@RequestMapping("/calibration")
@CrossOrigin(value = "*")
public class CalibrationController {

    @Autowired
    private CalibrationService calibrationService;

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @GetMapping
    public CalibrationParams test() {
        return this.calibrationService.getCalibrationParams();
    }

    @PutMapping
    public void updateCalibration(@RequestBody CalibrationParams calibrationParams) {
        calibrationService.updateCalibration(calibrationParams);
        simpMessagingTemplate.convertAndSend("/calibration/live", calibrationParams);
    }
}
