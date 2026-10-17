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
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoCameraBackKt {
    private static ImageVector _videoCameraBack;

    public static final ImageVector getVideoCameraBack(Icons.Sharp sharp) {
        ImageVector imageVector = _videoCameraBack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VideoCameraBack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(18.0f, 10.48f, 4.0f, 2.0f, 16.0f);
        bv.p(f, 16.0f, -6.48f, 4.0f, 3.98f);
        kf0.t(f, -11.0f, 18.0f, 10.48f);
        f.moveTo(5.0f, 16.0f);
        f.lineToRelative(2.38f, -3.17f);
        f.lineTo(9.0f, 15.0f);
        f.lineToRelative(2.62f, -3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(f, 15.0f, 16.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoCameraBack = build;
        build.getClass();
        return build;
    }
}
