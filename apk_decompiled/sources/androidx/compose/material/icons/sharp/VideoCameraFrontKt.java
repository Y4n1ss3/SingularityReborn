package androidx.compose.material.icons.sharp;

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
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoCameraFrontKt {
    private static ImageVector _videoCameraFront;

    public static final ImageVector getVideoCameraFront(Icons.Sharp sharp) {
        ImageVector imageVector = _videoCameraFront;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VideoCameraFront", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(18.0f, 10.48f, 4.0f, 2.0f, 16.0f);
        bv.p(f, 16.0f, -6.48f, 4.0f, 3.98f);
        kf0.t(f, -11.0f, 18.0f, 10.48f);
        f.moveTo(10.0f, 8.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        f.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        f.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        f.reflectiveCurveTo(8.9f, 8.0f, 10.0f, 8.0f);
        uo.q(f, 14.0f, 16.0f, 6.0f, -0.57f);
        f.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        f.curveTo(8.07f, 13.21f, 9.01f, 13.0f, 10.0f, 13.0f);
        f.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        f.curveTo(13.52f, 13.9f, 14.0f, 14.62f, 14.0f, 15.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoCameraFront = build;
        build.getClass();
        return build;
    }
}
