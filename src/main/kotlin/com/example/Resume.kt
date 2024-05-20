package com.example

import com.example.resume.generated.ResumeQuery

@Suppress("KotlinConstantConditions")
fun resume() {
  ResumeQuery()
  val resumeData: ResumeQuery.Data? = null
  resumeData?.resume?.education?.get(0)?.degree
  resumeData?.resume?.education?.get(0)?.institution?.name
  resumeData?.resume?.education?.get(0)?.moreInfo
  resumeData?.resume?.skills?.get(0)?.name
  resumeData?.resume?.experience?.get(0)?.environment?.get(0)
  resumeData?.meta?.lastModified
}
