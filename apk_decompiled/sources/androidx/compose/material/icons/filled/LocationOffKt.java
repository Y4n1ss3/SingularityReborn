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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocationOffKt {
    private static ImageVector _locationOff;

    public static final ImageVector getLocationOff(Icons.Filled filled) {
        ImageVector imageVector = _locationOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocationOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.5f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        b.curveToRelative(0.0f, 0.74f, -0.33f, 1.39f, -0.83f, 1.85f);
        b.lineToRelative(3.63f, 3.63f);
        b.curveToRelative(0.98f, -1.86f, 1.7f, -3.8f, 1.7f, -5.48f);
        b.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        b.curveToRelative(-1.98f, 0.0f, -3.76f, 0.83f, -5.04f, 2.15f);
        b.lineToRelative(3.19f, 3.19f);
        b.curveToRelative(0.46f, -0.52f, 1.11f, -0.84f, 1.85f, -0.84f);
        k4.x(b, 16.37f, 16.1f, -4.63f, -4.63f);
        b.lineToRelative(-0.11f, -0.11f);
        b.lineTo(3.27f, 3.0f);
        b.lineTo(2.0f, 4.27f);
        b.lineToRelative(3.18f, 3.18f);
        b.curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        b.reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f);
        b.lineTo(18.73f, 21.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b, 20.0f, 19.73f, -3.63f, -3.63f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOff = build;
        build.getClass();
        return build;
    }
}
