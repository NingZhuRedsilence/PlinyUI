package edu.rice.cs.todo.views;


import javax.swing.*;
import java.awt.*;

/**
 * Created by Matt on 5/31/2016.
 */
public class MasterView extends JFrame
{
    /**
     * The lower half the the application.
     */
    private Container _displayView;

    /**
     * Holds the toolbar on top and the display on bottom.
     */
    private JPanel _wrapper = new JPanel();

    public MasterView(Container toolbarView, Container displayView)
    {
        _displayView = displayView;

        _wrapper.setLayout(new BorderLayout());
        _wrapper.add(toolbarView, BorderLayout.NORTH);
        setDisplayView(_displayView);

        super.getContentPane().add(_wrapper);

        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setDisplayView(Container displayView)
    {
        if(_displayView != null)
            _wrapper.remove(_displayView);

        _displayView = displayView;

        _wrapper.add(_displayView, BorderLayout.CENTER);

        // force repaint
        _displayView.invalidate();
        _wrapper.invalidate();
        super.validate();
        super.repaint();


    }

    public void showView()
    {
        super.pack();
        super.setVisible(true);
    }
}
