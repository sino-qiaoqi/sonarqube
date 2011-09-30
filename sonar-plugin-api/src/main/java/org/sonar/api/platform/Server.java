/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2008-2011 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.api.platform;

import org.sonar.api.BatchComponent;
import org.sonar.api.ServerComponent;

import java.util.Date;

/**
 * @since 2.2
  */
public abstract class Server implements BatchComponent, ServerComponent {

  public abstract String getId();

  public abstract String getVersion();

  public abstract Date getStartedAt();

  /**
   * @return the server URL when executed from batch, else null.
   * @since 2.4
   */
  public abstract String getURL();

  /**
   * @since 2.10
   */
  public abstract String getPermanentServerId();
}
