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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsOverscanKt {
    private static ImageVector _settingsOverscan;

    public static final ImageVector getSettingsOverscan(Icons.TwoTone twoTone) {
        ImageVector imageVector = _settingsOverscan;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SettingsOverscan", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(3.0f, 19.01f, 18.0f, 21.0f, 4.99f);
        bv.r(p, 3.0f, 4.99f, 14.02f);
        p.moveTo(18.0f, 10.0f);
        p.lineToRelative(2.5f, 2.01f);
        bv.r(p, 18.0f, 14.0f, -4.0f);
        p.moveTo(12.01f, 5.5f);
        p.lineTo(14.0f, 8.0f);
        uo.w(p, -4.0f, 2.01f, -2.5f);
        p.moveTo(14.0f, 16.0f);
        p.lineToRelative(-1.99f, 2.5f);
        uf.j(p, 10.0f, 16.0f, 4.0f);
        p.moveTo(6.0f, 10.0f);
        p.verticalLineToRelative(4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(p, -2.5f, -1.99f, 6.0f, 10.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(2.01f, 2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 10.0f);
        uo.t(pathBuilder, 4.0f, 2.5f, -1.99f);
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.lineTo(3.0f, 3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(23.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(pathBuilder, 21.0f, 19.01f, 3.0f, 19.01f);
        r6.m(pathBuilder, 3.0f, 4.99f, 18.0f, 14.02f);
        pathBuilder.moveTo(6.0f, 10.0f);
        gy.B(pathBuilder, -2.5f, 2.01f, 6.0f, 14.0f);
        pathBuilder.moveTo(12.01f, 5.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(pathBuilder, 10.0f, 8.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsOverscan = build;
        build.getClass();
        return build;
    }
}
