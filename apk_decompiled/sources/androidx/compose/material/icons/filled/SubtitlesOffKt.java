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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SubtitlesOffKt {
    private static ImageVector _subtitlesOff;

    public static final ImageVector getSubtitlesOff(Icons.Filled filled) {
        ImageVector imageVector = _subtitlesOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SubtitlesOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(20.0f, 4.0f, 6.83f, 8.0f, 8.0f);
        af0.u(a, 20.0f, 2.0f, -3.17f);
        a.lineToRelative(4.93f, 4.93f);
        a.curveTo(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f);
        a.verticalLineTo(6.0f);
        a.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.04f, 3.87f, 1.2f, 1.2f);
        e.curveTo(2.09f, 5.35f, 2.0f, 5.66f, 2.0f, 6.0f);
        e.verticalLineToRelative(12.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(13.17f);
        e.lineToRelative(2.96f, 2.96f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.45f, 2.45f, 1.04f, 3.87f);
        uf.D(e, 8.0f, 12.0f, 2.0f, 4.0f);
        kf0.n(e, -2.0f, 8.0f, 14.0f, 16.83f);
        bv.A(e, 18.0f, 4.0f, -2.0f, 9.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 14.0f, 16.83f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subtitlesOff = build;
        build.getClass();
        return build;
    }
}
