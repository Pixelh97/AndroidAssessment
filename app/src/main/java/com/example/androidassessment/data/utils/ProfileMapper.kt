package com.example.androidassessment.data.utils

import com.example.androidassessment.data.model.ProfileResponseDto
import com.example.androidassessment.domian.model.Platform
import com.example.androidassessment.domian.model.Profile

fun ProfileResponseDto.toProfile(): Profile =
    Profile(
        username = this.user.username,
        name = this.user.name,
        imageUrl = this.user.avatar,
        location = "${this.user.location.country}, ${this.user.location.city}",
        website = this.user.social.website,
        profiles =
            this.user.social.profiles
                .map { Platform(it.platform, it.url) },
        followersCount =
            this
                .user.statistics.followers,
        followingCount =
            this
                .user.statistics.following,
        shotsCount =
            this
                .user.statistics.activity.shots,
        collectionCount =
            this
                .user.statistics.activity.collections,
    )
