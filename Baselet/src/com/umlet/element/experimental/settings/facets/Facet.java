package com.umlet.element.experimental.settings.facets;

import com.baselet.diagram.draw.BaseDrawHandlerSwing;
import com.baselet.gui.AutocompletionText;
import com.umlet.element.experimental.PropertiesConfig;

public interface Facet {

	boolean checkStart(String line);
	
	void handleLine(String line, BaseDrawHandlerSwing drawer, PropertiesConfig propConfig);
	
	boolean replacesText(String line);
	
	AutocompletionText[] getAutocompletionStrings();
}
