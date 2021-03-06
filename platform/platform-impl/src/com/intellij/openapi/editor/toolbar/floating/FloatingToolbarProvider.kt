// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.editor.toolbar.floating

import com.intellij.openapi.Disposable
import com.intellij.openapi.actionSystem.ActionGroup
import org.jetbrains.annotations.ApiStatus

interface FloatingToolbarProvider {

  val id: String

  val priority: Int

  val autoHideable: Boolean

  val actionGroup: ActionGroup

  @ApiStatus.ScheduledForRemoval(inVersion = "2022.1")
  @Deprecated("Redundant, because component already has toolbar provider")
  fun register(toolbar: FloatingToolbarComponent, parentDisposable: Disposable) {
  }
}