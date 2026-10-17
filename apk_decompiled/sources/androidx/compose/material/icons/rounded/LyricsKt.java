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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LyricsKt {
    private static ImageVector _lyrics;

    public static final ImageVector getLyrics(Icons.Rounded rounded) {
        ImageVector imageVector = _lyrics;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Lyrics", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.0f, 9.0f);
        b.curveToRelative(0.0f, -2.04f, 1.24f, -3.79f, 3.0f, -4.57f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(2.9f, 2.0f, 2.01f, 2.9f, 2.01f, 4.0f);
        b.lineTo(2.0f, 22.0f);
        b.lineToRelative(4.0f, -4.0f);
        b.horizontalLineToRelative(9.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-2.42f);
        b.curveTo(15.24f, 12.8f, 14.0f, 11.05f, 14.0f, 9.0f);
        uo.q(b, 10.0f, 14.0f, 6.0f, -2.0f);
        uo.r(b, 4.0f, 14.0f, 13.0f, 11.0f);
        uo.o(b, 6.0f, 9.0f, 7.0f, 11.0f);
        uo.p(b, 13.0f, 8.0f, 6.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 7.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(20.0f, 6.18f);
        b2.curveTo(19.69f, 6.07f, 19.35f, 6.0f, 19.0f, 6.0f);
        b2.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b2.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b2.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        gy.z(b2, 3.0f, 2.0f, 1.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b2, 6.18f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lyrics = build;
        build.getClass();
        return build;
    }
}
