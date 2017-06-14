aws-s3 API for Scala.js
================================
[aws-s3](https://www.npmjs.com/package/aws-s3) - AWS-S3 binding for Scala.js.

### Description

An AWS-S3 binding for Scala.js.

### Build Dependencies

* [SBT v0.13.13](http://www.scala-sbt.org/download.html)

### Build/publish the SDK locally

```bash
 $ sbt clean publish-local
```

### Running the tests

Before running the tests the first time, you must ensure the npm packages are installed:

```bash
$ npm install
```

Then you can run the tests:

```bash
$ sbt test
```

### Examples

```scala
import io.scalajs.nodejs._
import io.scalajs.npm.aws._
import io.scalajs.npm.aws.s3._

val s3 = new S3(ClientConfiguration(
  accessKeyId = "[YOUR PUBLIC ACCESS KEY]",
  secretAccessKey = "[YOUR SECRET ACCESS KEY]",
  region = "us-west-1"
))

val params = new BucketParams(Bucket = "test-bucket")
s3.getBucketLocation(params, (err, data) => {
  if (err != null) console.log(err, err.stack)
  else console.log(data)
})
```

### Artifacts and Resolvers

To add the `aws-s3` binding to your project, add the following to your build.sbt:  

```sbt
libraryDependencies += "io.scalajs.npm" %%% "aws-s3" % "0.4.0"
```

Optionally, you may add the Sonatype Repository resolver:

```sbt   
resolvers += Resolver.sonatypeRepo("releases") 
```