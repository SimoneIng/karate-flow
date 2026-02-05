package org.hinnamac.karate_flow_api.util;

import org.springframework.data.domain.Page;

import java.util.List;

public record PageResponse <T> (
        List<T> data,
        int pageNumber,
        int pageSize
) { }
