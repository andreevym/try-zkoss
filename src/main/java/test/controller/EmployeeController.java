package test.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import test.model.Employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuryandreev on 06/09/16.
 */
public class EmployeeController extends SelectorComposer<Component> {

    @Wire
    private Textbox keyWordTextBox;

    @Wire
    private Listbox employeeListBox;

    private List employees = Arrays.asList(
            new Employee("Test", 1, new BigDecimal(4)),
            new Employee("Teserovich", 2, new BigDecimal(3)),
            new Employee("Testovich", 3, new BigDecimal(2)),
            new Employee("Testov", 4, new BigDecimal(1))
    );

    @Listen("onClick = #searchButton")
    public void search() {
        String keyWord = keyWordTextBox.getValue();

        List<Employee> result = employees;
        employeeListBox.setModel(new ListModelList<Employee>(result));
    }
}
