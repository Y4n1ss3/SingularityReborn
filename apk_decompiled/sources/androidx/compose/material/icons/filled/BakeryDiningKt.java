package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BakeryDiningKt {
    private static ImageVector _bakeryDining;

    public static final ImageVector getBakeryDining(Icons.Filled filled) {
        ImageVector imageVector = _bakeryDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BakeryDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.28f, 16.34f);
        b.curveTo(18.07f, 15.45f, 17.46f, 15.0f, 17.46f, 15.0f);
        b.reflectiveCurveToRelative(0.32f, -0.59f, 0.96f, -1.78f);
        b.curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0.0f);
        b.lineToRelative(0.81f, 1.26f);
        b.curveToRelative(0.19f, 0.3f, 0.21f, 0.68f, 0.06f, 1.0f);
        b.lineToRelative(-0.22f, 0.47f);
        b.curveTo(20.42f, 16.49f, 19.76f, 16.67f, 19.28f, 16.34f);
        b.close();
        b.moveTo(4.72f, 16.34f);
        b.curveToRelative(-0.48f, 0.33f, -1.13f, 0.15f, -1.39f, -0.38f);
        b.lineTo(3.1f, 15.49f);
        b.curveToRelative(-0.15f, -0.32f, -0.13f, -0.7f, 0.06f, -1.0f);
        b.lineToRelative(0.81f, -1.26f);
        b.curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0.0f);
        b.curveTo(6.22f, 14.41f, 6.54f, 15.0f, 6.54f, 15.0f);
        b.reflectiveCurveTo(5.93f, 15.45f, 4.72f, 16.34f);
        b.close();
        b.moveTo(15.36f, 9.37f);
        b.curveToRelative(0.09f, -0.68f, 0.73f, -1.06f, 1.27f, -0.75f);
        b.lineToRelative(1.59f, 0.9f);
        b.curveToRelative(0.46f, 0.26f, 0.63f, 0.91f, 0.36f, 1.41f);
        b.lineTo(16.5f, 15.0f);
        gy.n(b, -1.8f, 15.36f, 9.37f);
        b.moveTo(8.63f, 9.37f);
        b.lineTo(9.3f, 15.0f);
        b.horizontalLineTo(7.5f);
        b.lineToRelative(-2.09f, -4.08f);
        b.curveToRelative(-0.27f, -0.5f, -0.1f, -1.15f, 0.36f, -1.41f);
        b.lineToRelative(1.59f, -0.9f);
        b.curveTo(7.89f, 8.31f, 8.54f, 8.69f, 8.63f, 9.37f);
        af0.l(b, 13.8f, 15.0f, -3.6f);
        b.lineTo(9.46f, 8.12f);
        b.curveTo(9.39f, 7.53f, 9.81f, 7.0f, 10.34f, 7.0f);
        b.horizontalLineToRelative(3.3f);
        b.curveToRelative(0.53f, 0.0f, 0.94f, 0.53f, 0.88f, 1.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 13.8f, 15.0f), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bakeryDining = build;
        build.getClass();
        return build;
    }
}
