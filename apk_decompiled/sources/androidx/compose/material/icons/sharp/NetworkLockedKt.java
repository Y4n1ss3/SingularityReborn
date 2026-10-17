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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NetworkLockedKt {
    private static ImageVector _networkLocked;

    public static final ImageVector getNetworkLocked(Icons.Sharp sharp) {
        ImageVector imageVector = _networkLocked;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NetworkLocked", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 16.0f, -0.36f);
        h.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        h.curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f);
        r6.D(h, 0.5f, -1.0f, 6.0f, 7.0f);
        kf0.C(h, -6.0f, -1.0f, 21.0f, 16.0f);
        h.horizontalLineToRelative(-3.0f);
        h.verticalLineToRelative(-0.5f);
        h.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        h.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        r6.l(h, 0.5f, 19.5f, 11.0f);
        h.curveToRelative(0.15f, 0.0f, 0.3f, 0.01f, 0.46f, 0.02f);
        h.curveToRelative(0.01f, 0.0f, 0.03f, 0.01f, 0.04f, 0.01f);
        h.lineTo(20.0f, 1.0f);
        fc.w(h, 1.0f, 20.0f, 13.0f, -6.0f);
        h.horizontalLineToRelative(1.26f);
        h.curveToRelative(0.22f, -0.63f, 0.58f, -1.2f, 1.06f, -1.68f);
        h.curveToRelative(0.85f, -0.85f, 1.98f, -1.32f, 3.18f, -1.32f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkLocked = build;
        build.getClass();
        return build;
    }
}
