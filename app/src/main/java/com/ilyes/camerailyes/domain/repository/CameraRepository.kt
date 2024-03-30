package com.ilyes.camerailyes.domain.repository

import androidx.camera.view.LifecycleCameraController


/**
 * @author Ilyes Moussaoui
 */
interface CameraRepository {

    suspend fun takePhoto(
        controller: LifecycleCameraController
    )

    suspend fun recordVideo(
        controller: LifecycleCameraController
    )

}