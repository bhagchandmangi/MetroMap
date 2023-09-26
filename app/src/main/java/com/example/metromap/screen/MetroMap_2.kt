package pl.bartoszwesolowski.metromap

import android.graphics.Typeface
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.Group
import androidx.compose.ui.graphics.vector.Path
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MetroMaps() {
  val vectorPainterFace = rememberVectorPainter(
    defaultWidth =  1152.dp,
    defaultHeight = 826.dp,
    viewportWidth = 1152f,
    viewportHeight = 826f,
    autoMirror = false,
  ) { _, _ ->
    Group(translationX = 1037.06f, translationY = 22.697f) {
      Path(path1, fill = SolidColor(Color(-198702)))
    }
    Group(translationX = 1009.98f, translationY = 240.517f) {
      Path(path2, fill = SolidColor(Color(-4406301)))
    }
    Group(translationX = 1037.06f, translationY = 141.382f) {
      Path(path3, fill = SolidColor(Color(-2824243)))
    }
    Group(translationX = 1060.02f, translationY = 48.91f) {
      Path(path4, fill = SolidColor(Color(-990995)))
    }
    Group(translationX = 67.4f, translationY = 131.714f) {
      Path(path5, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 192.483f, translationY = 91.35f) {
      Path(path6, fill = SolidColor(Color(-1898206)))
    }
    Group(translationX = 183.644f, translationY = 98.54f) {
      Path(path7, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 134.218f, translationY = 569.988f) {
      Path(path8, fill = SolidColor(Color(-1898206)))
    }
    Group(translationX = 125.379f, translationY = 577.177f) {
      Path(path9, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 824.24f, translationY = 73.795f) {
      Path(path10, fill = SolidColor(Color(-1898206)))
    }
    Group(translationX = 815.4f, translationY = 81.138f) {
      Path(path11, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 443.039f, translationY = 72.323f) {
      Path(path12, fill = SolidColor(Color(-808704)))
    }
    Group(translationX = 434.22f, translationY = 79.755f) {
      Path(path13, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 982.99f, translationY = 715.79f) {
      Path(path14, fill = SolidColor(Color(-808704)))
    }
    Group(translationX = 974.17f, translationY = 723.221f) {
      Path(path15, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 983.04f, translationY = 543.07f) {
      Path(path16, fill = SolidColor(Color(-15057814)))
    }
    Group(translationX = 974.16f, translationY = 550.19f) {
      Path(path17, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 221.061f, translationY = 91.13f) {
      reuse_0()
    }
    Group(translationX = 219.011f, translationY = 96.145f) {
      reuse_1()
    }
    Group(translationX = 641.347f, translationY = 528.65f) {
      Path(path20, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 627.109f, translationY = 534.948f) {
      Path(path21, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 630.195f, translationY = 533.953f) {
      Path(path22, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 629.404f, translationY = 536.428f) {
      Path(path23, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 640.009f, translationY = 536.428f) {
      Path(path24, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 688.117f, translationY = 370.009f) {
      Path(path25, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 677.456f, translationY = 372.703f) {
      Path(path26, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 686.781f, translationY = 377.54f) {
      Path(path27, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 668.222f, translationY = 369.958f) {
      reuse_2()
    }
    Group(translationX = 658.142f, translationY = 374.897f) {
      reuse_3()
    }
    Group(translationX = 654.51404f, translationY = 378.7937f, rotation = 125.0f) {
      reuse_4()
    }
    Group(translationX = 658.67413f, translationY = 377.36996f, rotation = 55.0f) {
      reuse_5()
    }
    Group(translationX = 655.63196f, translationY = 376.57535f, rotation = -118.0f) {
      reuse_6()
    }
    Group(translationX = 654.606f, translationY = 378.654f, rotation = 180.0f) {
      reuse_7()
    }
    Group(translationX = 655.509f, translationY = 370.026f) {
      reuse_8()
    }
    Group(translationX = 655.719f, translationY = 370.722f) {
      reuse_9()
    }
    Group(translationX = 656.576f, translationY = 370.722f) {
      reuse_10()
    }
    Group(translationX = 666.876f, translationY = 377.697f) {
      reuse_11()
    }
    Group(translationX = 621.666f, translationY = 369.958f) {
      reuse_2()
    }
    Group(translationX = 611.586f, translationY = 374.897f) {
      reuse_3()
    }
    Group(translationX = 607.95667f, translationY = 378.7945f, rotation = 125.0f) {
      reuse_4()
    }
    Group(translationX = 612.1173f, translationY = 377.3695f, rotation = 55.0f) {
      reuse_5()
    }
    Group(translationX = 609.07635f, translationY = 376.57562f, rotation = -118.0f) {
      reuse_6()
    }
    Group(translationX = 608.049f, translationY = 378.654f, rotation = 180.0f) {
      reuse_7()
    }
    Group(translationX = 608.953f, translationY = 370.026f) {
      reuse_8()
    }
    Group(translationX = 609.163f, translationY = 370.722f) {
      reuse_9()
    }
    Group(translationX = 610.019f, translationY = 370.722f) {
      reuse_10()
    }
    Group(translationX = 620.32f, translationY = 377.697f) {
      reuse_11()
    }
    Group(translationX = 386.378f, translationY = 227.154f) {
      Path(path48, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 376.299f, translationY = 232.093f) {
      Path(path49, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 372.6688f, translationY = 235.99034f, rotation = 125.0f) {
      reuse_4()
    }
    Group(translationX = 376.82947f, translationY = 234.56528f, rotation = 55.0f) {
      Path(path51, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 373.7928f, translationY = 233.77425f, rotation = -118.0f) {
      Path(path52, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 372.763f, translationY = 235.85f, rotation = 180.0f) {
      Path(path53, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 373.665f, translationY = 227.222f) {
      Path(path54, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 373.875f, translationY = 227.918f) {
      Path(path55, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 374.732f, translationY = 227.918f) {
      Path(path56, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 385.033f, translationY = 234.893f) {
      Path(path57, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 582.655f, translationY = 514.532f) {
      Path(path58, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 572.576f, translationY = 519.47f) {
      Path(path59, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 568.93665f, translationY = 523.36633f, rotation = 125.0f) {
      Path(path60, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 573.1028f, translationY = 521.9353f, rotation = 55.0f) {
      Path(path61, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 570.0726f, translationY = 521.14795f, rotation = -118.0f) {
      Path(path62, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 569.039f, translationY = 523.228f, rotation = 180.0f) {
      Path(path63, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 569.943f, translationY = 514.597f) {
      Path(path64, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 570.152f, translationY = 515.295f) {
      Path(path65, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 571.009f, translationY = 515.295f) {
      Path(path66, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 581.31f, translationY = 522.271f) {
      Path(path67, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 178.041f, translationY = 23.282f) {
      Path(path68, fill = SolidColor(Color(-1010895)))
    }
    Group(translationX = 178.041f, translationY = 51.501f) {
      Path(path69, fill = SolidColor(Color(-6508068)))
    }
    Group(translationX = 178.041f, translationY = 37.391f) {
      Path(path70, fill = SolidColor(Color(-535808)))
    }
    Group(translationX = 332.205f, translationY = 23.605f) {
      Path(path71, fill = SolidColor(Color(-5764562)))
    }
    Group(translationX = 317.899f, translationY = 23.318f) {
      Path(path72, fill = SolidColor(Color(-1756633)))
    }
    Group(translationX = 533.414f, translationY = 514.107f) {
      Path(path73, fill = SolidColor(Color(-5764562)))
    }
    Group(translationX = 944.58f, translationY = 793.343f) {
      Path(path74, fill = SolidColor(Color(-1756633)))
    }
    Group(translationX = 547.855f, translationY = 37.575f) {
      Path(path75, fill = SolidColor(Color(-7881435)))
    }
    Group(translationX = 547.855f, translationY = 23.447f) {
      Path(path76, fill = SolidColor(Color(-16738183)))
    }
    Group(translationX = 548.222f, translationY = 514.107f) {
      Path(path77, fill = SolidColor(Color(-7881435)))
    }
    Group(translationX = 926.21f, translationY = 688.612f) {
      Path(path78, fill = SolidColor(Color(-16738183)))
    }
    Group(translationX = 891.82f, translationY = 51.919f) {
      Path(path79, fill = SolidColor(Color(-5621110)))
    }
    Group(translationX = 891.82f, translationY = 37.723f) {
      Path(path80, fill = SolidColor(Color(-608587)))
    }
    Group(translationX = 891.82f, translationY = 23.422f) {
      Path(path81, fill = SolidColor(Color(-1630355)))
    }
    Group(translationX = 891.35f, translationY = 65.794f) {
      Path(path82, fill = SolidColor(Color(-6184752)))
    }
    Group(translationX = 126.959f, translationY = 793.301f) {
      Path(path83, fill = SolidColor(Color(-5621110)))
    }
    Group(translationX = 630.269f, translationY = 355.6f) {
      Path(path84, fill = SolidColor(Color(-608587)))
    }
    Group(translationX = 615.712f, translationY = 355.527f) {
      Path(path85, fill = SolidColor(Color(-1630355)))
    }
    Group(translationX = 1060.23f, translationY = 38.792f) {
      Path(path86, fill = SolidColor(Color(-10513872)))
    }
    Group(translationX = 1051.35f, translationY = 46.226f) {
      Path(path87, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 908.95f, translationY = 201.513f) {
      Path(path88, fill = SolidColor(Color(-10513872)))
    }
    Group(translationX = 900.08f, translationY = 208.948f) {
      Path(path89, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 309.741f, translationY = 766.877f) {
      Path(path90, fill = SolidColor(Color(-10513872)))
    }
    Group(translationX = 300.865f, translationY = 774.31f) {
      Path(path91, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 469.994f, translationY = 748.34f) {
      Path(path92, fill = SolidColor(Color(-10513872)))
    }
    Group(translationX = 461.119f, translationY = 755.773f) {
      Path(path93, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 928.26f, translationY = 378.778f) {
      Path(path94, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 206.941f, translationY = 91.175f) {
      reuse_12()
    }
    Group(translationX = 200.566f, translationY = 91.592f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 204.28f, translationY = 94.226f) {
      reuse_14()
    }
    Group(translationX = 202.427f, translationY = 97.522f) {
      reuse_15()
    }
    Group(translationX = 234.897f, translationY = 91.169f) {
      Path(path99, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 231.398f, translationY = 95.938f) {
      Path(path100, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 227.67047f, translationY = 99.99002f, rotation = 125.0f) {
      reuse_16()
    }
    Group(translationX = 231.95476f, translationY = 98.51836f, rotation = 55.0f) {
      Path(path102, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 228.8241f, translationY = 97.69614f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -117.0f) {
      Path(path103, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 227.756f, translationY = 99.852f, rotation = 180.0f) {
      Path(path104, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 228.686f, translationY = 90.867f) {
      Path(path105, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 228.902f, translationY = 91.593f) {
      Path(path106, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 229.785f, translationY = 91.593f) {
      Path(path107, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 691.033f, translationY = 355.98f) {
      reuse_17()
    }
    Group(translationX = 687.534f, translationY = 360.749f) {
      reuse_18()
    }
    Group(translationX = 683.81067f, translationY = 364.801f, rotation = 125.0f) {
      reuse_19()
    }
    Group(translationX = 688.09436f, translationY = 363.33243f, rotation = 55.0f) {
      reuse_20()
    }
    Group(translationX = 684.9596f, translationY = 362.5058f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -117.0f) {
      reuse_21()
    }
    Group(translationX = 683.892f, translationY = 364.663f, rotation = 180.0f) {
      reuse_22()
    }
    Group(translationX = 684.822f, translationY = 355.678f) {
      reuse_23()
    }
    Group(translationX = 685.039f, translationY = 356.404f) {
      reuse_24()
    }
    Group(translationX = 685.92f, translationY = 356.404f) {
      reuse_25()
    }
    Group(translationX = 912.09f, translationY = 702.979f) {
      Path(path117, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 908.59f, translationY = 707.75f) {
      Path(path118, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 904.8703f, translationY = 711.8035f, rotation = 125.0f) {
      reuse_16()
    }
    Group(translationX = 909.15454f, translationY = 710.337f, rotation = 55.0f) {
      reuse_20()
    }
    Group(translationX = 906.0185f, translationY = 709.50494f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -117.0f) {
      reuse_21()
    }
    Group(translationX = 904.95f, translationY = 711.663f, rotation = 180.0f) {
      reuse_22()
    }
    Group(translationX = 905.88f, translationY = 702.679f) {
      Path(path123, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 906.09f, translationY = 703.404f) {
      Path(path124, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 906.98f, translationY = 703.404f) {
      Path(path125, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 810.02f, translationY = 463.055f) {
      Path(path126, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 811.49f, translationY = 469.441f) {
      Path(path127, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 804.4983f, translationY = 472.06567f, rotation = 169.0f) {
      Path(path128, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 808.98486f, translationY = 474.98715f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 100.0f) {
      Path(path129, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 808.1503f, translationY = 472.14044f, rotation = -73.0f) {
      Path(path130, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 806.135f, translationY = 471.65796f, rotation = -135.0f) {
      Path(path131, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 812.1f, translationY = 467.552f) {
      Path(path132, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 811.88f, translationY = 467.035f) {
      Path(path133, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 812.51f, translationY = 467.805f) {
      Path(path134, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 601.488f, translationY = 370.057f) {
      reuse_17()
    }
    Group(translationX = 597.989f, translationY = 374.827f) {
      reuse_18()
    }
    Group(translationX = 594.2654f, translationY = 378.8794f, rotation = 125.0f) {
      reuse_19()
    }
    Group(translationX = 598.54846f, translationY = 377.4092f, rotation = 55.0f) {
      reuse_20()
    }
    Group(translationX = 595.4152f, translationY = 376.58383f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -117.0f) {
      reuse_21()
    }
    Group(translationX = 594.347f, translationY = 378.74f, rotation = 180.0f) {
      reuse_22()
    }
    Group(translationX = 595.277f, translationY = 369.755f) {
      reuse_23()
    }
    Group(translationX = 595.494f, translationY = 370.481f) {
      reuse_24()
    }
    Group(translationX = 596.375f, translationY = 370.481f) {
      reuse_25()
    }
    Group(translationX = 681.126f, translationY = 72.402f) {
      Path(path144, fill = SolidColor(Color(-6122810)))
    }
    Group(translationX = 672.318f, translationY = 79.588f) {
      Path(path145, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 176.545f, translationY = 483.38f) {
      Path(path146, fill = SolidColor(Color(-6122810)))
    }
    Group(translationX = 167.737f, translationY = 490.567f) {
      Path(path147, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 870.93f, translationY = 793.377f) {
      Path(path148, fill = SolidColor(Color(-7448025)))
    }
    Group(translationX = 170.942f, translationY = 725.696f) {
      Path(path149, fill = SolidColor(Color(-15123094)))
    }
    Group(translationX = 162.133f, translationY = 733.087f) {
      Path(path150, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 400.721f, translationY = 226.635f) {
      Path(path151, fill = SolidColor(Color(-7448025)))
    }
    Group(translationX = 167.515f, translationY = 474.429f) {
      Path(path152, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 0.6f)
    }
    Group(translationX = 1112.78f, translationY = 468.635f) {
      Path(path153, fill = SolidColor(Color(-1010895)))
    }
    Group(translationX = 1127.03f, translationY = 468.701f) {
      Path(path154, fill = SolidColor(Color(-535808)))
    }
    Group(translationX = 560.621f, translationY = 396.846f) {
      Path(path155, stroke = SolidColor(Color(-5664061)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 446.74982f, translationY = 274.97375f, rotation = 45.0f) {
      Path(path156, stroke = SolidColor(Color(-6771500)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 483.969f, translationY = 231.095f) {
      Path(path157, stroke = SolidColor(Color(-6021840)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 442.814f, translationY = 258.262f, rotation = 180.0f) {
      Path(path158, stroke = SolidColor(Color(-1011664)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 566.339f, translationY = 22.774f) {
      Path(path159, stroke = SolidColor(Color(-739917)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 569.139f, translationY = 22.774f) {
      Path(path160, stroke = SolidColor(Color(-1827217)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 873.61f, translationY = 381.25f) {
      Path(path161, stroke = SolidColor(Color(-6185268)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 856.74f, translationY = 22.774f) {
      Path(path162, stroke = SolidColor(Color(-6078578)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 111.21f, translationY = 525.727f) {
      Path(path163, stroke = SolidColor(Color(-6078578)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 442.814f, translationY = 22.773f) {
      Path(path164, stroke = SolidColor(Color(-1011664)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 1129.15f, translationY = 385.69f) {
      Path(path165, stroke = SolidColor(Color(-1011664)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 450.483f, translationY = 386.864f) {
      Path(path166, stroke = SolidColor(Color(-6771500)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 155.305f, translationY = 276.516f) {
      Path(path167, stroke = SolidColor(Color(-6771500)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 440.763f, translationY = 22.773f) {
      Path(path168, stroke = SolidColor(Color(-864749)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 1129.15f, translationY = 389.104f) {
      Path(path169, stroke = SolidColor(Color(-864749)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 445.523f, translationY = 804.01f) {
      Path(path170, stroke = SolidColor(Color(-6920921)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 299.721f, translationY = 227.79f) {
      Path(path171, stroke = SolidColor(Color(-6021840)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 896.36f, translationY = 226.078f) {
      Path(path172, stroke = SolidColor(Color(-16738695)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 928.94f, translationY = 22.773f) {
      Path(path173, stroke = SolidColor(Color(-2148311)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 532.281f, translationY = 222.438f) {
      Path(path174, stroke = SolidColor(Color(-16738692)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 486.769f, translationY = 22.773f) {
      Path(path175, stroke = SolidColor(Color(-8341183)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 440.763f, translationY = 261.062f, rotation = 180.0f) {
      Path(path176, stroke = SolidColor(Color(-864749)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 345.705f, translationY = 258.345f) {
      Path(path177, fill = SolidColor(Color(-1)), stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 262.06f, translationY = 186.01f) {
      Path(path178, fill = SolidColor(Color(-1)), stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 955.46f, translationY = 541.47f, rotation = -90.0f) {
      reuse_26()
    }
    Group(translationX = 955.46f, translationY = 541.47f, rotation = 90.0f) {
      Path(path180, stroke = SolidColor(Color(-15057814)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 275.706f, translationY = 388.643f, rotation = 180.0f) {
      Path(path181, stroke = SolidColor(Color(-5664061)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 460.905f, translationY = 195.319f, rotation = 90.0f) {
      Path(path182, stroke = SolidColor(Color(-2413017)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 128.335f, translationY = 100.319f) {
      Path(path183, stroke = SolidColor(Color(-2413017)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 431.711f, translationY = 720.519f) {
      Path(path184, stroke = SolidColor(Color(-1005282)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 275.706f, translationY = 448.283f) {
      Path(path185, stroke = SolidColor(Color(-5664061)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 552.55f, translationY = 399.082f) {
      Path(path186, stroke = SolidColor(Color(-5664061)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 669.66f, translationY = 368.667f) {
      Path(path187, stroke = SolidColor(Color(-5664061)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 964.81f, translationY = 288.203f, rotation = -90.0f) {
      Path(path188, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 1050.26f, translationY = 752.922f) {
      Path(path189, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 319.679f, translationY = 708.745f) {
      Path(path190, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 6.5f)
    }
    Group(translationX = 1050.26f, translationY = 53.1f, rotation = -90.0f) {
      reuse_27()
    }
    Group(translationX = 1050.26f, translationY = 53.1f, rotation = 90.0f) {
      Path(path192, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 124.196f, translationY = 584.012f, rotation = -90.0f) {
      reuse_28()
    }
    Group(translationX = 124.196f, translationY = 584.012f, rotation = 90.0f) {
      Path(path194, stroke = SolidColor(Color(-2413017)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 170.773f, translationY = 442.225f, rotation = -90.0f) {
      reuse_28()
    }
    Group(translationX = 170.773f, translationY = 442.225f, rotation = 90.0f) {
      Path(path196, stroke = SolidColor(Color(-5664061)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 238.933f, translationY = 382.967f) {
      reuse_29()
    }
    Group(translationX = 326.598f, translationY = 382.967f) {
      reuse_29()
    }
    Group(translationX = 366.48f, translationY = 382.967f) {
      reuse_29()
    }
    Group(translationX = 448.499f, translationY = 401.235f) {
      reuse_29()
    }
    Group(translationX = 485.48f, translationY = 401.235f) {
      reuse_29()
    }
    Group(translationX = 522.397f, translationY = 401.235f) {
      reuse_29()
    }
    Group(translationX = 195.09305f, translationY = 415.74677f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -43.0f) {
      reuse_29()
    }
    Group(translationX = 319.679f, translationY = 765.412f, rotation = -90.0f) {
      Path(path204, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 319.679f, translationY = 765.412f, rotation = 90.0f) {
      Path(path205, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 443.022f, translationY = 747.025f, rotation = -90.0f) {
      reuse_26()
    }
    Group(translationX = 443.022f, translationY = 747.025f, rotation = 90.0f) {
      Path(path207, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 899.35f, translationY = 215.476f, rotation = -90.0f) {
      reuse_27()
    }
    Group(translationX = 899.35f, translationY = 215.476f, rotation = 90.0f) {
      Path(path209, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 696.284f, translationY = 689.215f, rotation = -90.0f) {
      reuse_30()
    }
    Group(translationX = 696.284f, translationY = 689.215f, rotation = 90.0f) {
      Path(path211, stroke = SolidColor(Color(-6645094)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 696.121f, translationY = 717.006f, rotation = -90.0f) {
      reuse_31()
    }
    Group(translationX = 696.121f, translationY = 717.006f, rotation = 90.0f) {
      Path(path213, stroke = SolidColor(Color(-6645094)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 706.024f, translationY = 707.963f, rotation = 90.0f) {
      Path(path214, stroke = SolidColor(Color(-6645094)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 920.49f, translationY = 754.989f, rotation = -90.0f) {
      reuse_31()
    }
    Group(translationX = 920.49f, translationY = 754.989f, rotation = 90.0f) {
      Path(path216, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 431.71f, translationY = 87.792f, rotation = -90.0f) {
      Path(path217, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 431.71f, translationY = 87.792f, rotation = 90.0f) {
      Path(path218, stroke = SolidColor(Color(-1005282)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 669.668f, translationY = 86.627f, rotation = -90.0f) {
      Path(path219, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 669.668f, translationY = 86.627f, rotation = 90.0f) {
      Path(path220, stroke = SolidColor(Color(-5664061)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 899.48f, translationY = 720.348f) {
      reuse_32()
    }
    Group(translationX = 899.48f, translationY = 720.348f) {
      reuse_33()
    }
    Group(translationX = 742.451f, translationY = 194.33f) {
      Path(path223, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 742.451f, translationY = 194.33f) {
      Path(path224, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 465.563f, translationY = 156.616f) {
      Path(path225, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 465.563f, translationY = 156.616f) {
      Path(path226, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 749.825f, translationY = 574.48f) {
      Path(path227, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 749.825f, translationY = 574.48f) {
      Path(path228, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 1000.45f, translationY = 466.373f) {
      Path(path229, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 1000.45f, translationY = 466.373f) {
      Path(path230, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 485.447f, translationY = 502.952f, rotation = -90.0f) {
      reuse_30()
    }
    Group(translationX = 485.447f, translationY = 502.952f, rotation = 90.0f) {
      Path(path232, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 823.3f, translationY = 92.633f) {
      Path(path233, fill = SolidColor(Color(-1)), stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 587.545f, translationY = 284.751f, rotation = -90.0f) {
      reuse_34()
    }
    Group(translationX = 587.545f, translationY = 284.751f, rotation = 90.0f) {
      Path(path235, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 453.98f, translationY = 232.6f) {
      Path(path236, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 453.98f, translationY = 232.6f) {
      Path(path237, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 416.31f, translationY = 196.995f) {
      reuse_35()
    }
    Group(translationX = 416.31f, translationY = 196.995f) {
      reuse_36()
    }
    Group(translationX = 378.658f, translationY = 158.436f) {
      reuse_35()
    }
    Group(translationX = 378.658f, translationY = 158.436f) {
      reuse_36()
    }
    Group(translationX = 345.29f, translationY = 125.575f) {
      reuse_37()
    }
    Group(translationX = 345.29f, translationY = 125.575f) {
      reuse_38()
    }
    Group(translationX = 311.04f, translationY = 91.31f) {
      reuse_37()
    }
    Group(translationX = 311.04f, translationY = 91.31f) {
      reuse_38()
    }
    Group(translationX = 505.195f, translationY = 286.976f) {
      Path(path246, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 505.195f, translationY = 286.976f) {
      Path(path247, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 604.65f, translationY = 542.88f, rotation = -90.0f) {
      reuse_30()
    }
    Group(translationX = 604.65f, translationY = 542.88f, rotation = 90.0f) {
      Path(path249, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 177.396f, translationY = 505.61f) {
      Path(path250, stroke = SolidColor(Color(-14992022)), strokeLineWidth = 6.0f)
    }
    Group(translationX = 445.822f, translationY = 542.702f, rotation = -90.0f) {
      reuse_30()
    }
    Group(translationX = 445.822f, translationY = 542.702f, rotation = 90.0f) {
      Path(path252, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 406.09f, translationY = 661.812f, rotation = -90.0f) {
      reuse_34()
    }
    Group(translationX = 406.09f, translationY = 661.812f, rotation = 90.0f) {
      Path(path254, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 922.49f, translationY = 369.804f, rotation = 90.0f) {
      Path(path255, fill = SolidColor(Color(-10253010)))
    }
    Group(translationX = 912.0065f, translationY = 345.8919f, rotation = -134.0f) {
      Path(path256, stroke = SolidColor(Color(-10253010)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 899.37f, translationY = 344.233f, rotation = -90.0f) {
      Path(path257, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 899.37f, translationY = 344.233f, rotation = 90.0f) {
      Path(path258, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 793.03f, translationY = 412.325f, rotation = -90.0f) {
      reuse_34()
    }
    Group(translationX = 793.03f, translationY = 412.325f, rotation = 90.0f) {
      Path(path260, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 716.971f, translationY = 487.063f) {
      Path(path261, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 716.971f, translationY = 487.063f) {
      Path(path262, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 644.201f, translationY = 384.005f, rotation = -90.0f) {
      reuse_34()
    }
    Group(translationX = 644.201f, translationY = 384.005f, rotation = 90.0f) {
      Path(path264, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 644.07f, translationY = 437.266f) {
      Path(path265, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 644.07f, translationY = 437.266f) {
      Path(path266, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 406.146f, translationY = 383.947f, rotation = -90.0f) {
      reuse_39()
    }
    Group(translationX = 406.146f, translationY = 383.947f, rotation = 90.0f) {
      Path(path268, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 723.619f, translationY = 384.005f, rotation = -90.0f) {
      reuse_34()
    }
    Group(translationX = 723.619f, translationY = 384.005f, rotation = 90.0f) {
      Path(path270, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 535.445f, translationY = 73.895f) {
      Path(path271, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 535.445f, translationY = 73.895f) {
      Path(path272, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 512.749f, translationY = 106.993f) {
      Path(path273, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 512.749f, translationY = 106.993f) {
      Path(path274, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 159.454f, translationY = 701.56f, rotation = 90.0f) {
      Path(path275, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 159.454f, translationY = 701.56f, rotation = 90.0f) {
      Path(path276, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 111.349f, translationY = 734.579f, rotation = 90.0f) {
      reuse_40()
    }
    Group(translationX = 111.349f, translationY = 734.579f, rotation = 90.0f) {
      Path(path278, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 111.349f, translationY = 759.454f, rotation = 90.0f) {
      reuse_40()
    }
    Group(translationX = 111.349f, translationY = 759.454f, rotation = 90.0f) {
      Path(path280, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 287.146f, translationY = 383.947f, rotation = -90.0f) {
      reuse_39()
    }
    Group(translationX = 287.146f, translationY = 383.947f, rotation = 90.0f) {
      Path(path282, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 578.486f, translationY = 390.682f) {
      Path(path283, fill = SolidColor(Color(-1)), stroke = SolidColor(Color(-16777216)), strokeLineWidth = 1.84f)
    }
    Group(translationX = 183.165f, translationY = 110.017f) {
      Path(path284, fill = SolidColor(Color(-1)), stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 604.401f, translationY = 576.477f, rotation = -90.0f) {
      reuse_30()
    }
    Group(translationX = 604.401f, translationY = 576.477f, rotation = 90.0f) {
      Path(path286, stroke = SolidColor(Color(-6645094)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 624.901f, translationY = 576.477f, rotation = -90.0f) {
      reuse_30()
    }
    Group(translationX = 624.901f, translationY = 576.477f, rotation = 90.0f) {
      Path(path288, stroke = SolidColor(Color(-6645094)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 609.047f, translationY = 581.173f, rotation = 180.0f) {
      Path(path289, stroke = SolidColor(Color(-6645094)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 956.29f, translationY = 714.606f, rotation = -90.0f) {
      reuse_26()
    }
    Group(translationX = 956.29f, translationY = 714.606f, rotation = 90.0f) {
      Path(path291, stroke = SolidColor(Color(-809443)), strokeLineWidth = 2.5f)
    }
    Group(translationX = 866.57f, translationY = 515.9f, rotation = -90.0f) {
      Path(path292, stroke = SolidColor(Color(-6078578)), strokeLineWidth = 1.8f)
    }
    Group(translationX = 195.355f, translationY = 666.921f) {
      Path(path293, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 226.687f, translationY = 635.709f) {
      Path(path294, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 257.73f, translationY = 604.534f) {
      Path(path295, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 289.052f, translationY = 573.342f) {
      Path(path296, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 326.752f, translationY = 541.744f) {
      Path(path297, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 366.478f, translationY = 541.744f) {
      reuse_41()
    }
    Group(translationX = 405.146f, translationY = 541.744f) {
      reuse_42()
    }
    Group(translationX = 563.535f, translationY = 606.894f) {
      Path(path300, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 686.789f, translationY = 537.422f) {
      reuse_42()
    }
    Group(translationX = 820.27f, translationY = 541.544f) {
      reuse_41()
    }
    Group(translationX = 900.6f, translationY = 541.544f) {
      reuse_41()
    }
    Group(translationX = 778.73f, translationY = 515.768f) {
      Path(path304, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 480.322f, translationY = 567.062f) {
      Path(path305, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 508.103f, translationY = 594.972f) {
      Path(path306, fill = SolidColor(Color(-14992022)))
    }
    Group(translationX = 238.098f, translationY = 405.802f, scaleX = 12.8203f, scaleY = 12.8203f, rotation = 90.0f) {
      Path(path307, fill = SolidColor(Color(-16777216)))
    }
    Group(translationX = 232.981f, translationY = 412.214f) {
      Path(path308, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 240.033f, translationY = 416.952f) {
      Path(path309, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 238.361f, translationY = 412.278f) {
      Path(path310, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 646.275f, translationY = 539.318f, rotation = -90.0f) {
      reuse_30()
    }
    Group(translationX = 646.275f, translationY = 539.318f, rotation = 90.0f) {
      Path(path312, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 733.824f, translationY = 530.563f) {
      Path(path313, fill = SolidColor(Color(-1)))
    }
    Group(translationX = 733.824f, translationY = 530.563f) {
      Path(path314, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
    }
    Group(translationX = 860.03f, translationY = 547.352f) {
      reuse_32()
    }
    Group(translationX = 860.03f, translationY = 547.352f) {
      reuse_33()
    }
    Group(translationX = 171.82f, translationY = 154.5f) {
      reuse_12()
    }
    Group(translationX = 165.444f, translationY = 154.918f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 169.159f, translationY = 157.552f) {
      reuse_14()
    }
    Group(translationX = 167.306f, translationY = 160.848f) {
      reuse_15()
    }
    Group(translationX = 157.85f, translationY = 190.607f) {
      reuse_12()
    }
    Group(translationX = 151.474f, translationY = 191.024f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 155.189f, translationY = 193.658f) {
      reuse_14()
    }
    Group(translationX = 153.336f, translationY = 196.954f) {
      reuse_15()
    }
    Group(translationX = 171.816f, translationY = 261.608f) {
      reuse_12()
    }
    Group(translationX = 165.44f, translationY = 262.024f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 169.155f, translationY = 264.659f) {
      reuse_14()
    }
    Group(translationX = 167.302f, translationY = 267.955f) {
      reuse_15()
    }
    Group(translationX = 273.76193f, translationY = 271.7071f, rotation = -46.0f) {
      reuse_12()
    }
    Group(translationX = 269.59338f, translationY = 276.54617f, scaleX = 0.99997f, scaleY = 0.99997f, rotation = -134.0f) {
      reuse_13()
    }
    Group(translationX = 274.08148f, translationY = 275.74304f, rotation = -46.0f) {
      reuse_14()
    }
    Group(translationX = 275.14f, translationY = 279.37244f, rotation = -46.0f) {
      reuse_15()
    }
    Group(translationX = 156.85f, translationY = 483.205f) {
      reuse_12()
    }
    Group(translationX = 150.476f, translationY = 483.622f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 154.189f, translationY = 486.256f) {
      reuse_14()
    }
    Group(translationX = 152.336f, translationY = 489.552f) {
      reuse_15()
    }
    Group(translationX = 208.78589f, translationY = 438.5854f, rotation = 45.0f) {
      reuse_12()
    }
    Group(translationX = 203.98065f, translationY = 434.37476f, scaleX = 0.99999f, scaleY = 0.99999f, rotation = 135.0f) {
      reuse_13()
    }
    Group(translationX = 204.74658f, translationY = 438.863f, rotation = 45.0f) {
      reuse_14()
    }
    Group(translationX = 201.10626f, translationY = 439.88678f, rotation = 45.0f) {
      reuse_15()
    }
    Group(translationX = 276.87f, translationY = 395.387f) {
      reuse_12()
    }
    Group(translationX = 270.496f, translationY = 395.804f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 274.209f, translationY = 398.438f) {
      reuse_14()
    }
    Group(translationX = 272.356f, translationY = 401.734f) {
      reuse_15()
    }
    Group(translationX = 148.322f, translationY = 569.813f) {
      reuse_12()
    }
    Group(translationX = 141.946f, translationY = 570.23f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 145.661f, translationY = 572.865f) {
      reuse_14()
    }
    Group(translationX = 143.808f, translationY = 576.161f) {
      reuse_15()
    }
    Group(translationX = 328.33655f, translationY = 333.70758f, rotation = -46.0f) {
      reuse_12()
    }
    Group(translationX = 324.17465f, translationY = 338.55145f, rotation = -134.0f) {
      reuse_13()
    }
    Group(translationX = 328.6541f, translationY = 337.74323f, rotation = -46.0f) {
      reuse_14()
    }
    Group(translationX = 329.7107f, translationY = 341.37323f, rotation = -46.0f) {
      reuse_15()
    }
    Group(translationX = 356.0474f, translationY = 340.75552f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -46.0f) {
      reuse_12()
    }
    Group(translationX = 351.9002f, translationY = 345.61557f, scaleX = 0.99998f, scaleY = 0.99998f, rotation = -134.0f) {
      reuse_13()
    }
    Group(translationX = 356.38733f, translationY = 344.78998f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -46.0f) {
      reuse_14()
    }
    Group(translationX = 357.4663f, translationY = 348.41315f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -46.0f) {
      reuse_15()
    }
    Group(translationX = 396.92288f, translationY = 340.59872f, rotation = -45.0f) {
      reuse_12()
    }
    Group(translationX = 392.73428f, translationY = 345.42407f, rotation = -135.0f) {
      reuse_13()
    }
    Group(translationX = 397.22006f, translationY = 344.63666f, rotation = -45.0f) {
      reuse_14()
    }
    Group(translationX = 398.26056f, translationY = 348.27173f, rotation = -45.0f) {
      reuse_15()
    }
    Group(translationX = 450.97733f, translationY = 353.12296f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -45.0f) {
      reuse_12()
    }
    Group(translationX = 446.74323f, translationY = 357.9079f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -135.0f) {
      reuse_13()
    }
    Group(translationX = 451.23694f, translationY = 357.16306f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -45.0f) {
      reuse_14()
    }
    Group(translationX = 452.24417f, translationY = 360.80783f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -45.0f) {
      reuse_15()
    }
    Group(translationX = 490.88583f, translationY = 348.68213f, rotation = -45.0f) {
      reuse_12()
    }
    Group(translationX = 486.6855f, translationY = 353.49524f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -135.0f) {
      reuse_13()
    }
    Group(translationX = 491.17087f, translationY = 352.71994f, rotation = -45.0f) {
      reuse_14()
    }
    Group(translationX = 492.19952f, translationY = 356.35895f, rotation = -45.0f) {
      reuse_15()
    }
    Group(translationX = 509.7651f, translationY = 366.35178f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -46.0f) {
      reuse_12()
    }
    Group(translationX = 505.6423f, translationY = 371.23227f, scaleX = 0.99998f, scaleY = 0.99998f, rotation = -134.0f) {
      reuse_13()
    }
    Group(translationX = 510.1232f, translationY = 370.38406f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -46.0f) {
      reuse_14()
    }
    Group(translationX = 511.2074f, translationY = 373.9987f, scaleX = 0.9999799f, scaleY = 0.9999799f, rotation = -46.0f) {
      reuse_15()
    }
    Group(translationX = 457.492f, translationY = 72.329f) {
      reuse_12()
    }
    Group(translationX = 451.118f, translationY = 72.746f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 454.831f, translationY = 75.38f) {
      reuse_14()
    }
    Group(translationX = 452.978f, translationY = 78.676f) {
      reuse_15()
    }
    Group(translationX = 430.514f, translationY = 167.218f) {
      reuse_12()
    }
    Group(translationX = 424.14f, translationY = 167.634f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 427.853f, translationY = 170.269f) {
      reuse_14()
    }
    Group(translationX = 426.0f, translationY = 173.565f) {
      reuse_15()
    }
    Group(translationX = 541.31714f, translationY = 137.63727f, rotation = -45.0f) {
      reuse_12()
    }
    Group(translationX = 537.12305f, translationY = 142.45677f, rotation = -135.0f) {
      reuse_13()
    }
    Group(translationX = 541.6087f, translationY = 141.67542f, rotation = -45.0f) {
      reuse_14()
    }
    Group(translationX = 542.642f, translationY = 145.31311f, rotation = -45.0f) {
      reuse_15()
    }
    Group(translationX = 695.607f, translationY = 72.242f) {
      reuse_12()
    }
    Group(translationX = 689.234f, translationY = 72.66f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 692.946f, translationY = 75.293f) {
      reuse_14()
    }
    Group(translationX = 691.093f, translationY = 78.59f) {
      reuse_15()
    }
    Group(translationX = 790.24f, translationY = 73.954f) {
      reuse_12()
    }
    Group(translationX = 783.87f, translationY = 74.37f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 787.58f, translationY = 77.005f) {
      reuse_14()
    }
    Group(translationX = 785.73f, translationY = 80.3f) {
      reuse_15()
    }
    Group(translationX = 720.987f, translationY = 127.49f) {
      reuse_12()
    }
    Group(translationX = 714.612f, translationY = 127.906f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 718.326f, translationY = 130.541f) {
      reuse_14()
    }
    Group(translationX = 716.473f, translationY = 133.837f) {
      reuse_15()
    }
    Group(translationX = 558.3611f, translationY = 182.53845f, rotation = -45.0f) {
      reuse_12()
    }
    Group(translationX = 554.1792f, translationY = 187.33932f, scaleX = 1.00006f, scaleY = 1.00006f, rotation = -135.0f) {
      reuse_13()
    }
    Group(translationX = 558.6288f, translationY = 186.57861f, rotation = -45.0f) {
      reuse_14()
    }
    Group(translationX = 559.63983f, translationY = 190.22107f, rotation = -45.0f) {
      reuse_15()
    }
    Group(translationX = 597.5757f, translationY = 208.81189f, rotation = -45.0f) {
      reuse_12()
    }
    Group(translationX = 593.39557f, translationY = 213.61546f, scaleX = 1.00006f, scaleY = 1.00006f, rotation = -135.0f) {
      reuse_13()
    }
    Group(translationX = 597.8409f, translationY = 212.85223f, rotation = -45.0f) {
      reuse_14()
    }
    Group(translationX = 598.85425f, translationY = 216.49445f, rotation = -45.0f) {
      reuse_15()
    }
    Group(translationX = 554.657f, translationY = 284.833f) {
      reuse_12()
    }
    Group(translationX = 548.284f, translationY = 285.25f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 551.996f, translationY = 287.884f) {
      reuse_14()
    }
    Group(translationX = 550.143f, translationY = 291.18f) {
      reuse_15()
    }
    Group(translationX = 552.258f, translationY = 335.942f) {
      reuse_12()
    }
    Group(translationX = 545.884f, translationY = 336.36f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 549.597f, translationY = 338.993f) {
      reuse_14()
    }
    Group(translationX = 547.744f, translationY = 342.29f) {
      reuse_15()
    }
    Group(translationX = 587.757f, translationY = 355.952f) {
      reuse_12()
    }
    Group(translationX = 581.382f, translationY = 356.37f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 585.096f, translationY = 359.003f) {
      reuse_14()
    }
    Group(translationX = 583.243f, translationY = 362.299f) {
      reuse_15()
    }
    Group(translationX = 662.757f, translationY = 355.952f) {
      reuse_12()
    }
    Group(translationX = 656.382f, translationY = 356.37f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 660.096f, translationY = 359.003f) {
      reuse_14()
    }
    Group(translationX = 658.243f, translationY = 362.299f) {
      reuse_15()
    }
    Group(translationX = 678.585f, translationY = 320.346f) {
      reuse_12()
    }
    Group(translationX = 672.21f, translationY = 320.762f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 675.924f, translationY = 323.397f) {
      reuse_14()
    }
    Group(translationX = 674.07f, translationY = 326.693f) {
      reuse_15()
    }
    Group(translationX = 664.185f, translationY = 267.88f) {
      reuse_12()
    }
    Group(translationX = 657.81f, translationY = 268.298f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 661.524f, translationY = 270.932f) {
      reuse_14()
    }
    Group(translationX = 659.671f, translationY = 274.228f) {
      reuse_15()
    }
    Group(translationX = 680.928f, translationY = 242.354f) {
      reuse_12()
    }
    Group(translationX = 674.552f, translationY = 242.77f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 678.266f, translationY = 245.405f) {
      reuse_14()
    }
    Group(translationX = 676.413f, translationY = 248.7f) {
      reuse_15()
    }
    Group(translationX = 725.394f, translationY = 216.75f) {
      reuse_12()
    }
    Group(translationX = 719.02f, translationY = 217.168f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 722.732f, translationY = 219.801f) {
      reuse_14()
    }
    Group(translationX = 720.879f, translationY = 223.097f) {
      reuse_15()
    }
    Group(translationX = 689.816f, translationY = 180.014f) {
      reuse_12()
    }
    Group(translationX = 683.442f, translationY = 180.432f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 687.155f, translationY = 183.065f) {
      reuse_14()
    }
    Group(translationX = 685.302f, translationY = 186.361f) {
      reuse_15()
    }
    Group(translationX = 923.26f, translationY = 201.495f, scaleX = 0.9381f, scaleY = 0.9381f) {
      reuse_12()
    }
    Group(translationX = 917.28f, translationY = 201.888f, scaleX = 0.9381f, scaleY = 0.9381f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 920.77f, translationY = 204.358f, scaleX = 0.9381f, scaleY = 0.9381f) {
      reuse_14()
    }
    Group(translationX = 919.03f, translationY = 207.45f, scaleX = 0.9381f, scaleY = 0.9381f) {
      reuse_15()
    }
    Group(translationX = 1095.638f, translationY = 290.755f, scaleX = 0.9403f, scaleY = 0.9403f) {
      reuse_12()
    }
    Group(translationX = 1089.648f, translationY = 291.146f, scaleX = 0.9403f, scaleY = 0.9403f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 1093.138f, translationY = 293.624f, scaleX = 0.9403f, scaleY = 0.9403f) {
      reuse_14()
    }
    Group(translationX = 1091.398f, translationY = 296.723f, scaleX = 0.9403f, scaleY = 0.9403f) {
      reuse_15()
    }
    Group(translationX = 1073.352f, translationY = 318.527f, scaleX = 0.9403f, scaleY = 0.9403f) {
      reuse_12()
    }
    Group(translationX = 1067.352f, translationY = 318.92f, scaleX = 0.9403f, scaleY = 0.9403f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 1070.852f, translationY = 321.396f, scaleX = 0.9403f, scaleY = 0.9403f) {
      reuse_14()
    }
    Group(translationX = 1069.102f, translationY = 324.495f, scaleX = 0.9403f, scaleY = 0.9403f) {
      reuse_15()
    }
    Group(translationX = 290.08f, translationY = 766.853f) {
      reuse_12()
    }
    Group(translationX = 283.706f, translationY = 767.27f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 287.418f, translationY = 769.904f) {
      reuse_14()
    }
    Group(translationX = 285.565f, translationY = 773.2f) {
      reuse_15()
    }
    Group(translationX = 369.813f, translationY = 729.872f) {
      reuse_12()
    }
    Group(translationX = 363.44f, translationY = 730.288f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 367.152f, translationY = 732.923f) {
      reuse_14()
    }
    Group(translationX = 365.299f, translationY = 736.219f) {
      reuse_15()
    }
    Group(translationX = 426.203f, translationY = 701.671f) {
      reuse_12()
    }
    Group(translationX = 419.828f, translationY = 702.088f, rotation = 180.0f) {
      reuse_13()
    }
    Group(translationX = 423.542f, translationY = 704.722f) {
      reuse_14()
    }
    Group(translationX = 421.689f, translationY = 708.018f) {
      reuse_15()
    }
    Group() {
      Group(translationX = 426.203f, translationY = 651.921f) {
        reuse_12()
      }
      Group(translationX = 419.828f, translationY = 652.338f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 423.542f, translationY = 654.972f) {
        reuse_14()
      }
      Group(translationX = 421.689f, translationY = 658.268f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 484.271f, translationY = 748.315f) {
        reuse_12()
      }
      Group(translationX = 477.896f, translationY = 748.732f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 481.609f, translationY = 751.367f) {
        reuse_14()
      }
      Group(translationX = 479.756f, translationY = 754.663f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 527.0332f, translationY = 421.2172f, rotation = -45.0f) {
        reuse_12()
      }
      Group(translationX = 522.85114f, translationY = 426.04965f, scaleX = 1.00001f, scaleY = 1.00001f, rotation = -135.0f) {
        reuse_13()
      }
      Group(translationX = 527.3338f, translationY = 425.25436f, rotation = -45.0f) {
        reuse_14()
      }
      Group(translationX = 528.3777f, translationY = 428.88806f, rotation = -45.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 519.632f, translationY = 514.515f) {
        reuse_12()
      }
      Group(translationX = 513.258f, translationY = 514.932f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 516.971f, translationY = 517.566f) {
        reuse_14()
      }
      Group(translationX = 515.118f, translationY = 520.862f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 596.401f, translationY = 496.554f) {
        reuse_12()
      }
      Group(translationX = 590.028f, translationY = 496.972f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 593.74f, translationY = 499.605f) {
        reuse_14()
      }
      Group(translationX = 591.887f, translationY = 502.901f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 670.286f, translationY = 464.997f) {
        reuse_12()
      }
      Group(translationX = 663.91f, translationY = 465.414f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 667.625f, translationY = 468.048f) {
        reuse_14()
      }
      Group(translationX = 665.772f, translationY = 471.344f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 689.977f, translationY = 422.447f) {
        reuse_12()
      }
      Group(translationX = 683.602f, translationY = 422.864f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 687.315f, translationY = 425.498f) {
        reuse_14()
      }
      Group(translationX = 685.462f, translationY = 428.794f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 621.679f, translationY = 528.956f) {
        reuse_12()
      }
      Group(translationX = 615.304f, translationY = 529.374f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 619.018f, translationY = 532.007f) {
        reuse_14()
      }
      Group(translationX = 617.165f, translationY = 535.303f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 596.221f, translationY = 586.886f) {
        reuse_12()
      }
      Group(translationX = 589.846f, translationY = 587.302f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 593.56f, translationY = 589.937f) {
        reuse_14()
      }
      Group(translationX = 591.707f, translationY = 593.233f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 638.57056f, translationY = 647.6831f, rotation = -45.0f) {
        reuse_12()
      }
      Group(translationX = 634.3891f, translationY = 652.521f, scaleX = 1.00007f, scaleY = 1.00007f, rotation = -135.0f) {
        reuse_13()
      }
      Group(translationX = 638.83105f, translationY = 651.723f, rotation = -45.0f) {
        reuse_14()
      }
      Group(translationX = 639.83826f, translationY = 655.36725f, rotation = -45.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 667.06824f, translationY = 676.2095f, rotation = -45.0f) {
        reuse_12()
      }
      Group(translationX = 662.88745f, translationY = 681.0488f, scaleX = 1.00007f, scaleY = 1.00007f, rotation = -135.0f) {
        reuse_13()
      }
      Group(translationX = 667.3291f, translationY = 680.24854f, rotation = -45.0f) {
        reuse_14()
      }
      Group(translationX = 668.33594f, translationY = 683.8937f, rotation = -45.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 714.8165f, translationY = 684.18774f, rotation = -45.0f) {
        reuse_12()
      }
      Group(translationX = 710.64044f, translationY = 689.0299f, scaleX = 1.00007f, scaleY = 1.00007f, rotation = -135.0f) {
        reuse_13()
      }
      Group(translationX = 715.0773f, translationY = 688.2284f, rotation = -45.0f) {
        reuse_14()
      }
      Group(translationX = 716.0845f, translationY = 691.87244f, rotation = -45.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 748.0641f, translationY = 699.5764f, rotation = -45.0f) {
        reuse_12()
      }
      Group(translationX = 743.88983f, translationY = 704.41785f, scaleX = 1.00007f, scaleY = 1.00007f, rotation = -135.0f) {
        reuse_13()
      }
      Group(translationX = 748.3243f, translationY = 703.6157f, rotation = -45.0f) {
        reuse_14()
      }
      Group(translationX = 749.3318f, translationY = 707.26056f, rotation = -45.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 798.3972f, translationY = 699.5767f, rotation = -45.0f) {
        reuse_12()
      }
      Group(translationX = 794.22675f, translationY = 704.42004f, scaleX = 1.00007f, scaleY = 1.00007f, rotation = -135.0f) {
        reuse_13()
      }
      Group(translationX = 798.6566f, translationY = 703.61633f, rotation = -45.0f) {
        reuse_14()
      }
      Group(translationX = 799.6666f, translationY = 707.26105f, rotation = -45.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 848.9428f, translationY = 699.577f, rotation = -45.0f) {
        reuse_12()
      }
      Group(translationX = 844.77625f, translationY = 704.41876f, scaleX = 1.00007f, scaleY = 1.00007f, rotation = -135.0f) {
        reuse_13()
      }
      Group(translationX = 849.203f, translationY = 703.6162f, rotation = -45.0f) {
        reuse_14()
      }
      Group(translationX = 850.213f, translationY = 707.2609f, rotation = -45.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 912.56f, translationY = 688.773f) {
        reuse_12()
      }
      Group(translationX = 906.19f, translationY = 689.19f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 909.9f, translationY = 691.825f) {
        reuse_14()
      }
      Group(translationX = 908.05f, translationY = 695.121f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 997.23f, translationY = 715.765f) {
        reuse_12()
      }
      Group(translationX = 990.86f, translationY = 716.182f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 994.57f, translationY = 718.816f) {
        reuse_14()
      }
      Group(translationX = 992.72f, translationY = 722.112f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 769.416f, translationY = 374.185f) {
        reuse_12()
      }
      Group(translationX = 763.04f, translationY = 374.6f, rotation = 180.0f) {
        reuse_13()
      }
      Group(translationX = 766.756f, translationY = 377.236f) {
        reuse_14()
      }
      Group(translationX = 764.896f, translationY = 380.532f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 786.51447f, translationY = 441.213f, rotation = 44.0f) {
        reuse_12()
      }
      Group(translationX = 781.64374f, translationY = 437.0732f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 136.0f) {
        reuse_13()
      }
      Group(translationX = 782.47455f, translationY = 441.54803f, rotation = 44.0f) {
        reuse_14()
      }
      Group(translationX = 778.8544f, translationY = 442.62195f, rotation = 44.0f) {
        reuse_15()
      }
    }
    Group() {
      Group(translationX = 171.795f, translationY = 190.594f) {
        reuse_43()
      }
      Group(translationX = 165.106f, translationY = 197.571f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 171.75f, translationY = 226.227f) {
        reuse_43()
      }
      Group(translationX = 165.061f, translationY = 233.204f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 351.416f, translationY = 190.225f) {
        reuse_43()
      }
      Group(translationX = 344.727f, translationY = 197.202f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 283.82336f, translationY = 261.81454f, rotation = -45.0f) {
        reuse_43()
      }
      Group(translationX = 284.0928f, translationY = 271.4768f, rotation = -45.0f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 162.55f, translationY = 569.835f) {
        reuse_43()
      }
      Group(translationX = 155.861f, translationY = 576.813f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 251.53882f, translationY = 561.6509f, rotation = 45.0f) {
        reuse_43()
      }
      Group(translationX = 241.87714f, translationY = 561.90674f, rotation = 45.0f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 440.148f, translationY = 651.942f) {
        reuse_43()
      }
      Group(translationX = 433.459f, translationY = 658.919f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 440.148f, translationY = 701.692f) {
        reuse_43()
      }
      Group(translationX = 433.459f, translationY = 708.669f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 498.411f, translationY = 748.337f) {
        reuse_43()
      }
      Group(translationX = 491.722f, translationY = 755.315f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 607.45f, translationY = 198.8927f, rotation = -46.0f) {
        reuse_43()
      }
      Group(translationX = 607.9052f, translationY = 208.54645f, rotation = -46.0f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 702.583f, translationY = 369.956f) {
        reuse_43()
      }
      Group(translationX = 695.894f, translationY = 376.933f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 407.05014f, translationY = 330.85f, rotation = -45.0f) {
        reuse_43()
      }
      Group(translationX = 407.2857f, translationY = 340.51407f, rotation = -45.0f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 891.16f, translationY = 355.667f) {
        reuse_43()
      }
      Group(translationX = 884.47f, translationY = 362.644f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 891.16f, translationY = 392.684f) {
        reuse_43()
      }
      Group(translationX = 884.47f, translationY = 399.661f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 937.89f, translationY = 201.414f) {
        reuse_43()
      }
      Group(translationX = 931.2f, translationY = 208.391f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 1074.22f, translationY = 38.72f) {
        reuse_43()
      }
      Group(translationX = 1067.53f, translationY = 45.698f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 724.8827f, translationY = 674.358f, rotation = -44.0f) {
        reuse_43()
      }
      Group(translationX = 724.9103f, translationY = 684.02435f, rotation = -44.0f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 926.51f, translationY = 702.973f) {
        reuse_43()
      }
      Group(translationX = 919.82f, translationY = 709.951f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 1011.49f, translationY = 715.786f) {
        reuse_43()
      }
      Group(translationX = 1004.8f, translationY = 722.763f) {
        reuse_44()
      }
    }
    Group() {
      Group(translationX = 393.611f, translationY = 583.69f) {
        reuse_45()
      }
      Group(translationX = 397.25f, translationY = 574.39f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 400.862f, translationY = 576.956f) {
        reuse_47()
      }
      Group(translationX = 399.058f, translationY = 580.165f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 415.91f, translationY = 631.79f) {
        reuse_45()
      }
      Group(translationX = 419.548f, translationY = 622.49f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 423.161f, translationY = 625.055f) {
        reuse_47()
      }
      Group(translationX = 421.356f, translationY = 628.264f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 155.14581f, translationY = 612.10144f, rotation = 45.0f) {
        reuse_45()
      }
      Group(translationX = 164.27377f, translationY = 608.0581f, rotation = 135.0f) {
        reuse_46()
      }
      Group(translationX = 165.03607f, translationY = 612.4252f, rotation = 45.0f) {
        reuse_47()
      }
      Group(translationX = 161.495f, translationY = 613.433f, scaleX = 0.9999988f, scaleY = 0.9999988f, rotation = 45.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 227.09882f, translationY = 551.44775f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 45.0f) {
        reuse_45()
      }
      Group(translationX = 236.23386f, translationY = 547.4143f, rotation = 135.0f) {
        reuse_46()
      }
      Group(translationX = 236.98926f, translationY = 551.7803f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 45.0f) {
        reuse_47()
      }
      Group(translationX = 233.44733f, translationY = 552.78467f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 45.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 255.08493f, translationY = 523.36707f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 45.0f) {
        reuse_45()
      }
      Group(translationX = 264.20953f, translationY = 519.3126f, rotation = 135.0f) {
        reuse_46()
      }
      Group(translationX = 264.9756f, translationY = 523.6772f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 45.0f) {
        reuse_47()
      }
      Group(translationX = 261.43585f, translationY = 524.68994f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 45.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 276.83832f, translationY = 462.83163f, rotation = -46.0f) {
        reuse_45()
      }
      Group(translationX = 272.7378f, translationY = 453.72516f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = -134.0f) {
        reuse_46()
      }
      Group(translationX = 277.0985f, translationY = 452.93848f, rotation = -46.0f) {
        reuse_47()
      }
      Group(translationX = 278.12866f, translationY = 456.4727f, rotation = -46.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 384.3699f, translationY = 498.29166f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 46.0f) {
        reuse_45()
      }
      Group(translationX = 393.59933f, translationY = 494.46036f, scaleX = 1.00001f, scaleY = 1.00001f, rotation = 134.0f) {
        reuse_46()
      }
      Group(translationX = 394.2505f, translationY = 498.83948f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 46.0f) {
        reuse_47()
      }
      Group(translationX = 390.6882f, translationY = 499.76694f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 46.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 490.099f, translationY = 559.684f) {
        reuse_45()
      }
      Group(translationX = 493.736f, translationY = 550.384f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 497.349f, translationY = 552.949f) {
        reuse_47()
      }
      Group(translationX = 495.545f, translationY = 556.159f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 523.766f, translationY = 573.803f) {
        reuse_45()
      }
      Group(translationX = 527.404f, translationY = 564.504f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 531.016f, translationY = 567.068f) {
        reuse_47()
      }
      Group(translationX = 529.212f, translationY = 570.278f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 538.187f, translationY = 593.7667f, rotation = -45.0f) {
        reuse_45()
      }
      Group(translationX = 534.2112f, translationY = 584.60754f, rotation = -135.0f) {
        reuse_46()
      }
      Group(translationX = 538.58246f, translationY = 583.8796f, rotation = -45.0f) {
        reuse_47()
      }
      Group(translationX = 539.5654f, translationY = 587.42737f, rotation = -45.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 625.433f, translationY = 509.96f) {
        reuse_45()
      }
      Group(translationX = 629.072f, translationY = 500.66f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 632.684f, translationY = 503.224f) {
        reuse_47()
      }
      Group(translationX = 630.88f, translationY = 506.434f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 676.25903f, translationY = 587.3269f, rotation = 46.0f) {
        reuse_45()
      }
      Group(translationX = 685.47437f, translationY = 583.4785f, scaleX = 0.99999f, scaleY = 0.99999f, rotation = 134.0f) {
        reuse_46()
      }
      Group(translationX = 686.1411f, translationY = 587.858f, rotation = 46.0f) {
        reuse_47()
      }
      Group(translationX = 682.57874f, translationY = 588.7917f, rotation = 46.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 746.223f, translationY = 430.641f) {
        reuse_45()
      }
      Group(translationX = 749.86f, translationY = 421.34f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 753.473f, translationY = 423.906f) {
        reuse_47()
      }
      Group(translationX = 751.669f, translationY = 427.116f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 774.448f, translationY = 484.292f) {
        reuse_45()
      }
      Group(translationX = 778.088f, translationY = 474.992f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 781.698f, translationY = 477.557f) {
        reuse_47()
      }
      Group(translationX = 779.898f, translationY = 480.766f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 782.17664f, translationY = 450.5849f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 46.0f) {
        reuse_45()
      }
      Group(translationX = 791.46875f, translationY = 446.83597f, scaleX = 1.00006f, scaleY = 1.00006f, rotation = 134.0f) {
        reuse_46()
      }
      Group(translationX = 792.056f, translationY = 451.185f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 46.0f) {
        reuse_47()
      }
      Group(translationX = 788.4866f, translationY = 452.094f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 46.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 842.8749f, translationY = 446.90808f, rotation = 45.0f) {
        reuse_45()
      }
      Group(translationX = 852.01416f, translationY = 442.88675f, scaleX = 0.99999f, scaleY = 0.99999f, rotation = 135.0f) {
        reuse_46()
      }
      Group(translationX = 852.765f, translationY = 447.25433f, rotation = 45.0f) {
        reuse_47()
      }
      Group(translationX = 849.2251f, translationY = 448.255f, rotation = 45.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 888.56946f, translationY = 451.42804f, rotation = 43.0f) {
        reuse_45()
      }
      Group(translationX = 897.578f, translationY = 447.16602f, rotation = 137.0f) {
        reuse_46()
      }
      Group(translationX = 898.46924f, translationY = 451.50745f, rotation = 43.0f) {
        reuse_47()
      }
      Group(translationX = 894.9495f, translationY = 452.602f, rotation = 43.0f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 866.86f, translationY = 402.679f) {
        reuse_45()
      }
      Group(translationX = 870.5f, translationY = 393.38f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 874.11f, translationY = 395.944f) {
        reuse_47()
      }
      Group(translationX = 872.31f, translationY = 399.153f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 779.66f, translationY = 339.005f) {
        reuse_45()
      }
      Group(translationX = 783.3f, translationY = 329.704f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 786.91f, translationY = 332.27f) {
        reuse_47()
      }
      Group(translationX = 785.11f, translationY = 335.48f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 818.545f, translationY = 284.719f) {
        reuse_45()
      }
      Group(translationX = 822.184f, translationY = 275.42f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 825.795f, translationY = 277.984f) {
        reuse_47()
      }
      Group(translationX = 823.995f, translationY = 281.193f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 855.011f, translationY = 260.871f) {
        reuse_45()
      }
      Group(translationX = 858.652f, translationY = 251.572f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 862.261f, translationY = 254.136f) {
        reuse_47()
      }
      Group(translationX = 860.461f, translationY = 257.345f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 829.91f, translationY = 196.931f) {
        reuse_45()
      }
      Group(translationX = 833.54f, translationY = 187.632f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 837.16f, translationY = 190.196f) {
        reuse_47()
      }
      Group(translationX = 835.35f, translationY = 193.405f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 591.506f, translationY = 365.736f) {
        reuse_45()
      }
      Group(translationX = 595.144f, translationY = 356.436f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 598.756f, translationY = 359.002f) {
        reuse_47()
      }
      Group(translationX = 596.952f, translationY = 362.211f) {
        reuse_48()
      }
    }
    Group() {
      Group(translationX = 624.3f, translationY = 403.748f) {
        reuse_45()
      }
      Group(translationX = 627.936f, translationY = 394.448f, rotation = 180.0f) {
        reuse_46()
      }
      Group(translationX = 631.55f, translationY = 397.013f) {
        reuse_47()
      }
      Group(translationX = 629.746f, translationY = 400.222f) {
        reuse_48()
      }
    }
    Group(translationX = 165.24f, translationY = 584.394f) {
      reuse_49()
    }
    Group(translationX = 196.66272f, translationY = 559.7058f, rotation = -42.0f) {
      reuse_49()
    }
    Group(translationX = 227.9505f, translationY = 528.4949f, rotation = -42.0f) {
      reuse_49()
    }
    Group(translationX = 256.0053f, translationY = 500.24142f, scaleX = 0.99995f, scaleY = 0.99995f, rotation = -42.0f) {
      reuse_49()
    }
    Group(translationX = 296.567f, translationY = 470.749f) {
      reuse_49()
    }
    Group(translationX = 343.726f, translationY = 470.749f) {
      reuse_49()
    }
    Group(translationX = 394.414f, translationY = 470.749f) {
      reuse_49()
    }
    Group(translationX = 440.146f, translationY = 470.749f) {
      reuse_49()
    }
    Group(translationX = 531.98f, translationY = 541.72f) {
      reuse_49()
    }
    Group(translationX = 566.315f, translationY = 541.72f) {
      reuse_49()
    }
    Group(translationX = 673.90674f, translationY = 509.64838f, rotation = -47.0f) {
      reuse_49()
    }
    Group(translationX = 717.906f, translationY = 433.893f, rotation = -90.0f) {
      reuse_49()
    }
    Group(translationX = 717.906f, translationY = 356.723f, rotation = -90.0f) {
      reuse_49()
    }
    Group(translationX = 730.16223f, translationY = 321.70386f, rotation = -49.0f) {
      reuse_49()
    }
    Group(translationX = 755.4115f, translationY = 296.78717f, rotation = -49.0f) {
      reuse_49()
    }
    Group(translationX = 779.2665f, translationY = 272.4355f, rotation = -48.0f) {
      reuse_49()
    }
    Group(translationX = 802.5169f, translationY = 249.41028f, rotation = -48.0f) {
      reuse_49()
    }
    Group(translationX = 825.64f, translationY = 215.517f, rotation = 90.0f) {
      reuse_49()
    }
    Group(translationX = 825.64f, translationY = 173.0f, rotation = 90.0f) {
      reuse_49()
    }
    Group(translationX = 825.64f, translationY = 133.484f, rotation = 90.0f) {
      reuse_49()
    }
    Group(translationX = 185.547f, translationY = 148.55f, rotation = 90.0f) {
      reuse_49()
    }
    Group(translationX = 185.547f, translationY = 183.666f, rotation = 90.0f) {
      reuse_49()
    }
    Group(translationX = 185.547f, translationY = 218.667f, rotation = 90.0f) {
      reuse_49()
    }
    Group(translationX = 185.547f, translationY = 253.712f, rotation = 90.0f) {
      reuse_49()
    }
    Group(translationX = 197.33786f, translationY = 291.01865f, rotation = 43.0f) {
      reuse_49()
    }
    Group(translationX = 228.48608f, translationY = 321.84558f, rotation = 43.0f) {
      reuse_49()
    }
    Group(translationX = 259.6985f, translationY = 353.3145f, rotation = 43.0f) {
      reuse_49()
    }
    Group(translationX = 319.12457f, translationY = 412.72394f, rotation = 43.0f) {
      reuse_49()
    }
    Group(translationX = 350.4555f, translationY = 444.12424f, rotation = 43.0f) {
      reuse_49()
    }
    Group(translationX = 843.01f, translationY = 714.842f) {
      reuse_50()
    }
    Group(translationX = 792.22f, translationY = 714.842f) {
      reuse_50()
    }
    Group(translationX = 741.099f, translationY = 714.842f) {
      reuse_50()
    }
    Group(translationX = 672.033f, translationY = 661.28f, scaleX = 0.9999536f, scaleY = 0.9999536f, rotation = 41.0f) {
      reuse_50()
    }
    Group(translationX = 643.9059f, translationY = 633.16614f, rotation = 41.0f) {
      reuse_50()
    }
    Group(translationX = 610.439f, translationY = 500.528f, rotation = 90.0f) {
      reuse_50()
    }
    Group(translationX = 620.9247f, translationY = 459.00183f, rotation = -43.0f) {
      reuse_50()
    }
    Group(translationX = 630.6221f, translationY = 324.26947f, rotation = 46.0f) {
      reuse_50()
    }
    Group(translationX = 559.7701f, translationY = 253.39825f, rotation = 46.0f) {
      reuse_50()
    }
    Group(translationX = 527.0308f, translationY = 221.29059f, rotation = 46.0f) {
      reuse_50()
    }
    Group(translationX = 495.97858f, translationY = 189.61273f, rotation = 46.0f) {
      reuse_50()
    }
    Group(translationX = 371.14966f, translationY = 742.8683f, rotation = -48.0f) {
      reuse_51()
    }
    Group(translationX = 411.681f, translationY = 706.316f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 411.602f, translationY = 626.768f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 419.3493f, translationY = 581.9085f, scaleX = 0.99999994f, scaleY = 0.99999994f, rotation = 135.0f) {
      reuse_51()
    }
    Group(translationX = 512.72363f, translationY = 472.7299f, rotation = -48.0f) {
      reuse_51()
    }
    Group(translationX = 540.79114f, translationY = 444.42728f, rotation = -48.0f) {
      reuse_51()
    }
    Group(translationX = 604.213f, translationY = 382.81f) {
      reuse_51()
    }
    Group(translationX = 683.696f, translationY = 382.81f) {
      reuse_51()
    }
    Group(translationX = 765.3523f, translationY = 403.87122f, rotation = 47.0f) {
      reuse_51()
    }
    Group(translationX = 831.28f, translationY = 411.294f) {
      reuse_51()
    }
    Group(translationX = 870.84f, translationY = 411.349f) {
      reuse_51()
    }
    Group(translationX = 905.03f, translationY = 388.483f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 905.03f, translationY = 259.555f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 905.03f, translationY = 299.482f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 927.65f, translationY = 314.862f) {
      reuse_51()
    }
    Group(translationX = 965.93f, translationY = 314.862f) {
      reuse_51()
    }
    Group(translationX = 1028.9714f, translationY = 280.77014f, rotation = -46.0f) {
      reuse_51()
    }
    Group(translationX = 1001.76154f, translationY = 308.4121f, rotation = -46.0f) {
      reuse_51()
    }
    Group(translationX = 1055.91f, translationY = 251.65f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 1055.91f, translationY = 213.317f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 1055.91f, translationY = 174.649f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 1055.91f, translationY = 136.063f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 1055.91f, translationY = 97.442f, rotation = 90.0f) {
      reuse_51()
    }
    Group(translationX = 566.297f, translationY = 329.047f, rotation = 90.0f) {
      reuse_29()
    }
    Group(translationX = 608.0973f, translationY = 260.8871f, rotation = -49.0f) {
      reuse_29()
    }
    Group(translationX = 633.71387f, translationY = 235.32904f, rotation = -49.0f) {
      reuse_29()
    }
    Group(translationX = 656.3279f, translationY = 212.52142f, rotation = -49.0f) {
      reuse_29()
    }
    Group(translationX = 675.336f, translationY = 173.243f, rotation = 90.0f) {
      reuse_29()
    }
    Group(translationX = 675.336f, translationY = 132.422f, rotation = 90.0f) {
      reuse_29()
    }
    Group(translationX = 444.592f, translationY = 167.24f) {
      reuse_0()
    }
    Group(translationX = 442.542f, translationY = 172.254f) {
      reuse_1()
    }
    Group(translationX = 804.3f, translationY = 73.62f) {
      reuse_0()
    }
    Group(translationX = 802.25f, translationY = 78.634f) {
      reuse_1()
    }
    Group(translationX = 757.887f, translationY = 206.844f) {
      reuse_0()
    }
    Group(translationX = 755.837f, translationY = 211.858f) {
      reuse_1()
    }
    Group(translationX = 461.02283f, translationY = 343.40714f, rotation = -45.0f) {
      reuse_0()
    }
    Group(translationX = 463.13843f, translationY = 348.39407f, rotation = -45.0f) {
      reuse_1()
    }
    Group(translationX = 440.435f, translationY = 622.027f) {
      reuse_0()
    }
    Group(translationX = 438.385f, translationY = 627.042f) {
      reuse_1()
    }
    Group(translationX = 940.63f, translationY = 688.795f) {
      reuse_0()
    }
    Group(translationX = 938.58f, translationY = 693.809f) {
      reuse_1()
    }
    Group(translationX = 562.575f, translationY = 514.537f) {
      reuse_0()
    }
    Group(translationX = 560.525f, translationY = 519.552f) {
      reuse_1()
    }
    Group(translationX = 806.56573f, translationY = 461.42047f, rotation = 46.0f) {
      reuse_0()
    }
    Group(translationX = 801.55585f, translationY = 463.46796f, rotation = 46.0f) {
      reuse_1()
    }
    Group(translationX = 587.795f, translationY = 370.051f) {
      reuse_0()
    }
    Group(translationX = 585.745f, translationY = 375.065f) {
      reuse_1()
    }
    Group(translationX = 676.968f, translationY = 355.974f) {
      reuse_0()
    }
    Group(translationX = 674.918f, translationY = 360.988f) {
      reuse_1()
    }

  }
  Image(
    painter = vectorPainterFace,
    contentDescription = "",
    contentScale = ContentScale.Crop
  )
  Text(
    text = "1",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.02966f, 1.0f)
      .padding(start = 185.61157.dp, top = 90.127.dp)
  )
  Text(
    text = "1",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.02966f, 1.0f)
      .padding(start = 127.76744.dp, top = 568.78796.dp)
  )
  Text(
    text = "1",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.00837f, 1.0f)
      .padding(start = 817.7771.dp, top = 72.658.dp)
  )
  Text(
    text = "3",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.99396f, 1.0f)
      .padding(start = 436.96313.dp, top = 71.313.dp)
  )
  Text(
    text = "3",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.99396f, 1.0f)
      .padding(start = 976.7409.dp, top = 714.80396.dp)
  )
  Text(
    text = "4",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.04483f, 1.0f)
      .padding(start = 976.4716.dp, top = 541.845.dp)
  )
  Text(
    text = "S5",
    color = Color(-16777216),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 169.43542.dp, top = 24.609999.dp)
  )
  Text(
    text = "S11",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 167.91437.dp, top = 52.829998.dp)
  )
  Text(
    text = "S6",
    color = Color(-16777216),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 169.42067.dp, top = 38.695004.dp)
  )
  Text(
    text = "S7",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 606.94745.dp, top = 357.104.dp)
  )
  Text(
    text = "S8",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 621.4487.dp, top = 357.107.dp)
  )
  Text(
    text = "RHO Fieramilano",
    color = Color(-16777216),
    fontSize = 10.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 175.41399.dp, top = 75.354004.dp)
  )
  Text(
    text = "Rho",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 181.17299.dp, top = 52.055.dp)
  )
  Text(
    text = "Novara",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 181.17299.dp, top = 37.388.dp)
  )
  Text(
    text = "Varese",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 181.17299.dp, top = 23.251.dp)
  )
  Text(
    text = "S3",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 323.594.dp, top = 24.919.dp)
  )
  Text(
    text = "S1",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 309.28256.dp, top = 24.641.dp)
  )
  Text(
    text = "Saronno",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 335.48297.dp, top = 23.251999.dp)
  )
  Text(
    text = "S3",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9615f, 1.0f)
      .padding(start = 524.49133.dp, top = 515.681.dp)
  )
  Text(
    text = "S1",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9534f, 1.0f)
      .padding(start = 935.8977.dp, top = 794.795.dp)
  )
  Text(
    text = "S4",
    color = Color(-16777216),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 539.2323.dp, top = 38.888.dp)
  )
  Text(
    text = "S2",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 539.22906.dp, top = 24.761002.dp)
  )
  Text(
    text = "Camnago Lentate",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 551.161.dp, top = 37.842003.dp)
  )
  Text(
    text = "Mariano Comense",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 551.161.dp, top = 23.618.dp)
  )
  Text(
    text = "S4",
    color = Color(-16777216),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9615f, 1.0f)
      .padding(start = 539.3253.dp, top = 515.679.dp)
  )
  Text(
    text = "S2",
    color = Color(-1),
    fontSize = 5.3.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 917.8143.dp, top = 690.06805.dp)
  )
  Text(
    text = "S9",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 883.1947.dp, top = 53.246002.dp)
  )
  Text(
    text = "S8",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 883.185.dp, top = 39.083.dp)
  )
  Text(
    text = "S7",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 883.1625.dp, top = 24.747997.dp)
  )
  Text(
    text = "S11",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96152f, 1.0f)
      .padding(start = 881.1915.dp, top = 67.154.dp)
  )
  Text(
    text = "Chiasso",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 894.45996.dp, top = 66.245.dp)
  )
  Text(
    text = "Saronno",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 894.45996.dp, top = 51.575005.dp)
  )
  Text(
    text = "Carnate - Lecco",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 894.45996.dp, top = 37.523003.dp)
  )
  Text(
    text = "Molteno - Lecco",
    color = Color(-16777216),
    fontSize = 7.6.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 894.45996.dp, top = 23.618.dp)
  )
  Text(
    text = "S9",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.95302f, 1.0f)
      .padding(start = 118.252304.dp, top = 794.77997.dp)
  )
  Text(
    text = "2",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 1053.88.dp, top = 37.744.dp)
  )
  Text(
    text = "GESSATE",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 1042.78.dp, top = 24.324001.dp)
  )
  Text(
    text = "2",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 902.392.dp, top = 200.46599.dp)
  )
  Text(
    text = "COLOGNO NORD",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 891.81995.dp, top = 186.132.dp)
  )
  Text(
    text = "Metro automatica",
    color = Color(-16777216),
    fontSize = 6.8.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98423f, 1.0f)
      .padding(start = 917.5542.dp, top = 391.79.dp)
  )
  Text(
    text = "per S.Raffaele",
    color = Color(-16777216),
    fontSize = 6.8.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98423f, 1.0f)
      .padding(start = 917.7836.dp, top = 398.535.dp)
  )
  Text(
    text = "Treviglio",
    color = Color(-16777216),
    fontSize = 8.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98424f, 1.0f)
      .padding(start = 1068.4854.dp, top = 468.64.dp)
  )
  Text(
    text = "2",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 303.175.dp, top = 765.805.dp)
  )
  Text(
    text = "2",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 463.51904.dp, top = 747.28094.dp)
  )
  Text(
    text = "H",
    color = Color(-1),
    fontSize = 9.615.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.92336f, 1.0f)
      .padding(start = 919.3656.dp, top = 377.329.dp)
  )
  Text(
    text = "5",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.02657f, 1.0f)
      .padding(start = 674.743.dp, top = 71.257.dp)
  )
  Text(
    text = "5",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.02657f, 1.0f)
      .padding(start = 170.2733.dp, top = 482.22.dp)
  )
  Text(
    text = "S13",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96142f, 1.0f)
      .padding(start = 860.6745.dp, top = 794.819.dp)
  )
  Text(
    text = "4",
    color = Color(-1),
    fontSize = 8.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.99808f, 1.0f)
      .padding(start = 164.514.dp, top = 724.693.dp)
  )
  Text(
    text = "S13",
    color = Color(-1),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96592f, 1.0f)
      .padding(start = 390.1739.dp, top = 228.31.dp)
  )
  Text(
    text = "PERO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 153.31322.dp, top = 143.916.dp)
  )
  Text(
    text = "MOLINO DORINO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 114.845.dp, top = 178.528.dp)
  )
  Text(
    text = "S. LEONARDO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 125.163574.dp, top = 213.678.dp)
  )
  Text(
    text = "BONOLA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 142.46826.dp, top = 248.312.dp)
  )
  Text(
    text = "SAN SIRO Stadio",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96859f, 1.0f)
      .padding(start = 103.2511.dp, top = 455.833.dp)
  )
  Text(
    text = "BISCEGLIE",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96859f, 1.0f)
      .padding(start = 116.78792.dp, top = 555.363.dp)
  )
  Text(
    text = "Mi3",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.92305f, 1.0f)
      .padding(start = 80.22768.dp, top = 690.799.dp)
  )
  Text(
    text = "Mi1",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.92305f, 1.0f)
      .padding(start = 927.5466.dp, top = 583.672.dp)
  )
  Text(
    text = "Mi3",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 1028.1699.dp, top = 391.22.dp)
  )
  Text(
    text = "Mi4",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 1102.28.dp, top = 391.22.dp)
  )
  Text(
    text = "Mi5",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 1102.28.dp, top = 184.748.dp)
  )
  Text(
    text = "Mi6",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 1101.83.dp, top = 67.96.dp)
  )
  Text(
    text = "Mi3",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 953.48.dp, top = 116.46.dp)
  )
  Text(
    text = "Mi1",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 620.846.dp, top = 98.526.dp)
  )
  Text(
    text = "Albairate",
    color = Color(-16777216),
    fontSize = 7.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96859f, 1.0f)
      .padding(start = 129.76628.dp, top = 793.601.dp)
  )
  Text(
    text = "SAN CRISTOFORO",
    color = Color(-16777216),
    fontSize = 10.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.97541f, 1.0f)
      .padding(start = 153.93147.dp, top = 711.346.dp)
  )
  Text(
    text = "ASSAGO",
    color = Color(-16777216),
    fontSize = 10.201.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98235f, 1.0f)
      .padding(start = 270.3104.dp, top = 742.468.dp)
  )
  Text(
    text = "MIlanoﬁori Forum",
    color = Color(-16777216),
    fontSize = 10.201.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.95983f, 1.0f)
      .padding(start = 230.68658.dp, top = 752.669.dp)
  )
  Text(
    text = "P.ZA ABBIATEGRASSO",
    color = Color(-16777216),
    fontSize = 10.201.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.97537f, 1.0f)
      .padding(start = 452.1106.dp, top = 724.003.dp)
  )
  Text(
    text = "Chiesa Rossa",
    color = Color(-16777216),
    fontSize = 10.689.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.95597f, 1.0f)
      .padding(start = 452.16602.dp, top = 733.751.dp)
  )
  Text(
    text = "Pavia",
    color = Color(-16777216),
    fontSize = 7.679.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.95598f, 1.0f)
      .padding(start = 873.46716.dp, top = 793.422.dp)
  )
  Text(
    text = "Lodi",
    color = Color(-16777216),
    fontSize = 7.679.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.95598f, 1.0f)
      .padding(start = 947.7178.dp, top = 793.422.dp)
  )
  Text(
    text = "S. DONATO",
    color = Color(-16777216),
    fontSize = 10.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98806f, 1.0f)
      .padding(start = 966.24994.dp, top = 701.63.dp)
  )
  Text(
    text = "Limite tariffa",
    color = Color(-16777216),
    fontSize = 8.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98806f, 1.0f)
      .padding(start = 901.8072.dp, top = 601.746.dp)
  )
  Text(
    text = "abbonamenti",
    color = Color(-16777216),
    fontSize = 8.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98806f, 1.0f)
      .padding(start = 901.2467.dp, top = 609.746.dp)
  )
  Text(
    text = "urbani",
    color = Color(-16777216),
    fontSize = 8.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98806f, 1.0f)
      .padding(start = 925.3066.dp, top = 617.746.dp)
  )
  Text(
    text = "LINATE",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98806f, 1.0f)
      .padding(start = 965.8131.dp, top = 518.408.dp)
  )
  Text(
    text = "AEROPORTO",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98806f, 1.0f)
      .padding(start = 965.8131.dp, top = 528.845.dp)
  )
  Text(
    text = "DAZN",
    color = Color(-16777216),
    fontSize = 10.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.96859f, 1.0f)
      .padding(start = 140.00175.dp, top = 467.663.dp)
  )
  Text(
    text = "DA",
    color = Color(-16777216),
    fontSize = 4.283.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9686f, 1.0f)
      .padding(start = 168.87492.dp, top = 469.86902.dp)
  )
  Text(
    text = "ZN",
    color = Color(-16777216),
    fontSize = 4.283.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9686f, 1.0f)
      .padding(start = 168.87587.dp, top = 473.681.dp)
  )
  Text(
    text = "Urban passes",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9378f, 1.0f)
      .padding(start = 80.07585.dp, top = 328.49503.dp)
  )
  Text(
    text = "fare limit",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9378f, 1.0f)
      .padding(start = 80.07585.dp, top = 336.38602.dp)
  )
  Text(
    text = "Limite tariffa",
    color = Color(-16777216),
    fontSize = 7.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9959f, 1.0f)
      .padding(start = 80.30821.dp, top = 299.78802.dp)
  )
  Text(
    text = "abbonamenti",
    color = Color(-16777216),
    fontSize = 7.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9959f, 1.0f)
      .padding(start = 80.30821.dp, top = 307.41602.dp)
  )
  Text(
    text = "urbani",
    color = Color(-16777216),
    fontSize = 7.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.00726f, 1.0f)
      .padding(start = 80.54048.dp, top = 315.463.dp)
  )
  Text(
    text = "Mi1",
    color = Color(-16777216),
    fontSize = 13.628.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.92305f, 1.0f)
      .padding(start = 80.07391.dp, top = 281.64502.dp)
  )
  Text(
    text = "URUGUAY",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9746425f, 0.9750808f)
      .padding(start = 200.67325.dp, top = 283.14215.dp)
      .rotate(46.0f)
  )
  Text(
    text = "LAMPUGNANO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9746425f, 0.9750808f)
      .padding(start = 232.07794.dp, top = 315.05585.dp)
      .rotate(46.0f)
  )
  Text(
    text = "LOTTO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.95788705f, 0.95859635f)
      .padding(start = 286.10242.dp, top = 368.59573.dp)
      .rotate(47.0f)
  )
  Text(
    text = "QT8",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93956685f, 0.94059783f)
      .padding(start = 263.38077.dp, top = 345.46997.dp)
      .rotate(49.0f)
  )
  Text(
    text = "PORTELLO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.958958f, 0.9575383f)
      .padding(start = 327.36066.dp, top = 372.5671.dp)
      .rotate(48.0f)
  )
  Text(
    text = "SAN SIRO Ippodromo",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96219f, 0.96245384f)
      .padding(start = 203.17734.dp, top = 419.4923.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "PRIMATICCIO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 203.16724.dp, top = 563.72394.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "INGANNI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 163.18231.dp, top = 593.03485.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "SEGNERI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 197.84297.dp, top = 671.49854.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "GELSOMINI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9728589f, 0.9730414f)
      .padding(start = 228.71594.dp, top = 640.3913.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "FRATTINI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.97962886f, 0.97977936f)
      .padding(start = 259.40253.dp, top = 609.1874.dp)
      .rotate(-46.0f)
  )
  Text(
    text = "TOLSTOJ",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.98331845f, 0.9834484f)
      .padding(start = 291.08795.dp, top = 578.40967.dp)
      .rotate(-46.0f)
  )
  Text(
    text = "BOLIVAR",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.98331845f, 0.9834484f)
      .padding(start = 320.42963.dp, top = 550.41113.dp)
      .rotate(-46.0f)
  )
  Text(
    text = "BANDE NERE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 235.15196.dp, top = 532.37146.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "GAMBARA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 263.34894.dp, top = 504.53528.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "DE ANGELI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 294.2572.dp, top = 479.67957.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "WAGNER",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 340.99036.dp, top = 479.6839.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "PAGANO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96915066f, 0.96938133f)
      .padding(start = 392.61566.dp, top = 479.68243.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "AMENDOLA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9638554f, 0.9626064f)
      .padding(start = 283.7809.dp, top = 444.5738.dp)
      .rotate(48.0f)
  )
  Text(
    text = "CALIFORNIA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9567942f, 0.9552942f)
      .padding(start = 366.41058.dp, top = 532.9625.dp)
      .rotate(48.0f)
  )
  Text(
    text = "VETRA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9567942f, 0.9552942f)
      .padding(start = 491.14087.dp, top = 615.32526.dp)
      .rotate(48.0f)
  )
  Text(
    text = "DE AMICIS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9567942f, 0.9552942f)
      .padding(start = 454.22003.dp, top = 596.32587.dp)
      .rotate(48.0f)
  )
  Text(
    text = "SANTA SOFIA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96107423f, 0.95972705f)
      .padding(start = 534.7944.dp, top = 647.226.dp)
      .rotate(48.0f)
  )
  Text(
    text = "CROCETTA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96107423f, 0.95972705f)
      .padding(start = 611.0764.dp, top = 662.61053.dp)
      .rotate(48.0f)
  )
  Text(
    text = "P.TA ROMANA",
    color = Color(-16777216),
    fontSize = 7.89.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.97210336f, 0.9604944f)
      .padding(start = 631.8319.dp, top = 697.7286.dp)
      .rotate(47.0f)
  )
  Text(
    text = "LODITIBB",
    color = Color(-16777216),
    fontSize = 7.89.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.97210336f, 0.9604944f)
      .padding(start = 704.179.dp, top = 681.8995.dp)
      .rotate(47.0f)
  )
  Text(
    text = "BRENTA",
    color = Color(-16777216),
    fontSize = 7.89.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.97210336f, 0.9604944f)
      .padding(start = 736.1285.dp, top = 697.3996.dp)
      .rotate(47.0f)
  )
  Text(
    text = "CORVETTO",
    color = Color(-16777216),
    fontSize = 7.89.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.97210336f, 0.9604944f)
      .padding(start = 787.4013.dp, top = 697.39685.dp)
      .rotate(47.0f)
  )
  Text(
    text = "PORTO DI MARE",
    color = Color(-16777216),
    fontSize = 7.89.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.97210336f, 0.9604944f)
      .padding(start = 836.3739.dp, top = 698.6002.dp)
      .rotate(47.0f)
  )
  Text(
    text = "CONI ZUGNA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96631f, 0.9576756f)
      .padding(start = 406.7588.dp, top = 532.36676.dp)
      .rotate(48.0f)
  )
  Text(
    text = "CORDUSIO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96631f, 0.9576756f)
      .padding(start = 545.11224.dp, top = 575.42505.dp)
      .rotate(48.0f)
  )
  Text(
    text = "BUONARROTI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9700367f, 0.9626556f)
      .padding(start = 353.818.dp, top = 436.8553.dp)
      .rotate(47.0f)
  )
  Text(
    text = "CONCILIAZIONE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9590436f, 0.96627855f)
      .padding(start = 400.86603.dp, top = 423.3105.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "TRICOLORE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.95367575f, 0.9610072f)
      .padding(start = 683.8695.dp, top = 546.51337.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "CIMIANO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.952945f, 0.9518616f)
      .padding(start = 866.67456.dp, top = 418.9755.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "VIMODRONE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9444632f, 0.95151067f)
      .padding(start = 923.51794.dp, top = 325.60654.dp)
      .rotate(-48.0f)
  )
  Text(
    text = "C.NA BURRONA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9444632f, 0.95151067f)
      .padding(start = 961.9369.dp, top = 325.6087.dp)
      .rotate(-48.0f)
  )
  Text(
    text = "UDINE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.952945f, 0.9518616f)
      .padding(start = 827.2613.dp, top = 419.9776.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "SAN BABILA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9586965f, 0.96593374f)
      .padding(start = 646.7569.dp, top = 546.1256.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "SFORZA POLICLINICO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9536893f, 0.9610273f)
      .padding(start = 631.987.dp, top = 574.15576.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "TRE TORRI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.958958f, 0.9575383f)
      .padding(start = 367.3429.dp, top = 372.56635.dp)
      .rotate(48.0f)
  )
  Text(
    text = "SUSA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.958958f, 0.9575383f)
      .padding(start = 787.4109.dp, top = 509.5312.dp)
      .rotate(48.0f)
  )
  Text(
    text = "ARGONNE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.958958f, 0.9575383f)
      .padding(start = 820.1886.dp, top = 532.3658.dp)
      .rotate(48.0f)
  )
  Text(
    text = "STAZIONE FORLANINI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9561483f, 0.95062196f)
      .padding(start = 862.63495.dp, top = 533.72125.dp)
      .rotate(48.0f)
  )
  Text(
    text = "REPETTI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9561483f, 0.95062196f)
      .padding(start = 900.78186.dp, top = 532.45374.dp)
      .rotate(48.0f)
  )
  Text(
    text = "DOMODOSSOLA FN",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9560543f, 0.954534f)
      .padding(start = 413.84235.dp, top = 377.31674.dp)
      .rotate(48.0f)
  )
  Text(
    text = "AFFORI CENTRO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.95692325f, 0.9470536f)
      .padding(start = 499.6548.dp, top = 181.43922.dp)
      .rotate(48.0f)
  )
  Text(
    text = "DERGANO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9666599f, 0.96471214f)
      .padding(start = 530.204.dp, top = 213.06403.dp)
      .rotate(48.0f)
  )
  Text(
    text = "MACIACHINI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9727604f, 0.971005f)
      .padding(start = 563.1235.dp, top = 245.79527.dp)
      .rotate(47.0f)
  )
  Text(
    text = "GERUSALEMME",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9531375f, 0.94358f)
      .padding(start = 450.2617.dp, top = 391.82062.dp)
      .rotate(48.0f)
  )
  Text(
    text = "MONUMENTALE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9531375f, 0.94358f)
      .padding(start = 487.45856.dp, top = 446.9032.dp)
      .rotate(48.0f)
  )
  Text(
    text = "CENISIO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9531375f, 0.94358f)
      .padding(start = 486.09814.dp, top = 392.23132.dp)
      .rotate(48.0f)
  )
  Text(
    text = "Bluvacanze",
    color = Color(-16777216),
    fontSize = 9.297.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9918631f, 0.9776453f)
      .padding(start = 292.29932.dp, top = 373.77768.dp)
      .rotate(46.0f)
  )
  Text(
    text = "SEGESTA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92178f, 1.0f)
      .padding(start = 232.89314.dp, top = 394.978.dp)
  )
  Text(
    text = "S. AGOSTINO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9552f, 1.0f)
      .padding(start = 359.38998.dp, top = 562.118.dp)
  )
  Text(
    text = "P.TA GENOVA FS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9552f, 1.0f)
      .padding(start = 414.48358.dp, top = 610.443.dp)
  )
  Text(
    text = "ROMOLO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9552f, 1.0f)
      .padding(start = 414.52057.dp, top = 639.83.dp)
  )
  Text(
    text = "FAMAGOSTA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9552f, 1.0f)
      .padding(start = 413.85858.dp, top = 689.67.dp)
  )
  Text(
    text = "Bollate Nord",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 258.64703.dp, top = 84.578995.dp)
  )
  Text(
    text = "Bruzzano",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 463.9109.dp, top = 95.97.dp)
  )
  Text(
    text = "Parco Nord",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 463.9109.dp, top = 103.861.dp)
  )
  Text(
    text = "Cormano-Cusano",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 539.46375.dp, top = 68.53.dp)
  )
  Text(
    text = "Milanino",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 539.46375.dp, top = 76.441.dp)
  )
  Text(
    text = "Urban passes",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.95595f, 1.0f)
      .padding(start = 567.92114.dp, top = 125.592995.dp)
  )
  Text(
    text = "fare limit",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.95595f, 1.0f)
      .padding(start = 613.05115.dp, top = 125.592995.dp)
  )
  Text(
    text = "AFFORI FN",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96113f, 1.0f)
      .padding(start = 410.5285.dp, top = 155.13998.dp)
  )
  Text(
    text = "Bollate Centro",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 286.7904.dp, top = 120.018.dp)
  )
  Text(
    text = "Novate Milanese",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 310.65002.dp, top = 151.00699.dp)
  )
  Text(
    text = "Quarto Oggiaro",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96995f, 1.0f)
      .padding(start = 353.7367.dp, top = 189.72899.dp)
  )
  Text(
    text = "Villapizzone",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96995f, 1.0f)
      .padding(start = 325.9215.dp, top = 269.127.dp)
  )
  Text(
    text = "Lancetti",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.94657f, 1.0f)
      .padding(start = 506.7246.dp, top = 264.509.dp)
  )
  Text(
    text = "ZARA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.94657f, 1.0f)
      .padding(start = 557.9118.dp, top = 284.26.dp)
  )
  Text(
    text = "ISOLA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.94657f, 1.0f)
      .padding(start = 533.36145.dp, top = 323.74002.dp)
  )
  Text(
    text = "GARIBALDI FS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.94657f, 1.0f)
      .padding(start = 576.15405.dp, top = 344.004.dp)
  )
  Text(
    text = "SONDRIO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.94657f, 1.0f)
      .padding(start = 632.91327.dp, top = 319.857.dp)
  )
  Text(
    text = "CENTRALE FS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92992f, 1.0f)
      .padding(start = 651.6855.dp, top = 344.00302.dp)
  )
  Text(
    text = "GIOIA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92992f, 1.0f)
      .padding(start = 601.56494.dp, top = 393.504.dp)
  )
  Text(
    text = "CAIAZZO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92992f, 1.0f)
      .padding(start = 670.4036.dp, top = 393.504.dp)
  )
  Text(
    text = "LORETO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92992f, 1.0f)
      .padding(start = 729.0937.dp, top = 373.618.dp)
  )
  Text(
    text = "PIOLA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92992f, 1.0f)
      .padding(start = 735.59186.dp, top = 409.17502.dp)
  )
  Text(
    text = "P.TA VENEZIA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92992f, 1.0f)
      .padding(start = 725.095.dp, top = 474.11102.dp)
  )
  Text(
    text = "TURATI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92992f, 1.0f)
      .padding(start = 631.9898.dp, top = 464.397.dp)
  )
  Text(
    text = "PALESTRO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 638.41876.dp, top = 500.1.dp)
  )
  Text(
    text = "DATEO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 735.06836.dp, top = 519.887.dp)
  )
  Text(
    text = "P.Vittoria",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 753.49835.dp, top = 557.978.dp)
  )
  Text(
    text = "P.ta Romana FS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 650.1034.dp, top = 725.16296.dp)
  )
  Text(
    text = "ASSAGO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 342.679.dp, top = 710.075.dp)
  )
  Text(
    text = "Milanoﬁori Nord",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.90465f, 1.0f)
      .padding(start = 319.26077.dp, top = 717.96606.dp)
  )
  Text(
    text = "Corsico",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 79.75929.dp, top = 732.039.dp)
  )
  Text(
    text = "Cesano Boscone",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 118.631836.dp, top = 757.472.dp)
  )
  Text(
    text = "S. Donato Milanese FS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93396f, 1.0f)
      .padding(start = 927.82635.dp, top = 752.085.dp)
  )
  Text(
    text = "ROGOREDO FS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93396f, 1.0f)
      .padding(start = 900.7457.dp, top = 677.00903.dp)
  )
  Text(
    text = "Urban passes",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93396f, 1.0f)
      .padding(start = 903.2819.dp, top = 629.978.dp)
  )
  Text(
    text = "fare limit",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93396f, 1.0f)
      .padding(start = 919.3319.dp, top = 638.209.dp)
  )
  Text(
    text = "DUOMO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91736f, 1.0f)
      .padding(start = 610.07764.dp, top = 516.967.dp)
  )
  Text(
    text = "REPUBBLICA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9147f, 1.0f)
      .padding(start = 649.68494.dp, top = 411.979.dp)
  )
  Text(
    text = "MOSCOVA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92868f, 1.0f)
      .padding(start = 549.9065.dp, top = 450.777.dp)
  )
  Text(
    text = "LANZA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92868f, 1.0f)
      .padding(start = 490.3715.dp, top = 462.479.dp)
  )
  Text(
    text = "MONTENAPOLEONE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93f, 1.0f)
      .padding(start = 529.36096.dp, top = 484.459.dp)
  )
  Text(
    text = "CADORNA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92868f, 1.0f)
      .padding(start = 495.51248.dp, top = 502.678.dp)
  )
  Text(
    text = "FN",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92868f, 1.0f)
      .padding(start = 531.30756.dp, top = 502.678.dp)
  )
  Text(
    text = "S.AMBROGIO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.92868f, 1.0f)
      .padding(start = 458.61908.dp, top = 537.973.dp)
  )
  Text(
    text = "CAIROLI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91238f, 1.0f)
      .padding(start = 508.05017.dp, top = 552.465.dp)
  )
  Text(
    text = "MISSORI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.91238f, 1.0f)
      .padding(start = 568.7667.dp, top = 575.183.dp)
  )
  Text(
    text = "LIMA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9147f, 1.0f)
      .padding(start = 698.69305.dp, top = 428.846.dp)
  )
  Text(
    text = "MARCHE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.94657f, 1.0f)
      .padding(start = 619.29114.dp, top = 267.42102.dp)
  )
  Text(
    text = "ISTRIA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93395f, 1.0f)
      .padding(start = 644.25006.dp, top = 241.745.dp)
  )
  Text(
    text = "CA’ GRANDA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.95286f, 1.0f)
      .padding(start = 668.53424.dp, top = 216.439.dp)
  )
  Text(
    text = "BICOCCA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.98142f, 1.0f)
      .padding(start = 677.6209.dp, top = 168.053.dp)
  )
  Text(
    text = "PONALE",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.98142f, 1.0f)
      .padding(start = 677.6209.dp, top = 126.98.dp)
  )
  Text(
    text = "Greco Pirelli",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96319f, 1.0f)
      .padding(start = 745.7291.dp, top = 187.278.dp)
  )
  Text(
    text = "Bicocca",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96319f, 1.0f)
      .padding(start = 745.7291.dp, top = 195.16899.dp)
  )
  Text(
    text = "SESTO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96319f, 1.0f)
      .padding(start = 828.48395.dp, top = 168.055.dp)
  )
  Text(
    text = "MARELLI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96319f, 1.0f)
      .padding(start = 828.48395.dp, top = 175.946.dp)
  )
  Text(
    text = "SESTO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96319f, 1.0f)
      .padding(start = 828.48395.dp, top = 128.63899.dp)
  )
  Text(
    text = "RONDÒ",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.96319f, 1.0f)
      .padding(start = 828.48395.dp, top = 135.56.dp)
  )
  Text(
    text = "VILLA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 827.7334.dp, top = 210.6437.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "S. GIOVANNI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.98241293f, 0.9999967f)
      .padding(start = 827.6095.dp, top = 218.53517.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "PRECOTTO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 813.4962.dp, top = 250.2389.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "COLOGNO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 907.8898.dp, top = 254.6194.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "CENTRO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 907.8855.dp, top = 261.9662.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "COLOGNO SUD",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 907.88525.dp, top = 294.02554.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "CERNUSCO S.N.",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.94682765f, 0.9999885f)
      .padding(start = 1007.0935.dp, top = 316.9504.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "VILLA FIORITA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.93415946f, 0.9999854f)
      .padding(start = 1034.85.dp, top = 289.1372.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "CASSINA DE’ PECCHI",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9206423f, 1.0000018f)
      .padding(start = 1058.3848.dp, top = 246.35089.dp)
  )
  Text(
    text = "BUSSERO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9206423f, 1.0000018f)
      .padding(start = 1058.711.dp, top = 208.37973.dp)
  )
  Text(
    text = "VILLA POMPEA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9206423f, 1.0000018f)
      .padding(start = 1058.7114.dp, top = 169.71259.dp)
  )
  Text(
    text = "GORGONZOLA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9206423f, 1.0000018f)
      .padding(start = 1059.0913.dp, top = 131.20517.dp)
  )
  Text(
    text = "C.NA ANTONIETTA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9206423f, 1.0000018f)
      .padding(start = 1058.7109.dp, top = 92.466286.dp)
  )
  Text(
    text = "C.NA GOBBA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 847.5394.dp, top = 343.84628.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "CRESCENZAGO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 837.8788.dp, top = 380.98645.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "Automatic train",
    color = Color(-16777216),
    fontSize = 6.999.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.98438305f, 1.0000001f)
      .padding(start = 917.8849.dp, top = 407.04312.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "to S. Raffaele",
    color = Color(-16777216),
    fontSize = 6.999.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.98438305f, 1.0000001f)
      .padding(start = 917.54553.dp, top = 414.19208.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "Segrate",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 988.2469.dp, top = 443.85654.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "GORLA",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 789.765.dp, top = 273.9011.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "TURRO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 763.13184.dp, top = 304.09958.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "ROVERETO",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 738.95593.dp, top = 328.45013.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "PASTEUR",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9632055f, 0.9999922f)
      .padding(start = 731.62836.dp, top = 351.5854.dp)
      .rotate(-1.0f)
  )
  Text(
    text = "Prysmian",
    color = Color(-16777216),
    fontSize = 7.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98143f, 1.0f)
      .padding(start = 677.6241.dp, top = 135.545.dp)
  )
  Text(
    text = "Group",
    color = Color(-16777216),
    fontSize = 5.411.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.98142f, 1.0f)
      .padding(start = 692.2605.dp, top = 141.32901.dp)
  )
  Text(
    text = "Bovisa",
    color = Color(-16777216),
    fontSize = 7.615.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(1.00231f, 1.0f)
      .padding(start = 403.2808.dp, top = 222.34698.dp)
  )
  Text(
    text = "Politecnico",
    color = Color(-16777216),
    fontSize = 7.615.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(1.02392f, 1.0f)
      .padding(start = 403.02826.dp, top = 229.67299.dp)
  )
  Text(
    text = "LAMBRATE FS",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9534126f, 0.9615858f)
      .padding(start = 781.27344.dp, top = 421.7931.dp)
      .rotate(-47.0f)
  )
  Text(
    text = "SESTO",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 794.07996.dp, top = 48.868.dp)
  )
  Text(
    text = "1° MAGGIO",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 775.20996.dp, top = 59.367996.dp)
  )
  Text(
    text = "BIGNAMI",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 663.06696.dp, top = 47.798.dp)
  )
  Text(
    text = "Parco Nord",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.01528f, 1.0f)
      .padding(start = 663.0703.dp, top = 57.998.dp)
  )
  Text(
    text = "Limite tariffa abbonamenti urbani",
    color = Color(-16777216),
    fontSize = 8.0.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.02789f, 1.0f)
      .padding(start = 531.29724.dp, top = 117.082.dp)
  )
  Text(
    text = "COMASINA",
    color = Color(-16777216),
    fontSize = 10.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(1.02789f, 1.0f)
      .padding(start = 426.01187.dp, top = 57.467003.dp)
  )
  Text(
    text = "S5",
    color = Color(-16777216),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9535f, 1.0f)
      .padding(start = 1104.0681.dp, top = 470.104.dp)
  )
  Text(
    text = "S6",
    color = Color(-16777216),
    fontSize = 5.5.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.BOLD)),
    modifier = Modifier
      .scale(0.9535f, 1.0f)
      .padding(start = 1118.3351.dp, top = 470.11502.dp)
  )
  Text(
    text = "I.R.C.C.S.",
    color = Color(-16777216),
    fontSize = 3.5.sp,
    fontFamily = FontFamily(Typeface.create("'Roboto-Black','Roboto'", Typeface.BOLD)),
    modifier = Modifier
      .padding(start = 246.56499.dp, top = 407.372.dp)
  )
  Text(
    text = "GALEAZZI",
    color = Color(-5564663),
    fontSize = 2.924.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(1.0261539f, 1.0f)
      .padding(start = 263.13873.dp, top = 407.948.dp)
      .rotate(13.0f)
  )
  Text(
    text = "SANSIRO",
    color = Color(-5564663),
    fontSize = 4.385.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(1.0261539f, 1.0f)
      .padding(start = 246.55826.dp, top = 412.093.dp)
      .rotate(13.0f)
  )
  Text(
    text = "Certosa",
    color = Color(-16777216),
    fontSize = 7.891.sp,
    fontFamily = FontFamily(Typeface.create("Roboto", Typeface.NORMAL)),
    modifier = Modifier
      .scale(0.9523f, 1.0f)
      .padding(start = 226.31787.dp, top = 187.78499.dp)
  )

}

@Preview(showBackground = true)
@Composable
fun MetroMapPreview() {
  MetroMaps()
}

@Composable
private fun reuse_0() {
  Path(reuse_0_path1, fill = SolidColor(Color(-16754269)))
}

@Composable
private fun reuse_1() {
  Path(reuse_1_path1, fill = SolidColor(Color(-10309073)))
}

@Composable
private fun reuse_2() {
  Path(reuse_2_path1, fill = SolidColor(Color(-16777216)))
}

@Composable
private fun reuse_3() {
  Path(reuse_3_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_4() {
  Path(reuse_4_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_5() {
  Path(reuse_5_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_6() {
  Path(reuse_6_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_7() {
  Path(reuse_7_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_8() {
  Path(reuse_8_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_9() {
  Path(reuse_9_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_10() {
  Path(reuse_10_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_11() {
  Path(reuse_11_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_12() {
  Path(reuse_12_path1, fill = SolidColor(Color(-16736285)))
}

@Composable
private fun reuse_13() {
  Path(reuse_13_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_14() {
  Path(reuse_14_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_15() {
  Path(reuse_15_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_16() {
  Path(reuse_16_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_17() {
  Path(reuse_17_path1, fill = SolidColor(Color(-16777216)))
}

@Composable
private fun reuse_18() {
  Path(reuse_18_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_19() {
  Path(reuse_19_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_20() {
  Path(reuse_20_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_21() {
  Path(reuse_21_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_22() {
  Path(reuse_22_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_23() {
  Path(reuse_23_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_24() {
  Path(reuse_24_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_25() {
  Path(reuse_25_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_26() {
  Path(reuse_26_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_27() {
  Path(reuse_27_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_28() {
  Path(reuse_28_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_29() {
  Path(reuse_29_path1, fill = SolidColor(Color(-5664317)))
}

@Composable
private fun reuse_30() {
  Path(reuse_30_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_31() {
  Path(reuse_31_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_32() {
  Path(reuse_32_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_33() {
  Path(reuse_33_path1, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
}

@Composable
private fun reuse_34() {
  Path(reuse_34_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_35() {
  Path(reuse_35_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_36() {
  Path(reuse_36_path1, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
}

@Composable
private fun reuse_37() {
  Path(reuse_37_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_38() {
  Path(reuse_38_path1, stroke = SolidColor(Color(-16777216)), strokeLineWidth = 2.0f)
}

@Composable
private fun reuse_39() {
  Path(reuse_39_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_40() {
  Path(reuse_40_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_41() {
  Path(reuse_41_path1, fill = SolidColor(Color(-14992022)))
}

@Composable
private fun reuse_42() {
  Path(reuse_42_path1, fill = SolidColor(Color(-14992022)))
}

@Composable
private fun reuse_43() {
  Path(reuse_43_path1, fill = SolidColor(Color(-16777216)))
}

@Composable
private fun reuse_44() {
  Path(reuse_44_path1, fill = SolidColor(Color(-1)))
}

@Composable
private fun reuse_45() {
  Path(reuse_45_path1, fill = SolidColor(Color(-16736285)))
}

@Composable
private fun reuse_46() {
  Path(reuse_46_path1, fill = SolidColor(Color(-16736285)))
}

@Composable
private fun reuse_47() {
  Path(reuse_47_path1, fill = SolidColor(Color(-16736285)))
}

@Composable
private fun reuse_48() {
  Path(reuse_48_path1, fill = SolidColor(Color(-16736285)))
}

@Composable
private fun reuse_49() {
  Path(reuse_49_path1, fill = SolidColor(Color(-2217690)))
}

@Composable
private fun reuse_50() {
  Path(reuse_50_path1, fill = SolidColor(Color(-809443)))
}

@Composable
private fun reuse_51() {
  Path(reuse_51_path1, fill = SolidColor(Color(-10253010)))
}


private val reuse_0_path1 = "M0,-9.149C0,-9.797 -0.531,-10.323 -1.187,-10.323L-10.487,-10.323C-11.143,-10.323 -11.674,-9.797 -11.674,-9.149L-11.674,-0C-11.674,0.649 -11.143,1.174 -10.487,1.174L-1.187,1.174C-0.531,1.174 0,0.649 0,-0L0,-9.149Z".toPathNodes()
private val reuse_1_path1 = "M0,0.88C0,2.663 -1.31,3.728 -2.577,3.728C-3.938,3.728 -4.604,2.723 -5.585,1.075L-7.845,-2.848L-6.136,-2.848L-4.302,0.339C-3.315,1.995 -3.02,2.26 -2.577,2.26C-2.047,2.26 -1.484,1.776 -1.484,0.88C-1.484,0.012 -2.788,-0.032 -3.049,-0.032L-4.323,-0.032L-2.709,-2.848L-1.003,-2.848L-1.867,-1.341C-0.827,-1.045 0,-0.328 0,0.88".toPathNodes()
private val reuse_2_path1 = "M0,9.16C0,9.81 -0.524,10.337 -1.17,10.337L-15.896,10.337C-16.541,10.337 -17.064,9.81 -17.064,9.16L-17.064,-0.001C-17.064,-0.651 -16.541,-1.177 -15.896,-1.177L-1.17,-1.177C-0.524,-1.177 0,-0.651 0,-0.001L0,9.16Z".toPathNodes()
private val reuse_3_path1 = "M0,-1.213L-3.989,-1.213C-3.989,-1.213 -4.164,-2.526 -3.294,-3.237L-0.696,-3.237C0.175,-2.526 0,-1.213 0,-1.213M-0.021,1.04L-1.271,1.04L-1.271,1.035C-1.271,0.724 -1.021,0.472 -0.712,0.472L-0.581,0.472C-0.272,0.472 -0.021,0.724 -0.021,1.035L-0.021,1.04ZM-2.718,1.04L-3.969,1.04L-3.969,1.035C-3.969,0.724 -3.717,0.472 -3.408,0.472L-3.277,0.472C-2.968,0.472 -2.718,0.724 -2.718,1.035L-2.718,1.04ZM0.332,-2.939C0.035,-3.431 -0.438,-3.713 -0.438,-3.713L-3.551,-3.713C-3.551,-3.713 -4.024,-3.431 -4.321,-2.939C-4.618,-2.445 -4.74,-1.882 -4.74,-1.055L-4.74,1.372C-4.74,1.995 -4.252,2.5 -3.65,2.5L-0.339,2.5C0.263,2.5 0.75,1.995 0.75,1.372L0.75,-1.055C0.75,-1.882 0.629,-2.445 0.332,-2.939".toPathNodes()
private val reuse_4_path1 = "M-1.155,-0.941L0.726,-0.941L0.312,-0.346L-1.318,-0.553L-1.155,-0.941Z".toPathNodes()
private val reuse_5_path1 = "M-0.491,-0.604L1.391,-0.604L0.977,-1.199L-0.653,-0.991L-0.491,-0.604Z".toPathNodes()
private val reuse_6_path1 = "M-2.093,-0.929L-1.716,-0.929L-0.642,1.109L-0.856,1.419L-2.093,-0.929Z".toPathNodes()
private val reuse_7_path1 = "M-2.995,-0.334L-0,-0.334L0.175,0L-3.17,0L-2.995,-0.334Z".toPathNodes()
private val reuse_8_path1 = "M0,0.195L1.236,0.195C1.379,0.195 1.504,0.252 1.603,0.341L2.141,0.341C2.102,0.068 1.879,-0.146 1.597,-0.146L-0.321,-0.146C-0.603,-0.146 -0.826,0.068 -0.865,0.341L-0.365,0.341C-0.268,0.252 -0.142,0.195 0,0.195".toPathNodes()
private val reuse_9_path1 = "M0,0.001C0,-0.119 0.093,-0.215 0.21,-0.224L0.21,-0.3C0.178,-0.312 0.145,-0.321 0.108,-0.321L-0.118,-0.321C-0.295,-0.321 -0.438,-0.176 -0.438,0.001C-0.438,0.178 -0.295,0.322 -0.118,0.322L0.108,0.322C0.145,0.322 0.178,0.313 0.21,0.301L0.21,0.226C0.093,0.217 0,0.121 0,0.001".toPathNodes()
private val reuse_10_path1 = "M0,0.001C0,-0.119 -0.093,-0.215 -0.21,-0.224L-0.21,-0.3C-0.178,-0.312 -0.145,-0.321 -0.109,-0.321L0.119,-0.321C0.295,-0.321 0.438,-0.176 0.438,0.001C0.438,0.178 0.295,0.322 0.119,0.322L-0.109,0.322C-0.145,0.322 -0.178,0.313 -0.21,0.301L-0.21,0.226C-0.093,0.217 0,0.121 0,0.001".toPathNodes()
private val reuse_11_path1 = "M0,-6.369C-0.859,-6.236 -1.729,-5.308 -2.246,-4.82L-5.727,-5.749L-6.039,-5.494L-3.33,-3.744C-3.744,-3.322 -4.145,-2.884 -4.515,-2.416C-4.672,-2.22 -4.82,-2.015 -4.969,-1.809L-6.213,-1.973L-6.285,-1.866L-5.305,-1.306C-5.426,-1.118 -5.55,-0.932 -5.656,-0.73C-5.445,-0.841 -5.24,-0.95 -5.04,-1.06L-4.413,0L-4.309,-0.075L-4.503,-1.38C-4.314,-1.5 -4.13,-1.625 -3.951,-1.767C-3.494,-2.125 -3.077,-2.581 -2.666,-3.003L-0.818,-0.267L-0.576,-0.667L-1.605,-4.064C-1.161,-4.474 -0.078,-5.486 0,-6.369".toPathNodes()
private val reuse_12_path1 = "M0,-9.192C0,-9.843 -0.528,-10.371 -1.18,-10.371L-10.419,-10.371C-11.071,-10.371 -11.599,-9.843 -11.599,-9.192L-11.599,-0.001C-11.599,0.65 -11.071,1.179 -10.419,1.179L-1.18,1.179C-0.528,1.179 0,0.65 0,-0.001L0,-9.192Z".toPathNodes()
private val reuse_13_path1 = "M-0.002,-1.421C-0.396,-1.421 -0.711,-1.099 -0.711,-0.711C-0.711,-0.317 -0.396,0 -0.002,0C0.39,0 0.709,-0.317 0.709,-0.711C0.709,-1.099 0.39,-1.421 -0.002,-1.421".toPathNodes()
private val reuse_14_path1 = "M0,-4.302L-0.552,-1.975C-0.626,-1.85 -0.758,-1.778 -0.895,-1.774L-2.875,-1.774L-2.902,-1.044C-2.626,-1.203 -2.327,-1.183 -1.925,-1.183L-1.252,-1.183C-1.089,-1.183 -0.958,-1.051 -0.958,-0.887C-0.958,-0.725 -1.089,-0.593 -1.252,-0.593L-1.925,-0.593C-2.458,-0.593 -2.865,-0.574 -2.963,-0.134L-2.976,0.019C-3.002,0.391 -3.323,0.686 -3.699,0.664C-4.079,0.644 -4.366,0.317 -4.347,-0.061L-4.222,-2.217C-4.192,-2.594 -3.875,-2.862 -3.5,-2.862L-1.199,-2.862L-0.713,-4.727C-0.6,-4.912 -0.339,-4.988 -0.143,-4.87C0.053,-4.752 0.111,-4.508 0,-4.302".toPathNodes()
private val reuse_15_path1 = "M0,0.079C-0.018,-1.019 -0.907,-1.908 -2,-1.908C-3.104,-1.908 -4.003,-1.003 -4.003,0.111C-4.003,0.947 -3.496,1.666 -2.775,1.973L-2.811,2.576C-3.842,2.231 -4.592,1.263 -4.592,0.111C-4.592,-1.327 -3.43,-2.497 -2,-2.497C-0.768,-2.497 0.261,-1.627 0.524,-0.466L0.382,0.079L0,0.079Z".toPathNodes()
private val reuse_16_path1 = "M-1.197,-0.978L0.754,-0.978L0.331,-0.364L-1.362,-0.577L-1.197,-0.978Z".toPathNodes()
private val reuse_17_path1 = "M0,9.137C0,9.784 -0.516,10.31 -1.152,10.31L-10.183,10.31C-10.818,10.31 -11.335,9.784 -11.335,9.137L-11.335,0C-11.335,-0.648 -10.818,-1.173 -10.183,-1.173L-1.152,-1.173C-0.516,-1.173 0,-0.648 0,0L0,9.137Z".toPathNodes()
private val reuse_18_path1 = "M0,-1.262L-4.108,-1.262C-4.108,-1.262 -4.288,-2.629 -3.392,-3.369L-0.718,-3.369C0.179,-2.629 0,-1.262 0,-1.262M-0.022,1.084L-1.311,1.084L-1.311,1.078C-1.311,0.755 -1.052,0.492 -0.733,0.492L-0.599,0.492C-0.28,0.492 -0.022,0.755 -0.022,1.078L-0.022,1.084ZM-2.799,1.084L-4.087,1.084L-4.087,1.078C-4.087,0.755 -3.828,0.492 -3.51,0.492L-3.375,0.492C-3.057,0.492 -2.799,0.755 -2.799,1.078L-2.799,1.084ZM0.342,-3.059C0.035,-3.572 -0.451,-3.865 -0.451,-3.865L-3.657,-3.865C-3.657,-3.865 -4.144,-3.572 -4.45,-3.059C-4.757,-2.546 -4.882,-1.959 -4.882,-1.098L-4.882,1.43C-4.882,2.078 -4.38,2.603 -3.761,2.603L-0.349,2.603C0.271,2.603 0.772,2.078 0.772,1.43L0.772,-1.098C0.772,-1.959 0.647,-2.546 0.342,-3.059".toPathNodes()
private val reuse_19_path1 = "M-1.197,-0.978L0.754,-0.978L0.331,-0.363L-1.362,-0.577L-1.197,-0.978Z".toPathNodes()
private val reuse_20_path1 = "M-0.514,-0.629L1.437,-0.629L1.013,-1.245L-0.679,-1.03L-0.514,-0.629Z".toPathNodes()
private val reuse_21_path1 = "M-2.148,-0.959L-1.756,-0.959L-0.666,1.148L-0.893,1.467L-2.148,-0.959Z".toPathNodes()
private val reuse_22_path1 = "M-3.084,-0.348L0,-0.348L0.18,0L-3.264,0L-3.084,-0.348Z".toPathNodes()
private val reuse_23_path1 = "M0,0.203L1.273,0.203C1.42,0.203 1.549,0.263 1.65,0.354L2.205,0.354C2.165,0.071 1.934,-0.151 1.645,-0.151L-0.33,-0.151C-0.621,-0.151 -0.85,0.071 -0.89,0.354L-0.376,0.354C-0.275,0.263 -0.146,0.203 0,0.203".toPathNodes()
private val reuse_24_path1 = "M0,0C0,-0.125 0.096,-0.225 0.215,-0.235L0.215,-0.313C0.183,-0.325 0.148,-0.334 0.112,-0.334L-0.123,-0.334C-0.305,-0.334 -0.451,-0.185 -0.451,0C-0.451,0.185 -0.305,0.334 -0.123,0.334L0.112,0.334C0.148,0.334 0.183,0.324 0.215,0.313L0.215,0.234C0.096,0.225 0,0.125 0,0".toPathNodes()
private val reuse_25_path1 = "M0,0C0,-0.125 -0.096,-0.225 -0.217,-0.235L-0.217,-0.313C-0.183,-0.325 -0.149,-0.334 -0.112,-0.334L0.122,-0.334C0.303,-0.334 0.45,-0.185 0.45,0C0.45,0.185 0.303,0.334 0.122,0.334L-0.112,0.334C-0.149,0.334 -0.183,0.324 -0.217,0.313L-0.217,0.234C-0.096,0.225 0,0.125 0,0".toPathNodes()
private val reuse_26_path1 = "M-5.895,-5.897C-9.13,-5.897 -11.752,-3.257 -11.752,-0.001C-11.752,3.254 -9.13,5.895 -5.895,5.895C-2.661,5.895 -0.04,3.254 -0.04,-0.001C-0.04,-3.257 -2.661,-5.897 -5.895,-5.897".toPathNodes()
private val reuse_27_path1 = "M-5.948,-5.948C-9.211,-5.948 -11.855,-3.285 -11.855,0C-11.855,3.285 -9.211,5.948 -5.948,5.948C-2.685,5.948 -0.041,3.285 -0.041,0C-0.041,-3.285 -2.685,-5.948 -5.948,-5.948".toPathNodes()
private val reuse_28_path1 = "M-6.058,-6.059C-9.382,-6.059 -12.077,-3.347 -12.077,0C-12.077,3.345 -9.382,6.058 -6.058,6.058C-2.734,6.058 -0.04,3.345 -0.04,0C-0.04,-3.347 -2.734,-6.059 -6.058,-6.059".toPathNodes()
private val reuse_29_path1 = "M0,-11.352C-1.657,-11.352 -3,-10.009 -3,-8.352L-3,-3C-3,-1.344 -1.657,0 0,0C1.657,0 3,-1.344 3,-3L3,-8.352C3,-10.009 1.657,-11.352 0,-11.352".toPathNodes()
private val reuse_30_path1 = "M-4.696,-4.696C-7.3,-4.696 -9.413,-2.594 -9.413,-0.001C-9.413,2.594 -7.3,4.696 -4.696,4.696C-2.091,4.696 0.021,2.594 0.021,-0.001C0.021,-2.594 -2.091,-4.696 -4.696,-4.696".toPathNodes()
private val reuse_31_path1 = "M-3.342,-3.342C-5.196,-3.342 -6.699,-1.846 -6.699,0C-6.699,1.846 -5.196,3.342 -3.342,3.342C-1.488,3.342 0.015,1.846 0.015,0C0.015,-1.846 -1.488,-3.342 -3.342,-3.342".toPathNodes()
private val reuse_32_path1 = "M0,0.001C0,1.774 -1.438,3.213 -3.212,3.213L-8.833,3.213C-10.607,3.213 -12.046,1.774 -12.046,0.001C-12.046,-1.773 -10.607,-3.212 -8.833,-3.212L-3.212,-3.212C-1.438,-3.212 0,-1.773 0,0.001".toPathNodes()
private val reuse_33_path1 = "M0,0.001C0,1.774 -1.438,3.213 -3.212,3.213L-8.833,3.213C-10.607,3.213 -12.046,1.774 -12.046,0.001C-12.046,-1.773 -10.607,-3.212 -8.833,-3.212L-3.212,-3.212C-1.438,-3.212 0,-1.773 0,0.001Z".toPathNodes()
private val reuse_34_path1 = "M-4.696,-4.696C-7.301,-4.696 -9.413,-2.593 -9.413,-0.001C-9.413,2.593 -7.301,4.696 -4.696,4.696C-2.091,4.696 0.021,2.593 0.021,-0.001C0.021,-2.593 -2.091,-4.696 -4.696,-4.696".toPathNodes()
private val reuse_35_path1 = "M0,-6.624C1.265,-5.38 1.279,-3.346 0.035,-2.082L-2.064,-0.032C-3.309,1.231 -5.344,1.246 -6.607,0.001C-7.871,-1.243 -7.885,-3.278 -6.641,-4.542L-4.542,-6.593C-3.297,-7.854 -1.264,-7.87 0,-6.624".toPathNodes()
private val reuse_36_path1 = "M0,-6.624C1.265,-5.38 1.279,-3.346 0.035,-2.082L-2.064,-0.032C-3.309,1.231 -5.344,1.246 -6.607,0.001C-7.871,-1.243 -7.885,-3.278 -6.641,-4.542L-4.542,-6.593C-3.297,-7.854 -1.264,-7.87 0,-6.624Z".toPathNodes()
private val reuse_37_path1 = "M0,-6.624C1.265,-5.38 1.279,-3.346 0.035,-2.082L-2.064,-0.032C-3.309,1.231 -5.344,1.246 -6.607,0.001C-7.871,-1.244 -7.885,-3.279 -6.641,-4.542L-4.542,-6.592C-3.297,-7.854 -1.264,-7.87 0,-6.624".toPathNodes()
private val reuse_38_path1 = "M0,-6.624C1.265,-5.38 1.279,-3.346 0.035,-2.082L-2.064,-0.032C-3.309,1.231 -5.344,1.246 -6.607,0.001C-7.871,-1.244 -7.885,-3.279 -6.641,-4.542L-4.542,-6.592C-3.297,-7.854 -1.264,-7.87 0,-6.624Z".toPathNodes()
private val reuse_39_path1 = "M-4.696,-4.696C-7.3,-4.696 -9.412,-2.593 -9.412,-0.001C-9.412,2.593 -7.3,4.696 -4.696,4.696C-2.092,4.696 0.02,2.593 0.02,-0.001C0.02,-2.593 -2.092,-4.696 -4.696,-4.696".toPathNodes()
private val reuse_40_path1 = "M3.287,-3.287C1.472,-3.287 -0,-1.816 -0,0C-0,1.815 1.472,3.287 3.287,3.287C5.102,3.287 6.574,1.815 6.574,0C6.574,-1.816 5.102,-3.287 3.287,-3.287".toPathNodes()
private val reuse_41_path1 = "M0,11.403C-1.656,11.403 -3,10.06 -3,8.403L-3,3C-3,1.342 -1.656,0 0,0C1.656,0 3,1.342 3,3L3,8.403C3,10.06 1.656,11.403 0,11.403".toPathNodes()
private val reuse_42_path1 = "M0,11.403C-1.656,11.403 -3,10.06 -3,8.403L-3,3C-3,1.342 -1.656,0 0,0C1.657,0 3,1.342 3,3L3,8.403C3,10.06 1.657,11.403 0,11.403".toPathNodes()
private val reuse_43_path1 = "M0,-9.151C0,-9.799 -0.526,-10.326 -1.175,-10.326L-10.375,-10.326C-11.023,-10.326 -11.55,-9.799 -11.55,-9.151L-11.55,0C-11.55,0.65 -11.023,1.175 -10.375,1.175L-1.175,1.175C-0.526,1.175 0,0.65 0,0L0,-9.151Z".toPathNodes()
private val reuse_44_path1 = "M0,4.554L0,2.601L0.702,2.601C1.208,2.601 1.546,2.637 1.716,2.709C1.887,2.781 2.021,2.893 2.118,3.047C2.214,3.2 2.263,3.379 2.263,3.582C2.263,3.832 2.195,4.039 2.059,4.202C1.923,4.365 1.751,4.466 1.543,4.507C1.39,4.538 1.082,4.554 0.62,4.554L0,4.554ZM-1.283,-1.164L-1.283,5.718L0.776,5.718C1.556,5.718 2.065,5.684 2.302,5.615C2.666,5.512 2.971,5.287 3.216,4.941C3.462,4.596 3.585,4.149 3.585,3.601C3.585,3.179 3.514,2.823 3.373,2.535C3.231,2.247 3.051,2.021 2.833,1.857C2.615,1.693 2.393,1.584 2.167,1.531C1.861,1.465 1.417,1.432 0.836,1.432L0,1.432L0,-1.164L-1.283,-1.164Z".toPathNodes()
private val reuse_45_path1 = "M0,10.376C-0.471,10.376 -0.854,9.982 -0.854,9.498L-0.854,0.878C-0.854,0.394 -0.471,-0.001 0,-0.001L8.642,-0.001C9.113,-0.001 9.496,0.394 9.496,0.878L9.496,9.498C9.496,9.982 9.113,10.376 8.642,10.376L0,10.376ZM8.642,-0.572L0,-0.572C-0.786,-0.572 -1.426,0.078 -1.426,0.878L-1.426,9.498C-1.426,10.298 -0.786,10.948 0,10.948L8.642,10.948C9.428,10.948 10.068,10.298 10.068,9.498L10.068,0.878C10.068,0.078 9.428,-0.572 8.642,-0.572".toPathNodes()
private val reuse_46_path1 = "M0,-1.383C-0.383,-1.383 -0.691,-1.069 -0.691,-0.692C-0.691,-0.308 -0.383,0 0,0C0.382,0 0.691,-0.308 0.691,-0.692C0.691,-1.07 0.382,-1.383 0,-1.383".toPathNodes()
private val reuse_47_path1 = "M0,-4.187L-0.537,-1.922C-0.61,-1.8 -0.738,-1.73 -0.871,-1.726L-2.799,-1.726L-2.826,-1.015C-2.558,-1.171 -2.266,-1.15 -1.874,-1.15L-1.219,-1.15C-1.06,-1.15 -0.932,-1.022 -0.932,-0.863C-0.932,-0.705 -1.06,-0.576 -1.219,-0.576L-1.874,-0.576C-2.393,-0.576 -2.789,-0.558 -2.884,-0.129L-2.898,0.02C-2.923,0.381 -3.235,0.668 -3.602,0.648C-3.972,0.627 -4.25,0.309 -4.232,-0.058L-4.111,-2.157C-4.081,-2.525 -3.773,-2.787 -3.408,-2.787L-1.167,-2.787L-0.693,-4.601C-0.583,-4.782 -0.33,-4.855 -0.138,-4.74C0.051,-4.625 0.108,-4.388 0,-4.187".toPathNodes()
private val reuse_48_path1 = "M0,0.079C-0.017,-0.991 -0.882,-1.857 -1.947,-1.857C-3.022,-1.857 -3.897,-0.975 -3.897,0.109C-3.897,0.923 -3.403,1.624 -2.702,1.921L-2.736,2.51C-3.74,2.174 -4.471,1.231 -4.471,0.109C-4.471,-1.291 -3.339,-2.431 -1.947,-2.431C-0.748,-2.431 0.254,-1.583 0.51,-0.452L0.372,0.079L0,0.079Z".toPathNodes()
private val reuse_49_path1 = "M0,-11.353C-1.657,-11.353 -3,-10.01 -3,-8.353L-3,-3C-3,-1.343 -1.657,0 0,0C1.657,0 3,-1.343 3,-3L3,-8.353C3,-10.01 1.657,-11.353 0,-11.353".toPathNodes()
private val reuse_50_path1 = "M0,-11.352C-1.657,-11.352 -3,-10.009 -3,-8.352L-3,-3C-3,-1.343 -1.657,0 0,0C1.657,0 3,-1.343 3,-3L3,-8.352C3,-10.009 1.657,-11.352 0,-11.352".toPathNodes()
private val reuse_51_path1 = "M0,-11.352L-0.02,-11.352C-1.676,-11.341 -3.011,-9.99 -3,-8.332L-2.966,-2.981C-2.956,-1.331 -1.615,0 0.033,0L0.053,0C1.709,-0.011 3.044,-1.363 3.034,-3.02L3,-8.372C2.989,-10.021 1.648,-11.352 0,-11.352".toPathNodes()
private val path1 = "M0,65.118L92.363,65.118L92.363,0L-11,0L-11,54.118C-11,60.193 -6.075,65.118 0,65.118".toPathNodes()
private val path2 = "M0,-45.017L0,-217.82L-31.592,-217.82L-31.592,172.803L119.446,172.803L119.446,-34.017L11,-34.017C4.925,-34.017 0,-38.942 0,-45.017".toPathNodes()
private val path3 = "M0,-53.567C-6.075,-53.567 -11,-58.492 -11,-64.567L-11,-118.685L-27.083,-118.685L-27.083,54.118C-27.083,60.193 -22.158,65.118 -16.083,65.118L92.363,65.118L92.363,-53.567L0,-53.567Z".toPathNodes()
private val path4 = "M0,305.054L0,719.194C0,729.687 -8.507,738.194 -19,738.194L-1014.83,738.194C-1024.22,738.194 -1031.83,730.583 -1031.83,721.194L-1031.83,83.804C-1031.83,74.415 -1024.22,66.804 -1014.83,66.804L-818.393,66.804C-811.766,66.804 -806.393,61.431 -806.393,54.804L-806.393,15.916C-806.393,9.288 -801.02,3.916 -794.393,3.916L-692.459,3.916C-686.662,3.916 -681.964,-0.783 -681.964,-6.579L-681.964,-12.834C-681.964,-20.014 -676.144,-25.834 -668.964,-25.834L-565.144,-25.834C-557.964,-25.834 -552.144,-20.014 -552.144,-12.834L-552.144,-3.315C-552.144,3.865 -546.323,9.685 -539.144,9.685L-444.175,9.685C-436.995,9.685 -431.175,3.865 -431.175,-3.315L-431.175,-12.834C-431.175,-20.014 -425.354,-25.834 -418.175,-25.834L-228.599,-25.834C-221.419,-25.834 -215.599,-20.014 -215.599,-12.834L-215.599,44.423C-215.599,51.603 -209.778,57.423 -202.599,57.423L-76.236,57.423C-70.161,57.423 -65.236,62.348 -65.236,68.423L-65.236,283.054C-65.236,289.13 -60.312,294.054 -54.236,294.054L-11,294.054C-4.925,294.054 0,298.979 0,305.054Z".toPathNodes()
private val path5 = "M0,541.853C0,547.928 4.925,552.853 11,552.853L58.075,552.845C64.15,552.845 69.075,557.77 69.075,563.845L69.068,602.798C69.068,608.874 73.992,613.798 80.068,613.798L180.256,613.798C186.332,613.798 191.256,608.874 191.256,602.798L191.256,571.24C191.256,566.54 195.066,562.729 199.768,562.729L304.363,562.729C311.543,562.729 317.363,568.549 317.363,575.729L317.121,618.167C317.121,625.347 322.941,631.167 330.121,631.167L489.044,630.923C493.669,630.923 497.419,627.173 497.419,622.548L497.419,620.719C497.419,614.644 502.344,609.719 508.419,609.719L877.674,610.329C883.749,610.329 888.674,605.404 888.674,599.329L888.658,321.378C888.658,315.304 893.583,310.378 899.658,310.378L900.212,310.378C906.287,310.378 911.212,305.455 911.212,299.379L911.212,228.439C911.212,222.365 906.287,217.439 900.212,217.439L820.576,217.44C814.501,217.44 809.576,212.515 809.576,206.44L809.576,52.319C809.576,46.244 804.651,41.319 798.576,41.319L691.15,41.319C685.075,41.319 680.15,36.394 680.15,30.319L680.15,-78.314C680.15,-84.389 675.226,-89.314 669.15,-89.314L591.558,-89.314C585.482,-89.314 580.558,-84.389 580.558,-78.314L580.558,-45.966C580.558,-39.891 575.633,-34.966 569.558,-34.966L434.984,-34.979C428.909,-34.979 423.984,-39.904 423.984,-45.979L423.984,-74.872C423.984,-80.947 419.06,-85.872 412.984,-85.872L346.624,-85.872C340.549,-85.872 335.624,-80.947 335.624,-74.872L335.624,27.328C335.624,33.404 330.699,38.328 324.624,38.328L11.304,38.328C5.229,38.328 0.304,43.253 0.304,49.328L0,541.853Z".toPathNodes()
private val path6 = "M0,8.845C0,9.473 -0.523,9.982 -1.169,9.982L-15.899,9.982C-16.546,9.982 -17.069,9.473 -17.069,8.845L-17.069,-0.001C-17.069,-0.629 -16.546,-1.137 -15.899,-1.137L-1.169,-1.137C-0.523,-1.137 0,-0.629 0,-0.001L0,8.845Z".toPathNodes()
private val path7 = "M0,-5.668L-1.2,-5.668L-2.379,-1.864L-3.558,-5.668L-4.757,-5.668L-6.576,0L-5.457,0L-4.137,-3.804L-2.898,0L-1.859,0L-0.62,-3.804L0.699,0L1.818,0L0,-5.668Z".toPathNodes()
private val path8 = "M0,8.845C0,9.473 -0.523,9.982 -1.169,9.982L-15.899,9.982C-16.546,9.982 -17.069,9.473 -17.069,8.845L-17.069,-0.002C-17.069,-0.629 -16.546,-1.137 -15.899,-1.137L-1.169,-1.137C-0.523,-1.137 0,-0.629 0,-0.002L0,8.845Z".toPathNodes()
private val path9 = "M0,-5.668L-1.2,-5.668L-2.379,-1.863L-3.558,-5.668L-4.757,-5.668L-6.576,0L-5.457,0L-4.137,-3.805L-2.898,0L-1.859,0L-0.62,-3.805L0.699,0L1.818,0L0,-5.668Z".toPathNodes()
private val path10 = "M0,9.032C0,9.674 -0.523,10.193 -1.169,10.193L-15.898,10.193C-16.545,10.193 -17.068,9.674 -17.068,9.032L-17.068,-0.001C-17.068,-0.641 -16.545,-1.161 -15.898,-1.161L-1.169,-1.161C-0.523,-1.161 0,-0.641 0,-0.001L0,9.032Z".toPathNodes()
private val path11 = "M0,-5.788L-1.2,-5.788L-2.379,-1.904L-3.558,-5.788L-4.757,-5.788L-6.575,0L-5.457,0L-4.138,-3.885L-2.897,0L-1.858,0L-0.62,-3.885L0.699,0L1.818,0L0,-5.788Z".toPathNodes()
private val path12 = "M0,9.142C0,9.79 -0.522,10.316 -1.167,10.316L-15.863,10.316C-16.507,10.316 -17.03,9.79 -17.03,9.142L-17.03,-0.001C-17.03,-0.649 -16.507,-1.174 -15.863,-1.174L-1.167,-1.174C-0.522,-1.174 0,-0.649 0,-0.001L0,9.142Z".toPathNodes()
private val path13 = "M0,-5.858L-1.196,-5.858L-2.374,-1.926L-3.55,-5.858L-4.746,-5.858L-6.561,0L-5.444,0L-4.128,-3.932L-2.892,0L-1.855,0L-0.618,-3.932L0.697,0L1.814,0L0,-5.858Z".toPathNodes()
private val path14 = "M0,9.142C0,9.79 -0.522,10.316 -1.167,10.316L-15.863,10.316C-16.508,10.316 -17.029,9.79 -17.029,9.142L-17.029,-0.001C-17.029,-0.649 -16.508,-1.174 -15.863,-1.174L-1.167,-1.174C-0.522,-1.174 0,-0.649 0,-0.001L0,9.142Z".toPathNodes()
private val path15 = "M0,-5.858L-1.197,-5.858L-2.374,-1.926L-3.551,-5.858L-4.746,-5.858L-6.561,0L-5.445,0L-4.129,-3.931L-2.893,0L-1.855,0L-0.619,-3.931L0.697,0L1.814,0L0,-5.858Z".toPathNodes()
private val path16 = "M0,8.76C0,9.381 -0.525,9.884 -1.176,9.884L-15.975,9.884C-16.623,9.884 -17.15,9.381 -17.15,8.76L-17.15,0C-17.15,-0.622 -16.623,-1.124 -15.975,-1.124L-1.176,-1.124C-0.525,-1.124 0,-0.622 0,0L0,8.76Z".toPathNodes()
private val path17 = "M0,-5.611L-1.205,-5.611L-2.39,-1.844L-3.574,-5.611L-4.779,-5.611L-6.606,0L-5.482,0L-4.156,-3.766L-2.912,0L-1.867,0L-0.623,-3.766L0.702,0L1.827,0L0,-5.611Z".toPathNodes()
private val path20 = "M0,9.201C0,9.854 -0.521,10.383 -1.163,10.383L-15.807,10.383C-16.449,10.383 -16.969,9.854 -16.969,9.201L-16.969,0C-16.969,-0.653 -16.449,-1.182 -15.807,-1.182L-1.163,-1.182C-0.521,-1.182 0,-0.653 0,0L0,9.201Z".toPathNodes()
private val path21 = "M0,-3.439L2.308,-3.439L2.308,-2.793C2.107,-2.575 1.939,-2.338 1.805,-2.083C1.643,-1.774 1.513,-1.429 1.418,-1.048C1.344,-0.752 1.293,-0.403 1.268,0L0.479,0C0.541,-0.561 0.639,-1.032 0.771,-1.413C0.905,-1.793 1.116,-2.199 1.404,-2.632L0,-2.632L0,-3.439Z".toPathNodes()
private val path22 = "M0,-1.449L-0.747,-1.612C-0.686,-1.899 -0.565,-2.12 -0.389,-2.273C-0.213,-2.427 0.037,-2.503 0.361,-2.503C0.732,-2.503 1.001,-2.42 1.166,-2.252C1.332,-2.085 1.415,-1.874 1.415,-1.62C1.415,-1.472 1.381,-1.337 1.314,-1.217C1.247,-1.096 1.145,-0.991 1.009,-0.901C1.119,-0.868 1.203,-0.83 1.262,-0.786C1.355,-0.716 1.43,-0.623 1.482,-0.508C1.535,-0.392 1.561,-0.256 1.561,-0.095C1.561,0.105 1.518,0.296 1.431,0.48C1.344,0.663 1.219,0.805 1.057,0.905C0.893,1.004 0.678,1.054 0.413,1.054C0.154,1.054 -0.05,1.017 -0.199,0.944C-0.349,0.87 -0.472,0.763 -0.567,0.62C-0.664,0.479 -0.738,0.302 -0.789,0.087L0,-0.039C0.031,0.153 0.08,0.286 0.145,0.36C0.21,0.435 0.293,0.472 0.394,0.472C0.5,0.472 0.588,0.425 0.658,0.331C0.729,0.237 0.765,0.112 0.765,-0.045C0.765,-0.204 0.73,-0.327 0.662,-0.415C0.596,-0.503 0.503,-0.546 0.387,-0.546C0.324,-0.546 0.238,-0.527 0.13,-0.491L0.17,-1.173C0.215,-1.165 0.249,-1.161 0.273,-1.161C0.377,-1.161 0.463,-1.202 0.533,-1.28C0.602,-1.36 0.637,-1.455 0.637,-1.564C0.637,-1.67 0.611,-1.753 0.559,-1.815C0.508,-1.878 0.436,-1.909 0.346,-1.909C0.252,-1.909 0.177,-1.876 0.119,-1.806C0.061,-1.739 0.021,-1.62 0,-1.449".toPathNodes()
private val path23 = "M0,-6.442C-1.719,-6.442 -3.117,-4.997 -3.117,-3.221C-3.117,-1.446 -1.719,-0.001 0,-0.001C1.719,-0.001 3.117,-1.446 3.117,-3.221C3.117,-4.997 1.719,-6.442 0,-6.442M0,0.472C-1.975,0.472 -3.582,-1.185 -3.582,-3.221C-3.582,-5.258 -1.975,-6.914 0,-6.914C1.976,-6.914 3.582,-5.258 3.582,-3.221C3.582,-1.185 1.976,0.472 0,0.472".toPathNodes()
private val path24 = "M0,-6.397C-0.855,-6.262 -1.721,-5.331 -2.234,-4.841L-5.695,-5.774L-6.006,-5.517L-3.312,-3.761C-3.723,-3.335 -4.122,-2.896 -4.489,-2.426C-4.646,-2.229 -4.794,-2.024 -4.941,-1.818L-6.178,-1.982L-6.25,-1.874L-5.275,-1.311C-5.396,-1.123 -5.52,-0.936 -5.625,-0.733C-5.414,-0.844 -5.211,-0.953 -5.012,-1.066L-4.389,0L-4.284,-0.075L-4.479,-1.385C-4.291,-1.506 -4.107,-1.632 -3.93,-1.775C-3.475,-2.135 -3.061,-2.592 -2.652,-3.015L-0.814,-0.268L-0.573,-0.669L-1.596,-4.083C-1.154,-4.494 -0.078,-5.509 0,-6.397".toPathNodes()
private val path25 = "M0,9.045C0,9.686 -0.521,10.207 -1.162,10.207L-15.788,10.207C-16.43,10.207 -16.949,9.686 -16.949,9.045L-16.949,0C-16.949,-0.641 -16.43,-1.162 -15.788,-1.162L-1.162,-1.162C-0.521,-1.162 0,-0.641 0,0L0,9.045Z".toPathNodes()
private val path26 = "M0,3.531C0,3.394 0.11,3.284 0.247,3.284L0.962,3.284C1.099,3.284 1.209,3.394 1.209,3.531C1.209,3.668 1.099,3.778 0.962,3.778L0.247,3.778C0.11,3.778 0,3.668 0,3.531M-3.031,3.778L-3.745,3.778C-3.882,3.778 -3.993,3.668 -3.993,3.531C-3.993,3.394 -3.882,3.284 -3.745,3.284L-3.031,3.284C-2.895,3.284 -2.784,3.394 -2.784,3.531C-2.784,3.668 -2.895,3.778 -3.031,3.778M-3.993,-0.274C-3.993,-0.753 -3.69,-0.711 -3.69,-0.711L0.907,-0.711C0.907,-0.711 1.209,-0.753 1.209,-0.274L1.209,1.999C1.209,2.479 0.906,2.437 0.906,2.437L-3.69,2.437C-3.69,2.437 -3.993,2.479 -3.993,1.999L-3.993,-0.274ZM-3.764,-1.554L0.979,-1.554L0.979,-1.094L-3.764,-1.094L-3.764,-1.554ZM1.948,-0.362L1.679,-0.362L1.679,-1.333C1.679,-1.654 1.419,-1.914 1.099,-1.914L-3.927,-1.914C-4.247,-1.914 -4.508,-1.654 -4.508,-1.333L-4.508,-0.362L-4.685,-0.362C-4.804,-0.362 -4.866,-0.344 -4.866,-0.226L-4.866,0.927C-4.866,1.045 -4.849,1.108 -4.729,1.108L-4.508,1.108L-4.508,4.47L-4.154,4.47L-4.154,4.93C-4.154,5.214 -3.924,5.445 -3.638,5.445C-3.354,5.445 -3.123,5.214 -3.123,4.93L-3.123,4.47L0.366,4.47L0.366,4.93C0.366,5.214 0.597,5.445 0.882,5.445C1.167,5.445 1.397,5.214 1.397,4.93L1.397,4.47L1.679,4.47L1.679,1.108L1.994,1.108C2.112,1.108 2.13,1.045 2.13,0.927L2.13,-0.226C2.13,-0.344 2.065,-0.362 1.948,-0.362".toPathNodes()
private val path27 = "M0,-6.289C-0.854,-6.157 -1.719,-5.24 -2.232,-4.76L-5.689,-5.677L-5.999,-5.424L-3.309,-3.698C-3.72,-3.279 -4.117,-2.848 -4.484,-2.386C-4.641,-2.192 -4.789,-1.991 -4.937,-1.788L-6.172,-1.948L-6.243,-1.843L-5.27,-1.289C-5.39,-1.104 -5.514,-0.92 -5.619,-0.721C-5.408,-0.831 -5.206,-0.938 -5.006,-1.048L-4.384,0L-4.279,-0.075L-4.473,-1.363C-4.287,-1.481 -4.103,-1.605 -3.926,-1.746C-3.471,-2.1 -3.058,-2.55 -2.649,-2.965L-0.813,-0.264L-0.573,-0.66L-1.595,-4.013C-1.154,-4.418 -0.078,-5.417 0,-6.289".toPathNodes()
private val path48 = "M0,9.16C0,9.81 -0.524,10.337 -1.169,10.337L-15.895,10.337C-16.54,10.337 -17.064,9.81 -17.064,9.16L-17.064,-0.001C-17.064,-0.651 -16.54,-1.177 -15.895,-1.177L-1.169,-1.177C-0.524,-1.177 0,-0.651 0,-0.001L0,9.16Z".toPathNodes()
private val path49 = "M0,-1.213L-3.99,-1.213C-3.99,-1.213 -4.165,-2.526 -3.294,-3.237L-0.697,-3.237C0.174,-2.526 0,-1.213 0,-1.213M-0.022,1.04L-1.272,1.04L-1.272,1.035C-1.272,0.724 -1.022,0.472 -0.712,0.472L-0.582,0.472C-0.273,0.472 -0.022,0.724 -0.022,1.035L-0.022,1.04ZM-2.718,1.04L-3.969,1.04L-3.969,1.035C-3.969,0.724 -3.718,0.472 -3.409,0.472L-3.278,0.472C-2.968,0.472 -2.718,0.724 -2.718,1.035L-2.718,1.04ZM0.332,-2.939C0.034,-3.431 -0.438,-3.713 -0.438,-3.713L-3.552,-3.713C-3.552,-3.713 -4.025,-3.431 -4.322,-2.939C-4.619,-2.445 -4.741,-1.882 -4.741,-1.055L-4.741,1.372C-4.741,1.995 -4.253,2.5 -3.651,2.5L-0.339,2.5C0.262,2.5 0.75,1.995 0.75,1.372L0.75,-1.055C0.75,-1.882 0.628,-2.445 0.332,-2.939".toPathNodes()
private val path51 = "M-0.491,-0.603L1.391,-0.603L0.976,-1.199L-0.654,-0.991L-0.491,-0.603Z".toPathNodes()
private val path52 = "M-2.091,-0.931L-1.714,-0.931L-0.644,1.11L-0.859,1.42L-2.091,-0.931Z".toPathNodes()
private val path53 = "M-2.994,-0.334L0.001,-0.334L0.175,0L-3.169,0L-2.994,-0.334Z".toPathNodes()
private val path54 = "M0,0.195L1.237,0.195C1.378,0.195 1.504,0.252 1.603,0.341L2.141,0.341C2.102,0.068 1.878,-0.146 1.597,-0.146L-0.321,-0.146C-0.603,-0.146 -0.826,0.068 -0.865,0.341L-0.365,0.341C-0.268,0.252 -0.142,0.195 0,0.195".toPathNodes()
private val path55 = "M0,0.001C0,-0.119 0.092,-0.215 0.209,-0.224L0.209,-0.3C0.178,-0.312 0.145,-0.321 0.109,-0.321L-0.119,-0.321C-0.295,-0.321 -0.438,-0.176 -0.438,0.001C-0.438,0.178 -0.295,0.322 -0.119,0.322L0.109,0.322C0.145,0.322 0.178,0.313 0.209,0.301L0.209,0.226C0.092,0.217 0,0.121 0,0.001".toPathNodes()
private val path56 = "M0,0.001C0,-0.119 -0.093,-0.215 -0.21,-0.224L-0.21,-0.3C-0.178,-0.312 -0.145,-0.321 -0.11,-0.321L0.118,-0.321C0.294,-0.321 0.437,-0.176 0.437,0.001C0.437,0.178 0.294,0.322 0.118,0.322L-0.11,0.322C-0.145,0.322 -0.178,0.313 -0.21,0.301L-0.21,0.226C-0.093,0.217 0,0.121 0,0.001".toPathNodes()
private val path57 = "M0,-6.369C-0.86,-6.236 -1.73,-5.308 -2.247,-4.82L-5.727,-5.749L-6.04,-5.494L-3.331,-3.744C-3.745,-3.322 -4.145,-2.884 -4.515,-2.416C-4.672,-2.22 -4.821,-2.015 -4.97,-1.809L-6.213,-1.973L-6.285,-1.866L-5.306,-1.306C-5.426,-1.118 -5.55,-0.932 -5.657,-0.73C-5.445,-0.841 -5.241,-0.95 -5.041,-1.06L-4.414,0L-4.309,-0.075L-4.503,-1.38C-4.315,-1.5 -4.13,-1.625 -3.952,-1.767C-3.495,-2.125 -3.078,-2.581 -2.667,-3.003L-0.818,-0.267L-0.577,-0.667L-1.605,-4.064C-1.162,-4.474 -0.079,-5.486 0,-6.369".toPathNodes()
private val path58 = "M0,9.159C0,9.809 -0.524,10.337 -1.169,10.337L-15.896,10.337C-16.54,10.337 -17.063,9.809 -17.063,9.159L-17.063,-0.001C-17.063,-0.652 -16.54,-1.178 -15.896,-1.178L-1.169,-1.178C-0.524,-1.178 0,-0.652 0,-0.001L0,9.159Z".toPathNodes()
private val path59 = "M0,-1.213L-3.99,-1.213C-3.99,-1.213 -4.164,-2.526 -3.295,-3.236L-0.697,-3.236C0.174,-2.526 0,-1.213 0,-1.213M-0.022,1.041L-1.272,1.041L-1.272,1.035C-1.272,0.725 -1.022,0.473 -0.713,0.473L-0.582,0.473C-0.273,0.473 -0.022,0.725 -0.022,1.035L-0.022,1.041ZM-2.719,1.041L-3.969,1.041L-3.969,1.035C-3.969,0.725 -3.718,0.473 -3.408,0.473L-3.277,0.473C-2.969,0.473 -2.719,0.725 -2.719,1.035L-2.719,1.041ZM0.332,-2.939C0.034,-3.432 -0.438,-3.713 -0.438,-3.713L-3.552,-3.713C-3.552,-3.713 -4.025,-3.432 -4.322,-2.939C-4.619,-2.445 -4.74,-1.883 -4.74,-1.055L-4.74,1.373C-4.74,1.996 -4.253,2.5 -3.651,2.5L-0.34,2.5C0.262,2.5 0.75,1.996 0.75,1.373L0.75,-1.055C0.75,-1.883 0.629,-2.445 0.332,-2.939".toPathNodes()
private val path60 = "M-1.156,-0.94L0.725,-0.94L0.31,-0.344L-1.319,-0.553L-1.156,-0.94Z".toPathNodes()
private val path61 = "M-0.491,-0.603L1.391,-0.603L0.975,-1.198L-0.653,-0.99L-0.491,-0.603Z".toPathNodes()
private val path62 = "M-2.089,-0.931L-1.711,-0.931L-0.644,1.111L-0.861,1.421L-2.089,-0.931Z".toPathNodes()
private val path63 = "M-2.996,-0.334L-0,-0.334L0.174,0L-3.17,0L-2.996,-0.334Z".toPathNodes()
private val path64 = "M0,0.197L1.236,0.197C1.378,0.197 1.504,0.254 1.602,0.342L2.141,0.342C2.102,0.069 1.878,-0.145 1.596,-0.145L-0.322,-0.145C-0.604,-0.145 -0.826,0.069 -0.865,0.342L-0.365,0.342C-0.268,0.254 -0.143,0.197 0,0.197".toPathNodes()
private val path65 = "M0,0.002C0,-0.119 0.093,-0.215 0.21,-0.224L0.21,-0.3C0.178,-0.311 0.145,-0.32 0.109,-0.32L-0.118,-0.32C-0.295,-0.32 -0.438,-0.176 -0.438,0.002C-0.438,0.179 -0.295,0.322 -0.118,0.322L0.109,0.322C0.145,0.322 0.178,0.313 0.21,0.302L0.21,0.227C0.093,0.217 0,0.121 0,0.002".toPathNodes()
private val path66 = "M0,0.002C0,-0.119 -0.094,-0.215 -0.211,-0.224L-0.211,-0.3C-0.178,-0.311 -0.145,-0.32 -0.109,-0.32L0.118,-0.32C0.294,-0.32 0.438,-0.176 0.438,0.002C0.438,0.179 0.294,0.322 0.118,0.322L-0.109,0.322C-0.145,0.322 -0.178,0.313 -0.211,0.302L-0.211,0.227C-0.094,0.217 0,0.121 0,0.002".toPathNodes()
private val path67 = "M0,-6.369C-0.86,-6.236 -1.73,-5.308 -2.247,-4.82L-5.727,-5.75L-6.039,-5.494L-3.33,-3.745C-3.744,-3.322 -4.145,-2.885 -4.516,-2.416C-4.672,-2.221 -4.821,-2.015 -4.97,-1.81L-6.213,-1.974L-6.285,-1.867L-5.306,-1.306C-5.426,-1.118 -5.551,-0.932 -5.657,-0.73C-5.445,-0.842 -5.24,-0.95 -5.041,-1.06L-4.414,0L-4.309,-0.076L-4.504,-1.381C-4.315,-1.5 -4.131,-1.626 -3.952,-1.767C-3.494,-2.126 -3.078,-2.582 -2.666,-3.004L-0.818,-0.267L-0.576,-0.668L-1.605,-4.064C-1.162,-4.474 -0.078,-5.486 0,-6.369".toPathNodes()
private val path68 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.954,9.902 -10.954,9.515L-10.954,-0C-10.954,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path69 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.954,9.902 -10.954,9.515L-10.954,-0C-10.954,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path70 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.954,9.902 -10.954,9.515L-10.954,-0C-10.954,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path71 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.954,9.902 -10.954,9.515L-10.954,-0C-10.954,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path72 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.955,9.902 -10.955,9.515L-10.955,-0C-10.955,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path73 = "M0,10.009C0,10.416 -0.33,10.744 -0.736,10.744L-10.784,10.744C-11.191,10.744 -11.521,10.416 -11.521,10.009L-11.521,0.001C-11.521,-0.405 -11.191,-0.735 -10.784,-0.735L-0.736,-0.735C-0.33,-0.735 0,-0.405 0,0.001L0,10.009Z".toPathNodes()
private val path74 = "M0,9.762C0,10.158 -0.318,10.479 -0.712,10.479L-10.43,10.479C-10.823,10.479 -11.143,10.158 -11.143,9.762L-11.143,0C-11.143,-0.396 -10.823,-0.717 -10.43,-0.717L-0.712,-0.717C-0.318,-0.717 0,-0.396 0,0L0,9.762Z".toPathNodes()
private val path75 = "M0,9.515C0,9.902 -0.313,10.215 -0.699,10.215L-10.254,10.215C-10.641,10.215 -10.954,9.902 -10.954,9.515L-10.954,-0C-10.954,-0.387 -10.641,-0.7 -10.254,-0.7L-0.699,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path76 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.954,9.902 -10.954,9.515L-10.954,-0C-10.954,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path77 = "M0,10.008C0,10.415 -0.33,10.743 -0.736,10.743L-10.785,10.743C-11.191,10.743 -11.521,10.415 -11.521,10.008L-11.521,-0C-11.521,-0.406 -11.191,-0.735 -10.785,-0.735L-0.736,-0.735C-0.33,-0.735 0,-0.406 0,-0L0,10.008Z".toPathNodes()
private val path78 = "M0,9.515C0,9.903 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.954,9.903 -10.954,9.515L-10.954,-0C-10.954,-0.386 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.386 0,-0L0,9.515Z".toPathNodes()
private val path79 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.955,9.902 -10.955,9.515L-10.955,-0C-10.955,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path80 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.955,9.902 -10.955,9.515L-10.955,-0C-10.955,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path81 = "M0,9.515C0,9.902 -0.313,10.215 -0.7,10.215L-10.254,10.215C-10.641,10.215 -10.955,9.902 -10.955,9.515L-10.955,-0C-10.955,-0.387 -10.641,-0.7 -10.254,-0.7L-0.7,-0.7C-0.313,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path82 = "M0,9.515C0,9.902 -0.314,10.215 -0.7,10.215L-10.255,10.215C-10.641,10.215 -10.955,9.902 -10.955,9.515L-10.955,-0C-10.955,-0.387 -10.641,-0.7 -10.255,-0.7L-0.7,-0.7C-0.314,-0.7 0,-0.387 0,-0L0,9.515Z".toPathNodes()
private val path83 = "M0,9.814C0,10.214 -0.32,10.537 -0.716,10.537L-10.485,10.537C-10.88,10.537 -11.201,10.214 -11.201,9.814L-11.201,0C-11.201,-0.4 -10.88,-0.723 -10.485,-0.723L-0.716,-0.723C-0.32,-0.723 0,-0.4 0,0L0,9.814Z".toPathNodes()
private val path84 = "M0,9.898C0,10.301 -0.326,10.626 -0.729,10.626L-10.668,10.626C-11.07,10.626 -11.396,10.301 -11.396,9.898L-11.396,0C-11.396,-0.403 -11.07,-0.728 -10.668,-0.728L-0.729,-0.728C-0.326,-0.728 0,-0.403 0,0L0,9.898Z".toPathNodes()
private val path85 = "M0,10.042C0,10.451 -0.321,10.781 -0.719,10.781L-10.531,10.781C-10.928,10.781 -11.25,10.451 -11.25,10.042L-11.25,0C-11.25,-0.409 -10.928,-0.739 -10.531,-0.739L-0.719,-0.739C-0.321,-0.739 0,-0.409 0,0L0,10.042Z".toPathNodes()
private val path86 = "M0,9.147C0,9.795 -0.525,10.321 -1.174,10.321L-15.965,10.321C-16.613,10.321 -17.139,9.795 -17.139,9.147L-17.139,0C-17.139,-0.648 -16.613,-1.174 -15.965,-1.174L-1.174,-1.174C-0.525,-1.174 0,-0.648 0,0L0,9.147Z".toPathNodes()
private val path87 = "M0,-5.86L-1.204,-5.86L-2.388,-1.927L-3.572,-5.86L-4.776,-5.86L-6.603,0L-5.479,0L-4.153,-3.933L-2.91,0L-1.866,0L-0.622,-3.933L0.702,0L1.826,0L0,-5.86Z".toPathNodes()
private val path88 = "M0,9.147C0,9.795 -0.526,10.321 -1.175,10.321L-15.965,10.321C-16.613,10.321 -17.14,9.795 -17.14,9.147L-17.14,0C-17.14,-0.648 -16.613,-1.174 -15.965,-1.174L-1.175,-1.174C-0.526,-1.174 0,-0.648 0,0L0,9.147Z".toPathNodes()
private val path89 = "M0,-5.86L-1.203,-5.86L-2.388,-1.927L-3.572,-5.86L-4.775,-5.86L-6.602,0L-5.479,0L-4.153,-3.933L-2.91,0L-1.866,0L-0.621,-3.933L0.703,0L1.826,0L0,-5.86Z".toPathNodes()
private val path90 = "M0,9.145C0,9.793 -0.526,10.32 -1.174,10.32L-15.965,10.32C-16.613,10.32 -17.139,9.793 -17.139,9.145L-17.139,-0.001C-17.139,-0.65 -16.613,-1.175 -15.965,-1.175L-1.174,-1.175C-0.526,-1.175 0,-0.65 0,-0.001L0,9.145Z".toPathNodes()
private val path91 = "M0,-5.86L-1.204,-5.86L-2.388,-1.926L-3.572,-5.86L-4.776,-5.86L-6.602,0L-5.479,0L-4.154,-3.932L-2.91,0L-1.867,0L-0.622,-3.932L0.702,0L1.826,0L0,-5.86Z".toPathNodes()
private val path92 = "M0,9.145C0,9.793 -0.525,10.32 -1.174,10.32L-15.964,10.32C-16.613,10.32 -17.139,9.793 -17.139,9.145L-17.139,-0.001C-17.139,-0.65 -16.613,-1.175 -15.964,-1.175L-1.174,-1.175C-0.525,-1.175 0,-0.65 0,-0.001L0,9.145Z".toPathNodes()
private val path93 = "M0,-5.86L-1.205,-5.86L-2.389,-1.926L-3.573,-5.86L-4.777,-5.86L-6.603,0L-5.479,0L-4.154,-3.932L-2.91,0L-1.867,0L-0.623,-3.932L0.701,0L1.826,0L0,-5.86Z".toPathNodes()
private val path94 = "M0,9.151C0,9.8 -0.526,10.326 -1.175,10.326L-10.375,10.326C-11.023,10.326 -11.55,9.8 -11.55,9.151L-11.55,0C-11.55,-0.649 -11.023,-1.175 -10.375,-1.175L-1.175,-1.175C-0.526,-1.175 0,-0.649 0,0L0,9.151Z".toPathNodes()
private val path99 = "M0,9.137C0,9.784 -0.517,10.31 -1.153,10.31L-10.183,10.31C-10.819,10.31 -11.335,9.784 -11.335,9.137L-11.335,0C-11.335,-0.648 -10.819,-1.173 -10.183,-1.173L-1.153,-1.173C-0.517,-1.173 0,-0.648 0,0L0,9.137Z".toPathNodes()
private val path100 = "M0,-1.262L-4.108,-1.262C-4.108,-1.262 -4.288,-2.629 -3.392,-3.369L-0.717,-3.369C0.179,-2.629 0,-1.262 0,-1.262M-0.022,1.084L-1.311,1.084L-1.311,1.078C-1.311,0.755 -1.052,0.492 -0.734,0.492L-0.599,0.492C-0.28,0.492 -0.022,0.755 -0.022,1.078L-0.022,1.084ZM-2.799,1.084L-4.086,1.084L-4.086,1.078C-4.086,0.755 -3.828,0.492 -3.51,0.492L-3.375,0.492C-3.057,0.492 -2.799,0.755 -2.799,1.078L-2.799,1.084ZM0.342,-3.059C0.035,-3.572 -0.451,-3.865 -0.451,-3.865L-3.658,-3.865C-3.658,-3.865 -4.144,-3.572 -4.451,-3.059C-4.757,-2.546 -4.881,-1.959 -4.881,-1.098L-4.881,1.43C-4.881,2.078 -4.379,2.603 -3.761,2.603L-0.349,2.603C0.27,2.603 0.773,2.078 0.773,1.43L0.773,-1.098C0.773,-1.959 0.647,-2.546 0.342,-3.059".toPathNodes()
private val path102 = "M-0.514,-0.629L1.437,-0.629L1.014,-1.244L-0.679,-1.03L-0.514,-0.629Z".toPathNodes()
private val path103 = "M-2.149,-0.96L-1.757,-0.96L-0.667,1.148L-0.893,1.468L-2.149,-0.96Z".toPathNodes()
private val path104 = "M-3.084,-0.348L-0.001,-0.348L0.18,0L-3.264,0L-3.084,-0.348Z".toPathNodes()
private val path105 = "M0,0.203L1.273,0.203C1.419,0.203 1.549,0.263 1.65,0.354L2.204,0.354C2.165,0.071 1.934,-0.151 1.644,-0.151L-0.331,-0.151C-0.621,-0.151 -0.851,0.071 -0.89,0.354L-0.376,0.354C-0.275,0.263 -0.146,0.203 0,0.203".toPathNodes()
private val path106 = "M0,0C0,-0.125 0.096,-0.225 0.216,-0.235L0.216,-0.313C0.183,-0.325 0.149,-0.334 0.113,-0.334L-0.122,-0.334C-0.304,-0.334 -0.451,-0.185 -0.451,0C-0.451,0.185 -0.304,0.334 -0.122,0.334L0.113,0.334C0.149,0.334 0.183,0.324 0.216,0.313L0.216,0.234C0.096,0.225 0,0.125 0,0".toPathNodes()
private val path107 = "M0,0C0,-0.125 -0.096,-0.225 -0.217,-0.235L-0.217,-0.313C-0.183,-0.325 -0.149,-0.334 -0.113,-0.334L0.122,-0.334C0.303,-0.334 0.45,-0.185 0.45,0C0.45,0.185 0.303,0.334 0.122,0.334L-0.113,0.334C-0.149,0.334 -0.183,0.324 -0.217,0.313L-0.217,0.234C-0.096,0.225 0,0.125 0,0".toPathNodes()
private val path117 = "M0,9.139C0,9.785 -0.517,10.311 -1.152,10.311L-10.184,10.311C-10.819,10.311 -11.336,9.785 -11.336,9.139L-11.336,0.002C-11.336,-0.646 -10.819,-1.172 -10.184,-1.172L-1.152,-1.172C-0.517,-1.172 0,-0.646 0,0.002L0,9.139Z".toPathNodes()
private val path118 = "M0,-1.262L-4.107,-1.262C-4.107,-1.262 -4.287,-2.629 -3.391,-3.368L-0.717,-3.368C0.18,-2.629 0,-1.262 0,-1.262M-0.021,1.085L-1.311,1.085L-1.311,1.079C-1.311,0.755 -1.051,0.492 -0.733,0.492L-0.599,0.492C-0.279,0.492 -0.021,0.755 -0.021,1.079L-0.021,1.085ZM-2.799,1.085L-4.086,1.085L-4.086,1.079C-4.086,0.755 -3.828,0.492 -3.51,0.492L-3.375,0.492C-3.057,0.492 -2.799,0.755 -2.799,1.079L-2.799,1.085ZM0.342,-3.059C0.035,-3.572 -0.451,-3.865 -0.451,-3.865L-3.657,-3.865C-3.657,-3.865 -4.144,-3.572 -4.45,-3.059C-4.756,-2.546 -4.881,-1.959 -4.881,-1.098L-4.881,1.43C-4.881,2.078 -4.379,2.603 -3.76,2.603L-0.349,2.603C0.271,2.603 0.773,2.078 0.773,1.43L0.773,-1.098C0.773,-1.959 0.648,-2.546 0.342,-3.059".toPathNodes()
private val path123 = "M0,0.203L1.273,0.203C1.42,0.203 1.549,0.263 1.65,0.354L2.204,0.354C2.164,0.07 1.934,-0.151 1.645,-0.151L-0.33,-0.151C-0.621,-0.151 -0.851,0.07 -0.891,0.354L-0.377,0.354C-0.275,0.263 -0.146,0.203 0,0.203".toPathNodes()
private val path124 = "M0,0.001C0,-0.125 0.096,-0.224 0.216,-0.234L0.216,-0.313C0.183,-0.324 0.149,-0.334 0.112,-0.334L-0.122,-0.334C-0.304,-0.334 -0.45,-0.185 -0.45,0.001C-0.45,0.185 -0.304,0.335 -0.122,0.335L0.112,0.335C0.149,0.335 0.183,0.325 0.216,0.314L0.216,0.234C0.096,0.226 0,0.125 0,0.001".toPathNodes()
private val path125 = "M0,0.001C0,-0.125 -0.096,-0.224 -0.217,-0.234L-0.217,-0.313C-0.183,-0.324 -0.148,-0.334 -0.112,-0.334L0.122,-0.334C0.303,-0.334 0.451,-0.185 0.451,0.001C0.451,0.185 0.303,0.335 0.122,0.335L-0.112,0.335C-0.148,0.335 -0.183,0.325 -0.217,0.314L-0.217,0.234C-0.096,0.226 0,0.125 0,0.001".toPathNodes()
private val path126 = "M0,14.466C-0.456,14.928 -1.193,14.938 -1.645,14.49L-8.07,8.145C-8.522,7.696 -8.52,6.96 -8.064,6.5L-1.643,-0.001C-1.188,-0.461 -0.452,-0.472 0,-0.023L6.424,6.322C6.877,6.77 6.876,7.506 6.421,7.967L0,14.466Z".toPathNodes()
private val path127 = "M0,1.616L-1.463,0.172L-2.924,-1.271C-2.924,-1.271 -2.09,-2.37 -0.933,-2.267C-0.563,-1.902 -0.235,-1.577 0.02,-1.328C0.271,-1.077 0.6,-0.753 0.97,-0.388C1.088,0.769 0,1.616 0,1.616M-1.665,3.269L-2.582,2.364L-2.577,2.36C-2.352,2.131 -1.981,2.125 -1.756,2.347L-1.66,2.443C-1.434,2.668 -1.436,3.036 -1.661,3.265L-1.665,3.269ZM-3.641,1.318L-4.557,0.413L-4.553,0.409C-4.326,0.179 -3.957,0.174 -3.73,0.397L-3.635,0.492C-3.408,0.716 -3.41,1.084 -3.637,1.314L-3.641,1.318ZM1.505,0.578C1.646,-0.002 1.508,-0.553 1.508,-0.553L0.366,-1.679L-0.773,-2.806C-0.773,-2.806 -1.326,-2.939 -1.904,-2.79C-2.483,-2.64 -2.982,-2.311 -3.589,-1.697C-4.193,-1.084 -5.107,-0.159 -5.107,-0.159L-5.365,0.101C-5.82,0.561 -5.832,1.288 -5.393,1.723L-4.18,2.922L-2.965,4.121C-2.525,4.555 -1.798,4.535 -1.344,4.075L-1.086,3.814C-1.086,3.814 -0.172,2.889 0.434,2.276C1.039,1.663 1.361,1.159 1.505,0.578".toPathNodes()
private val path128 = "M-1.747,-0.725L0.204,-0.725L-0.218,-0.11L-1.913,-0.324L-1.747,-0.725Z".toPathNodes()
private val path129 = "M-1.347,-0.564L0.606,-0.564L0.182,-1.18L-1.509,-0.966L-1.347,-0.564Z".toPathNodes()
private val path130 = "M-1.622,-0.154L-1.23,-0.154L-0.133,1.948L-0.358,2.269L-1.622,-0.154Z".toPathNodes()
private val path131 = "M-2.825,0.634L0.258,0.634L0.438,0.98L-3.005,0.98L-2.825,0.634Z".toPathNodes()
private val path132 = "M0,-0.965L0.904,-0.07C1.009,0.032 1.059,0.166 1.066,0.302L1.461,0.691C1.632,0.462 1.624,0.141 1.418,-0.063L0.014,-1.45C-0.193,-1.654 -0.513,-1.656 -0.74,-1.483L-0.375,-1.122C-0.238,-1.116 -0.104,-1.068 0,-0.965".toPathNodes()
private val path133 = "M0,0.074C0.088,-0.015 0.227,-0.019 0.318,0.06L0.374,0.004C0.359,-0.028 0.342,-0.059 0.315,-0.083L0.148,-0.248C0.02,-0.376 -0.191,-0.372 -0.32,-0.243C-0.45,-0.111 -0.45,0.098 -0.321,0.227L-0.154,0.391C-0.128,0.417 -0.097,0.434 -0.066,0.45L-0.01,0.393C-0.09,0.302 -0.088,0.163 0,0.074".toPathNodes()
private val path134 = "M0,-0.076C0.088,-0.164 0.09,-0.303 0.01,-0.395L0.064,-0.45C0.097,-0.434 0.129,-0.417 0.153,-0.393L0.32,-0.227C0.449,-0.101 0.449,0.111 0.319,0.24C0.189,0.373 -0.02,0.374 -0.148,0.246L-0.316,0.082C-0.342,0.058 -0.359,0.028 -0.375,-0.006L-0.32,-0.061C-0.227,0.017 -0.088,0.013 0,-0.076".toPathNodes()
private val path144 = "M0,8.841C0,9.468 -0.522,9.977 -1.166,9.977L-15.843,9.977C-16.486,9.977 -17.009,9.468 -17.009,8.841L-17.009,0C-17.009,-0.627 -16.486,-1.136 -15.843,-1.136L-1.166,-1.136C-0.522,-1.136 0,-0.627 0,0L0,8.841Z".toPathNodes()
private val path145 = "M0,-5.664L-1.194,-5.664L-2.37,-1.862L-3.545,-5.664L-4.74,-5.664L-6.552,0L-5.438,0L-4.122,-3.802L-2.888,0L-1.853,0L-0.617,-3.802L0.697,0L1.813,0L0,-5.664Z".toPathNodes()
private val path146 = "M0,8.842C0,9.469 -0.522,9.977 -1.166,9.977L-15.842,9.977C-16.486,9.977 -17.008,9.469 -17.008,8.842L-17.008,0C-17.008,-0.627 -16.486,-1.135 -15.842,-1.135L-1.166,-1.135C-0.522,-1.135 0,-0.627 0,0L0,8.842Z".toPathNodes()
private val path147 = "M0,-5.664L-1.194,-5.664L-2.37,-1.862L-3.544,-5.664L-4.74,-5.664L-6.552,0L-5.437,0L-4.122,-3.802L-2.888,0L-1.853,0L-0.617,-3.802L0.697,0L1.813,0L0,-5.664Z".toPathNodes()
private val path148 = "M0,9.729C0,10.125 -0.32,10.445 -0.716,10.445L-10.484,10.445C-10.88,10.445 -11.2,10.125 -11.2,9.729L-11.2,0C-11.2,-0.396 -10.88,-0.716 -10.484,-0.716L-0.716,-0.716C-0.32,-0.716 0,-0.396 0,0L0,9.729Z".toPathNodes()
private val path149 = "M0,9.094C0,9.739 -0.522,10.262 -1.166,10.262L-15.845,10.262C-16.488,10.262 -17.01,9.739 -17.01,9.094L-17.01,0C-17.01,-0.646 -16.488,-1.168 -15.845,-1.168L-1.166,-1.168C-0.522,-1.168 0,-0.646 0,0L0,9.094Z".toPathNodes()
private val path150 = "M0,-5.826L-1.195,-5.826L-2.371,-1.916L-3.545,-5.826L-4.74,-5.826L-6.553,0L-5.438,0L-4.123,-3.911L-2.888,0L-1.853,0L-0.617,-3.911L0.697,0L1.813,0L0,-5.826Z".toPathNodes()
private val path151 = "M0,10.013C0,10.42 -0.332,10.75 -0.74,10.75L-10.841,10.75C-11.25,10.75 -11.581,10.42 -11.581,10.013L-11.581,0C-11.581,-0.407 -11.25,-0.737 -10.841,-0.737L-0.74,-0.737C-0.332,-0.737 0,-0.407 0,0L0,10.013Z".toPathNodes()
private val path152 = "M0,0L-0.623,-0.732L-0.623,-4.69L8.758,-4.69L8.758,-0.732L8.135,0L8.758,0.732L8.758,4.69L-0.623,4.69L-0.623,0.732L0,0Z".toPathNodes()
private val path153 = "M0,9.799C0,10.196 -0.32,10.52 -0.715,10.52L-10.473,10.52C-10.867,10.52 -11.188,10.196 -11.188,9.799L-11.188,0C-11.188,-0.397 -10.867,-0.721 -10.473,-0.721L-0.715,-0.721C-0.32,-0.721 0,-0.397 0,0L0,9.799Z".toPathNodes()
private val path154 = "M0,9.668C0,10.062 -0.319,10.38 -0.712,10.38L-10.429,10.38C-10.821,10.38 -11.14,10.062 -11.14,9.668L-11.14,-0.001C-11.14,-0.395 -10.821,-0.712 -10.429,-0.712L-0.712,-0.712C-0.319,-0.712 0,-0.395 0,-0.001L0,9.668Z".toPathNodes()
private val path155 = "M0,-28.179L0,-20.521C0,-12.977 -3.254,-5.631 -8.07,0".toPathNodes()
private val path156 = "M-1.537-3.716 8.986-3.716M-1.537-3.716 8.986-3.716".toPathNodes()
private val path157 = "M0,273.296L0,258.779C0,255.836 -0.894,253.207 -2.731,250.745C-4.733,248.063 -11.938,241.036 -15.401,237.659C-20.398,232.786 -47.858,205.328 -48.135,205.051L-74.231,179.027C-77.7,175.017 -79.247,170.52 -79.247,164.445L-79.247,138.82C-79.247,132.602 -76.421,128.502 -72.177,124.258C-67.971,120.052 -43.003,95.291 -42.751,95.041C-39.761,92.117 -38.122,88.285 -38.122,84.237L-38.122,0".toPathNodes()
private val path158 = "M-8.962,0L0,0".toPathNodes()
private val path159 = "M0,358.476L0,319.643C0,313.474 2.836,310.744 5.115,308.548C5.384,308.281 35.698,278.109 38.519,275.363C42.675,271.318 45.718,271.027 50.235,271.027L116.49,271.027C120.535,271.027 121.671,269.89 122.874,268.689C135.81,255.402 160.741,229.765 162.322,228.021C163.998,226.171 164.337,225.441 164.337,223.679L164.337,164.208C164.337,157.726 167.298,154.847 169.677,152.533L169.948,152.269C171.846,150.419 277.352,44.837 298.481,23.69L299.002,23.17C300.856,21.379 301.668,20.144 301.668,17.475L301.668,0".toPathNodes()
private val path160 = "M0,358.476L0,319.643C0,314.665 2.164,312.581 4.258,310.566C5.485,309.343 34.943,280.026 37.672,277.37C41.15,273.984 43.412,273.827 47.436,273.827L113.69,273.827C118.895,273.827 120.646,272.076 122.054,270.668C134.999,257.372 159.964,231.703 161.597,229.902C163.491,227.81 164.337,226.415 164.337,223.679L164.337,164.208C164.337,158.908 166.622,156.687 168.831,154.538L169.097,154.281C171.149,152.279 292.898,30.437 298.08,25.251L298.182,25.15C300.39,23.018 301.668,21.079 301.668,17.475L301.668,0".toPathNodes()
private val path161 = "M0,-358.476L0,-341.001C0,-336.438 -1.721,-333.842 -4.341,-331.312C-5.61,-330.041 -131.308,-204.246 -133.421,-202.185L-133.685,-201.93C-135.802,-199.872 -137.331,-198.385 -137.331,-194.268L-137.331,-134.797C-137.331,-131.034 -138.699,-129.009 -140.797,-126.694C-142.895,-124.38 -180.435,-85.828 -180.435,-85.828C-182.171,-84.092 -184.557,-81.85 -190.777,-81.85L-257.032,-81.85C-260.721,-81.85 -262.094,-81.775 -264.843,-79.1C-267.592,-76.424 -298.26,-45.901 -298.26,-45.901C-300.213,-44.02 -301.668,-42.625 -301.668,-38.833L-301.668,0".toPathNodes()
private val path162 = "M0,483.298L0,477.902C0,474.245 0.258,471.662 -2.162,468.007C-4.582,464.352 -10.443,458.867 -12.701,456.662C-14.959,454.457 -60.182,409.184 -60.182,409.184C-62.332,406.656 -63.838,404.022 -63.838,399.398L-63.838,289.921C-63.838,284.976 -65.182,282.179 -68.408,279.06C-71.635,275.943 -112.447,235.831 -112.447,235.831C-115.941,231.905 -117.662,228.894 -117.662,223.679L-117.662,164.208C-117.662,161.144 -116.749,160.392 -114.598,158.294C-112.446,156.197 14.509,29.143 14.509,29.143C17.628,26.131 19.669,22.798 19.669,17.474L19.669,0".toPathNodes()
private val path163 = "M0,278.102L0,203.119C0,196.099 2.713,190.834 7.02,186.899C11.327,182.963 16.221,180.252 23.027,180.252L117.899,180.252C124.707,180.252 130.291,176.423 132.949,173.71C132.949,173.71 152.573,154.034 158.051,148.609C163.528,143.184 169.06,140.74 174.75,140.74L414.64,140.74C421.181,140.74 427.083,146.908 427.083,146.908C427.083,146.908 467.817,185.092 471.54,188.23C475.263,191.368 480.263,193.124 484.836,193.124L583.271,193.124C594.97,193.124 599.598,186.159 604.703,180.999L723.673,61.93C730.277,55.284 738.703,46.753 738.787,46.673L738.911,46.546C743.202,41.891 745.527,38.039 745.527,31.024L745.527,0".toPathNodes()
private val path164 = "M0,235.489L-102.521,235.489C-109.957,235.489 -112.137,233.199 -114.293,230.933C-115.56,229.668 -241.059,104.29 -248.588,96.637C-256.165,88.936 -261.361,89.219 -264.465,89.388C-264.816,89.407 -265.146,89.426 -265.459,89.426L-270.99,89.426C-277.011,89.426 -281.909,84.528 -281.909,78.508L-281.909,0".toPathNodes()
private val path165 = "M0,75.428L-210.512,75.428C-214.781,75.427 -218.229,75.428 -223.77,79.775L-223.989,79.967C-224.421,80.385 -267.19,121.831 -271.662,126.017C-276.946,130.962 -278.008,135.886 -278.008,142.227L-278.008,171.061C-278.008,176.3 -279.574,178.907 -283.083,182.724C-283.888,183.494 -291.889,191.158 -298.235,197.545C-303.512,202.855 -305.583,202.825 -309.015,202.772C-309.39,202.767 -309.772,202.761 -310.166,202.761L-364.083,202.761C-368.199,202.761 -371.433,200.289 -372.941,198.866C-372.941,198.866 -395.687,176.247 -400.644,171.289C-404.964,166.968 -405.783,163.599 -405.783,158.894L-405.783,115.102C-405.783,112.84 -406.863,111.532 -408.067,110.283C-408.501,109.833 -468.635,49.622 -470.655,47.782C-472.979,45.665 -474.518,45.523 -476.639,45.548L-519.375,45.552C-524.308,45.552 -527.676,42.716 -528.896,41.497C-532.042,38.351 -606.006,-37.026 -609.652,-40.801C-612.571,-43.825 -613.991,-46.937 -613.991,-50.315L-613.991,-80.065C-613.991,-83.37 -614.14,-84.067 -616.175,-86.352L-616.688,-86.923C-617.026,-87.259 -650.508,-120.68 -653.142,-123.437C-656.404,-126.851 -658.832,-127.427 -663.041,-127.427L-677.37,-127.427".toPathNodes()
private val path166 = "M0,-102.917L64.982,-38.086C66.704,-36.304 84.093,-18.568 102.313,0".toPathNodes()
private val path167 = "M0,-253.742L0,-175.235C0,-166.126 7.41,-158.716 16.519,-158.716L22.05,-158.716C22.458,-158.716 22.89,-158.738 23.348,-158.763C25.923,-158.902 29.125,-159.076 34.929,-153.177C42.476,-145.507 167.991,-20.114 169.208,-18.899C172.339,-15.608 175.901,-12.654 184.987,-12.654L270.032,-12.654C272.728,-12.654 275.397,-12.486 277.89,-9.817L287.729,0".toPathNodes()
private val path168 = "M0,238.289L-100.471,238.289C-108.971,238.289 -111.783,235.476 -114.221,232.914C-114.221,232.914 -240.908,106.351 -248.533,98.601C-256.158,90.851 -260.471,92.226 -263.408,92.226L-268.939,92.226C-276.516,92.226 -282.658,86.084 -282.658,78.508L-282.658,0".toPathNodes()
private val path169 = "M0,74.814L-210.375,74.814C-214.584,74.814 -217.208,74.772 -222.041,78.564C-222.041,78.564 -265.208,120.397 -269.749,124.647C-274.29,128.897 -275.208,133.022 -275.208,138.813L-275.208,167.647C-275.208,173.772 -277.166,177.022 -281.083,181.272C-281.083,181.272 -289.541,189.355 -296.249,196.105C-302.957,202.855 -305.875,202.147 -310.166,202.147L-364.083,202.147C-368.917,202.147 -372.708,199.522 -374.916,197.438C-374.916,197.438 -397.666,174.814 -402.624,169.855C-407.582,164.896 -408.583,160.73 -408.583,155.48L-408.583,111.688C-408.583,110.604 -408.958,109.98 -410.083,108.813C-411.208,107.646 -470.666,48.146 -472.541,46.437C-474.416,44.729 -475.249,44.938 -477.166,44.938L-519.375,44.938C-524.459,44.938 -528.5,42.438 -530.875,40.063C-533.25,37.688 -606.999,-37.438 -611.666,-42.27C-616.333,-47.104 -616.791,-51.437 -616.791,-53.729L-616.791,-83.479C-616.791,-86.479 -616.791,-86.229 -618.666,-88.354C-618.666,-88.354 -652.479,-122.104 -655.166,-124.916C-657.854,-127.729 -659.479,-128.041 -663.041,-128.041L-676.725,-128.041".toPathNodes()
private val path170 = "M0,-576.22C35.907,-540.34 65.416,-510.861 68.546,-507.734L68.63,-507.653C71.182,-505.308 72.587,-502.319 72.587,-499.235L72.587,-469.509C72.587,-466.36 73.25,-463.881 76.639,-460.532C79.567,-457.637 154.887,-380.59 155.619,-379.842C158.119,-377.21 161.107,-375.82 164.259,-375.82L206.247,-375.82C210.143,-375.82 213.392,-374.408 216.181,-371.508C219.786,-367.756 259.913,-327.753 273.099,-314.608L277.521,-310.198C279.169,-308.549 280.947,-305.407 280.947,-303.204L280.947,-258.063C280.947,-255.003 281.821,-252.74 283.87,-250.491C285.64,-248.549 324.764,-209.358 326.431,-207.689C329.317,-204.801 332.192,-204.196 334.096,-204.196L361.629,-204.196C363.36,-204.196 364.767,-203.553 366.056,-202.173L366.141,-202.086C366.156,-202.071 367.779,-200.475 375.614,-192.477C376.576,-191.485 377.845,-190.158 379.338,-188.598C382.965,-184.806 387.933,-179.613 393.033,-174.474C403.146,-164.288 413.84,-154.085 413.912,-154.017L443.973,-124.357C445.236,-122.902 445.236,-122.546 445.236,-121.411L445.236,-77.162C445.236,-76.314 445.631,-74.161 443.519,-72.008C441.406,-69.855 412.717,-39.86 412.651,-39.755C411.188,-38.333 409.889,-36.586 409.889,-33.783L409.889,0".toPathNodes()
private val path171 = "M0,-205.016L0,-154.522C0,-150.33 0.646,-145.374 5.439,-140.389C8.098,-137.624 85.864,-59.893 145.802,0".toPathNodes()
private val path172 = "M0,492.443L0,456.52C0,453.79 -0.659,452.16 -2.715,449.812L-33.024,419.895C-33.131,419.794 -43.771,409.642 -53.828,399.512C-58.893,394.411 -63.84,389.239 -67.451,385.464C-68.955,383.891 -70.232,382.555 -71.212,381.547C-78.527,374.077 -80.431,372.186 -80.73,371.89C-83.078,369.399 -85.93,368.136 -89.207,368.136L-116.74,368.136C-117.97,368.136 -119.217,367.512 -120.444,366.285C-131.759,354.952 -161.429,325.202 -162.827,323.669C-164.063,322.312 -164.289,321.325 -164.289,319.869L-164.289,274.727C-164.289,270.683 -166.915,266.214 -169.355,263.775L-173.783,259.358C-186.959,246.223 -227.054,206.252 -230.618,202.543C-234.465,198.541 -239.166,196.512 -244.589,196.512L-286.577,196.512C-288.572,196.512 -290.169,195.273 -291.185,194.204C-294.291,191.026 -367.298,116.345 -370.26,113.418C-372.649,111.056 -372.649,109.951 -372.649,108.422L-372.649,78.697C-372.649,74.046 -374.682,69.608 -378.374,66.195C-379.823,64.748 -408.743,35.855 -444.625,0".toPathNodes()
private val path173 = "M0,781.236L0,747.638C0,744.966 -0.958,743.084 -2.533,741.507C-2.533,741.507 -31.439,711.335 -33.392,709.382C-35.344,707.43 -35.377,705.787 -35.377,704.074L-35.377,659.825C-35.377,657.873 -35.72,656.879 -37.398,654.961L-67.534,625.226C-67.534,625.226 -78.19,615.066 -88.393,604.79C-95.573,597.556 -102.484,590.218 -105.789,586.81C-113.789,578.643 -115.312,577.151 -115.312,577.151C-117.264,575.062 -119.456,574.241 -121.784,574.241L-149.317,574.241C-152.022,574.241 -154.01,572.561 -155.003,571.568C-155.003,571.568 -195.727,530.776 -197.474,528.859C-199.221,526.942 -199.666,525.262 -199.666,523.173L-199.666,478.032C-199.666,474.916 -201.857,471.114 -203.912,469.059C-205.967,467.005 -260.967,412.207 -265.214,407.789C-269.461,403.371 -273.981,402.617 -277.166,402.617L-319.154,402.617C-322.202,402.617 -324.462,400.836 -325.764,399.466C-325.764,399.466 -401.826,321.659 -404.806,318.714C-407.785,315.768 -408.026,313.92 -408.026,311.727L-408.026,282.002C-408.026,278.441 -409.498,274.638 -412.889,271.521C-412.889,271.521 -617.477,67.138 -621.757,62.686C-626.038,58.235 -626.415,53.919 -626.415,50.494L-626.415,0".toPathNodes()
private val path174 = "M0,-199.664L0,-139.48C0,-134.685 -2.777,-129.935 -5.358,-127.549C-7.436,-125.629 -72.01,-60.663 -76.488,-55.793C-80.095,-51.872 -80.834,-48.685 -80.834,-45.105L-80.834,0".toPathNodes()
private val path175 = "M0,481.618L0,467.101C0,463.184 -1.328,460.017 -3.287,457.392C-5.246,454.767 -11.204,448.893 -16.246,443.976C-21.288,439.059 -48.955,411.392 -48.955,411.392L-74.913,385.517C-77.58,382.434 -79.246,378.725 -79.246,372.767L-79.246,347.142C-79.246,342.226 -77.246,338.809 -72.996,334.559C-68.746,330.309 -43.58,305.351 -43.58,305.351C-39.871,301.726 -38.121,297.142 -38.121,292.559L-38.121,154.559C-38.121,150.642 -37.33,146.642 -33.038,141.976C-28.746,137.309 36.044,72.101 38.253,70.059C40.462,68.017 42.712,64.018 42.712,60.184L42.712,0".toPathNodes()
private val path176 = "M-11.658,0L0,0".toPathNodes()
private val path177 = "M0,5.44C0,7.276 -1.488,8.764 -3.324,8.764C-5.16,8.764 -6.648,7.276 -6.648,5.44L-6.648,0.001C-6.648,-1.835 -5.16,-3.324 -3.324,-3.324C-1.488,-3.324 0,-1.835 0,0.001L0,5.44Z".toPathNodes()
private val path178 = "M0,8.535C-1.281,9.849 -3.387,9.877 -4.701,8.596C-6.016,7.314 -6.043,5.209 -4.761,3.894L-0.965,-0.001C0.317,-1.315 2.422,-1.342 3.736,-0.061C5.051,1.221 5.078,3.326 3.797,4.64L0,8.535Z".toPathNodes()
private val path180 = "M0.0,0.0 a 5.896,5.896 0 1,0 11.792,0 a 5.896,5.896 0 1,0 -11.792,0".toPathNodes()
private val path181 = "M-23.424,0L0,0".toPathNodes()
private val path182 = "M-75.027,-281.107L69.733,-281.107C79.089,-281.107 85.851,-281.292 92.977,-274.472C100.105,-267.652 272.099,-95.34 272.099,-95.34C274.431,-93.09 281.107,-88.257 281.107,-74.84".toPathNodes()
private val path183 = "M0,489.751L30.675,489.751C39.009,489.751 45.746,491.033 56.917,478.977C68.087,466.92 151.778,383.404 151.778,383.404C157.186,378.616 160.022,376.106 171.548,376.106L314.549,376.106C320.134,376.106 326.783,376.844 334.763,385C342.742,393.156 388.842,439.611 388.842,439.611C392.831,443.866 397.53,447.078 409.41,447.078L501.875,447.078C511.894,447.078 519.164,443.688 525.725,437.127C532.285,430.566 589.606,373.647 589.606,373.647C593.016,369.924 595.248,365.489 595.248,354.407L595.248,249.972C595.248,240.929 595.678,234.899 608.354,222.487C621.031,210.075 683.979,147.042 683.979,147.042C687.525,143.585 691.634,138.265 691.634,128.513L691.634,-1.282".toPathNodes()
private val path184 = "M0,-626.702L0,-600.226C0,-592.01 -0.168,-587.975 7.271,-579.905C14.712,-571.835 205.494,-381.431 205.494,-381.431C210.286,-376.386 212.491,-373.74 212.491,-364.66L212.491,-283.25C212.491,-278.033 209.783,-274.376 204.991,-269.08C200.199,-263.785 180.332,-244.331 180.332,-244.331C177.145,-241.144 172.707,-236.797 172.707,-228.394L172.707,-133.894C172.707,-126.331 172.52,-118.144 181.832,-108.581C191.145,-99.019 284.02,-6.394 284.02,-6.394C288.082,-2.456 291.27,0 299.52,0L525.895,0".toPathNodes()
private val path185 = "M0,-59.64L-31.708,-59.64C-42.603,-59.64 -47.566,-58.15 -54.253,-50.815C-60.941,-43.48 -104.933,0 -104.933,0".toPathNodes()
private val path186 = "M0,-2.237C-5.309,3.966 -12.516,8.085 -19.358,8.085L-107.596,8.085C-113.528,8.085 -118.059,8.202 -123.775,2.376C-129.492,-3.448 -135.699,-10.439 -146.403,-10.439L-253.42,-10.439".toPathNodes()
private val path187 = "M0,-274.85L0,-171.511C0,-160.833 -3.253,-158.458 -10.156,-151.339C-17.06,-144.22 -100.804,-60.798 -101.195,-60.515C-103.138,-58.465 -109.039,-53.071 -109.039,-44.874L-109.039,0".toPathNodes()
private val path188 = "M-65.442,65.442L65.442,65.442".toPathNodes()
private val path189 = "M0,-693.874L0,-501.255C0,-491.653 0.473,-485.547 -6.152,-479.297C-12.777,-473.047 -44.976,-440.213 -44.976,-440.213C-44.976,-440.213 -52.027,-432.384 -65.027,-432.384L-119.152,-432.384C-129.652,-432.384 -150.887,-427.547 -150.887,-403.993L-150.887,-364.422C-150.887,-352.797 -160.277,-335.901 -179.402,-335.901L-272.527,-335.901C-276.402,-335.901 -281.742,-337.871 -289.072,-345.147C-296.402,-352.422 -302.027,-358.047 -302.027,-358.047C-305.652,-361.672 -312.13,-364.436 -319.402,-364.436L-468.902,-364.436C-475.152,-364.436 -479.652,-364.047 -488.277,-355.047C-496.902,-346.047 -496.777,-342.422 -496.777,-331.797C-496.777,-321.172 -495.203,-314.231 -505.115,-304.639C-515.027,-295.047 -634.95,-174.971 -634.95,-174.971C-641.152,-168.047 -644.253,-165.797 -644.253,-152.047L-644.253,-46.589C-644.253,-41.297 -642.777,-35.797 -634.652,-27.797C-626.527,-19.797 -607.234,0 -607.234,0".toPathNodes()
private val path190 = "M0,62.563L18.301,62.563C23.676,62.563 30.926,63.434 41.801,52.032C52.676,40.629 78.676,15.129 78.676,15.129C82.176,11.754 86.325,9.129 86.325,-0.871".toPathNodes()
private val path192 = "M0.0,0.0 a 5.948,5.948 0 1,0 11.896,0 a 5.948,5.948 0 1,0 -11.896,0".toPathNodes()
private val path194 = "M0.0,0.0 a 6.058,6.058 0 1,0 12.116,0 a 6.058,6.058 0 1,0 -12.116,0".toPathNodes()
private val path196 = "M0.0,0.0 a 6.058,6.058 0 1,0 12.116,0 a 6.058,6.058 0 1,0 -12.116,0".toPathNodes()
private val path204 = "M-5.895,-5.897C-9.13,-5.897 -11.752,-3.256 -11.752,-0.001C-11.752,3.256 -9.13,5.895 -5.895,5.895C-2.661,5.895 -0.04,3.256 -0.04,-0.001C-0.04,-3.256 -2.661,-5.897 -5.895,-5.897".toPathNodes()
private val path205 = "M0.0,0.0 a 5.896,5.896 0 1,0 11.792,0 a 5.896,5.896 0 1,0 -11.792,0".toPathNodes()
private val path207 = "M0.0,0.0 a 5.896,5.896 0 1,0 11.792,0 a 5.896,5.896 0 1,0 -11.792,0".toPathNodes()
private val path209 = "M0.0,0.0 a 5.948,5.948 0 1,0 11.896,0 a 5.948,5.948 0 1,0 -11.896,0".toPathNodes()
private val path211 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path213 = "M0.0,0.0 a 3.342,3.342 0 1,0 6.684,0 a 3.342,3.342 0 1,0 -6.684,0".toPathNodes()
private val path214 = "M-9.354,-9.354L9.354,-9.354".toPathNodes()
private val path216 = "M0.0,0.0 a 3.342,3.342 0 1,0 6.684,0 a 3.342,3.342 0 1,0 -6.684,0".toPathNodes()
private val path217 = "M-6.025,-6.025C-9.33,-6.025 -12.008,-3.326 -12.008,-0.001C-12.008,3.329 -9.33,6.025 -6.025,6.025C-2.72,6.025 -0.041,3.329 -0.041,-0.001C-0.041,-3.326 -2.72,-6.025 -6.025,-6.025".toPathNodes()
private val path218 = "M0.0,0.0 a 6.025,6.025 0 1,0 12.05,0 a 6.025,6.025 0 1,0 -12.05,0".toPathNodes()
private val path219 = "M-5.754,-5.754C-8.91,-5.754 -11.468,-3.178 -11.468,0C-11.468,3.179 -8.91,5.754 -5.754,5.754C-2.598,5.754 -0.04,3.179 -0.04,0C-0.04,-3.178 -2.598,-5.754 -5.754,-5.754".toPathNodes()
private val path220 = "M0.0,0.0 a 5.754,5.754 0 1,0 11.508,0 a 5.754,5.754 0 1,0 -11.508,0".toPathNodes()
private val path223 = "M0,0C0,1.773 -1.438,3.213 -3.212,3.213L-12.045,3.213C-13.819,3.213 -15.258,1.773 -15.258,0C-15.258,-1.773 -13.819,-3.213 -12.045,-3.213L-3.212,-3.213C-1.438,-3.213 0,-1.773 0,0".toPathNodes()
private val path224 = "M0,0C0,1.773 -1.438,3.213 -3.212,3.213L-12.045,3.213C-13.819,3.213 -15.258,1.773 -15.258,0C-15.258,-1.773 -13.819,-3.213 -12.045,-3.213L-3.212,-3.213C-1.438,-3.213 0,-1.773 0,0Z".toPathNodes()
private val path225 = "M0,10.725C-1.246,11.987 -3.28,11.998 -4.542,10.752L-10.826,4.544C-12.088,3.297 -12.101,1.263 -10.854,0.001C-9.607,-1.261 -7.572,-1.273 -6.311,-0.026L-0.026,6.182C1.234,7.428 1.247,9.462 0,10.725".toPathNodes()
private val path226 = "M0,10.725C-1.246,11.987 -3.28,11.998 -4.542,10.752L-10.826,4.544C-12.088,3.297 -12.101,1.263 -10.854,0.001C-9.607,-1.261 -7.572,-1.273 -6.311,-0.026L-0.026,6.182C1.234,7.428 1.247,9.462 0,10.725Z".toPathNodes()
private val path227 = "M0,-12.66C1.26,-11.41 1.265,-9.376 0.014,-8.119L-8.076,-0.012C-9.328,1.245 -11.363,1.252 -12.62,0.001C-13.878,-1.251 -13.881,-3.288 -12.631,-4.545L-4.541,-12.65C-3.29,-13.906 -1.257,-13.912 0,-12.66".toPathNodes()
private val path228 = "M0,-12.66C1.26,-11.41 1.265,-9.376 0.014,-8.119L-8.076,-0.012C-9.328,1.245 -11.363,1.252 -12.62,0.001C-13.878,-1.251 -13.881,-3.288 -12.631,-4.545L-4.541,-12.65C-3.29,-13.906 -1.257,-13.912 0,-12.66Z".toPathNodes()
private val path229 = "M0,-9.355C1.772,-9.395 3.244,-7.988 3.282,-6.214L3.29,-3.282C3.328,-1.508 1.922,-0.039 0.147,0C-1.626,0.04 -3.096,-1.368 -3.134,-3.142L-3.144,-6.075C-3.18,-7.848 -1.774,-9.317 0,-9.355".toPathNodes()
private val path230 = "M0,-9.355C1.772,-9.395 3.244,-7.988 3.282,-6.214L3.29,-3.282C3.328,-1.508 1.922,-0.039 0.147,0C-1.626,0.04 -3.096,-1.368 -3.134,-3.142L-3.144,-6.075C-3.18,-7.848 -1.774,-9.317 0,-9.355Z".toPathNodes()
private val path232 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path233 = "M0,11.037C0,12.897 -1.508,14.404 -3.367,14.404C-5.227,14.404 -6.734,12.897 -6.734,11.037L-6.734,0C-6.734,-1.86 -5.227,-3.367 -3.367,-3.367C-1.508,-3.367 0,-1.86 0,0L0,11.037Z".toPathNodes()
private val path235 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path236 = "M0,-10.867C1.264,-9.623 1.279,-7.589 0.035,-6.325L-6.166,-0.033C-7.411,1.23 -9.445,1.245 -10.709,0.001C-11.973,-1.245 -11.987,-3.28 -10.742,-4.544L-4.543,-10.835C-3.297,-12.097 -1.264,-12.112 0,-10.867".toPathNodes()
private val path237 = "M0,-10.867C1.264,-9.623 1.279,-7.589 0.035,-6.325L-6.166,-0.033C-7.411,1.23 -9.445,1.245 -10.709,0.001C-11.973,-1.245 -11.987,-3.28 -10.742,-4.544L-4.543,-10.835C-3.297,-12.097 -1.264,-12.112 0,-10.867Z".toPathNodes()
private val path246 = "M0,-12.643C1.264,-11.399 1.279,-9.365 0.035,-8.101L-8.006,-0.034C-9.251,1.229 -11.285,1.245 -12.549,0.001C-13.813,-1.246 -13.827,-3.281 -12.582,-4.544L-4.543,-12.611C-3.297,-13.873 -1.264,-13.888 0,-12.643".toPathNodes()
private val path247 = "M0,-12.643C1.264,-11.399 1.279,-9.365 0.035,-8.101L-8.006,-0.034C-9.251,1.229 -11.285,1.245 -12.549,0.001C-13.813,-1.246 -13.827,-3.281 -12.582,-4.544L-4.543,-12.611C-3.297,-13.873 -1.264,-13.888 0,-12.643Z".toPathNodes()
private val path249 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path250 = "M-12.472,195.677L32.353,149.652L98.925,83.067C98.925,83.067 132.318,50.412 135.728,47.537C139.137,44.662 145.226,41.835 158.44,41.835L260.385,41.835C268.426,41.835 279.057,38.988 295.129,56.507C311.201,74.025 324.731,87.029 327.967,90.12C331.202,93.211 342.958,106.837 359.422,106.837L417.918,106.837C424.034,106.837 439.274,104.331 443.607,94.618C447.94,84.905 447.127,66.953 447.299,63.005C447.471,59.057 450.983,37.519 476.715,37.519L516.488,37.519C520.461,37.519 530.781,36.709 541.412,23.788C552.043,10.867 563.068,0 577.112,0C591.156,0 601.466,12.336 611.271,23.544C621.077,34.752 624.07,41.939 651.455,41.939L772.191,41.939".toPathNodes()
private val path252 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path254 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path255 = "M2.777,-2.777C1.244,-2.777 0.001,-1.534 0.001,-0.001C0.001,1.533 1.244,2.777 2.777,2.777C4.31,2.777 5.553,1.533 5.553,-0.001C5.553,-1.534 4.31,-2.777 2.777,-2.777".toPathNodes()
private val path256 = "M-26.428,11.138L4.694,11.138".toPathNodes()
private val path257 = "M-4.697,-4.696C-7.301,-4.696 -9.413,-2.593 -9.413,-0.001C-9.413,2.593 -7.301,4.697 -4.697,4.697C-2.092,4.697 0.02,2.593 0.02,-0.001C0.02,-2.593 -2.092,-4.696 -4.697,-4.696".toPathNodes()
private val path258 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path260 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path261 = "M0,-12.777C1.271,-11.539 1.295,-9.505 0.056,-8.236L-7.959,-0.054C-9.199,1.214 -11.233,1.24 -12.502,0C-13.771,-1.24 -13.794,-3.276 -12.556,-4.545L-4.541,-12.725C-3.302,-13.993 -1.269,-14.017 0,-12.777".toPathNodes()
private val path262 = "M0,-12.777C1.271,-11.539 1.295,-9.505 0.056,-8.236L-7.959,-0.054C-9.199,1.214 -11.233,1.24 -12.502,0C-13.771,-1.24 -13.794,-3.276 -12.556,-4.545L-4.541,-12.725C-3.302,-13.993 -1.269,-14.017 0,-12.777Z".toPathNodes()
private val path264 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path265 = "M0,-17.874C1.774,-17.887 3.222,-16.457 3.232,-14.684L3.285,-3.23C3.296,-1.457 1.866,-0.009 0.093,0.002C-1.682,0.013 -3.129,-1.419 -3.141,-3.192L-3.193,-14.645C-3.203,-16.417 -1.774,-17.864 0,-17.874".toPathNodes()
private val path266 = "M0,-17.874C1.774,-17.887 3.222,-16.457 3.232,-14.684L3.285,-3.23C3.296,-1.457 1.866,-0.009 0.093,0.002C-1.682,0.013 -3.129,-1.419 -3.141,-3.192L-3.193,-14.645C-3.203,-16.417 -1.774,-17.864 0,-17.874Z".toPathNodes()
private val path268 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path270 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path271 = "M0,-0.245C0.059,1.527 -1.333,3.011 -3.105,3.069L-6.039,3.108C-7.813,3.165 -9.296,1.774 -9.354,0.002C-9.411,-1.772 -8.02,-3.257 -6.246,-3.314L-3.313,-3.353C-1.541,-3.41 -0.058,-2.019 0,-0.245".toPathNodes()
private val path272 = "M0,-0.245C0.059,1.527 -1.333,3.011 -3.105,3.069L-6.039,3.108C-7.813,3.165 -9.296,1.774 -9.354,0.002C-9.411,-1.772 -8.02,-3.257 -6.246,-3.314L-3.313,-3.353C-1.541,-3.41 -0.058,-2.019 0,-0.245Z".toPathNodes()
private val path273 = "M0,6.663C-1.254,7.916 -3.287,7.914 -4.541,6.659L-6.573,4.543C-7.825,3.287 -7.824,1.253 -6.567,0C-5.313,-1.253 -3.278,-1.252 -2.024,0.005L0.008,2.119C1.259,3.376 1.257,5.409 0,6.663".toPathNodes()
private val path274 = "M0,6.663C-1.254,7.916 -3.287,7.914 -4.541,6.659L-6.573,4.543C-7.825,3.287 -7.824,1.253 -6.567,0C-5.313,-1.253 -3.278,-1.252 -2.024,0.005L0.008,2.119C1.259,3.376 1.257,5.409 0,6.663Z".toPathNodes()
private val path275 = "M4.579,-4.579C2.05,-4.579 -0,-2.529 -0,-0.001C-0,2.528 2.05,4.579 4.579,4.579C7.108,4.579 9.158,2.528 9.158,-0.001C9.158,-2.529 7.108,-4.579 4.579,-4.579".toPathNodes()
private val path276 = "M0.0,0.0 a 4.579,4.579 0 1,0 9.158,0 a 4.579,4.579 0 1,0 -9.158,0".toPathNodes()
private val path278 = "M0.0,0.0 a 3.287,3.287 0 1,0 6.574,0 a 3.287,3.287 0 1,0 -6.574,0".toPathNodes()
private val path280 = "M0.0,0.0 a 3.287,3.287 0 1,0 6.574,0 a 3.287,3.287 0 1,0 -6.574,0".toPathNodes()
private val path282 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path283 = "M0,-3.926C1.101,-2.825 1.138,-1.076 0.081,-0.019L-11.684,11.746C-12.741,12.803 -14.489,12.765 -15.592,11.664L-27.255,0.002C-28.356,-1.1 -28.393,-2.849 -27.336,-3.906L-15.571,-15.671C-14.514,-16.729 -12.766,-16.692 -11.664,-15.59L0,-3.926Z".toPathNodes()
private val path284 = "M0,10.268C0,12.128 -1.508,13.635 -3.367,13.635C-5.227,13.635 -6.734,12.128 -6.734,10.268L-6.734,0C-6.734,-1.859 -5.227,-3.367 -3.367,-3.367C-1.508,-3.367 0,-1.859 0,0L0,10.268Z".toPathNodes()
private val path286 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path288 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path289 = "M-11.159,0L0,0".toPathNodes()
private val path291 = "M0.0,0.0 a 5.896,5.896 0 1,0 11.792,0 a 5.896,5.896 0 1,0 -11.792,0".toPathNodes()
private val path292 = "M-9.828,9.828L9.828,9.828".toPathNodes()
private val path293 = "M0,10.155C-0.777,10.155 -1.554,9.855 -2.141,9.258L-5.926,5.403C-7.088,4.22 -7.07,2.321 -5.889,1.16C-4.707,0 -2.807,0.015 -1.646,1.198L2.14,5.052C3.301,6.235 3.283,8.134 2.102,9.296C1.518,9.869 0.758,10.155 0,10.155".toPathNodes()
private val path294 = "M0,10.155C-0.777,10.155 -1.553,9.855 -2.141,9.258L-5.926,5.403C-7.087,4.22 -7.07,2.321 -5.888,1.16C-4.707,0 -2.807,0.016 -1.646,1.198L2.141,5.052C3.301,6.235 3.284,8.134 2.102,9.296C1.518,9.869 0.759,10.155 0,10.155".toPathNodes()
private val path295 = "M0,10.156C-0.777,10.156 -1.553,9.856 -2.141,9.259L-5.926,5.404C-7.087,4.221 -7.07,2.322 -5.888,1.161C-4.707,0 -2.807,0.017 -1.646,1.199L2.141,5.053C3.301,6.236 3.284,8.135 2.102,9.297C1.518,9.87 0.759,10.156 0,10.156".toPathNodes()
private val path296 = "M0,10.075C-0.754,10.075 -1.51,9.793 -2.093,9.224L-5.963,5.456C-7.15,4.3 -7.176,2.401 -6.02,1.214C-4.865,0.028 -2.965,0 -1.777,1.157L2.093,4.926C3.279,6.082 3.305,7.98 2.149,9.168C1.562,9.771 0.781,10.075 0,10.075".toPathNodes()
private val path297 = "M0,11.403L-0.009,11.403C-1.666,11.398 -3.004,10.05 -3,8.394L-2.982,2.991C-2.979,1.337 -1.636,0 0.018,0L0.026,0C1.684,0.005 3.021,1.352 3.018,3.008L3,8.412C2.996,10.066 1.653,11.403 0,11.403".toPathNodes()
private val path300 = "M0,11.403C-1.657,11.403 -3,10.06 -3,8.403L-3,3C-3,1.342 -1.657,0 0,0C1.656,0 3,1.342 3,3L3,8.403C3,10.06 1.656,11.403 0,11.403".toPathNodes()
private val path304 = "M0,10.075C-0.781,10.075 -1.562,9.772 -2.149,9.168C-3.305,7.98 -3.279,6.082 -2.093,4.926L1.779,1.156C2.967,0 4.866,0.025 6.021,1.213C7.177,2.4 7.151,4.299 5.965,5.455L2.093,9.224C1.51,9.792 0.754,10.075 0,10.075".toPathNodes()
private val path305 = "M0,10.203C-0.749,10.203 -1.498,9.925 -2.08,9.364C-3.273,8.215 -3.31,6.315 -2.16,5.122L1.589,1.229C2.738,0.035 4.637,0 5.83,1.149C7.023,2.299 7.06,4.198 5.91,5.391L2.161,9.284C1.572,9.895 0.787,10.203 0,10.203".toPathNodes()
private val path306 = "M0,10.202C-0.749,10.202 -1.498,9.924 -2.08,9.363C-3.273,8.214 -3.31,6.314 -2.16,5.121L1.589,1.228C2.738,0.035 4.638,0 5.83,1.148C7.023,2.298 7.06,4.197 5.91,5.39L2.161,9.283C1.572,9.894 0.787,10.202 0,10.202".toPathNodes()
private val path307 = "M0.0,0.0 a 0.5,0.5 0 1,0 1.0,0 a 0.5,0.5 0 1,0 -1.0,0".toPathNodes()
private val path308 = "M0,-0.001C0,2.173 1.361,4.035 3.276,4.776C3.436,4.838 3.598,4.892 3.764,4.938L3.764,0.944L2.402,0.944C2.402,1.328 2.487,1.38 2.727,1.38L3.276,1.38L3.276,4.249C1.637,3.536 0.488,1.899 0.488,-0.001C0.488,-1.901 1.637,-3.538 3.276,-4.251L3.276,-3.577C3.276,-3.386 3.315,-3.298 3.588,-3.298L3.764,-3.298L3.764,-4.939C3.598,-4.894 3.436,-4.84 3.276,-4.778C1.361,-4.037 0,-2.175 0,-0.001".toPathNodes()
private val path309 = "M0,-9.48C-0.159,-9.545 -0.322,-9.603 -0.488,-9.652L-0.488,-6.173C-0.488,-5.676 -0.359,-5.688 -0.208,-5.688L0,-5.688L0,-8.948C1.588,-8.213 2.694,-6.604 2.694,-4.74C2.694,-2.876 1.588,-1.266 0,-0.531L0,-1.478C-0.375,-1.478 -0.488,-1.433 -0.488,-1.225L-0.488,0.172C-0.322,0.124 -0.159,0.066 0,0C1.864,-0.765 3.182,-2.6 3.182,-4.74C3.182,-6.879 1.864,-8.715 0,-9.48".toPathNodes()
private val path310 = "M0,-0.147C-0.392,-0.965 -1.119,-2.487 -0.041,-4.904L-0.486,-5.104C-1.657,-2.48 -0.866,-0.826 -0.44,0.063L-0.415,0.116C0.099,1.194 0.287,2.068 0.175,2.868C0.04,3.84 -0.408,4.727 -0.412,4.736L0.022,4.957C0.042,4.919 0.511,3.991 0.659,2.935C0.822,1.755 0.376,0.642 0.025,-0.094L0,-0.147Z".toPathNodes()
private val path312 = "M0.0,0.0 a 4.696,4.696 0 1,0 9.392,0 a 4.696,4.696 0 1,0 -9.392,0".toPathNodes()
private val path313 = "M0,-15.84C1.271,-14.602 1.295,-12.568 0.056,-11.299L-11.241,-0.054C-12.481,1.215 -14.516,1.24 -15.784,0.001C-17.054,-1.239 -17.076,-3.276 -15.838,-4.544L-4.541,-15.788C-3.302,-17.056 -1.269,-17.08 0,-15.84".toPathNodes()
private val path314 = "M0,-15.84C1.271,-14.602 1.295,-12.568 0.056,-11.299L-11.241,-0.054C-12.481,1.215 -14.516,1.24 -15.784,0.001C-17.054,-1.239 -17.076,-3.276 -15.838,-4.544L-4.541,-15.788C-3.302,-17.056 -1.269,-17.08 0,-15.84Z".toPathNodes()

private fun String.toPathNodes(): List<PathNode> = PathParser().parsePathString(this).toNodes()
