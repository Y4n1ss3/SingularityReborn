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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DesignServicesKt {
    private static ImageVector _designServices;

    public static final ImageVector getDesignServices(Icons.Sharp sharp) {
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DesignServices", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.79f, 17.06f, -5.55f, -5.55f);
        e.lineToRelative(1.57f, -1.57f);
        e.lineToRelative(-3.75f, -3.75f);
        e.lineToRelative(-1.57f, 1.57f);
        e.lineTo(6.94f, 2.21f);
        e.lineTo(2.21f, 6.94f);
        e.lineToRelative(5.55f, 5.55f);
        fc.t(e, 3.0f, 17.25f, 21.0f, 3.75f);
        e.lineToRelative(4.76f, -4.76f);
        e.lineToRelative(5.55f, 5.55f);
        e.lineToRelative(0.0f, 0.0f);
        kf0.t(e, 0.0f, 21.79f, 17.06f);
        e.moveTo(9.18f, 11.07f);
        e.lineTo(5.04f, 6.94f);
        e.lineToRelative(1.9f, -1.9f);
        e.lineToRelative(1.27f, 1.27f);
        e.lineTo(7.02f, 7.5f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(1.19f, -1.19f);
        gy.B(e, 1.45f, 1.45f, 9.18f, 11.07f);
        e.moveTo(12.93f, 14.82f);
        e.lineToRelative(1.9f, -1.9f);
        e.lineToRelative(1.45f, 1.45f);
        e.lineToRelative(-1.19f, 1.19f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(1.19f, -1.19f);
        e.lineToRelative(1.27f, 1.27f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, -1.9f, 1.9f, 12.93f, 14.82f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(15.133f, 5.123f, 2.538f, -2.538f), 3.748f, 3.748f, -2.538f, 2.538f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _designServices = build;
        build.getClass();
        return build;
    }
}
