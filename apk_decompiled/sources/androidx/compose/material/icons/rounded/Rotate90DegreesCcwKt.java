package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rotate90DegreesCcwKt {
    private static ImageVector _rotate90DegreesCcw;

    public static final ImageVector getRotate90DegreesCcw(Icons.Rounded rounded) {
        ImageVector imageVector = _rotate90DegreesCcw;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rotate90DegreesCcw", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(5.93f, 7.83f, -3.65f, 3.66f);
        e.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        e.lineToRelative(3.66f, 3.66f);
        e.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        e.lineToRelative(3.66f, -3.65f);
        e.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        e.lineTo(8.76f, 7.82f);
        e.curveToRelative(-0.79f, -0.78f, -2.05f, -0.78f, -2.83f, 0.01f);
        k4.x(e, 4.4f, 12.19f, 2.25f, -2.25f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, 0.0f);
        e.lineToRelative(2.24f, 2.24f);
        e.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(-2.25f, 2.25f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f);
        e.lineTo(4.4f, 13.61f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f);
        e.close();
        e.moveTo(19.36f, 6.64f);
        e.curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f);
        e.verticalLineToRelative(-0.83f);
        e.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        e.lineTo(9.47f, 4.29f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(1.83f, 1.83f);
        e.curveToRelative(0.62f, 0.63f, 1.7f, 0.19f, 1.7f, -0.7f);
        e.lineTo(13.0f, 6.0f);
        e.curveToRelative(2.02f, 0.0f, 4.03f, 0.86f, 5.45f, 2.61f);
        e.curveToRelative(2.05f, 2.52f, 2.05f, 6.27f, 0.0f, 8.79f);
        e.curveTo(17.03f, 19.14f, 15.02f, 20.0f, 13.0f, 20.0f);
        e.curveToRelative(-0.78f, 0.0f, -1.55f, -0.13f, -2.29f, -0.39f);
        e.curveToRelative(-0.36f, -0.12f, -0.75f, -0.01f, -1.02f, 0.26f);
        e.curveToRelative(-0.5f, 0.5f, -0.34f, 1.39f, 0.34f, 1.62f);
        e.curveToRelative(0.96f, 0.34f, 1.96f, 0.51f, 2.97f, 0.51f);
        e.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        e.curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCcw = build;
        build.getClass();
        return build;
    }
}
