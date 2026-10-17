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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RowingKt {
    private static ImageVector _rowing;

    public static final ImageVector getRowing(Icons.Filled filled) {
        ImageVector imageVector = _rowing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Rowing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(8.5f, 14.5f, 4.0f, 19.0f);
        i.lineToRelative(1.5f, 1.5f);
        i.lineTo(9.0f, 17.0f);
        gy.n(i, 2.0f, 8.5f, 14.5f);
        i.moveTo(15.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        i.reflectiveCurveTo(16.1f, 1.0f, 15.0f, 1.0f);
        k4.r(i, 21.0f, 21.01f, 18.0f, 24.0f);
        i.lineToRelative(-2.99f, -3.01f);
        i.verticalLineTo(19.5f);
        i.lineToRelative(-7.1f, -7.09f);
        i.curveTo(7.6f, 12.46f, 7.3f, 12.48f, 7.0f, 12.48f);
        i.verticalLineToRelative(-2.16f);
        i.curveToRelative(1.66f, 0.03f, 3.61f, -0.87f, 4.67f, -2.04f);
        i.lineToRelative(1.4f, -1.55f);
        i.curveTo(13.42f, 6.34f, 14.06f, 6.0f, 14.72f, 6.0f);
        i.horizontalLineToRelative(0.03f);
        i.curveTo(15.99f, 6.01f, 17.0f, 7.02f, 17.0f, 8.26f);
        i.verticalLineToRelative(5.75f);
        i.curveToRelative(0.0f, 0.84f, -0.35f, 1.61f, -0.92f, 2.16f);
        i.lineToRelative(-3.58f, -3.58f);
        i.verticalLineToRelative(-2.27f);
        i.curveToRelative(-0.63f, 0.52f, -1.43f, 1.02f, -2.29f, 1.39f);
        i.lineTo(16.5f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(i, 18.0f, 21.0f, 21.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rowing = build;
        build.getClass();
        return build;
    }
}
