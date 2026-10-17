package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SurroundSoundKt {
    private static ImageVector _surroundSound;

    public static final ImageVector getSurroundSound(Icons.Filled filled) {
        ImageVector imageVector = _surroundSound;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SurroundSound", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 4.0f, 4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(i, 7.76f, 16.24f, -1.41f, 1.41f);
        i.curveTo(4.78f, 16.1f, 4.0f, 14.05f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, -2.05f, 0.78f, -4.1f, 2.34f, -5.66f);
        i.lineToRelative(1.41f, 1.41f);
        i.curveTo(6.59f, 8.93f, 6.0f, 10.46f, 6.0f, 12.0f);
        i.reflectiveCurveToRelative(0.59f, 3.07f, 1.76f, 4.24f);
        i.close();
        i.moveTo(12.0f, 16.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        i.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        i.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        i.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        k4.x(i, 17.66f, 17.66f, -1.41f, -1.41f);
        i.curveTo(17.41f, 15.07f, 18.0f, 13.54f, 18.0f, 12.0f);
        i.reflectiveCurveToRelative(-0.59f, -3.07f, -1.76f, -4.24f);
        i.lineToRelative(1.41f, -1.41f);
        i.curveTo(19.22f, 7.9f, 20.0f, 9.95f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, 2.05f, -0.78f, 4.1f, -2.34f, 5.66f);
        i.close();
        i.moveTo(12.0f, 10.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _surroundSound = build;
        build.getClass();
        return build;
    }
}
