package ui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;

public class FileMenu {
    /* Method to get MenuBar*/
    public MenuBar getMenuBar() {
        // Create MenuBar
        MenuBar menuBar = new MenuBar();

        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        // Create MenuItems
        MenuItem newItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open File");
        MenuItem exitItem = new MenuItem("Exit");

        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        // Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);

        // Add Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        return menuBar;
    }
}
