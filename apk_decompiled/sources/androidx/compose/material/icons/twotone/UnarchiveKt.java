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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnarchiveKt {
    private static ImageVector _unarchive;

    public static final ImageVector getUnarchive(Icons.TwoTone twoTone) {
        ImageVector imageVector = _unarchive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Unarchive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(5.0f, 19.0f, 14.0f, 19.0f, 8.0f);
        bv.r(p, 5.0f, 8.0f, 11.0f);
        p.moveTo(12.0f, 10.0f);
        r6.q(p, 4.0f, 4.0f, -2.55f, 3.0f);
        bv.C(p, -2.91f, -3.0f, 8.0f, 14.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(p, 4.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.54f, 5.23f, -1.39f, -1.68f);
        e.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        e.lineTo(6.0f, 3.0f);
        e.curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.16f, 0.55f);
        e.lineTo(3.46f, 5.23f);
        e.curveTo(3.17f, 5.57f, 3.0f, 6.02f, 3.0f, 6.5f);
        e.lineTo(3.0f, 19.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(14.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.lineTo(21.0f, 6.5f);
        e.curveToRelative(0.0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f);
        af0.l(e, 6.24f, 5.0f, 11.52f);
        e.lineToRelative(0.83f, 1.0f);
        bv.o(e, 5.42f, 6.0f, 0.82f, -1.0f);
        e.moveTo(19.0f, 19.0f);
        e.lineTo(5.0f, 19.0f);
        r6.m(e, 5.0f, 8.0f, 14.0f, 11.0f);
        k4.C(e, 10.55f, 17.0f, 2.9f, -3.0f);
        e.lineTo(16.0f, 14.0f);
        e.lineToRelative(-4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(e, -4.0f, 4.0f, 2.55f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unarchive = build;
        build.getClass();
        return build;
    }
}
