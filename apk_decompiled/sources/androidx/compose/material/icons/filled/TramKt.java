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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TramKt {
    private static ImageVector _tram;

    public static final ImageVector getTram(Icons.Filled filled) {
        ImageVector imageVector = _tram;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tram", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 16.94f, 19.0f, 8.5f);
        i.curveToRelative(0.0f, -2.79f, -2.61f, -3.4f, -6.01f, -3.49f);
        i.lineToRelative(0.76f, -1.51f);
        i.lineTo(17.0f, 3.5f);
        i.lineTo(17.0f, 2.0f);
        af0.m(i, 7.0f, 2.0f, 1.5f, 4.75f);
        i.lineToRelative(-0.76f, 1.52f);
        i.curveTo(7.86f, 5.11f, 5.0f, 5.73f, 5.0f, 8.5f);
        i.verticalLineToRelative(8.44f);
        i.curveToRelative(0.0f, 1.45f, 1.19f, 2.66f, 2.59f, 2.97f);
        af0.m(i, 6.0f, 21.5f, 0.5f, 2.23f);
        i.lineToRelative(2.0f, -2.0f);
        i.lineTo(14.0f, 20.0f);
        r6.q(i, 2.0f, 2.0f, 2.0f, -0.5f);
        i.lineTo(16.5f, 20.0f);
        i.horizontalLineToRelative(-0.08f);
        i.curveToRelative(1.69f, 0.0f, 2.58f, -1.37f, 2.58f, -3.06f);
        i.close();
        i.moveTo(12.0f, 18.5f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        i.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        i.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        k4.r(i, 17.0f, 14.0f, 7.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i, 7.0f, 9.0f, 10.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tram = build;
        build.getClass();
        return build;
    }
}
