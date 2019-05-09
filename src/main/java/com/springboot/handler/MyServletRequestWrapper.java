package com.springboot.handler;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyServletRequestWrapper extends HttpServletRequestWrapper {

	private final List<String> ALLOWED_HEADERS = Arrays.asList("test-header", "api-header");
	private final Map<String, List<String>> headerMap;
	protected Map<String, String[]> parameters;

	public MyServletRequestWrapper(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
		parameters = request.getParameterMap();
		headerMap = getHeaderMap(request);
	}

	private Map<String, List<String>> getHeaderMap(HttpServletRequest request) {
		return ALLOWED_HEADERS.stream()
				.collect(Collectors.toMap(Function.identity(), s -> Arrays.asList(request.getHeader(s))));
	}

	@Override
	public String getHeader(String name) {
		List<String> values = headerMap.get(name);
		if (values != null)
			return values.get(0);
		return null;
	}

	@Override
	public Enumeration<String> getHeaders(String name) {
		List<String> values = headerMap.get(name);
		if (values == null)
			return Collections.emptyEnumeration();
		return Collections.enumeration(values);
	}

	@Override
	public Enumeration<String> getHeaderNames() {
		return Collections.enumeration(this.headerMap.keySet());
	}

	@Override
	public String getParameter(String name) {
		String[] values = getParameterValues(name);
		return values == null ? null : values[0];
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		return Collections.unmodifiableMap(parameters);
	}

	@Override
	public String[] getParameterValues(String name) {
		return parameters.get(name);
	}
}