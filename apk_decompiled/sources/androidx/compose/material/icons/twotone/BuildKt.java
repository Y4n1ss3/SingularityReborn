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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.TwoTone twoTone) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Build", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.92f, 8.28f);
        b.curveToRelative(0.24f, -1.4f, -0.16f, -2.89f, -1.24f, -3.96f);
        b.curveToRelative(-0.94f, -0.95f, -2.2f, -1.39f, -3.44f, -1.32f);
        b.lineToRelative(3.09f, 3.09f);
        b.lineToRelative(-4.24f, 4.24f);
        b.lineTo(3.0f, 7.24f);
        b.curveToRelative(-0.07f, 1.24f, 0.37f, 2.49f, 1.31f, 3.44f);
        b.curveToRelative(1.04f, 1.04f, 2.47f, 1.45f, 3.83f, 1.25f);
        b.curveToRelative(0.71f, -0.1f, 1.4f, -0.38f, 2.0f, -0.82f);
        b.lineToRelative(9.46f, 9.46f);
        b.lineToRelative(0.88f, -0.88f);
        b.lineToRelative(-9.45f, -9.45f);
        b.curveToRelative(0.47f, -0.6f, 0.77f, -1.26f, 0.89f, -1.96f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.61f, 18.97f, 13.54f, 9.9f);
        i.curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f);
        i.curveTo(9.8f, 0.6f, 6.22f, 0.39f, 3.67f, 2.25f);
        i.lineTo(7.5f, 6.08f);
        i.lineTo(6.08f, 7.5f);
        i.lineTo(2.25f, 3.67f);
        i.curveTo(0.39f, 6.21f, 0.6f, 9.79f, 2.9f, 12.09f);
        i.curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f);
        i.lineToRelative(9.11f, 9.11f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(2.3f, -2.3f);
        i.curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.0f, -1.41f);
        k4.x(i, 19.61f, 20.57f, -9.46f, -9.46f);
        i.curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f);
        i.curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f);
        i.curveToRelative(-0.95f, -0.94f, -1.39f, -2.2f, -1.32f, -3.44f);
        i.lineToRelative(3.09f, 3.09f);
        i.lineToRelative(4.24f, -4.24f);
        i.lineTo(7.24f, 3.0f);
        i.curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f);
        i.curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f);
        i.curveToRelative(-0.12f, 0.7f, -0.42f, 1.36f, -0.88f, 1.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 9.45f, 9.45f, -0.88f, 0.9f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        build.getClass();
        return build;
    }
}
