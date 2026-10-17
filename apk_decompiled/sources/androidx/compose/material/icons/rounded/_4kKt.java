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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _4kKt {
    private static ImageVector __4k;

    public static final ImageVector get_4k(Icons.Rounded rounded) {
        ImageVector imageVector = __4k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._4k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(12.0f, 12.76f);
        i.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        i.lineTo(11.0f, 13.51f);
        i.verticalLineToRelative(0.74f);
        i.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        i.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        i.verticalLineToRelative(-0.75f);
        i.horizontalLineToRelative(-2.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.lineTo(6.5f, 9.75f);
        i.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        i.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        i.lineTo(8.0f, 12.0f);
        i.horizontalLineToRelative(1.5f);
        i.lineTo(9.5f, 9.75f);
        i.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        i.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        i.lineTo(11.0f, 12.0f);
        i.horizontalLineToRelative(0.25f);
        i.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        r6.l(i, 0.01f, 17.47f, 13.9f);
        i.curveToRelative(0.22f, 0.33f, 0.13f, 0.77f, -0.2f, 0.98f);
        i.curveToRelative(-0.12f, 0.08f, -0.26f, 0.12f, -0.39f, 0.12f);
        i.curveToRelative(-0.23f, 0.0f, -0.45f, -0.11f, -0.59f, -0.32f);
        i.lineTo(14.5f, 12.0f);
        i.verticalLineToRelative(2.24f);
        i.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        i.curveToRelative(-0.41f, 0.01f, -0.75f, -0.33f, -0.75f, -0.74f);
        i.verticalLineToRelative(-4.5f);
        i.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        i.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        i.verticalLineToRelative(2.24f);
        i.lineToRelative(1.79f, -2.68f);
        i.curveToRelative(0.22f, -0.33f, 0.66f, -0.41f, 0.98f, -0.2f);
        i.curveToRelative(0.33f, 0.22f, 0.41f, 0.66f, 0.2f, 0.98f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 16.2f, 12.0f, 1.27f, 1.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4k = build;
        build.getClass();
        return build;
    }
}
