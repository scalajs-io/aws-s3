package io.scalajs.npm.aws.s3

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Delete Bucket Inventory Configuration Request
  * @param Bucket The name of the bucket containing the inventory configuration to delete.
  * @param Id     The ID used to identify the inventory configuration.
  */
@ScalaJSDefined
class DeleteBucketInventoryConfigurationRequest(val Bucket: js.UndefOr[String] = js.undefined,
                                                val Id: js.UndefOr[String] = js.undefined) extends js.Object