import javax.swing.*;

public class Interactive
{
    public static int dialogBoxForDelete()
    {
        String deleteNumber;
        deleteNumber = JOptionPane.showInputDialog("Введите значение, которое нужно удалить из массива");
        int numberForDelete = Integer.parseInt(deleteNumber);
        return numberForDelete;
    }

}
