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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolunteerActivismKt {
    private static ImageVector _volunteerActivism;

    public static final ImageVector getVolunteerActivism(Icons.Filled filled) {
        ImageVector imageVector = _volunteerActivism;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VolunteerActivism", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(1.0f, 11.0f, 4.0f, 11.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 3.25f);
        b.curveTo(16.65f, 2.49f, 17.66f, 2.0f, 18.7f, 2.0f);
        b.curveTo(20.55f, 2.0f, 22.0f, 3.45f, 22.0f, 5.3f);
        b.curveToRelative(0.0f, 2.27f, -2.91f, 4.9f, -6.0f, 7.7f);
        b.curveToRelative(-3.09f, -2.81f, -6.0f, -5.44f, -6.0f, -7.7f);
        b.curveTo(10.0f, 3.45f, 11.45f, 2.0f, 13.3f, 2.0f);
        b.curveTo(14.34f, 2.0f, 15.35f, 2.49f, 16.0f, 3.25f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 17.0f, -7.0f, -2.09f, -0.73f);
        i.lineToRelative(0.33f, -0.94f);
        i.lineTo(13.0f, 16.0f);
        i.horizontalLineToRelative(2.82f);
        i.curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
        r6.w(i, 8.97f, 11.0f, 7.0f, 9.02f);
        i.lineTo(14.0f, 22.0f);
        i.lineToRelative(8.01f, -3.0f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(22.0f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volunteerActivism = build;
        build.getClass();
        return build;
    }
}
