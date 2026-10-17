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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GppGoodKt {
    private static ImageVector _gppGood;

    public static final ImageVector getGppGood(Icons.TwoTone twoTone) {
        ImageVector imageVector = _gppGood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.GppGood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(6.0f, 6.31f, 4.78f);
        h.curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f);
        h.curveToRelative(3.45f, -1.13f, 6.0f, -4.82f, 6.0f, -8.83f);
        h.verticalLineTo(6.31f);
        gy.B(h, -6.0f, -2.12f, 6.0f, 6.31f);
        h.moveTo(16.6f, 9.88f);
        h.lineToRelative(-5.66f, 5.66f);
        h.lineTo(7.4f, 12.0f);
        h.lineToRelative(1.41f, -1.41f);
        h.lineToRelative(2.12f, 2.12f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(h, 4.24f, -4.24f, 16.6f, 9.88f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 2.0f, 4.0f, 5.0f, 6.09f);
        s.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        s.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        bv.k(s, 5.0f, 12.0f, 2.0f);
        s.moveTo(18.0f, 11.09f);
        s.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        s.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        s.verticalLineTo(6.31f);
        s.lineToRelative(6.0f, -2.12f);
        uf.x(s, 6.0f, 2.12f, 11.09f);
        s.moveTo(8.82f, 10.59f);
        s.lineTo(7.4f, 12.0f);
        s.lineToRelative(3.54f, 3.54f);
        s.lineToRelative(5.66f, -5.66f);
        s.lineToRelative(-1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(s, -4.24f, 4.24f, 8.82f, 10.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gppGood = build;
        build.getClass();
        return build;
    }
}
