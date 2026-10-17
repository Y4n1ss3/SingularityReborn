package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextSnippetKt {
    private static ImageVector _textSnippet;

    public static final ImageVector getTextSnippet(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _textSnippet;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.TextSnippet", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(14.17f, 5.0f, 19.0f, 9.83f, 19.0f);
        u.horizontalLineTo(5.0f);
        u.verticalLineTo(5.0f);
        u.lineTo(14.17f, 5.0f);
        u.lineTo(14.17f, 5.0f);
        k4.C(u, 7.0f, 15.0f, 10.0f, 2.0f);
        bv.s(u, 7.0f, 15.0f, 7.0f, 11.0f);
        gy.t(u, 10.0f, 2.0f, 7.0f, 11.0f);
        k4.C(u, 7.0f, 7.0f, 7.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(u, 7.0f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u2 = kp0.u(14.17f, 5.0f, 19.0f, 9.83f, 19.0f);
        u2.horizontalLineTo(5.0f);
        u2.verticalLineTo(5.0f);
        u2.lineTo(14.17f, 5.0f);
        u2.lineTo(14.17f, 5.0f);
        u2.moveTo(14.17f, 3.0f);
        u2.horizontalLineTo(5.0f);
        u2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        u2.verticalLineToRelative(14.0f);
        u2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        u2.horizontalLineToRelative(14.0f);
        u2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        u2.verticalLineTo(9.83f);
        u2.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        u2.lineToRelative(-4.83f, -4.83f);
        u2.curveTo(15.21f, 3.21f, 14.7f, 3.0f, 14.17f, 3.0f);
        uo.l(u2, 14.17f, 3.0f, 7.0f, 15.0f);
        gy.t(u2, 10.0f, 2.0f, 7.0f, 15.0f);
        k4.C(u2, 7.0f, 11.0f, 10.0f, 2.0f);
        bv.s(u2, 7.0f, 11.0f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(u2, 7.0f, 2.0f, 7.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textSnippet = build;
        build.getClass();
        return build;
    }
}
