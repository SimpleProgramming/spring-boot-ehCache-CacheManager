package com.springboot.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Major {

	PHYSICS("physics"), CHEMISTRY("chemistry"), MATHS("maths"), BIOLOGY("biology"), @JsonEnumDefaultValue
	UNKNOWN_ENUM("unknownEnum");

	private String value;
	private static final Map<String, Major> mapOfMajors;

	static {
		mapOfMajors = Collections.unmodifiableMap(
				Arrays.asList(Major.values()).stream().collect(Collectors.toMap(Major::value, Function.identity())));
	}

	Major(String value) {
		this.value = value;
	}

	@JsonValue
	public String value() {
		return value;
	}

	public static Major lookupValue(String value) {
		return mapOfMajors.get(value);
	}
}
