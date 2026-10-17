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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenSearchDesktopKt {
    private static ImageVector _screenSearchDesktop;

    public static final ImageVector getScreenSearchDesktop(Icons.Filled filled) {
        ImageVector imageVector = _screenSearchDesktop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ScreenSearchDesktop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 18.0f);
        b.curveTo(21.1f, 18.0f, 21.99f, 17.1f, 21.99f, 16.0f);
        b.lineTo(22.0f, 6.0f);
        b.curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f);
        b.lineTo(4.0f, 4.0f);
        b.curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f);
        b.lineTo(2.0f, 16.0f);
        b.curveTo(2.0f, 17.1f, 2.89f, 18.0f, 4.0f, 18.0f);
        b.lineTo(0.0f, 18.0f);
        b.lineTo(0.0f, 20.0f);
        b.lineTo(24.0f, 20.0f);
        r6.C(b, 24.0f, 18.0f, 20.0f, 18.0f);
        b.moveTo(4.0f, 16.0f);
        b.lineTo(4.0f, 6.0f);
        b.lineTo(20.0f, 6.0f);
        b.lineTo(20.0f, 16.0f);
        r6.C(b, 20.0f, 16.01f, 4.0f, 16.0f);
        b.moveTo(9.097f, 9.953f);
        b.curveTo(9.097f, 8.926f, 9.933f, 8.089f, 10.961f, 8.089f);
        b.curveTo(11.988f, 8.089f, 12.825f, 8.926f, 12.825f, 9.953f);
        b.curveTo(12.825f, 10.98f, 11.988f, 11.817f, 10.961f, 11.817f);
        b.curveTo(9.933f, 11.817f, 9.097f, 10.98f, 9.097f, 9.953f);
        k4.r(b, 16.129f, 14.189f, 13.647f, 11.707f);
        b.curveTo(13.978f, 11.202f, 14.174f, 10.6f, 14.174f, 9.953f);
        b.curveTo(14.174f, 8.181f, 12.733f, 6.74f, 10.961f, 6.74f);
        b.curveTo(9.189f, 6.74f, 7.747f, 8.181f, 7.747f, 9.953f);
        b.curveTo(7.747f, 11.725f, 9.189f, 13.167f, 10.961f, 13.167f);
        b.curveTo(11.597f, 13.167f, 12.186f, 12.975f, 12.685f, 12.656f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 15.174f, 15.144f, 16.129f, 14.189f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenSearchDesktop = build;
        build.getClass();
        return build;
    }
}
