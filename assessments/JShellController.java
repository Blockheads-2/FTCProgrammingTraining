import java.util.List;
import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;

@RestController
public class JShellController {

    @PostMapping("/execute")
    public String executeCode(@RequestBody String code) {
        JShell jshell = JShell.create();
        StringBuilder output = new StringBuilder();

        List<SnippetEvent> events = jshell.eval(code);
        for (SnippetEvent e : events) {
            output.append(e.value());
            output.append("\n");
        }

        return output.toString();
    }
}
