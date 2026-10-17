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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FontDownloadKt {
    private static ImageVector _fontDownload;

    public static final ImageVector getFontDownload(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fontDownload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FontDownload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.0f, 20.0f, 16.0f, 20.0f, 4.0f);
        bv.r(p, 4.0f, 4.0f, 16.0f);
        p.moveTo(11.07f, 5.5f);
        kf0.B(p, 1.86f, 5.11f, 13.0f, -2.09f);
        p.lineToRelative(-1.14f, -3.0f);
        p.lineTo(9.17f, 15.5f);
        p.lineToRelative(-1.12f, 3.0f);
        bv.o(p, 5.96f, 18.5f, 5.11f, -13.0f);
        p.moveTo(12.0f, 7.98f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(p, 9.93f, 13.5f, 4.14f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(9.17f, 15.5f, 5.64f, 1.14f, 3.0f);
        kf0.B(i, 2.09f, -5.11f, -13.0f, -1.86f);
        i.lineToRelative(-5.11f, 13.0f);
        uo.w(i, 2.09f, 1.12f, -3.0f);
        i.moveTo(12.0f, 7.98f);
        i.lineToRelative(2.07f, 5.52f);
        r6.C(i, 9.93f, 13.5f, 12.0f, 7.98f);
        i.moveTo(20.0f, 2.0f);
        i.lineTo(4.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 20.0f, 20.0f, 4.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i, 4.0f, 4.0f, 16.0f, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownload = build;
        build.getClass();
        return build;
    }
}
