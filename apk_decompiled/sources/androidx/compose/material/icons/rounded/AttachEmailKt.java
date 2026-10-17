package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachEmailKt {
    private static ImageVector _attachEmail;

    public static final ImageVector getAttachEmail(Icons.Rounded rounded) {
        ImageVector imageVector = _attachEmail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AttachEmail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(21.0f, 10.0f, 4.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(3.0f);
        d.curveTo(1.9f, 2.0f, 1.01f, 2.9f, 1.01f, 4.0f);
        d.lineTo(1.0f, 16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(11.0f);
        d.verticalLineToRelative(-5.0f);
        d.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        k4.w(d, 21.0f, 11.53f, 10.67f);
        d.curveToRelative(-0.32f, 0.2f, -0.74f, 0.2f, -1.06f, 0.0f);
        d.lineTo(3.4f, 6.25f);
        d.curveTo(3.15f, 6.09f, 3.0f, 5.82f, 3.0f, 5.53f);
        d.curveToRelative(0.0f, -0.67f, 0.73f, -1.07f, 1.3f, -0.72f);
        d.lineTo(11.0f, 9.0f);
        d.lineToRelative(6.7f, -4.19f);
        d.curveTo(18.27f, 4.46f, 19.0f, 4.86f, 19.0f, 5.53f);
        d.curveToRelative(0.0f, 0.29f, -0.15f, 0.56f, -0.4f, 0.72f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 11.53f, 10.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 14.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineToRelative(-4.5f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        b.verticalLineTo(17.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.5f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b.reflectiveCurveTo(15.0f, 12.12f, 15.0f, 13.5f);
        b.verticalLineTo(18.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveTo(23.0f, 14.45f, 22.55f, 14.0f, 22.0f, 14.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachEmail = build;
        build.getClass();
        return build;
    }
}
