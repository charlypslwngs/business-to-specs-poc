import com.example.copilotapi.CopilotAPI;
import com.example.copilotapi.CopilotResponse;

public class SpecificationGenerator {
    private CopilotAPI copilotAPI;

    public SpecificationGenerator() {
        this.copilotAPI = new CopilotAPI();
    }

    public String transformRequirementsToSpecifications(String businessRequirements) {
        // Call Copilot API with the business requirements
        CopilotResponse response = copilotAPI.generateSpecifications(businessRequirements);
        return response.getSpecifications();
    }

    public static void main(String[] args) {
        SpecificationGenerator generator = new SpecificationGenerator();
        String businessRequirements = "Your business requirements text here...";
        String specifications = generator.transformRequirementsToSpecifications(businessRequirements);
        System.out.println(specifications);
    }
}