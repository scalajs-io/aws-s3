package io.scalajs.npm.aws.s3

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Delete Bucket Analytics Configuration Request
  * @param Bucket The name of the bucket from which an analytics configuration is deleted.
  * @param Id     The identifier used to represent an analytics configuration.
  */
@ScalaJSDefined
class DeleteBucketAnalyticsConfigurationRequest(val Bucket: js.UndefOr[String] = js.undefined,
                                                val Id: js.UndefOr[String] = js.undefined)
  extends js.Object
