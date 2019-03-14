package com.es.singular.cover.zoo.animals.interfaces;

public interface IPrintable {
	default String getPropertiesAsString() {
		return "";
	}
}