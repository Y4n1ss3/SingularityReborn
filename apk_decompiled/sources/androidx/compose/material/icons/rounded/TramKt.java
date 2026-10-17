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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TramKt {
    private static ImageVector _tram;

    public static final ImageVector getTram(Icons.Rounded rounded) {
        ImageVector imageVector = _tram;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Tram", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 5.0f, 0.75f, -1.5f);
        e.lineTo(17.0f, 3.5f);
        e.lineTo(17.0f, 2.0f);
        af0.m(e, 7.0f, 2.0f, 1.5f, 4.75f);
        e.lineTo(11.0f, 5.0f);
        e.curveToRelative(-3.13f, 0.09f, -6.0f, 0.73f, -6.0f, 3.5f);
        e.lineTo(5.0f, 17.0f);
        e.curveToRelative(0.0f, 1.5f, 1.11f, 2.73f, 2.55f, 2.95f);
        e.lineToRelative(-1.19f, 1.19f);
        e.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        e.lineTo(7.8f, 22.0f);
        e.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        e.lineTo(10.0f, 20.0f);
        e.horizontalLineToRelative(4.0f);
        e.lineToRelative(1.85f, 1.85f);
        e.curveToRelative(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f);
        e.horizontalLineToRelative(1.09f);
        e.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        e.lineToRelative(-1.19f, -1.19f);
        e.curveTo(17.89f, 19.73f, 19.0f, 18.5f, 19.0f, 17.0f);
        e.lineTo(19.0f, 8.5f);
        e.curveToRelative(0.0f, -2.77f, -2.87f, -3.41f, -6.0f, -3.5f);
        e.close();
        e.moveTo(12.0f, 18.5f);
        e.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        e.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        e.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        e.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        k4.r(e, 17.0f, 14.0f, 7.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(e, 7.0f, 9.0f, 10.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tram = build;
        build.getClass();
        return build;
    }
}
