package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//InHouse------------------------------------------------------------------------------------------------
        if(inhousePartRepository.count() > 0) {
            inhousePartRepository.deleteAll();
            outsourcedPartRepository.deleteAll();
            productRepository.deleteAll();
        }
        if (inhousePartRepository.count() == 0) {
            List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();


            InhousePart HeadLightAssembly = new InhousePart();
            HeadLightAssembly.setName("Head Light Assembly");
            HeadLightAssembly.setInv(12);
            HeadLightAssembly.setPrice(67.66);
            HeadLightAssembly.setId(5);
            inhousePartRepository.save(HeadLightAssembly);
            InhousePart thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("HeadLightAssembly")) thePart = thePart;
            }

            InhousePart IgnitionCoil = new InhousePart();
            IgnitionCoil.setName("Ignition Coil");
            IgnitionCoil.setInv(132);
            IgnitionCoil.setPrice(47.38);
            IgnitionCoil.setId(6);
            inhousePartRepository.save(IgnitionCoil);
            thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("Ignition Coil")) thePart = thePart;
            }

            InhousePart TransmissionMount = new InhousePart();
            TransmissionMount.setName("Transmission Mount");
            TransmissionMount.setInv(3);
            TransmissionMount.setPrice(70.00);
            TransmissionMount.setId(7);
            inhousePartRepository.save(TransmissionMount);
            thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("Transmission Mount")) thePart = thePart;
            }

            InhousePart Battery = new InhousePart();
            Battery.setName("Battery");
            Battery.setInv(8);
            Battery.setPrice(167.49);
            Battery.setId(8);
            inhousePartRepository.save(Battery);
            thePart = null;
            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("Battery")) thePart = thePart;
            }


            inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                System.out.println(part.getName() + " " + part.getId());
            }
        }
//Outsource-----------------------------------------------------------------------------------------------------------
        if (outsourcedPartRepository.count() == 0) {

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();


            OutsourcedPart CVAxle = new OutsourcedPart();
            CVAxle.setCompanyName("Foreign Parts Galore");
            CVAxle.setName("CV Axle");
            CVAxle.setInv(13);
            CVAxle.setPrice(27.66);
            CVAxle.setId(9);
            outsourcedPartRepository.save(CVAxle);
            OutsourcedPart theOutPart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("CV Axle")) theOutPart = part;
            }



            System.out.println(theOutPart.getCompanyName());


            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }

//Product-----------------------------------------------------------------------------------------------------------
            Product antifreeze = new Product("AntiFreeze", 15.65, 63);
            Product filters = new Product("Air Filters", 10.17, 22);
            Product fueltankcaps = new Product("Fuel Tank Caps", 9.38, 5);
            Product floormats = new Product("Floor Mats", 93.84, 17);
            Product airfreshener = new Product("Car Air Freshener - Mint Flavored", 6.40, 89);

            productRepository.save(antifreeze);
            productRepository.save(filters);
            productRepository.save(fueltankcaps);
            productRepository.save(floormats);
            productRepository.save(airfreshener);


        }
    }
}


