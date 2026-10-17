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
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimCardDownloadKt {
    private static ImageVector _simCardDownload;

    public static final ImageVector getSimCardDownload(Icons.TwoTone twoTone) {
        ImageVector imageVector = _simCardDownload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SimCardDownload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(6.0f, 8.83f, 20.0f, 12.0f, 4.0f);
        gy.n(c, -7.17f, 6.0f, 8.83f);
        c.moveTo(11.0f, 9.02f);
        af0.m(c, 13.0f, 9.0f, 4.0f, 3.0f);
        c.lineToRelative(-4.0f, 4.0f);
        c.lineToRelative(-4.0f, -4.0f);
        c.horizontalLineToRelative(3.0f);
        c.verticalLineTo(9.02f);
        c.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(18.0f, 2.0f, -8.0f, 4.0f, 8.0f);
        p.verticalLineToRelative(12.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(12.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.verticalLineTo(4.0f);
        p.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        c21.d(p, 18.0f, 20.0f, 6.0f, 8.83f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(p, 10.83f, 4.0f, 18.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 17.0f, 4.0f, -4.0f);
        e.lineToRelative(-3.0f, 0.0f);
        e.lineToRelative(0.0f, -4.0f);
        e.lineToRelative(-2.0f, 0.02f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, 3.98f, -3.0f, 0.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _simCardDownload = build;
        build.getClass();
        return build;
    }
}
