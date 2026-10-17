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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandymanKt {
    private static ImageVector _handyman;

    public static final ImageVector getHandyman(Icons.Filled filled) {
        ImageVector imageVector = _handyman;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Handyman", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(21.67f, 18.17f, -5.3f, -5.3f, -0.99f);
        b.lineToRelative(-2.54f, 2.54f);
        b.verticalLineToRelative(0.99f);
        b.lineToRelative(5.3f, 5.3f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(2.12f, -2.12f);
        b.curveTo(22.06f, 19.2f, 22.06f, 18.56f, 21.67f, 18.17f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.34f, 10.19f, 1.41f, -1.41f);
        e.lineToRelative(2.12f, 2.12f);
        e.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        e.lineToRelative(-3.54f, -3.54f);
        e.lineToRelative(-1.41f, 1.41f);
        e.verticalLineTo(1.71f);
        e.lineTo(15.22f, 1.0f);
        e.lineToRelative(-3.54f, 3.54f);
        e.lineToRelative(0.71f, 0.71f);
        e.horizontalLineToRelative(2.83f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineToRelative(1.06f, 1.06f);
        e.lineToRelative(-2.89f, 2.89f);
        e.lineTo(7.85f, 6.48f);
        e.verticalLineTo(5.06f);
        e.lineTo(4.83f, 2.04f);
        e.lineTo(2.0f, 4.87f);
        e.lineToRelative(3.03f, 3.03f);
        e.horizontalLineToRelative(1.41f);
        e.lineToRelative(4.13f, 4.13f);
        e.lineToRelative(-0.85f, 0.85f);
        e.horizontalLineTo(7.6f);
        e.lineToRelative(-5.3f, 5.3f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(2.12f, 2.12f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(5.3f, -5.3f);
        e.verticalLineToRelative(-2.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 5.15f, -5.15f, 17.34f, 10.19f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handyman = build;
        build.getClass();
        return build;
    }
}
