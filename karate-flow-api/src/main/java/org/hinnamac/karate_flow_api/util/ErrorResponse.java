package org.hinnamac.karate_flow_api.util;

import java.time.LocalDateTime;

public record ErrorResponse (
    LocalDateTime timestamp,
    String message,
    String path,
    String statusCode,
    Object details
) { }
