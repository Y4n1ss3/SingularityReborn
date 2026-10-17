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
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BathtubKt {
    private static ImageVector _bathtub;

    public static final ImageVector getBathtub(Icons.Filled filled) {
        ImageVector imageVector = _bathtub;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Bathtub", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(7.0f, 7.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 13.0f, 4.83f);
        d.curveTo(20.0f, 3.27f, 18.73f, 2.0f, 17.17f, 2.0f);
        d.curveToRelative(-0.75f, 0.0f, -1.47f, 0.3f, -2.0f, 0.83f);
        d.lineToRelative(-1.25f, 1.25f);
        d.curveTo(13.76f, 4.03f, 13.59f, 4.0f, 13.41f, 4.0f);
        d.curveToRelative(-0.4f, 0.0f, -0.77f, 0.12f, -1.08f, 0.32f);
        d.lineToRelative(2.76f, 2.76f);
        d.curveToRelative(0.2f, -0.31f, 0.32f, -0.68f, 0.32f, -1.08f);
        d.curveToRelative(0.0f, -0.18f, -0.03f, -0.34f, -0.07f, -0.51f);
        d.lineToRelative(1.25f, -1.25f);
        d.curveTo(16.74f, 4.09f, 16.95f, 4.0f, 17.17f, 4.0f);
        d.curveTo(17.63f, 4.0f, 18.0f, 4.37f, 18.0f, 4.83f);
        d.verticalLineTo(13.0f);
        d.horizontalLineToRelative(-6.85f);
        d.curveToRelative(-0.3f, -0.21f, -0.57f, -0.45f, -0.82f, -0.72f);
        d.lineToRelative(-1.4f, -1.55f);
        d.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        d.curveTo(7.93f, 10.08f, 7.59f, 10.0f, 7.24f, 10.0f);
        d.curveTo(6.0f, 10.01f, 5.0f, 11.01f, 5.0f, 12.25f);
        r6.v(d, 13.0f, 2.0f, 6.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(d, -6.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bathtub = build;
        build.getClass();
        return build;
    }
}
