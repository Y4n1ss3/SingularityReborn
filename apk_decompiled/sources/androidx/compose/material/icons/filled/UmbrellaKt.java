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
import defpackage.bv;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.Filled filled) {
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Umbrella", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(14.5f, 6.92f, 13.0f, 5.77f, 3.88f);
        u.verticalLineTo(3.4f);
        u.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        u.curveToRelative(0.28f, 0.0f, 0.5f, 0.21f, 0.5f, 0.48f);
        uf.z(u, 4.0f, 2.0f, 3.4f);
        u.curveTo(16.0f, 2.07f, 14.88f, 1.0f, 13.5f, 1.0f);
        u.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        u.verticalLineToRelative(0.48f);
        u.verticalLineToRelative(1.89f);
        u.lineTo(9.5f, 6.92f);
        u.lineTo(6.0f, 6.07f);
        u.lineToRelative(5.05f, 15.25f);
        u.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        u.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        r6.C(u, 18.0f, 6.07f, 14.5f, 6.92f);
        u.moveTo(13.28f, 8.5f);
        u.lineToRelative(0.76f, 0.58f);
        u.lineToRelative(0.92f, -0.23f);
        u.lineTo(13.0f, 14.8f);
        bv.k(u, 8.29f, 13.28f, 8.5f);
        u.moveTo(9.96f, 9.09f);
        u.lineToRelative(0.76f, -0.58f);
        u.lineTo(11.0f, 8.29f);
        u.verticalLineToRelative(6.51f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(u, 9.03f, 8.86f, 9.96f, 9.09f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = build;
        build.getClass();
        return build;
    }
}
