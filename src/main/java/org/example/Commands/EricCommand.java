package org.example.Commands;

/**
 * секретка
 */
public class EricCommand implements Command{
    /**
     * Метод, который исполняет команду
     */
    @Override
    public void execute() {
        System.out.println("▒▒▒▒░░░░┈┈┈┈┈┈┈▄▄▄▓\n" +
                "▀▀▓▓▄▂░┈┈┈┈▂▄▄▓▓▀▓▔\n" +
                "▒▂▅▄▄▂╮▒░░░╱▂▄▄▅▄▓▄\n" +
                "▒╲╰▄█╞╳▌┈░▒╳╡╰▄█╱░▐\n" +
                "░░▔▔▔▒▒║┈░▒░▒▔▔▔▒░░\n" +
                "▒░░┈┈░▒┊┈┊░░┈┈░░░░░\n" +
                "▒░░┈┈░▒┃┈┊░░░┈┈░░░▒\n" +
                "▒▒░┈░▒╭╯┈╰╮░░░┈░░▒▒\n" +
                "▏▒░░▒▒╰╮┈╭╯┈░░░▒▒▒▒\n" +
                "▌▒▒▒╭┈░╰─╯░┈┈╮░░░▒▒\n" +
                "█▄▒▒▒╲━━━━━╱░░░░░▒▒\n" +
                "██▄▒▒▒╲▔▔▔▔╱┈░░░▒▒▒\n" +
                "▓███▒▒┈▔▔▔▔┈┈░░▒▒▄█\n" +
                "▓▓███▅┈┈┈┈┈┈░▒▒▄▓▓█");
    }

    /**
     * Метод, который возвращает описание команды
     * @return описание команды
     */
    @Override
    public String getDescription() {
        return "секрет";
    }
}