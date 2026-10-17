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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NestCamWiredStandKt {
    private static ImageVector _nestCamWiredStand;

    public static final ImageVector getNestCamWiredStand(Icons.Filled filled) {
        ImageVector imageVector = _nestCamWiredStand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NestCamWiredStand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.83f, 1.01f, -4.11f, 0.42f);
        e.curveTo(8.47f, 1.75f, 6.0f, 4.48f, 6.0f, 7.75f);
        e.reflectiveCurveToRelative(2.47f, 6.0f, 5.72f, 6.33f);
        e.lineToRelative(1.9f, 0.19f);
        e.lineToRelative(-0.56f, 0.85f);
        e.curveTo(12.71f, 15.04f, 12.36f, 15.0f, 12.0f, 15.0f);
        e.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        e.verticalLineToRelative(2.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(8.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-2.0f);
        e.curveToRelative(0.0f, -1.67f, -0.83f, -3.15f, -2.09f, -4.06f);
        e.lineToRelative(0.97f, -1.45f);
        e.curveTo(17.02f, 14.56f, 18.0f, 13.66f, 18.0f, 12.5f);
        e.verticalLineTo(3.0f);
        e.curveTo(18.0f, 1.83f, 17.0f, 0.91f, 15.83f, 1.01f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nestCamWiredStand = build;
        build.getClass();
        return build;
    }
}
