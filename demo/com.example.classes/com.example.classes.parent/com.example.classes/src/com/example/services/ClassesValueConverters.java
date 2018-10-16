package com.example.services;

import static org.apache.commons.lang.StringUtils.removeEnd;
import static org.apache.commons.lang.StringUtils.removeStart;
import static org.apache.commons.lang.StringUtils.trim;
import static org.apache.commons.lang.StringUtils.trimToEmpty;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class ClassesValueConverters extends DefaultTerminalConverters {
	private final class DescriptionTextValueConverter implements IValueConverter<String> {
		@Override
		public String toValue(final String string, final INode node) throws ValueConverterException {
			return trimToEmpty(removeEnd(removeStart(trim(string), "[[["), "]]]"));
		}

		@Override
		public String toString(final String value) throws ValueConverterException {
			return "\n[[[\n" + value + "\n]]]\n";
		}
	}
	
	@ValueConverter(rule = "DESCRIPTION_TEXT")
	public IValueConverter<String> DESCRIPTION_TEXT() {
		return new DescriptionTextValueConverter();
	}

}
