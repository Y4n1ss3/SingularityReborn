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
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GasMeterKt {
    private static ImageVector _gasMeter;

    public static final ImageVector getGasMeter(Icons.Outlined outlined) {
        ImageVector imageVector = _gasMeter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GasMeter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(16.0f, 4.0f, -1.0f, 2.0f, -2.0f);
        bv.B(n, 2.0f, -2.0f, 2.0f, 9.0f);
        n.verticalLineToRelative(2.0f);
        n.horizontalLineTo(8.0f);
        n.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        n.verticalLineToRelative(10.0f);
        n.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        n.horizontalLineToRelative(8.0f);
        n.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        n.verticalLineTo(8.0f);
        n.curveTo(20.0f, 5.79f, 18.21f, 4.0f, 16.0f, 4.0f);
        n.close();
        n.moveTo(18.0f, 18.0f);
        n.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        n.horizontalLineTo(8.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        n.verticalLineTo(8.0f);
        n.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        n.horizontalLineToRelative(8.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(n, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.5f, 15.54f);
        b.curveTo(9.5f, 16.9f, 10.62f, 18.0f, 12.0f, 18.0f);
        b.reflectiveCurveToRelative(2.5f, -1.1f, 2.5f, -2.46f);
        b.curveToRelative(0.0f, -1.09f, -0.45f, -1.41f, -2.5f, -3.79f);
        b.curveTo(9.93f, 14.15f, 9.5f, 14.46f, 9.5f, 15.54f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(8.0f, 8.0f, 8.0f, 2.0f, -8.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gasMeter = build;
        build.getClass();
        return build;
    }
}
