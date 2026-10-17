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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Filled filled) {
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Pinch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(6.0f, 2.5f, 1.0f, 5.0f, 5.0f);
        c.horizontalLineTo(9.5f);
        c.verticalLineTo(3.56f);
        c.lineTo(3.56f, 9.5f);
        af0.y(c, 6.0f, 11.0f, 1.0f, 6.0f);
        bv.C(c, 1.5f, 2.44f, 8.44f, 2.5f);
        k4.w(c, 6.0f, 22.98f, 16.82f);
        c.lineToRelative(-0.63f, 4.46f);
        c.curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f);
        c.horizontalLineToRelative(-6.16f);
        c.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        c.lineTo(8.0f, 17.62f);
        c.lineToRelative(0.83f, -0.84f);
        c.curveToRelative(0.24f, -0.24f, 0.58f, -0.35f, 0.92f, -0.28f);
        c.lineTo(13.0f, 17.24f);
        c.verticalLineTo(6.5f);
        c.curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f);
        c.reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f);
        c.verticalLineToRelative(6.0f);
        c.horizontalLineToRelative(0.91f);
        c.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        c.lineToRelative(4.09f, 2.04f);
        c.curveTo(22.66f, 15.14f, 23.1f, 15.97f, 22.98f, 16.82f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = build;
        build.getClass();
        return build;
    }
}
