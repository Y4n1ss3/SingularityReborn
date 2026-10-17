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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConstructionKt {
    private static ImageVector _construction;

    public static final ImageVector getConstruction(Icons.Filled filled) {
        ImageVector imageVector = _construction;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Construction", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(13.783f, 15.172f, 2.121f, -2.121f), 5.996f, 5.996f, -2.121f, 2.121f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.5f, 10.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.curveToRelative(0.0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f);
        b.lineToRelative(-2.7f, 2.7f);
        b.lineTo(16.4f, 6.11f);
        b.lineToRelative(2.7f, -2.7f);
        b.curveTo(18.62f, 3.16f, 18.08f, 3.0f, 17.5f, 3.0f);
        b.curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        b.curveToRelative(0.0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f);
        b.lineToRelative(-1.85f, 1.85f);
        b.lineToRelative(-1.78f, -1.78f);
        b.lineToRelative(0.71f, -0.71f);
        b.lineTo(9.88f, 5.61f);
        b.lineTo(12.0f, 3.49f);
        b.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        b.lineTo(4.22f, 7.03f);
        b.lineToRelative(1.41f, 1.41f);
        b.horizontalLineTo(2.81f);
        b.lineTo(2.1f, 9.15f);
        b.lineToRelative(3.54f, 3.54f);
        b.lineToRelative(0.71f, -0.71f);
        b.verticalLineTo(9.15f);
        b.lineToRelative(1.41f, 1.41f);
        b.lineToRelative(0.71f, -0.71f);
        b.lineToRelative(1.78f, 1.78f);
        b.lineToRelative(-7.41f, 7.41f);
        b.lineToRelative(2.12f, 2.12f);
        b.lineTo(16.34f, 9.79f);
        b.curveTo(16.7f, 9.92f, 17.09f, 10.0f, 17.5f, 10.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _construction = build;
        build.getClass();
        return build;
    }
}
