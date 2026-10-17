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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatColorFillKt {
    private static ImageVector _formatColorFill;

    public static final ImageVector getFormatColorFill(Icons.Filled filled) {
        ImageVector imageVector = _formatColorFill;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FormatColorFill", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.56f, 8.94f, 7.62f, 0.0f);
        i.lineTo(6.21f, 1.41f);
        i.lineToRelative(2.38f, 2.38f);
        i.lineTo(3.44f, 8.94f);
        i.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        i.lineToRelative(5.5f, 5.5f);
        i.curveTo(9.23f, 16.85f, 9.62f, 17.0f, 10.0f, 17.0f);
        i.reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f);
        i.lineToRelative(5.5f, -5.5f);
        i.curveTo(17.15f, 10.48f, 17.15f, 9.53f, 16.56f, 8.94f);
        k4.r(i, 5.21f, 10.0f, 10.0f, 5.21f);
        kf0.h(i, 14.79f, 10.0f, 5.21f);
        i.moveTo(19.0f, 11.5f);
        i.curveToRelative(0.0f, 0.0f, -2.0f, 2.17f, -2.0f, 3.5f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        i.curveTo(21.0f, 13.67f, 19.0f, 11.5f, 19.0f, 11.5f);
        r6.B(i, 2.0f, 20.0f, 20.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(i, 2.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorFill = build;
        build.getClass();
        return build;
    }
}
