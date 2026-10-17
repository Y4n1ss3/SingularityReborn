package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BeachAccessKt {
    private static ImageVector _beachAccess;

    public static final ImageVector getBeachAccess(Icons.TwoTone twoTone) {
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BeachAccess", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.6f, 7.6f);
        b.curveToRelative(-0.47f, 2.34f, 0.03f, 4.78f, 1.39f, 6.83f);
        b.lineToRelative(5.45f, -5.45f);
        b.curveToRelative(-1.53f, -1.02f, -3.28f, -1.56f, -5.08f, -1.56f);
        b.curveToRelative(-0.6f, 0.0f, -1.19f, 0.06f, -1.76f, 0.18f);
        b.close();
        b.moveTo(13.12f, 5.0f);
        b.curveToRelative(-0.93f, 0.0f, -1.82f, 0.16f, -2.67f, 0.46f);
        b.curveToRelative(1.91f, 0.19f, 3.79f, 0.89f, 5.44f, 2.07f);
        b.lineToRelative(1.39f, -1.39f);
        b.curveTo(16.03f, 5.4f, 14.61f, 5.0f, 13.12f, 5.0f);
        b.close();
        b.moveTo(5.0f, 13.12f);
        b.curveToRelative(0.0f, 1.49f, 0.4f, 2.91f, 1.14f, 4.15f);
        b.lineToRelative(1.39f, -1.39f);
        b.curveToRelative(-1.18f, -1.65f, -1.88f, -3.52f, -2.07f, -5.44f);
        b.curveToRelative(-0.3f, 0.86f, -0.46f, 1.76f, -0.46f, 2.68f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.126f, 14.56f, 1.428f, -1.428f);
        fc.C(e, 6.442f, 6.442f, -1.43f, 1.428f);
        e.moveTo(13.12f, 3.0f);
        e.curveToRelative(-2.58f, 0.0f, -5.16f, 0.98f, -7.14f, 2.95f);
        e.lineToRelative(-0.01f, 0.01f);
        e.curveToRelative(-3.95f, 3.95f, -3.95f, 10.36f, 0.0f, 14.31f);
        e.lineToRelative(14.3f, -14.31f);
        e.curveTo(18.3f, 3.99f, 15.71f, 3.0f, 13.12f, 3.0f);
        e.close();
        e.moveTo(6.14f, 17.27f);
        e.curveTo(5.4f, 16.03f, 5.0f, 14.61f, 5.0f, 13.12f);
        e.curveToRelative(0.0f, -0.93f, 0.16f, -1.82f, 0.46f, -2.67f);
        e.curveToRelative(0.19f, 1.91f, 0.89f, 3.79f, 2.07f, 5.44f);
        fc.B(e, -1.39f, 1.38f, 8.98f, 14.43f);
        e.curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f);
        e.curveToRelative(0.58f, -0.12f, 1.16f, -0.18f, 1.75f, -0.18f);
        e.curveToRelative(1.8f, 0.0f, 3.55f, 0.55f, 5.08f, 1.56f);
        fc.B(e, -5.45f, 5.45f, 10.45f, 5.46f);
        e.curveToRelative(0.85f, -0.3f, 1.74f, -0.46f, 2.67f, -0.46f);
        e.curveToRelative(1.49f, 0.0f, 2.91f, 0.4f, 4.15f, 1.14f);
        e.lineToRelative(-1.39f, 1.39f);
        e.curveToRelative(-1.65f, -1.18f, -3.52f, -1.88f, -5.43f, -2.07f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beachAccess = build;
        build.getClass();
        return build;
    }
}
