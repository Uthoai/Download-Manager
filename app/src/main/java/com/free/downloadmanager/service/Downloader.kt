package com.free.downloadmanager.service

interface Downloader {
    fun downloadFile(url: String): Long
}