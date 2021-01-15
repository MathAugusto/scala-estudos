// VETORES (TODOS NO MLLIB PRECISAM SER DOUBLES)
import org.apache.spark.mllib.linalg.{Vector, Vectors}
// DENSE VECTOR
// Create a dense vector (1.0, 0.0, 3.0).
val vet: Vector =  Vectors.dense(44.0, 0.0, 55.0)
// SPARSE VECTOR (feito por arrays, ou tuplas(SEQ))
// Create a sparse vector (1.0, 0.0, 3.0) by specifying its indices and values corresponding to nonzero entries.
// (INDEX, NUM), (INDEX,NUM)
val sv1: Vector = Vectors.sparse(3, Array(0, 2), Array(1.0, 3.0))
// Create a sparse vector (1.0, 0.0, 3.0) by specifying its nonzero entries.
// (INDEX,INDEX),(NUM,NUM)
val sv2: Vector = Vectors.sparse(3, Seq((0, 1.0), (2, 3.0)))


// LABELED POINTS (USADO EM SUPERVISED LEARNING)
import org.apache.spark.mllib.regression.LabeledPoint
// com dense
LabeledPoint(1.0, Vectors.dense(44.0, 0.0, 55.0))
// com sparse
LabeledPoint(0.0, Vectors.sparse(3, Array(0, 23), Array(1, 46.0)))


// MATRIZES
import org.apache.spark.mllib.linalg.{Matrix, Matrices}
//DENSE MATRIX
Matrices.dense(numRows = 3, numCols = 2, Array(1 , 3, 5, 2, 4, 6))
// SPARSE MATRIX
val m = Matrices.sparse(5, 4,
  Array(0,0,1,2,2),
  Array(1,3),
  Array(34,55))


// SIMPLE ROW-MATRIX
import org.apache.spark.rdd.RDD
import org.apache.spark.mllib.linalg.distributed.RowMatrix
import org.apache.spark.mllib.linalg.{Vector, Vectors}
val rows: RDD[Vector] = sc.parallelize(Array(
  Vectors.dense(1.0,2.0),
  Vectors.dense(4.0,5.0),
  Vectors.dense(7.0,8.0)))


// SIMPLE INDEXED ROW-MATRIX
import org.apache.spark.mllib.linalg.distributed.{ IndexedRow, IndexedRowMatrix, RowMatrix}
val roows: RDD[IndexedRow] = sc.parallelize(Array(
  IndexedRow(0, Vectors.dense(10.0,20.0)),
  IndexedRow(0, Vectors.dense(40.0,50.0)),
  IndexedRow(0, Vectors.dense(70.0,80.0))))
val idxmatrix: IndexedRowMatrix = new IndexedRowMatrix(roows)


// SIMPLE COORDINATE MATRIX
import org.apache.spark.mllib.linalg.distributed.MatrixEntry
import org.apache.spark.mllib.linalg.distributed.CoordinateMatrix
val entries: RDD[MatrixEntry] = sc.parallelize(Array(
  MatrixEntry(0,0,9.0),
  MatrixEntry(1,1,7.0),
  MatrixEntry(2,1,8.0)))
val coordmat: CoordinateMatrix = new CoordinateMatrix(entries)


