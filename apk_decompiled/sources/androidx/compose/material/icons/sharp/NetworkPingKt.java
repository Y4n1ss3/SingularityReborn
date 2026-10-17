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
import defpackage.af0;
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NetworkPingKt {
    private static ImageVector _networkPing;

    public static final ImageVector getNetworkPing(Icons.Sharp sharp) {
        ImageVector imageVector = _networkPing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NetworkPing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 14.67f, 3.41f, 6.09f);
        i.lineTo(2.0f, 7.5f);
        j50.x(i, 8.5f, 8.5f, 4.0f, 2.0f);
        kf0.x(i, 16.0f, -2.0f, -6.5f);
        i.lineToRelative(5.15f, -5.15f);
        i.curveTo(18.91f, 10.95f, 19.2f, 11.0f, 19.5f, 11.0f);
        i.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        i.reflectiveCurveTo(20.88f, 6.0f, 19.5f, 6.0f);
        i.reflectiveCurveTo(17.0f, 7.12f, 17.0f, 8.5f);
        i.curveToRelative(0.0f, 0.35f, 0.07f, 0.67f, 0.2f, 0.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 12.0f, 14.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkPing = build;
        build.getClass();
        return build;
    }
}
