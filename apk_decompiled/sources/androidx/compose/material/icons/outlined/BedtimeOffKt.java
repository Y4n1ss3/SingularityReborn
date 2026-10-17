package androidx.compose.material.icons.outlined;

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
public final class BedtimeOffKt {
    private static ImageVector _bedtimeOff;

    public static final ImageVector getBedtimeOff(Icons.Outlined outlined) {
        ImageVector imageVector = _bedtimeOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BedtimeOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.27f, 4.49f);
        b.curveTo(9.14f, 5.08f, 9.07f, 5.64f, 9.03f, 6.2f);
        b.lineToRelative(2.05f, 2.05f);
        b.curveToRelative(-0.27f, -2.05f, 0.1f, -4.22f, 1.26f, -6.23f);
        b.curveToRelative(-0.12f, 0.0f, -0.23f, -0.01f, -0.35f, -0.01f);
        b.curveToRelative(-2.05f, 0.0f, -3.93f, 0.61f, -5.5f, 1.65f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(8.37f, 4.88f, 8.81f, 4.66f, 9.27f, 4.49f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.39f, 4.22f, 2.27f, 2.27f);
        e.curveTo(2.61f, 8.07f, 2.0f, 9.97f, 2.0f, 12.0f);
        e.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        e.curveToRelative(2.04f, 0.0f, 3.92f, -0.63f, 5.5f, -1.67f);
        e.lineToRelative(2.28f, 2.28f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.81f, 2.81f, 1.39f, 4.22f);
        e.moveTo(5.13f, 7.96f);
        e.lineToRelative(10.92f, 10.92f);
        e.curveTo(14.84f, 19.6f, 13.45f, 20.0f, 12.0f, 20.0f);
        e.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        e.curveTo(4.0f, 10.52f, 4.42f, 9.15f, 5.13f, 7.96f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedtimeOff = build;
        build.getClass();
        return build;
    }
}
